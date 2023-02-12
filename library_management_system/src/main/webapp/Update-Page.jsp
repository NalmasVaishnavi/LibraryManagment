<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Update User</title>
</head>
<body>
	<h2>Update User</h2>
	<form action="update" method="post">
		<label for="firstName">FirstName:</label> 
			<input type="text" id="FirstName" name="FirstName"><br><br> 
		<label for="lastName">LastName:</label>
			<input type="text" id="LastName" name="LastName"><br><br> 
		<label for="address">Addresss:</label> 
			<input type="text" id="Address" name="Address"><br><br>
		<label for="email">Email:</label> 
			<input type="text"id="email" name="email"><br><br> 
		<label for="password">Password:</label> 
			<input type="text" id="password"name="password"><br><br> 
		<label for="userId">UserId</label>
			<input type="text" id="userId" name="userId"><br><br>
		<input type="submit" name="submitform" value="Update">
	</form>
</body>
</html>