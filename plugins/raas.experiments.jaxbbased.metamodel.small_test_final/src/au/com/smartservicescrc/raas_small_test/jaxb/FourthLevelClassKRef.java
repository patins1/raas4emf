package au.com.smartservicescrc.raas_small_test.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.EObjectRef;

import au.com.smartservicescrc.raas_small_test.FourthLevelClassK;
import au.com.smartservicescrc.raas_small_test.RstFactory;

@XmlRootElement(name = "FourthLevelClassKRefElement")
public class FourthLevelClassKRef implements EObjectRef {

	
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
	public FourthLevelClassK createInstance() {
		return RstFactory.eINSTANCE.createFourthLevelClassK();
	}
	
	public static FourthLevelClassKRef valueOf(String id) {
		FourthLevelClassKRef result = new FourthLevelClassKRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}