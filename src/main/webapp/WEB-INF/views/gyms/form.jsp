<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<%--@elvariable id="gym" type=""--%>
<form:form modelAttribute="gym" action="/addGym" method="post">
    <%--ID is set from the length of the gyms list + 1 so no two id's can be the same--%>
    <p>ID: ${id}</p>

    <%--Inputs for the Websites and classes--%>
    <label for="website">Website:</label>
    <form:input path="website" id="website"/>

    <label for="classes">Classes:</label>
    <form:input path="classes" id="classes"/>

    <button type="submit">Add Gym</button>

</form:form>
<%--Navigation button--%>
<a href="/gyms">Back to Gym List</a>