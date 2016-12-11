package org.eclipse.emf.ecore.jaxb;

import javax.xml.bind.annotation.XmlType;

@XmlType(name = "TimeZone")
public class TimeZoneID {
	private String id;

	public String getID() {
		return this.id;
	}

	public void setID(String id) {
		this.id = id;
	}
}
