package au.com.smartservicescrc.raas_small_test.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.EObjectRef;
import au.com.smartservicescrc.raas_small_test.jaxb.UnderClassERef;

import au.com.smartservicescrc.raas_small_test.RstFactory;
import au.com.smartservicescrc.raas_small_test.TopClassM;

@XmlRootElement(name = "TopClassMRefElement")
public class TopClassMRef extends UnderClassERef  {

	

	
	@Override
	public TopClassM createInstance() {
		return RstFactory.eINSTANCE.createTopClassM();
	}
	
	public static TopClassMRef valueOf(String id) {
		TopClassMRef result = new TopClassMRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}