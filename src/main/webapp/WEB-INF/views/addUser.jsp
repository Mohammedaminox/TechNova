<html>
<head>
    <title>Add New User</title>
</head>
<body>
<h2>Add New User</h2>

<form action="add" method="post">
    <table>
        <tr>
            <td>Nom:</td>
            <td><input type="text" name="nom" required /></td>
        </tr>
        <tr>
            <td>Prenom:</td>
            <td><input type="text" name="prenom" required /></td>
        </tr>
        <tr>
            <td>Piece d'Identification:</td>
            <td><input type="text" name="pieceIdentification" required /></td>
        </tr>
        <tr>
            <td>Nationalite:</td>
            <td><input type="text" name="nationalite" required /></td>
        </tr>
        <tr>
            <td>Date d'Inscription:</td>
            <td><input type="date" name="dateInscription" required /></td>
        </tr>
        <tr>
            <td>Date d'Expiration:</td>
            <td><input type="date" name="dateExpiration" required /></td>
        </tr>
        <tr>
            <td colspan="2">
                <input type="submit" value="Add User" />
            </td>
        </tr>
    </table>
</form>

<a href="list">Back to Users List</a>


</body>
</html>
