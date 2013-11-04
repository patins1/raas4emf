package au.com.smartservicescrc.raas_small_test.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.EObjectRef;
import au.com.smartservicescrc.raas_small_test.jaxb.DerivedUnderClassE1Ref;

import au.com.smartservicescrc.raas_small_test.MergingE1AndE2;
import au.com.smartservicescrc.raas_small_test.RstFactory;

@XmlRootElement(name = "MergingE1AndE2RefElement")
public class MergingE1AndE2Ref extends DerivedUnderClassE1Ref  {

	

	
	@Override
	public MergingE1AndE2 createInstance() {
		return RstFactory.eINSTANCE.createMergingE1AndE2();
	}
	
	public static MergingE1AndE2Ref valueOf(String id) {
		MergingE1AndE2Ref result = new MergingE1AndE2Ref();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}