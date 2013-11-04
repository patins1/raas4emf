package au.com.smartservicescrc.raas_small_test.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.EObjectRef;

import au.com.smartservicescrc.raas_small_test.RstFactory;
import au.com.smartservicescrc.raas_small_test.TopClassC;

@XmlRootElement(name = "TopClassCRefElement")
public class TopClassCRef implements EObjectRef {

	
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
	public TopClassC createInstance() {
		return RstFactory.eINSTANCE.createTopClassC();
	}
	
	public static TopClassCRef valueOf(String id) {
		TopClassCRef result = new TopClassCRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}