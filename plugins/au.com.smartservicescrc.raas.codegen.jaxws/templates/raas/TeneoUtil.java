package raas.experiments.jaxbased.webservice.raas;

import java.util.Properties;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.teneo.hibernate.HbDataStore;
import org.eclipse.emf.teneo.hibernate.HbHelper;
import org.hibernate.cfg.Environment;

public class TeneoUtil {
	private static final String dataStoreName = "USDLDataStore";

	public static HbDataStore configureDataStore(EPackage[] packages) {
		HbDataStore dataStore = HbHelper.INSTANCE.createRegisterDataStore(dataStoreName);
		Properties props = new Properties();
		props.setProperty(Environment.DRIVER, "org.hsqldb.jdbcDriver");
		props.setProperty(Environment.USER, "sa");
		props.setProperty(Environment.URL, "jdbc:hsqldb:mem:library");
		props.setProperty(Environment.PASS, "");
		props.setProperty(Environment.DIALECT, org.hibernate.dialect.HSQLDialect.class.getName());
		// InputStream is =
		// TeneoRepository.class.getClassLoader().getResourceAsStream("hibernate.properties");
		// props.load(is);
		dataStore.setProperties(props);
		dataStore.setEPackages(packages);
		// Initialise the data store, which creates the tables
		dataStore.initialize();
		System.out.println("Top entities are:");
		for (String te : dataStore.getTopEntities())
			System.out.println(te);
		return dataStore;
	}
}
