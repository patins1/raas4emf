package raas.experiments.jaxbased.webserviceclient;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import raas.experiments.jaxbased.webservice.DerivedUnderClassE1;
import raas.experiments.jaxbased.webservice.DerivedUnderClassE1Ref;
import raas.experiments.jaxbased.webservice.DerivedUnderClassE2;
import raas.experiments.jaxbased.webservice.DerivedUnderClassE2Ref;
import raas.experiments.jaxbased.webservice.Exception_Exception;
import raas.experiments.jaxbased.webservice.ReposRootRepository;
import raas.experiments.jaxbased.webservice.ReposRootRepositoryService;
import raas.experiments.jaxbased.webservice.ThirdLevelClassJ;
import raas.experiments.jaxbased.webservice.ThirdLevelClassJRef;
import raas.experiments.jaxbased.webservice.TimeZone;
import raas.experiments.jaxbased.webservice.TopClassD;
import raas.experiments.jaxbased.webservice.TopClassDRef;
import raas.experiments.jaxbased.webservice.UnderClassE;
import raas.experiments.jaxbased.webservice.UnderClassERef;

public class TestClient {
	private ReposRootRepository test;

	@Before
	public void setUp() {
		ReposRootRepositoryService repos = new ReposRootRepositoryService();
		test = repos.getReposRootRepositoryPort();
	}

	/**
	 * Test TimeZone handling
	 * 
	 * @throws Exception_Exception
	 * @throws IllegalArgumentException
	 * @throws IllegalAccessException
	 */
	@Test
	public void testTimeZone() throws Exception_Exception, IllegalArgumentException, IllegalAccessException {
		TopClassD d = new TopClassD();
		java.util.TimeZone javaTimeZone = java.util.TimeZone.getDefault();
		TimeZone jaxbTimeZone = new TimeZone();
		jaxbTimeZone.setID(javaTimeZone.getID());
		d.setOptionalTimeZone(jaxbTimeZone);
		d.setSingleAttrInt(6);
		d.getMulti2LowerAttrInt().add(1);
		d.getMulti2LowerAttrInt().add(2);
		TopClassDRef dRef = test.createTopClassD(d);
		d.setRaasRef(dRef.getValue());
		TopClassD dMirror = test.getTopClassD(dRef);
		Assert.assertEquals(javaTimeZone.getID(), dMirror.getOptionalTimeZone().getID());
		ObjectGraphComparer.assertEqual(d, dMirror);
	}

	/**
	 * Test CRUD operations on single object
	 * 
	 * @throws Exception_Exception
	 * @throws IllegalArgumentException
	 * @throws IllegalAccessException
	 */
	@Test
	public void testCRUD() throws Exception_Exception, IllegalArgumentException, IllegalAccessException {
		// first clean all instances!
		for (TopClassD d4 : test.getAllTopClassD()) {
			TopClassDRef dRef = new TopClassDRef();
			dRef.setValue(d4.getRaasRef());
			test.deleteTopClassD(dRef);
		}
		Assert.assertSame(0, test.getAllTopClassD().size());
		// test object creation
		TopClassD d = new TopClassD();
		d.setOptionalAttrInt(4);
		d.setSingleAttrInt(6);
		d.getMulti2LowerAttrInt().add(1);
		d.getMulti2LowerAttrInt().add(2);
		TopClassDRef dRef = test.createTopClassD(d);
		d.setRaasRef(dRef.getValue());
		TopClassD dMirror = test.getTopClassD(dRef);
		ObjectGraphComparer.assertEqual(d, dMirror);
		// test object update with ID change
		d = new TopClassD();
		d.setSingleAttrInt(5);
		d.setRaasRef(dRef.getValue() + "_modified");
		d.getMulti2LowerAttrInt().add(1);
		d.getMulti2LowerAttrInt().add(2);
		test.updateTopClassD(dRef, d);
		try {
			TopClassD result = test.getTopClassD(dRef);
			Assert.fail("Expected failure to get object since it has now different id, but got " + result);
		} catch (Exception e) {
			// ok
		}
		dRef.setValue(d.getRaasRef());
		dMirror = test.getTopClassD(dRef);
		ObjectGraphComparer.assertEqual(d, dMirror);
		Assert.assertSame(1, test.getAllTopClassD().size());
		// test object update without ID change
		d = new TopClassD();
		d.setSingleAttrInt(57);
		d.setRaasRef(dRef.getValue());
		d.getMulti2LowerAttrInt().add(1);
		d.getMulti2LowerAttrInt().add(2);
		test.updateTopClassD(dRef, d);
		dMirror = test.getTopClassD(dRef);
		ObjectGraphComparer.assertEqual(d, dMirror);
		// test object deletion
		test.deleteTopClassD(dRef);
		try {
			test.getTopClassD(dRef);
			Assert.fail("Expected failure to get object since already deleted");
		} catch (Exception e) {
			// ok
		}
		Assert.assertSame(0, test.getAllTopClassD().size());
	}

