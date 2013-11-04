/**
 * Copyright 2013 Smart Services CRC Pty Ltd
 */
package au.com.smartservicescrc.raas.codegen.jaxb.classes;

/**
 * Represents a Java class name
 */
public class ClassLiteral {
	private final String name;

	/**
	 * Constructor
	 * 
	 * @param pack
	 *            qualified package name
	 * @param name
	 *            simple name of class
	 */
	public ClassLiteral(String name) {
		this.name = name;
	}

	public String getQualifiedName() {
		return name;
	}

	public String getName() {
		return name.substring(name.lastIndexOf('.') + 1);
	}

	/**
	 * Define equality on {@link #name}
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (this.name == null ? 0 : this.name.hashCode());
		return result;
	}

	/**
	 * Define equality on {@link #name}
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		ClassLiteral other = (ClassLiteral) obj;
		if (this.name == null) {
			if (other.name != null) {
				return false;
			}
		} else if (!this.name.equals(other.name)) {
			return false;
		}
		return true;
	}

	/**
	 * For debugging purposes
	 */
	@Override
	public String toString() {
		return name;
	}
}
