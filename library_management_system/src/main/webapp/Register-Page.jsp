</head>
<body>
    <h1>Register Here</h1>
	<h2>Enter your Details</Details></h2>
	<form action="main" method="post">
		<label for="firstname">First Name: </label> 
		<input type="text" name="firstname" required pattern="[A-Za-z]{4,10}" title="only Uppercase & Lowercase"><br>
		<br> 
        <label for="lastname">Last Name: </label> 
        <input type="text" name="lastname" required pattern="[A-Za-z]{4,10}" title="only Uppercase & Lowercase"><br>
		<br> 
        <label for="Address">Address</label>
		<textarea rows="2" cols="4" name="Address" required></textarea>
		<br>
		<br> 
        <label for="PhoneNumber">Phone Number</label> 
        <input type="text" name="PhoneNumber" required pattern="[0-9]{10}"><br>
		<br> 
        <label for="Gender">Male</label> 
        <input type="radio" name="Gender" value="Male"> 
		<label for="Gender">Female</label> 
		<input type="radio"	name="Gender" value="Female"><br>
		<br> 
		<label for="Email">Email: </label> 
		<input type="email" name="Email" required pattern="[A-Za-z._$]+@[a-z0-9.]+\.[a-z]{2,}" title="ex : abc@xyz.co include lowercase letters and numbers and proper domain name."><br>
		<br> 
        <label for="username">User Name: </label> 
        <input type="text" name="username" required pattern="[a-zA-Z0-9]{4,10}"><br>
		<br> 
        <label for="Password">Password: </label> 
        <input type="password" name="Password" required pattern="[A-Za-Z0-9]{8,16}" title="must be from 8 -16 character's include lowercase letters and numbers"><br>
		<br> 
        <input type="submit" name="Done">
	</form>
	<br>
	<br>
	<nav>
		<a href="Home-page.html"><button>Back To Home</button></a> 
        <a href="Login-page.html"><button> Login</button></a>
	</nav>

</body>
</html>