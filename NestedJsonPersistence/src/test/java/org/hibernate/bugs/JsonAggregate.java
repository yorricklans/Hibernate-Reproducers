package org.hibernate.bugs;

import org.hibernate.annotations.JdbcTypeCode;
import org.hibernate.type.SqlTypes;

import jakarta.persistence.Embeddable;

@Embeddable
public class JsonAggregate {
	
	@JdbcTypeCode(SqlTypes.JSON)
	private NestedJsonAggregate nestedJsonAggregate;

	public NestedJsonAggregate getNestedJsonAggregate() {
		return nestedJsonAggregate;
	}

	public void setNestedJsonAggregate(NestedJsonAggregate nestedJsonAggregate) {
		this.nestedJsonAggregate = nestedJsonAggregate;
	}
}
