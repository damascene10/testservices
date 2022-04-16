package com.ac.testservices.model;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
@Table(name="student_laptop",uniqueConstraints = {@UniqueConstraint(name="st_laptop_serial_number_unique",columnNames="serialNumber")})
@Entity(name="StudentLaptop")
public class StudentLaptop {
	@Id
	@SequenceGenerator(name = "sq_student_laptop", sequenceName = "sq_student_laptop", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sq_student_laptop")
	@Column(name = "id", nullable = false, updatable = false,columnDefinition = "serial")
	private Long  id;
	@Column(name="serialNumber", length=20,nullable=false)
	private String serialNUmber;
	@Column(name="brand", length=100, nullable=false)
	private String brand;
	@Column(name="model", length=100, nullable=false)
	private String model;
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="student_id",
			referencedColumnName="id")
	private Student student;
	/**
	 * @return the id
	 */
	public long getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(long id) {
		this.id = id;
	}
	/**
	 * @return the serialNUmber
	 */
	public String getSerialNUmber() {
		return serialNUmber;
	}
	/**
	 * @param serialNUmber the serialNUmber to set
	 */
	public void setSerialNUmber(String serialNUmber) {
		this.serialNUmber = serialNUmber;
	}
	/**
	 * @return the brand
	 */
	public String getBrand() {
		return brand;
	}
	/**
	 * @param brand the brand to set
	 */
	public void setBrand(String brand) {
		this.brand = brand;
	}
	/**
	 * @return the model
	 */
	public String getModel() {
		return model;
	}
	/**
	 * @param model the model to set
	 */
	public void setModel(String model) {
		this.model = model;
	}
	

	/**
	 * @param serialNUmber
	 * @param brand
	 * @param model
	 */
	public StudentLaptop(String serialNUmber, String brand, String model) {
		super();
		this.serialNUmber = serialNUmber;
		this.brand = brand;
		this.model = model;
	}
	/**
	 * 
	 */
	public StudentLaptop() {
		super();
	}
	/**
	 * @param id
	 * @param serialNUmber
	 * @param brand
	 * @param model
	 */
	public StudentLaptop(long id, String serialNUmber, String brand, String model) {
		super();
		this.id = id;
		this.serialNUmber = serialNUmber;
		this.brand = brand;
		this.model = model;
	}
	
	/**
	 * @param serialNUmber
	 * @param brand
	 * @param model
	 * @param student
	 */
	public StudentLaptop(String serialNUmber, String brand, String model, Student student) {
		this.serialNUmber = serialNUmber;
		this.brand = brand;
		this.model = model;
		this.student = student;
	}
	@Override
	public String toString() {
		return "StudentLaptop [id=" + id + ", serialNUmber=" + serialNUmber + ", brand=" + brand + ", model=" + model
				+ ", student=" + student + "]";
	}
	
	
	
	

}
