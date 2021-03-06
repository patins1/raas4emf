
package au.com.smartservicescrc.raas.codegen.jaxb.jet;

import org.eclipse.emf.codegen.ecore.genmodel.GenClass;
import org.eclipse.emf.codegen.ecore.genmodel.GenClassifier;
import org.eclipse.emf.codegen.ecore.genmodel.GenEnum;
import org.eclipse.emf.codegen.ecore.genmodel.GenFeature;


public class MixedImplAdapter_Generator 
 {
 
  protected static String nl;
  public static synchronized MixedImplAdapter_Generator create(String lineSeparator)
  {
    nl = lineSeparator;
    MixedImplAdapter_Generator result = new MixedImplAdapter_Generator();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = "package ";
  protected final String TEXT_2 = ".jaxb;" + NL;
  protected final String TEXT_3 = NL + "import java.io.ByteArrayInputStream;" + NL + "import java.io.ByteArrayOutputStream;" + NL + "import java.io.InputStream;" + NL + "import java.util.Arrays;" + NL + "import java.util.HashMap;" + NL + "import java.util.Map;" + NL + "" + NL + "import javax.xml.bind.annotation.adapters.XmlAdapter;" + NL + "" + NL + "import org.eclipse.emf.common.util.TreeIterator;" + NL + "import org.eclipse.emf.common.util.URI;" + NL + "import org.eclipse.emf.ecore.EObject;" + NL + "import org.eclipse.emf.ecore.EPackage;" + NL + "import org.eclipse.emf.ecore.resource.Resource;" + NL + "import org.eclipse.emf.ecore.resource.ResourceSet;" + NL + "import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;" + NL + "import org.eclipse.emf.ecore.xmi.XMLResource;" + NL + "import org.eclipse.emf.ecore.xmi.impl.XMLHelperImpl;" + NL + "public class ";
  protected final String TEXT_4 = "ImplAdapter extends XmlAdapter<String, ";
  protected final String TEXT_5 = "> {" + NL + "" + NL + "\t@Override" + NL + "\tpublic ";
  protected final String TEXT_6 = " unmarshal(String v) throws Exception {" + NL + "\t\tResourceSet resourceSet = new ResourceSetImpl();" + NL + "\t\tresourceSet.getLoadOptions().put(XMLResource.OPTION_EXTENDED_META_DATA, true);" + NL + "\t\tresourceSet.getLoadOptions().put(XMLResource.OPTION_USE_ENCODED_ATTRIBUTE_STYLE, true);" + NL + "\t\tResource res = resourceSet.createResource(URI.createFileURI(\"/fakepath/file.xml\"));" + NL + "\t\tInputStream is = new ByteArrayInputStream(v.getBytes(\"UTF8\"));" + NL + "\t\tres.load(is, resourceSet.getLoadOptions());" + NL + "\t\tTreeIterator<EObject> it = res.getAllContents();" + NL + "\t\twhile (it.hasNext()) {" + NL + "\t\t\tEObject o = it.next();" + NL + "\t\t\tif (o instanceof ";
  protected final String TEXT_7 = ") {" + NL + "\t\t\t\treturn (";
  protected final String TEXT_8 = ") o;" + NL + "\t\t\t}" + NL + "\t\t}" + NL + "\t\treturn null;" + NL + "\t}" + NL + "" + NL + "\t@Override" + NL + "\tpublic String marshal(";
  protected final String TEXT_9 = " v) throws Exception {" + NL + "\t\tResourceSet resourceSet = new ResourceSetImpl();" + NL + "\t\tresourceSet.getLoadOptions().put(XMLResource.OPTION_ROOT_OBJECTS, Arrays.asList(v));" + NL + "\t\tresourceSet.getLoadOptions().put(XMLResource.OPTION_EXTENDED_META_DATA, true);" + NL + "\t\tresourceSet.getLoadOptions().put(XMLResource.OPTION_DECLARE_XML, false);" + NL + "\t\tresourceSet.getLoadOptions().put(Resource.OPTION_LINE_DELIMITER, \"\\n\");" + NL + "\t\tResource res = resourceSet.createResource(URI.createFileURI(\"/fakepath/file.xml\"));" + NL + "\t\tByteArrayOutputStream os = new ByteArrayOutputStream();" + NL + "\t\tres.save(os, resourceSet.getLoadOptions());" + NL + "\t\treturn os.toString(\"UTF8\");" + NL + "\t}" + NL + "" + NL + "}" + NL;

/* (non-javadoc)
    * @see IGenerator#generate(Object)
    */
public String generate(GenClass genClass, String jaxbUtilPackage)
  {
    final StringBuffer stringBuffer = new StringBuffer();
    stringBuffer.append(TEXT_1);
    stringBuffer.append(genClass.getGenPackage().getQualifiedPackageName());
    stringBuffer.append(TEXT_2);
    genClass.getGenModel().markImportLocation(stringBuffer, genClass.getGenPackage());
    stringBuffer.append(TEXT_3);
    stringBuffer.append(genClass.getInterfaceName());
    stringBuffer.append(TEXT_4);
    stringBuffer.append(genClass.getImportedInterfaceName());
    stringBuffer.append(TEXT_5);
    stringBuffer.append(genClass.getImportedInterfaceName());
    stringBuffer.append(TEXT_6);
    stringBuffer.append(genClass.getImportedInterfaceName());
    stringBuffer.append(TEXT_7);
    stringBuffer.append(genClass.getImportedInterfaceName());
    stringBuffer.append(TEXT_8);
    stringBuffer.append(genClass.getImportedInterfaceName());
    stringBuffer.append(TEXT_9);
    genClass.getGenModel().emitSortedImports();
    return stringBuffer.toString();
  }
}
