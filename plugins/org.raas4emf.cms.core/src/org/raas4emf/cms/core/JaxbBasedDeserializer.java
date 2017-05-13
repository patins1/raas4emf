/**
 * Copyright: Joerg Kiegeland
 * Author: Joerg Kiegeland, Distributed Models Pty Ltd 
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.raas4emf.cms.core;

import java.io.IOException;

import org.eclipse.net4j.util.io.IORuntimeException;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.deser.ContextualDeserializer;
import com.fasterxml.jackson.databind.deser.std.CollectionDeserializer;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;
import com.fasterxml.jackson.databind.deser.std.StdValueInstantiator;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import com.fasterxml.jackson.databind.util.Converter;

public class JaxbBasedDeserializer extends StdDeserializer<Object> implements ContextualDeserializer {

	private Converter<Object, Object> converter;

	public JaxbBasedDeserializer() {
		super((Class<?>) null);
	}

	@Override
	public JsonDeserializer<?> createContextual(DeserializationContext prov, BeanProperty property) throws JsonMappingException {
		JavaType contentType = prov.getContextualType().getContentType();
		if (contentType == null) {
			return this;
		}

		JavaType originalType = property.getMember().getType().getContentType();
		DeserializationConfig config = prov.getConfig();
		AnnotationIntrospector ai = config.getAnnotationIntrospector();
		Object convDef = null;
		Class<?> mixinClass = config.findMixInClassFor(originalType.getRawClass());
		if (mixinClass != null) {
			convDef = ai.findDeserializationConverter(config.introspect(prov.getTypeFactory().constructType(mixinClass)).getClassInfo());
		}
		if (convDef == null) {
			convDef = ai.findDeserializationConverter(config.introspect(originalType).getClassInfo());
		}
		if (convDef == null) {
			return this;
		}
		converter = prov.converterInstance(property.getMember(), convDef);

		StdValueInstantiator valueInstantiator = new StdValueInstantiator(prov.getConfig(), contentType);
		TypeDeserializer findTypeDeserializer = prov.getConfig().findTypeDeserializer(contentType);
		return new CollectionDeserializer(property.getType(), this, findTypeDeserializer, valueInstantiator);
	}

	@Override
	public Object deserialize(JsonParser p, DeserializationContext ctxt) throws IOException, JsonProcessingException {
		throw new IORuntimeException("not impl");
	}

	@Override
	public Object deserializeWithType(JsonParser p, DeserializationContext ctxt, TypeDeserializer typeDeserializer) throws IOException {
		Object value = super.deserializeWithType(p, ctxt, typeDeserializer);
		value = converter.convert(value);
		return value;
	}

}
