package au.com.smartservicescrc.raas_small_test.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.EObjectRef;
import au.com.smartservicescrc.raas_small_test.jaxb.UnderClassERef;

import au.com.smartservicescrc.raas_small_test.DerivedUnderClassE2;
import au.com.smartservicescrc.raas_small_test.RstFactory;

@XmlRootElement(name = "DerivedUnderClassE2RefElement")
public class DerivedUnderClassE2Ref extends UnderClassERef  {

	

	
	@Override
	public DerivedUnderClassE2 createInstance() {
		return RstFactory.eINSTANCE.createDerivedUnderClassE2();
	}
	
	public static DerivedUnderClassE2Ref valueOf(String id) {
		DerivedUnderClassE2Ref result = new DerivedUnderClassE2Ref();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}