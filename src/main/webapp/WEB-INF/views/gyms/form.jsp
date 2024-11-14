<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<%--@elvariable id="gym" type=""--%>
<form:form modelAttribute="gym" action="/addGym" method="post">
    <label for="id">Gym ID:</label>
    <form:input path="id" id="id"/>
    <form:errors path="id"/>
    <br>
    <br>
    <%--Inputs for the Websites and classes--%>
    <label for="website">Website:</label>
    <form:input path="website" id="website"/>
    <form:errors path="website"/>
    <br>
    <br>
    <label for="classes">Classes:</label>
    <form:input path="classes" id="classes"/>
    <form:errors path="classes"/>
    <br>
    <br>
    <button type="submit">Add Gym</button>

</form:form>
<%--Navigation button--%>
<a href="/gyms">Back to Gym List</a>