	/**
	 * Test derived objects
	 * 
	 * @throws Exception_Exception
	 * @throws IllegalArgumentException
	 * @throws IllegalAccessException
	 */
	@Test
	public void testDerivation() throws Exception_Exception, IllegalArgumentException, IllegalAccessException {
		// first clean all instances!
		for (UnderClassE e : test.getAllUnderClassE()) {
			UnderClassERef eRef = new UnderClassERef();
			eRef.setValue(e.getRaasRef());
			test.deleteUnderClassE(eRef);
		}
		Assert.assertSame(0, test.getAllUnderClassE().size());
		// create d
		TopClassD d = new TopClassD();
		d.setSingleAttrInt(6);
		d.getMulti2LowerAttrInt().add(1);
		d.getMulti2LowerAttrInt().add(2);
		TopClassDRef dRef = test.createTopClassD(d);
		// test allInstances include derived objects
		UnderClassE e = new UnderClassE();
		DerivedUnderClassE1 e1 = new DerivedUnderClassE1();
		DerivedUnderClassE2 e2 = new DerivedUnderClassE2();
		e1.setSingleRefClassD(dRef);
		DerivedUnderClassE1Ref e1Ref = test.createDerivedUnderClassE1(e1);
		UnderClassERef e2Ref = test.createUnderClassE(e2);// TODO
		UnderClassERef eRef = test.createUnderClassE(e);
		Assert.assertSame(3, test.getAllUnderClassE().size());
		Assert.assertSame(1, test.getAllDerivedUnderClassE1().size());
		Assert.assertSame(1, test.getAllDerivedUnderClassE2().size());
	}

