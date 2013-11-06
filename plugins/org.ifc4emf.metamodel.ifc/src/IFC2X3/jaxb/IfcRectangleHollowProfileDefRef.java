package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcRectangleHollowProfileDef;

@XmlRootElement(name = "IfcRectangleHollowProfileDefRefElement")
public class IfcRectangleHollowProfileDefRef extends IFC2X3.jaxb.IfcRectangleProfileDefRef  {

	

	
	@Override
	public IfcRectangleHollowProfileDef createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcRectangleHollowProfileDef();
	}
	
	public static IfcRectangleHollowProfileDefRef valueOf(String id) {
		IfcRectangleHollowProfileDefRef result = new IfcRectangleHollowProfileDefRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}