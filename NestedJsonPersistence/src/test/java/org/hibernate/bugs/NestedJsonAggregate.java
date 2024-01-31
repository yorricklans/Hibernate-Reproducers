package org.hibernate.bugs;

import jakarta.persistence.Embeddable;

@Embeddable
public class NestedJsonAggregate {
	
	String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
