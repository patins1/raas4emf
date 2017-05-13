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

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializationConfig;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;
import com.fasterxml.jackson.databind.ser.ContextualSerializer;
import com.fasterxml.jackson.databind.ser.std.CollectionSerializer;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;
import com.fasterxml.jackson.databind.util.Converter;

public class JaxbBasedSerializer extends StdSerializer<Object> implements ContextualSerializer {

	private Converter<Object, Object> converter;

	public JaxbBasedSerializer() {
		super((Class<Object>) null);
	}

	@Override
	public JsonSerializer<?> createContextual(SerializerProvider prov, BeanProperty property) throws JsonMappingException {
		JavaType contentType = property.getType().getContentType();
		if (contentType == null) {
			return this;
		}

		JavaType originalType = property.getMember().getType().getContentType();
		SerializationConfig config = prov.getConfig();
		AnnotationIntrospector ai = config.getAnnotationIntrospector();
		Object convDef = null;
		Class<?> mixinClass = config.findMixInClassFor(originalType.getRawClass());
		if (mixinClass != null) {
			convDef = ai.findSerializationConverter(config.introspect(prov.getTypeFactory().constructType(mixinClass)).getClassInfo());
		}
		if (convDef == null) {
			convDef = ai.findSerializationConverter(config.introspect(originalType).getClassInfo());
		}
		if (convDef == null) {
			return this;
		}
		converter = prov.converterInstance(property.getMember(), convDef);

		contentType = converter.getOutputType(config.getTypeFactory());
		TypeSerializer vts = prov.findTypeSerializer(contentType);
		return new CollectionSerializer(property.getType(), true, vts, this);
	}

	@Override
	public void serialize(Object value, JsonGenerator gen, SerializerProvider provider) throws IOException {
		value = converter.convert(value);
		JsonSerializer<Object> serializer = provider.findValueSerializer(value.getClass());
		serializer.serialize(value, gen, provider);
	}

	@Override
	public void serializeWithType(Object value, JsonGenerator gen, SerializerProvider provider, TypeSerializer typeSer) throws IOException {
		value = converter.convert(value);
		JsonSerializer<Object> serializer = provider.findValueSerializer(value.getClass());
		serializer.serializeWithType(value, gen, provider, typeSer);
	}

}
