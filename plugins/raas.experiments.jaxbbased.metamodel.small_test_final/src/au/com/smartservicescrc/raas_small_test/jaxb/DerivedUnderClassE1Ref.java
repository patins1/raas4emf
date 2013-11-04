package au.com.smartservicescrc.raas_small_test.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.EObjectRef;
import au.com.smartservicescrc.raas_small_test.jaxb.UnderClassERef;

import au.com.smartservicescrc.raas_small_test.DerivedUnderClassE1;
import au.com.smartservicescrc.raas_small_test.RstFactory;

@XmlRootElement(name = "DerivedUnderClassE1RefElement")
public class DerivedUnderClassE1Ref extends UnderClassERef  {

	

	
	@Override
	public DerivedUnderClassE1 createInstance() {
		return RstFactory.eINSTANCE.createDerivedUnderClassE1();
	}
	
	public static DerivedUnderClassE1Ref valueOf(String id) {
		DerivedUnderClassE1Ref result = new DerivedUnderClassE1Ref();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}