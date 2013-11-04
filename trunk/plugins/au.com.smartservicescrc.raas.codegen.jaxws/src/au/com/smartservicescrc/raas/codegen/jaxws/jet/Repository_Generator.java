package au.com.smartservicescrc.raas.codegen.jaxws.jet;

import au.com.smartservicescrc.raas.codegen.jaxws.wizard.*;
import java.util.*;
import org.eclipse.emf.ecore.*;
import org.eclipse.emf.codegen.ecore.genmodel.*;
import org.eclipse.emf.codegen.util.CodeGenUtil;

public class Repository_Generator 
 {
 
  protected static String nl;
  public static synchronized Repository_Generator create(String lineSeparator)
  {
    nl = lineSeparator;
    Repository_Generator result = new Repository_Generator();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = "";
  protected final String TEXT_2 = NL + NL + "package ";
  protected final String TEXT_3 = ";" + NL + " " + NL + "import javax.jws.WebService;";
  protected final String TEXT_4 = NL + "import javax.ws.rs.Path;";
  protected final String TEXT_5 = NL;
  protected final String TEXT_6 = NL;
  protected final String TEXT_7 = NL + "@Path(\"/";
  protected final String TEXT_8 = "\")";
  protected final String TEXT_9 = NL + "@WebService(endpointInterface = \"";
  protected final String TEXT_10 = ".jaxws.";
  protected final String TEXT_11 = "\", serviceName = \"";
  protected final String TEXT_12 = "\")" + NL + "public class ";
  protected final String TEXT_13 = "Impl extends ";
  protected final String TEXT_14 = ".raas.WebserviceRepository implements ";
  protected final String TEXT_15 = ".jaxws.";
  protected final String TEXT_16 = " {" + NL + " " + NL + " \tpublic ";
  protected final String TEXT_17 = "Impl() throws Exception {" + NL + "\t\tsuper(";
  protected final String TEXT_18 = ".eINSTANCE";
  protected final String TEXT_19 = ");" + NL + "\t}" + NL + "  ";
  protected final String TEXT_20 = "    ";
  protected final String TEXT_21 = NL + "\t// RepositoryRoot operations for ";
  protected final String TEXT_22 = NL;
  protected final String TEXT_23 = NL + "\tpublic ";
  protected final String TEXT_24 = " Get";
  protected final String TEXT_25 = "(";
  protected final String TEXT_26 = " rootRef) throws Exception {" + NL + "\t\treturn getter(rootRef,";
  protected final String TEXT_27 = "());" + NL + "\t}" + NL + "" + NL + "\tpublic void Set";
  protected final String TEXT_28 = "(";
  protected final String TEXT_29 = " rootRef, ";
  protected final String TEXT_30 = " valuesRef) throws Exception {" + NL + "\t\tsetter(rootRef,";
  protected final String TEXT_31 = "(),valuesRef);" + NL + "\t}" + NL;
  protected final String TEXT_32 = NL + "\t// CRUD operations for ";
  protected final String TEXT_33 = NL + NL + "\tpublic ";
  protected final String TEXT_34 = " Create";
  protected final String TEXT_35 = "(";
  protected final String TEXT_36 = " value) throws Exception {" + NL + "\t\treturn create(value);" + NL + "\t}" + NL + "" + NL + "\tpublic ";
  protected final String TEXT_37 = " Get";
  protected final String TEXT_38 = "AndGotoSubresource(";
  protected final String TEXT_39 = " valueRef) throws Exception {" + NL + "\t\treturn get(valueRef);" + NL + "\t}" + NL + "" + NL + "\tpublic ";
  protected final String TEXT_40 = " Get";
  protected final String TEXT_41 = "(";
  protected final String TEXT_42 = " valueRef) throws Exception {" + NL + "\t\treturn get(valueRef);" + NL + "\t}" + NL + "" + NL + "\tpublic void Update";
  protected final String TEXT_43 = "(";
  protected final String TEXT_44 = " valueRef, ";
  protected final String TEXT_45 = " value) throws Exception {" + NL + "\t\tupdate(valueRef, value);" + NL + "\t}" + NL + "" + NL + "\tpublic void Delete";
  protected final String TEXT_46 = "(";
  protected final String TEXT_47 = " valueRef) throws Exception {" + NL + "\t\tdelete(valueRef);" + NL + "\t}" + NL + "" + NL + "\tpublic List<";
  protected final String TEXT_48 = "> GetAll";
  protected final String TEXT_49 = "() throws Exception {" + NL + "\t\treturn getAllInstances(";
  protected final String TEXT_50 = ");" + NL + "\t}" + NL + "\t";
  protected final String TEXT_51 = NL + "    " + NL + "\t@Override" + NL + "\tpublic List<?> Query(String queryString) throws Exception {" + NL + "\t\treturn query(queryString);" + NL + "\t}" + NL + "\t" + NL + "}";

/* (non-javadoc)
    * @see IGenerator#generate(Object)
    */
public String generate(Collection<GenClass> genRepositoryRoots, Collection<GenClass> genTopClasses, String targetPackage, String serviceName, String itfPackage)
  {
    final StringBuffer stringBuffer = new StringBuffer();
    stringBuffer.append(TEXT_1);
     GenModel genModel = genRepositoryRoots.iterator().next().getGenModel(); 
    stringBuffer.append(TEXT_2);
    stringBuffer.append(targetPackage);
    stringBuffer.append(TEXT_3);
     if (GenerateJAXWS.enableJAXRS) { 
    stringBuffer.append(TEXT_4);
     } 
    stringBuffer.append(TEXT_5);
    genModel.markImportLocation(stringBuffer);
    stringBuffer.append(TEXT_6);
     if (GenerateJAXWS.enableJAXRS) { 
    stringBuffer.append(TEXT_7);
    stringBuffer.append(serviceName.substring(0,"Repository".length()));
    stringBuffer.append(TEXT_8);
     } 
    stringBuffer.append(TEXT_9);
    stringBuffer.append(itfPackage);
    stringBuffer.append(TEXT_10);
    stringBuffer.append(serviceName);
    stringBuffer.append(TEXT_11);
    stringBuffer.append(serviceName);
    stringBuffer.append(TEXT_12);
    stringBuffer.append(serviceName);
    stringBuffer.append(TEXT_13);
    stringBuffer.append(targetPackage);
    stringBuffer.append(TEXT_14);
    stringBuffer.append(itfPackage);
    stringBuffer.append(TEXT_15);
    stringBuffer.append(serviceName);
    stringBuffer.append(TEXT_16);
    stringBuffer.append(serviceName);
    stringBuffer.append(TEXT_17);
    for (GenPackage genPackage: genModel.getGenPackages()) { 
    stringBuffer.append(genPackage==genModel.getGenPackages().iterator().next()?"":", ");
    stringBuffer.append(genPackage.getImportedPackageInterfaceName());
    stringBuffer.append(TEXT_18);
    ; } 
    stringBuffer.append(TEXT_19);
     for (GenClass genRepositoryRoot: genRepositoryRoots) { 
    stringBuffer.append(TEXT_20);
     String repositoryRootName = genRepositoryRoot.getImportedInterfaceName(); 
    stringBuffer.append(TEXT_21);
    stringBuffer.append(repositoryRootName);
    stringBuffer.append(TEXT_22);
     for (GenFeature genFeature: genRepositoryRoot.getAllGenFeatures()) { 
    stringBuffer.append(TEXT_23);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_24);
    stringBuffer.append(genFeature.getName());
    stringBuffer.append(TEXT_25);
    stringBuffer.append(repositoryRootName);
    stringBuffer.append(TEXT_26);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessorName());
    stringBuffer.append(TEXT_27);
    stringBuffer.append(genFeature.getName());
    stringBuffer.append(TEXT_28);
    stringBuffer.append(repositoryRootName);
    stringBuffer.append(TEXT_29);
    stringBuffer.append(genFeature.getImportedType());
    stringBuffer.append(TEXT_30);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessorName());
    stringBuffer.append(TEXT_31);
     } 
     } 
     for (GenClass genTopClass: genTopClasses) { 
         String topClassName=genTopClass.getImportedInterfaceName(); 
    stringBuffer.append(TEXT_32);
    stringBuffer.append(topClassName);
    stringBuffer.append(TEXT_33);
    stringBuffer.append(topClassName);
    stringBuffer.append(TEXT_34);
    stringBuffer.append(topClassName);
    stringBuffer.append(TEXT_35);
    stringBuffer.append(topClassName);
    stringBuffer.append(TEXT_36);
    stringBuffer.append(topClassName);
    stringBuffer.append(TEXT_37);
    stringBuffer.append(topClassName);
    stringBuffer.append(TEXT_38);
    stringBuffer.append(topClassName);
    stringBuffer.append(TEXT_39);
    stringBuffer.append(topClassName);
    stringBuffer.append(TEXT_40);
    stringBuffer.append(topClassName);
    stringBuffer.append(TEXT_41);
    stringBuffer.append(topClassName);
    stringBuffer.append(TEXT_42);
    stringBuffer.append(topClassName);
    stringBuffer.append(TEXT_43);
    stringBuffer.append(topClassName);
    stringBuffer.append(TEXT_44);
    stringBuffer.append(topClassName);
    stringBuffer.append(TEXT_45);
    stringBuffer.append(topClassName);
    stringBuffer.append(TEXT_46);
    stringBuffer.append(topClassName);
    stringBuffer.append(TEXT_47);
    stringBuffer.append(topClassName);
    stringBuffer.append(TEXT_48);
    stringBuffer.append(topClassName);
    stringBuffer.append(TEXT_49);
    stringBuffer.append(genTopClass.getQualifiedClassifierAccessor());
    stringBuffer.append(TEXT_50);
     } 
    stringBuffer.append(TEXT_51);
    genModel.emitSortedImports();
    return stringBuffer.toString();
  }
}
