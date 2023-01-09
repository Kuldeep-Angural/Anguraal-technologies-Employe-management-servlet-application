<!DOCTYPE html>
<%@page import="com.navv.servlet_Employe_Management_Dto.Employe"%>

<html lang="en">

<head>
<meta charset="UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title></title>
<link rel="preconnect" href="https://fonts.googleapis.com">
<link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
<link
	href="https://fonts.googleapis.com/css2?family=Josefin+Sans&display=swap"
	rel="stylesheet">
<style>
* {
	box-sizing: border-box;
	padding: 0;
	margin: 0;
	font-family: "Josefin";
}

header {
	height: 600px;
	position:static;
	background-image: url("pexels.jpg");
	background-repeat: no-repeat;

	width: 100%
}

.top-block {
	/* background-color: rgb(0, 0, 0); */
	color: white;
	padding: 8px 20px;
	position: relative;
	height: 70px;
}

.hero-logo {
	/* background-image: url("/images/Logo-Tesla-removebg-preview.png"); */
	height: 58px;
	/* border: 2px solid white; */
	display: inline-block;
	width: 139px;
	margin-top: -5px;
	margin-left: 20px;
	background-repeat: no-repeat;
	background-position: center;
	background-size: cover;
	position: fixed;
}

nav {
	display: inline-block;
	/* background-color: rgb(112, 1, 1); */
	position: fixed;
	top: 25px;
	left: 240px;
}

nav ul {
	list-style-type: none;
}

nav ul li {
	color: #171a20;
	display: inline-block;
	margin-left: 0px;
	padding-left: 0px;
	padding-right: 0px;
	font-weight: 610;
}

nav ul li a {
	text-decoration: none;
	color: rgb(23, 22, 22);
	font-size: 16px;
	padding: 20px;
	font-weight: 500;
	font-family: 'Gill Sans', 'Gill Sans MT', Calibri, 'Trebuchet MS',
		sans-serif;
}

nav ul li a:hover {
	background-color: rgba(216, 219, 222, 0.231);
	border-radius: 16px;
}

.side ul {
	color: rgb(19, 18, 18);
	font-size: 20px;
	position: absolute;
	right: -340px;
	top: -3px;
	font-weight: 400;
	display: inline-block;
}

.side ul li {
	color: black;
	display: inline-block;
	margin-left: 15px;
}

.side ul li a {
	color: black;
}

.hero-heading {
	position: absolute;
	top: 89px;
	left: 491px;
	text-align: center;
	position: fixed;
}

.hero-heading article h2 {
	font-size: 48px;
	position: relative;
	color: #171a20;
	margin-bottom: 10px;
	right: 90px;
}

.buttons article button {
	padding: 10px 0px;
	border-radius: 6px;
	border: none;
	margin-left: 10px;
}

.buttons article button a {
	text-decoration: none;
	color: aliceblue;
	font-size: 29px;
	font-size: 10px;
	padding: 10px 100px; 
}

.buttons article button:first-of-type {
	background-color: #171a20;
	margin-left: 10px;
}

.buttons article button:last-of-type {
	background-color: rgb(170, 176, 182);
}

.form1 {
	box-sizing: border-box;
	height: 500px;
	width: 500px;
	/* background-color: red; */
	position: relative;
	color: #171a20;
	top: 40px;
	right: 100px;
}

input {
	justify-content: center;
	height: 30px;
	margin-bottom: 20px;
	width: 290px;
	border-radius: 10px;
}

section.buttons {
    position: relative;
    height:400px;
    width:600px;
    top: 14px;
    left: -40px;
    display: flex;
}
</style>
</head>

<body>
	<header>
		
			<section class="hero-heading">
				<article>
					<h2>UPDATE EMPLOYE</h2>

	
				</article>
				
<%
		Employe  employee=(Employe)request.getAttribute("employe");
	%>

				<div class="form1">
					<form action="updatemain2">

						<div class="name id">
							 <input
								type="number" name="id" value="<%=employee.getId()%>" hidden ="true">
						
						</div>

						<div class="name name1">
							<label for="Name" style="font-size: 20px;">Name <input
								type="text" name="name" value="<%=employee.getName() %>">
							</label>
						</div>
						<div class="name id">
							<label for="email" style="font-size: 20px;"> Email <input
								type="email" name="email" value="<%=employee.getEmail() %>">
							</label>
						</div>

						<div class="name name1">
							<label for="mobile" style="font-size: 20px;">mobile <input
								type="tel" name="mobile" value="<%=employee.getMobile() %>">
							</label>
						</div>
						
						
						

						
						<section class="buttons">
							<article>
								<input type="submit">
								
								 <input type="reset">


							</article>
						</section>
					</form>
				</div>


			</section>
	</header>










</body>

</html>