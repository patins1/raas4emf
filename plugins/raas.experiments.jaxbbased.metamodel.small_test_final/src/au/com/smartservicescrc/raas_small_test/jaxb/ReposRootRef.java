package au.com.smartservicescrc.raas_small_test.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.EObjectRef;

import au.com.smartservicescrc.raas_small_test.ReposRoot;
import au.com.smartservicescrc.raas_small_test.RstFactory;

@XmlRootElement(name = "ReposRootRefElement")
public class ReposRootRef implements EObjectRef {

	
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
	public ReposRoot createInstance() {
		return RstFactory.eINSTANCE.createReposRoot();
	}
	
	public static ReposRootRef valueOf(String id) {
		ReposRootRef result = new ReposRootRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}