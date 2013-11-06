/**
 * Copyright (c) 2010- 2011 QUT (Brisbane, Australia) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Jim Steel - initial API and implementation
 *    Joerg Kiegeland - extension for database storage 
 */
package IFC2X3.util;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcAxis2Placement;
import IFC2X3.IfcAxis2Placement2D;
import IFC2X3.IfcAxis2Placement3D;
import IFC2X3.IfcCartesianPoint;
import IFC2X3.IfcDirection;

/**
 * Class with geometric algorithms as specified by http://www.iai-tech.org/
 */
public class GeometricAlgorithms {
	

	public static int getDim(IfcCartesianPoint p) {
		return p.getCoordinates().size();
	}	
	
	public static EList<IfcDirection> getP(IfcAxis2Placement axis) { 
		if (axis instanceof IfcAxis2Placement3D) {
			IfcAxis2Placement3D ifcAxis2Placement3D = (IfcAxis2Placement3D) axis;
			return getP(ifcAxis2Placement3D.getAxis(),ifcAxis2Placement3D.getRefDirection());
		}
		IfcAxis2Placement2D ifcAxis2Placement2D=(IfcAxis2Placement2D) axis;
		return getP(ifcAxis2Placement2D.getRefDirection());
	}

	public static EList<IfcDirection> getP(IfcDirection axis, IfcDirection refDirection) {
		if (axis==null || refDirection==null) {
			EList<IfcDirection> result=new BasicEList<IfcDirection>();
						
			IfcDirection p1=IFC2X3Factory.eINSTANCE.createIfcDirection();
			p1.getDirectionRatios().add(1.0);
			p1.getDirectionRatios().add(0.0);
			p1.getDirectionRatios().add(0.0);
			result.add(p1);

			IfcDirection p2=IFC2X3Factory.eINSTANCE.createIfcDirection();
			p2.getDirectionRatios().add(0.0);
			p2.getDirectionRatios().add(1.0);
			p2.getDirectionRatios().add(0.0);
			result.add(p2);
			
			IfcDirection p3=IFC2X3Factory.eINSTANCE.createIfcDirection();
			p3.getDirectionRatios().add(0.0);
			p3.getDirectionRatios().add(0.0);
			p3.getDirectionRatios().add(1.0);
			result.add(p3);
			
			return result;
		}
		
		return ifcBuildAxes(axis, refDirection);
	}
	
	public static EList<IfcDirection> getP(IfcDirection refDirection) {
		if (refDirection==null) {
			EList<IfcDirection> result=new BasicEList<IfcDirection>();
			
			IfcDirection p1=IFC2X3Factory.eINSTANCE.createIfcDirection();
			p1.getDirectionRatios().add(1.0);
			p1.getDirectionRatios().add(0.0);
			result.add(p1);
			
			IfcDirection p2=IFC2X3Factory.eINSTANCE.createIfcDirection();
			p2.getDirectionRatios().add(0.0);
			p2.getDirectionRatios().add(1.0);
			result.add(p2);
			
			return result;
		}
		return ifcBuild2Axes(refDirection);
	}

	/**
	 * See http://buildingsmart-tech.org/ifc/IFC2x4/rc2/html/schema/ifcgeometryresource/lexical/ifcbuildaxes.htm
	 * 
	 * @param axis
	 * @param refDirection
	 * @return
	 */
	public static EList<IfcDirection> ifcBuildAxes(IfcDirection axis, IfcDirection refDirection) {
		EList<IfcDirection> result=new BasicEList<IfcDirection>();
		IfcDirection d1=ifcNormaliseFloat(axis);	
		IfcDirection d2 = ifcFirstProjAxis(d1, refDirection);
		result.add(d2);
		result.add(ifcNormalise(ifcCrossProduct(d1,d2)));
		result.add(d1);
		return result;		
	}
	
	public static EList<IfcDirection> ifcBuild2Axes(IfcDirection refDirection) {
		EList<IfcDirection> result=new BasicEList<IfcDirection>();
		IfcDirection d = ifcNormalise(refDirection);	
		result.add(d);
		result.add(ifcOrthogonalComplement(d));
		return result;		
	}

	
	private static IfcDirection ifcOrthogonalComplement(IfcDirection vec) {
		IfcDirection result=IFC2X3Factory.eINSTANCE.createIfcDirection();
		result.getDirectionRatios().add(-vec.getDirectionRatios().get(1));
		result.getDirectionRatios().add(vec.getDirectionRatios().get(0));
		return result;
	}

