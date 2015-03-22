<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="/struts-tags" prefix="s"%>
<h2>Flashcards Page</h2>
<br>

<s:iterator value="flashCards">

	<strong>Question:</strong> &nbsp; <s:property value="question" /> <br>
	<strong>Answer:</strong> &nbsp;  <s:property value="answer" />

</s:iterator>