	/**
	 * Test containment
	 * 
	 * @throws Exception_Exception
	 * @throws IllegalArgumentException
	 * @throws IllegalAccessException
	 */
	@Test
	public void testContainment() throws Exception_Exception, IllegalArgumentException, IllegalAccessException {
		// first clean all instances!
		for (UnderClassE e : test.getAllUnderClassE()) {
			UnderClassERef eRef = new UnderClassERef();
			eRef.setValue(e.getRaasRef());
			test.deleteUnderClassE(eRef);
		}
		Assert.assertSame(0, test.getAllUnderClassE().size());
		// test j1/j2/j3 is contained in e2
		DerivedUnderClassE2 e2 = new DerivedUnderClassE2();
		ThirdLevelClassJ j1 = new ThirdLevelClassJ();
		j1.setSingleAttrInt(1);
		j1.setRaasRef("id_j1");
		ThirdLevelClassJ j2 = new ThirdLevelClassJ();
		j2.setSingleAttrInt(2);
		j2.setRaasRef("id_j2");
		ThirdLevelClassJ j3 = new ThirdLevelClassJ();
		j3.setSingleAttrInt(3);
		j3.setRaasRef("id_j3");
		e2.getMultiContainClassJ().add(j1);
		e2.getMultiContainClassJ().add(j2);
		e2.getMultiContainClassJ().add(j3);
		j1.getMulti2LowerAttrInt().add(1);
		j1.getMulti2LowerAttrInt().add(2);
		j2.getMulti2LowerAttrInt().add(1);
		j2.getMulti2LowerAttrInt().add(2);
		j3.getMulti2LowerAttrInt().add(1);
		j3.getMulti2LowerAttrInt().add(2);
		DerivedUnderClassE2Ref e2Ref = test.createDerivedUnderClassE2(e2);
		DerivedUnderClassE2 e2Mirror = test.getDerivedUnderClassE2(e2Ref);
		Assert.assertEquals(3, e2Mirror.getMultiContainClassJ().size());
		ThirdLevelClassJ j1Mirror = e2Mirror.getMultiContainClassJ().get(0);
		ThirdLevelClassJ j2Mirror = e2Mirror.getMultiContainClassJ().get(1);
		ThirdLevelClassJ j3Mirror = e2Mirror.getMultiContainClassJ().get(2);
		Assert.assertNotNull(j1Mirror.getRaasRef());
		j1.setRaasRef(j1Mirror.getRaasRef());
		j2.setRaasRef(j2Mirror.getRaasRef());
		j3.setRaasRef(j3Mirror.getRaasRef());
		e2.setRaasRef(e2Mirror.getRaasRef());
		ObjectGraphComparer.assertEqual(e2, e2Mirror);
		ObjectGraphComparer.assertEqual(j1, j1Mirror);
		Assert.assertEquals(3, test.getAllThirdLevelClassJ().size());
		// test retrieving j1
		ThirdLevelClassJRef j1Ref = new ThirdLevelClassJRef();
		j1Ref.setValue(j1Mirror.getRaasRef());
		ThirdLevelClassJRef j2Ref = new ThirdLevelClassJRef();
		j2Ref.setValue(j2Mirror.getRaasRef());
		ThirdLevelClassJRef j3Ref = new ThirdLevelClassJRef();
		j3Ref.setValue(j3Mirror.getRaasRef());
		j1Mirror = test.getThirdLevelClassJ(j1Ref);
		ObjectGraphComparer.assertEqual(j1, j1Mirror);
		// test update
		e2.getMultiContainClassJ().remove(j3);
		j2.setRaasRef(j2.getRaasRef() + "_modified");
		test.updateDerivedUnderClassE2(e2Ref, e2);
		e2Mirror = test.getDerivedUnderClassE2(e2Ref);
		Assert.assertEquals("Expected one item to be deleted!", 2, e2Mirror.getMultiContainClassJ().size());
		try {
			test.getThirdLevelClassJ(j3Ref);
			Assert.fail("Expected failure to get object since deleted by removing from container!");
		} catch (Exception e) {
			// ok
		}
		try {
			test.getThirdLevelClassJ(j2Ref);
			Assert.fail("Expected failure to get object since deleted by changing id!");
		} catch (Exception e) {
			// ok
		}
		j2Ref.setValue(j2.getRaasRef());
		Assert.assertNotNull(test.getThirdLevelClassJ(j2Ref));
		Assert.assertEquals("Expected 2 instances, j1 and the 'new' j2!", 2, test.getAllThirdLevelClassJ().size());
		// test deleting j1 by deleting container
		test.deleteDerivedUnderClassE2(e2Ref);
		try {
			test.getThirdLevelClassJ(j1Ref);
			Assert.fail("Expected failure to get object since already deleted");
		} catch (Exception e) {
			// ok
		}
		Assert.assertEquals(0, test.getAllThirdLevelClassJ().size());
	}

	/**
	 * Test non containment references
	 * 
	 * @throws Exception_Exception
	 * @throws IllegalArgumentException
	 * @throws IllegalAccessException
	 */
	@Test
	public void testNonContainment() throws Exception_Exception, IllegalArgumentException, IllegalAccessException {
		// first clean all instances!
		for (UnderClassE e : test.getAllUnderClassE()) {
			UnderClassERef eRef = new UnderClassERef();
			eRef.setValue(e.getRaasRef());
			test.deleteUnderClassE(eRef);
		}
		// create d
		TopClassD d = new TopClassD();
		d.setSingleAttrInt(6);
		d.getMulti2LowerAttrInt().add(1);
		d.getMulti2LowerAttrInt().add(2);
		TopClassDRef dRef = test.createTopClassD(d);
		// create e1 and assign d to e1
		DerivedUnderClassE1 e1 = new DerivedUnderClassE1();
		e1.setSingleRefClassD(dRef);
		DerivedUnderClassE1Ref e1Ref = test.createDerivedUnderClassE1(e1);
		// test mirror
		DerivedUnderClassE1 e1Mirror = test.getDerivedUnderClassE1(e1Ref);
		e1.setRaasRef(dRef.getValue());
		ObjectGraphComparer.assertEqual(e1, e1Mirror);
	}
}
