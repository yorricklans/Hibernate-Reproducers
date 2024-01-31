package org.hibernate.bugs;

import org.hibernate.annotations.JdbcTypeCode;
import org.hibernate.type.SqlTypes;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class ContainerObject {

	@Id
	private Integer id;
	
	@JdbcTypeCode(SqlTypes.JSON)
	private JsonAggregate jsonAggregate;
	
	public Integer getId() {
		return id;
	}

	public JsonAggregate getJsonAggregate() {
		return jsonAggregate;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}
	
	public void setJsonAggregate(JsonAggregate jsonAggregate) {
		this.jsonAggregate = jsonAggregate;
	}
}
