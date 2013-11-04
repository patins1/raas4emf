package au.com.smartservicescrc.raas_small_test.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.EObjectRef;

import au.com.smartservicescrc.raas_small_test.RstFactory;
import au.com.smartservicescrc.raas_small_test.UnderClassE;

@XmlRootElement(name = "UnderClassERefElement")
public class UnderClassERef implements EObjectRef {

	
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
	public UnderClassE createInstance() {
		return RstFactory.eINSTANCE.createUnderClassE();
	}
	
	public static UnderClassERef valueOf(String id) {
		UnderClassERef result = new UnderClassERef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}