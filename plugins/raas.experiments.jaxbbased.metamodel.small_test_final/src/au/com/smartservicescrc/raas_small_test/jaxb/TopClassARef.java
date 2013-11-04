package au.com.smartservicescrc.raas_small_test.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.EObjectRef;

import au.com.smartservicescrc.raas_small_test.RstFactory;
import au.com.smartservicescrc.raas_small_test.TopClassA;

@XmlRootElement(name = "TopClassARefElement")
public class TopClassARef implements EObjectRef {

	
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
	public TopClassA createInstance() {
		return RstFactory.eINSTANCE.createTopClassA();
	}
	
	public static TopClassARef valueOf(String id) {
		TopClassARef result = new TopClassARef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}