	public static  IfcDirection ifcCrossProduct(IfcDirection a, IfcDirection b) {
		IfcDirection result=IFC2X3Factory.eINSTANCE.createIfcDirection();
		double a1=a.getDirectionRatios().get(0);
		double a2=a.getDirectionRatios().get(1);
		double a3=a.getDirectionRatios().get(2);
		double b1=b.getDirectionRatios().get(0);
		double b2=b.getDirectionRatios().get(1);
		double b3=b.getDirectionRatios().get(2);
		result.getDirectionRatios().add(a2*b3-a3*b2);
		result.getDirectionRatios().add(a3*b1-a1*b3);
		result.getDirectionRatios().add(a1*b2-a2*b1);
		return result;
	}

	/**
	 * See http://buildingsmart-tech.org/ifc/IFC2x4/rc2/html/schema/ifcgeometryresource/lexical/ifcFirstProjAxis.htm
	 * 
	 * @param zAxis
	 * @param arg
	 * @return
	 */
	public static  IfcDirection ifcFirstProjAxis(IfcDirection zAxis, IfcDirection arg) {      
		IfcDirection z = ifcNormaliseFloat(zAxis);         
		IfcDirection v = ifcNormaliseFloat(arg);
		IfcDirection xVec;
		if (SDAIAdapter.SIMULATE_EDM_CALCULATIONS)
			xVec  = ifcScalarTimesVector(-ifcDotProduct(v, z), z); else
			xVec  = ifcScalarTimesVector(ifcDotProduct(v, z), z);
		IfcDirection  xAxis = ifcVectorDifference(v, xVec);
		xAxis = ifcNormalise(xAxis);
		return xAxis;
	}

	public static  IfcDirection ifcVectorDifference(IfcDirection arg1, IfcDirection arg2) {	
		IfcDirection result=IFC2X3Factory.eINSTANCE.createIfcDirection();		
		double mag1 = getMagnitude(arg1);	
		IfcDirection vec1 = ifcNormalise(arg1);
		double mag2 = getMagnitude(arg2);
		IfcDirection vec2 = ifcNormalise(arg2);
		int i=0;
//		double mag=0;
		for (Double v1:vec1.getDirectionRatios()) {
			double c1 = mag1==0 ? 0 : mag1*v1;
			double c2 = mag2==0 ? 0 : mag2*vec2.getDirectionRatios().get(i);
			result.getDirectionRatios().add(c1-c2);
//			mag += result.getDirectionRatios().get(i)*result.getDirectionRatios().get(i);
			i++;
		}
//		since nevertheless normalized after this call, comment next line
//		result=ifcScalarTimesVector(Math.sqrt(mag),result);	
		return result;
	}

	public static  IfcDirection ifcScalarTimesVector(double scalar, IfcDirection z) {
		IfcDirection result=IFC2X3Factory.eINSTANCE.createIfcDirection();
		for (Double d:z.getDirectionRatios()) {
			result.getDirectionRatios().add(d*scalar);
		}
		return result;
	}

	public static  double ifcDotProduct(IfcDirection v, IfcDirection z) {
		double sum=0;
		int i=0;
		for (Double d:v.getDirectionRatios()) {
			sum += d*z.getDirectionRatios().get(i);
			i++;
		}
		return sum;
	}

	public static  IfcDirection ifcNormalise(IfcDirection axis2) {
		IfcDirection result=IFC2X3Factory.eINSTANCE.createIfcDirection();
		double length=getMagnitude(axis2);
		for (Double d:axis2.getDirectionRatios()) {
			result.getDirectionRatios().add(d/length);
		}
		return result;
	}

	public static  IfcDirection ifcNormaliseFloat(IfcDirection axis2) {
		IfcDirection result=IFC2X3Factory.eINSTANCE.createIfcDirection();
		double length=useFloatPrecision(getMagnitude(axis2));
		for (Double d:axis2.getDirectionRatios()) {
			result.getDirectionRatios().add(d/length);
		}
		return result;
	}

	public static  double getMagnitude(IfcDirection dir) {
		double sum=0;
		for (Double d:dir.getDirectionRatios()) {
			sum += d*d;
		}
		double length = Math.sqrt(sum);
		return length;
	}
	
	private static double useFloatPrecision(double d) {
		return SDAIAdapter.SIMULATE_EDM_CALCULATIONS ? new Double(new Float(d)) : d;
	}

}
