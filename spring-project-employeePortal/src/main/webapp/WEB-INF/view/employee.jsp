<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="UTF-8"%><%@ taglib
	uri="http://java.sun.com/jsp/jstl/core" prefix="c"%><%@ taglib
	uri="http://www.springframework.org/tags/form" prefix="form"%><%@ page
	isELIgnored="false"%><c:set var="contextRoot"
	value="${pageContext.request.contextPath}" />
<!DOCTYPE html>
<html>
<head>
<style type="text/css">.error{color:red;}</style>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<div style="text-align: center">
		<h1>EMPLOYEE SEARCH LIST SCREEN</h1>
	</div>
	<form:form action="${contextRoot}/employee" method="post"
		modelAttribute="employee"> Emp no(*) <form:input
			path="empId" placeholder="Employee id" />
	<form:errors path="empId" cssClass="error" />
		<br>
		<br>First Name(*) <form:input path="firstName"
			placeholder="first name" />
			<form:errors path="firstName" cssClass="error" />
		<br>
		<br>Mobile num(*) <form:input path="mobileNum"
			placeholder="TextBox" />
			<form:errors path="mobileNum" cssClass="error" />
		<br>
		<br>Date of birth(*) <form:input path="dob" type="date" data-date-inline-picker="false" data-date-open-on-focus="true"/>
		<br>
		<br>Office mail(*) <form:input path="officeMail"
			placeholder="office mail" />
			<form:errors path="officeMail" cssClass="error" />
		<br>
		<br>Joining date(*) <form:input path="doj" type="date" data-date-inline-picker="false" data-date-open-on-focus="true"/>
		<br>
		<br>Post(*) <form:input path="postName" placeholder="post" />
		<form:errors path="postName" cssClass="error" />
		<br>
		<br>Basic pay(*) <form:input path="basicPay"
			placeholder="basic pay" />
			<form:errors path="basicPay" cssClass="error" />
		<br>
		<br>Pan Card no <form:input path="panNum"
			placeholder="pan card number" />
			<form:errors path="panNum" cssClass="error" />
		<br>
		<br>Permanent Address <form:input path="permanentAddress"
			placeholder="permanent number" />
			<form:errors path="permanentAddress" cssClass="error" />
		<br>
		<br>Last name(*) <form:input path="lastName"
			placeholder="Last name" />
			<form:errors path="lastName" cssClass="error" />
		<br>
		<br>Email personal(*) <form:input path="emailId"
			placeholder="Personal email" />
			<form:errors path="emailId" cssClass="error" />
		<br>
		<br>Employee level <form:input path="empLevel"
			placeholder="Employee level" />
			<form:errors path="empLevel" cssClass="error" />
		<br>
		<br>Blood Group <form:input path="bloodGroup"
			placeholder="blood group" />
			<form:errors path="bloodGroup" cssClass="error" />
		<br>
		<br>House allowance <form:input path="houseAllowance"
			placeholder="TextBox" />
			<form:errors path="houseAllowance" cssClass="error" />
		<br>
		<br>Aadhaar card no <form:input path="aadhaarNum"
			placeholder="TextBox" />
			<form:errors path="aadhaarNum" cssClass="error" />
		<br>
		<br>Present Address <form:input path="presentAddress"
			placeholder="TextBox" />
			<form:errors path="presentAddress" cssClass="error" />
		<br>
		<br>Gender <form:input path="gender" placeholder="m/f"/>
		<form:errors path="gender" cssClass="error" />
		<br>
		<br>  <button type="submit">Add Employee</button>  </form:form>