<html>
<head>
    <title>Users List</title>
</head>
<body>
<h2>List of Users</h2>

<table border="1">
    <tr>
        <th>ID</th>
        <th>Nom</th>
        <th>Prenom</th>
        <th>Nationalite</th>
        <th>Actions</th>
    </tr>

    <%
        // Retrieve the list of users from the request attribute
        java.util.List<org.medamine.model.User> users = (java.util.List<org.medamine.model.User>) request.getAttribute("users");

        if (users != null) {
            for (org.medamine.model.User user : users) {
    %>
    <tr>
        <td><%= user.getId() %></td>
        <td><%= user.getNom() %></td>
        <td><%= user.getPrenom() %></td>
        <td><%= user.getNationalite() %></td>
        <td>
            <a href="update?userId=<%= user.getId() %>">Update</a> |
            <a href="delete?userId=<%= user.getId() %>">Delete</a>
        </td>
    </tr>
    <%
        }
    } else {
    %>
    <tr>
        <td colspan="5">No users found.</td>
    </tr>
    <%
        }
    %>
</table>

<a href="add">Add New User</a>
</body>
</html>
