package au.com.smartservicescrc.raas_small_test.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.EObjectRef;

import au.com.smartservicescrc.raas_small_test.RstFactory;
import au.com.smartservicescrc.raas_small_test.UnderClassF;

@XmlRootElement(name = "UnderClassFRefElement")
public class UnderClassFRef implements EObjectRef {

	
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
	public UnderClassF createInstance() {
		return RstFactory.eINSTANCE.createUnderClassF();
	}
	
	public static UnderClassFRef valueOf(String id) {
		UnderClassFRef result = new UnderClassFRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}