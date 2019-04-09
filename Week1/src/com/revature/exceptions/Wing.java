package com.revature.exceptions;

import java.io.Serializable;

/**
 * @author Alec Batson
 *
 */
public class Wing implements Serializable{

	private String name;
	
	private String type;
	
	private int spiceLevel;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getSpiceLevel() {
		return spiceLevel;
	}

	public void setSpiceLevel(int spiceLevel) {
		this.spiceLevel = spiceLevel;
	}

	public Wing(String name, String type, int spiceLevel) {
		super();
		this.name = name;
		this.type = type;
		this.spiceLevel = spiceLevel;
	}

	public Wing() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Wing [name=" + name + ", type=" + type + ", spiceLevel=" + spiceLevel + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + spiceLevel;
		result = prime * result + ((type == null) ? 0 : type.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Wing other = (Wing) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (spiceLevel != other.spiceLevel)
			return false;
		if (type == null) {
			if (other.type != null)
				return false;
		} else if (!type.equals(other.type))
			return false;
		return true;
	}
	
	
	
	
}
