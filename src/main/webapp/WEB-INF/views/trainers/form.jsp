<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<%--@elvariable id="trainer" type=""--%>
<input type="hidden" name="gym" value="${id}" />
<form:form modelAttribute="trainer" action="/addTrainer?gym=${id}" method="post">
    <h2>Add trainer to Gym: ${id}</h2>

    <%--Inputs for the trainer variables--%>
    <label for="name">Name:</label>
    <form:input path="name" id="name"/>
    <br>
    <br>
    <label for="skills">Skills:</label>
    <form:input path="skills" id="skills"/>
    <br>
    <br>
    <label for="expertise">Expertise:</label>
    <form:input path="expertise" id="expertise"/>
    <br>
    <br>
    <label for="duration">Duration of Classes:</label>
    <form:input path="duration" id="duration"/>
    <br>
    <br>
    <button type="submit">Add Trainer</button>
</form:form>
<br>
<a href="/trainers">Back to Trainer List</a>