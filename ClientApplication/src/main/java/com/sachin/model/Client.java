package com.sachin.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table
public class Client {
	
	@Id
	@Column
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column
	private String strFirstName;
	@Column
	private String strLastName;
	@Column
	private String strEmail;
	
	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * @return the strFirstName
	 */
	public String getFirstName() {
		return strFirstName;
	}
	/**
	 * @param strFirstName the strFirstName to set
	 */
	public void setFirstName(String strFirstName) {
		this.strFirstName = strFirstName;
	}
	/**
	 * @return the strLastName
	 */
	public String getLastName() {
		return strLastName;
	}
	/**
	 * @param strLastName the strLastName to set
	 */
	public void setLastName(String strLastName) {
		this.strLastName = strLastName;
	}
	/**
	 * @return the strEmail
	 */
	public String getEmail() {
		return strEmail;
	}
	/**
	 * @param strEmail the strEmail to set
	 */
	public void setEmail(String strEmail) {
		this.strEmail = strEmail;
	}

	
	
	

}
