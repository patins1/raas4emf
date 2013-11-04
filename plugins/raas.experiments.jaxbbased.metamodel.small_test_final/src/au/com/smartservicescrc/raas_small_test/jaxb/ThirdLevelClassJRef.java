package au.com.smartservicescrc.raas_small_test.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.EObjectRef;

import au.com.smartservicescrc.raas_small_test.RstFactory;
import au.com.smartservicescrc.raas_small_test.ThirdLevelClassJ;

@XmlRootElement(name = "ThirdLevelClassJRefElement")
public class ThirdLevelClassJRef implements EObjectRef {

	
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
	public ThirdLevelClassJ createInstance() {
		return RstFactory.eINSTANCE.createThirdLevelClassJ();
	}
	
	public static ThirdLevelClassJRef valueOf(String id) {
		ThirdLevelClassJRef result = new ThirdLevelClassJRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}