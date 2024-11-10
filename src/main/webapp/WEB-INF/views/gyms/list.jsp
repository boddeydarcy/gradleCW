<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
</head>
<body>
<h2>Gym List</h2>
<table>
    <tr>
        <th>Gym ID</th>
        <th>Visit Website</th>
        <th>Find Trainers</th>
    </tr>
    <c:forEach items="${gyms}" var="gym">
        <tr>
            <td>${gym.id}</td>
            <td><a href="${gym.website}" target="_blank">Website</a></td>
            <td><a href="/trainers?gym=${gym.id}">View Trainers</a></td>
        </tr>
    </c:forEach>
</table>
</body>
</html>