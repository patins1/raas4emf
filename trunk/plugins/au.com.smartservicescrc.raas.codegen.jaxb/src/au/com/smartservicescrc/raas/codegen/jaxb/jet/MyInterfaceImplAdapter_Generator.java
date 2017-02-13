
package au.com.smartservicescrc.raas.codegen.jaxb.jet;

import org.eclipse.emf.codegen.ecore.genmodel.GenClass;
import org.eclipse.emf.codegen.ecore.genmodel.GenClassifier;
import org.eclipse.emf.codegen.ecore.genmodel.GenEnum;
import org.eclipse.emf.codegen.ecore.genmodel.GenFeature;


public class MyInterfaceImplAdapter_Generator 
 {
 
  protected static String nl;
  public static synchronized MyInterfaceImplAdapter_Generator create(String lineSeparator)
  {
    nl = lineSeparator;
    MyInterfaceImplAdapter_Generator result = new MyInterfaceImplAdapter_Generator();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = "package ";
  protected final String TEXT_2 = ".jaxb;" + NL + "" + NL + "import ";
  protected final String TEXT_3 = ".EObjectImplAdapter;";
  protected final String TEXT_4 = NL;
  protected final String TEXT_5 = NL + "public class ";
  protected final String TEXT_6 = "ImplAdapter extends EObjectImplAdapter<";
  protected final String TEXT_7 = ", ";
  protected final String TEXT_8 = "> {" + NL + "}" + NL;
  protected final String TEXT_9 = NL + "import org.eclipse.emf.ecore.EObject;" + NL + "import org.eclipse.emf.ecore.impl.BasicEObjectImpl;" + NL + "" + NL + "public class ";
  protected final String TEXT_10 = "ImplAdapter extends EObjectImplAdapter<BasicEObjectImpl, EObject> {" + NL + "}" + NL;

/* (non-javadoc)
    * @see IGenerator#generate(Object)
    */
public String generate(GenClass genClass, String jaxbUtilPackage)
  {
    final StringBuffer stringBuffer = new StringBuffer();
    stringBuffer.append(TEXT_1);
    stringBuffer.append(genClass.getGenPackage().getQualifiedPackageName());
    stringBuffer.append(TEXT_2);
    stringBuffer.append(jaxbUtilPackage);
    stringBuffer.append(TEXT_3);
    genClass.getGenModel().markImportLocation(stringBuffer, genClass.getGenPackage());
    stringBuffer.append(TEXT_4);
     if (!genClass.isInterface()) { 
    stringBuffer.append(TEXT_5);
    stringBuffer.append(genClass.getInterfaceName());
    stringBuffer.append(TEXT_6);
    stringBuffer.append(genClass.getImportedClassName());
    stringBuffer.append(TEXT_7);
    stringBuffer.append(genClass.getImportedInterfaceName());
    stringBuffer.append(TEXT_8);
     } else { 
    stringBuffer.append(TEXT_9);
    stringBuffer.append(genClass.getInterfaceName());
    stringBuffer.append(TEXT_10);
     } 
    genClass.getGenModel().emitSortedImports();
    return stringBuffer.toString();
  }
}
