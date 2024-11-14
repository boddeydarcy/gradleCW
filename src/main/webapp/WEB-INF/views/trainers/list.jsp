<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
</head>
<body>
<h1>Trainers</h1>
<table>
    <tr>
        <th>Trainer Name</th>
        <th>Trainer Skills</th>
        <th>Expertise</th>
        <th>Class Duration</th>
    </tr>
    <c:forEach items="${gym.trainers}" var="trainer">
        <tr>
            <td>${trainer.name}</td>
            <td>${trainer.skills}</td>
            <td>${trainer.expertise}</td>
            <td>${trainer.duration}</td>
        </tr>
    </c:forEach>
</table>
<br>
<a href="/gyms">Back to gym list</a>
<a href="/newTrainer/${gym.id}">Add new trainers to gym</a>
</body>
</html>