package au.com.smartservicescrc.raas_small_test.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.EObjectRef;

import au.com.smartservicescrc.raas_small_test.RstFactory;
import au.com.smartservicescrc.raas_small_test.TopClassB;

@XmlRootElement(name = "TopClassBRefElement")
public class TopClassBRef implements EObjectRef {

	
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
	public TopClassB createInstance() {
		return RstFactory.eINSTANCE.createTopClassB();
	}
	
	public static TopClassBRef valueOf(String id) {
		TopClassBRef result = new TopClassBRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}