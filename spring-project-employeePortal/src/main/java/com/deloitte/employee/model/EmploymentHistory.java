package com.deloitte.employee.model;
 
import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
 
@Entity
@Table(name="employement_history")
@Data
public class EmploymentHistory {
    
    @Id
    private Long id;
    
    @Column(name="emp_id")
    private Long empId;
    
    @Column(name="organization_name")
    private String organizationName;
    
    @Column(name="from_date")
    private Date fromDate;
    
    @Column(name="until_date")
    private Date untilDate;
    
    @Column(name="location")
    private String location;
    
    @Column(name="country")
    private String country;
    
    @Column(name="post")
    private String post;
    
    @Column(name="skill_used")
    private String skillUsed;

    
    
	public EmploymentHistory() {
	
	}

	public EmploymentHistory(Long id, Long empId, String organizationName, Date fromDate, Date untilDate,
			String location, String country, String post, String skillUsed) {
		super();
		this.id = id;
		this.empId = empId;
		this.organizationName = organizationName;
		this.fromDate = fromDate;
		this.untilDate = untilDate;
		this.location = location;
		this.country = country;
		this.post = post;
		this.skillUsed = skillUsed;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getEmpId() {
		return empId;
	}

	public void setEmpId(Long empId) {
		this.empId = empId;
	}

	public String getOrganizationName() {
		return organizationName;
	}

	public void setOrganizationName(String organizationName) {
		this.organizationName = organizationName;
	}

	public Date getFromDate() {
		return fromDate;
	}

	public void setFromDate(Date fromDate) {
		this.fromDate = fromDate;
	}

	public Date getUntilDate() {
		return untilDate;
	}

	public void setUntilDate(Date untilDate) {
		this.untilDate = untilDate;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getPost() {
		return post;
	}

	public void setPost(String post) {
		this.post = post;
	}

	public String getSkillUsed() {
		return skillUsed;
	}

	public void setSkillUsed(String skillUsed) {
		this.skillUsed = skillUsed;
	}
    
    
 
}

