package com.deloitte.employee.model;

import java.sql.Date;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor; 

@Entity
@Table(name = "employees")
@Data
public class Employee {


	@Id
	@Column(name="emp_id")
	@NotNull(message = "cannot be blank")
	private Long empId;
	
	@NotBlank(message = "cannot be blank")
	@Size(min=1,max = 50,message = "must be between 1-50 characters")
	@Pattern(regexp = "^[a-zA-Z]", message = "must contain only alphabets")
	@Column(name="first_name")
	private String firstName;
	
	@NotBlank(message = "cannot be blank")
	@Size(min=1,max=50,message = "must be between 1-50 characters")
	@Pattern(regexp = "^[a-zA-Z]", message = "must contain only alphabets")
	@Column(name="last_name")
	private String LastName;
	
	@Pattern(regexp = "^(M|F|m|f|ND)$", message = "should be M,F or ND")
	@NotBlank(message = "cannot be blank")
	private String gender;
	
//	@NotBlank(message = "cannot be blank")
	private Date dob;
	
	
	@Column(name="pan_num")
	@Pattern(regexp = "^[a-zA-Z0-9]$", message="must be alphanumeric")
	@Size(min=10, max=10,message = "should have exactly 10 characters")
	private String panNum;
	
	@Pattern(regexp = "^[0-9]$", message="must be numeric")
	@Size(min=12,max=12,message = "should have exactly 12 characters")
	@Column(name="aadhaar_num")
	private String aadhaarNum;
	
	@NotBlank(message = "cannot be blank")
	@Size(min=10, max=10,message="")
	@Pattern(regexp = "^[0-9]$", message = "should be numeric")
	@Column(name="mobile_num")
	private String mobileNum;
	
	@NotBlank(message = "cannot be blank")
	@Email
	@Column(name="email_id")
	private String emailId;
	
	@Email
	@NotBlank(message = "cannot be blank")
	@Column(name="office_mail")
	private String officeMail;
	
	@Size(max=200)
	@NotBlank(message = "cannot be blank")
	@Column(name="permanent_address")
	private String permanentAddress;
	
	@Size(max=200)
	@NotBlank(message = "cannot be blank")
	@Column(name="present_address")
	private String presentAddress;
	
	@Pattern(regexp = "^(A|B|AB|O)[+-]$")
	@NotBlank(message = "cannot be blank")
	@Column(name="blood_group")
	private String bloodGroup;
	
	
	@Column(name="profile_pict")
	private String profilePic;
	
//	@NotBlank(message = "cannot be blank")
	private Date doj;
	
	@Min(value=7,message="min is 7")
	@Max(value=13,message="max is 13")
	@NotNull(message = "cannot be blank")
	@Column(name="emp_level")
	private Integer empLevel;
	
	@Pattern(regexp = "(A-Za-z)[//s]$")
	@NotBlank(message = "cannot be blank")
	@Column(name="post_name")
	private String postName;
	
	@Min(value=9999,message = "should be more than 10 thousand")
	@Max(value=10000000,message="should be less than 1 crore")
	@NotNull(message = "cannot be blank")
	@Column(name="basic_pay")
	private Long basicPay;
	
	
	@Min(value=2000,message="should be more than 2000")
	@Max(value=20000,message="should be less than 20 thousand")
	@NotNull(message = "cannot be blank")
	@Column(name="house_allowance")
	private Long houseAllowance;

	
	public Employee() {
		
	}

	public Employee(Long empId, String firstName, String lastName, String gender, Date dob, String panNum,
			String aadhaarNum, String mobileNum, String emailId, String officeMail, String permanentAddress,
			String presentAddress, String bloodGroup, String profilePic, Date doj, Integer empLevel,
			String postName, Long basicPay, Long houseAllowance) {
		super();
		this.empId = empId;
		this.firstName = firstName;
		LastName = lastName;
		this.gender = gender;
		this.dob = dob;
		this.panNum = panNum;
		this.aadhaarNum = aadhaarNum;
		this.mobileNum = mobileNum;
		this.emailId = emailId;
		this.officeMail = officeMail;
		this.permanentAddress = permanentAddress;
		this.presentAddress = presentAddress;
		this.bloodGroup = bloodGroup;
		this.profilePic = profilePic;
		this.doj = doj;
		this.empLevel = empLevel;
		this.postName = postName;
		this.basicPay = basicPay;
		this.houseAllowance = houseAllowance;
		//this.empName=firstName+lastName;
	}

	public Long getEmpId() {
		return empId;
	}

	public void setEmpId(Long empId) {
		this.empId = empId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return LastName;
	}

	public void setLastName(String lastName) {
		LastName = lastName;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public String getPanNum() {
		return panNum;
	}

	public void setPanNum(String panNum) {
		this.panNum = panNum;
	}

	public String getAadhaarNum() {
		return aadhaarNum;
	}

	public void setAadhaarNum(String aadhaarNum) {
		this.aadhaarNum = aadhaarNum;
	}

	public String getMobileNum() {
		return mobileNum;
	}

	public void setMobileNum(String mobileNum) {
		this.mobileNum = mobileNum;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getOfficeMail() {
		return officeMail;
	}

	public void setOfficeMail(String officeMail) {
		this.officeMail = officeMail;
	}

	public String getPermanentAddress() {
		return permanentAddress;
	}

	public void setPermanentAddress(String permanentAddress) {
		this.permanentAddress = permanentAddress;
	}

	public String getPresentAddress() {
		return presentAddress;
	}

	public void setPresentAddress(String presentAddress) {
		this.presentAddress = presentAddress;
	}

	public String getBloodGroup() {
		return bloodGroup;
	}

	public void setBloodGroup(String bloodGroup) {
		this.bloodGroup = bloodGroup;
	}

	public String getProfilePic() {
		return profilePic;
	}

	public void setProfilePic(String profilePic) {
		this.profilePic = profilePic;
	}

	public Date getDoj() {
		return doj;
	}

	public void setDoj(Date doj) {
		this.doj = doj;
	}

	public Integer getEmpLevel() {
		return empLevel;
	}

	public void setEmpLevel(Integer empLevel) {
		this.empLevel = empLevel;
	}

	public String getPostName() {
		return postName;
	}

	public void setPostName(String postName) {
		this.postName = postName;
	}

	public Long getBasicPay() {
		return basicPay;
	}

	public void setBasicPay(Long basicPay) {
		this.basicPay = basicPay;
	}

	public Long getHouseAllowance() {
		return houseAllowance;
	}

	public void setHouseAllowance(Long houseAllowance) {
		this.houseAllowance = houseAllowance;
	}
	

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", firstName=" + firstName + ", LastName=" + LastName + ", gender=" + gender
				+ ", dob=" + dob + ", panNum=" + panNum + ", aadhaarNum=" + aadhaarNum + ", mobileNum=" + mobileNum
				+ ", emailId=" + emailId + ", officeMail=" + officeMail + ", permanentAddress=" + permanentAddress
				+ ", presentAddress=" + presentAddress + ", bloodGroup=" + bloodGroup + ", profilePic=" + profilePic
				+ ", doj=" + doj + ", empLevel=" + empLevel + ", postName=" + postName + ", basicPay=" + basicPay
				+ ", houseAllowance=" + houseAllowance + "]";
	}
	
	
}
