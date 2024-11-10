<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<form:form action="/gyms" method="post">
    <label for="id">Gym ID:</label>
    <input type="text" id="id" name="id" required /><br />

    <label for="classes">Classes:</label>
    <input type="text" id="classes" name="classes" required /><br />

    <label for="website">Website:</label>
    <input type="text" id="website" name="website" required /><br />

    <input type="submit">
</form:form>

<a href="/gyms">Back to Gym List</a>