package com.nous.datastructure.customhash;

import java.util.Objects;

public class Employee {

	private String empName;
	private Long empId;
	private Double empSalary;

	// Parameterized constructors
	public Employee(String empName, Long empId, Double empSalary) {
		super();
		this.empName = empName;
		this.empId = empId;
		this.empSalary = empSalary;
	}

	// Getter and Setter Methods
	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public Long getEmpId() {
		return empId;
	}

	public void setEmpId(Long empId) {
		this.empId = empId;
	}

	public Double getEmpSalary() {
		return empSalary;
	}

	public void setEmpSalary(Double empSalary) {
		this.empSalary = empSalary;
	}

	// Overriding toString method
	@Override
	public String toString() {
		return "Employee [empName=" + empName + ", empId=" + empId + ", empSalary=" + empSalary + "]";
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		return Objects.hash(empId, empName, empSalary);
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof Employee))
			return false;
		Employee other = (Employee) obj;
		return Objects.equals(empId, other.empId) && Objects.equals(empName, other.empName)
				&& Objects.equals(empSalary, other.empSalary);
	}

		
}
