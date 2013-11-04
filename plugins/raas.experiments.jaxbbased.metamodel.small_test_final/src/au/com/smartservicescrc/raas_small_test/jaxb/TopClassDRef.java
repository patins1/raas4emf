package au.com.smartservicescrc.raas_small_test.jaxb;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlValue;

import au.com.smartservicescrc.raas_small_test.RstFactory;
import au.com.smartservicescrc.raas_small_test.TopClassD;

import org.eclipse.emf.ecore.jaxb.EObjectRef;

@XmlRootElement(name = "TopClassDRefElement")
public class TopClassDRef implements EObjectRef {

	
	public TopClassDRef() {
		id = null;
	}

	private String id;

	@XmlValue
	@Override
	public String getID() {
		return id;
	}

	@Override
	public void setID(String id) {
		this.id = id;
	}
	

	
	@Override
	public TopClassD createInstance() {
		return RstFactory.eINSTANCE.createTopClassD();
	}
	
	public static TopClassDRef valueOf(String id) {
		TopClassDRef result = new TopClassDRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}