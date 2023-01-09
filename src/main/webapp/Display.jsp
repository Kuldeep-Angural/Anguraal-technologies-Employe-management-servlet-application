<!DOCTYPE html>
<%@page import="java.util.List"%>
<%@page import="com.navv.servlet_Employe_Management_Service.ProjectService"%>
<%@page import="com.navv.servlet_Employe_Management_Dto.Employe"%>
<html lang="en">

<head>
    <title>DisplayData</title>
    <link rel="stylesheet" href="CssContainer/style.css">
</head>

<style>
    * {
        margin: 0;
        padding: 0;
    }

    .main {
        width: 100wh;
        background-image: url(pexels.jpg);

        /* background-position: center;
    background-size: cover; */
        height: 100vh;
    }

    .navbar {
        width: 1200px;
        height: 75px;
        margin: auto;
    }

    .icon {
        width: 200px;
        float: left;
        height: 70px;
    }

    .logo {
        color: #e76a05;
        font-size: 35px;
        font-family: Arial;
        padding-left: 20px;
        float: left;
        padding-top: 10px;
        margin-top: 5px
    }

    .menu {
        width: 400px;
        float: left;
        height: 70px;
    }

    ul {
        float: left;
        display: flex;
        justify-content: center;
        align-items: center;
    }

    ul li {
        list-style: none;
        margin-left: 123px;
        margin-top: 27px;
        font-size: 14px;
    }

    ul li a {
        text-decoration: none;
        color: #fff;
        font-family: Arial;
        font-weight: bold;
        transition: 1.0s ease-in-out;
    }

    ul li a:hover {
        color: #e76a05;
    }

    .search {
        width: 330px;
        float: left;
        margin-left: 270px;
    }

    .srch {
        font-family: 'Times New Roman';
        width: 200px;
        height: 40px;
        background: transparent;
        border: 1px solid #f80d0d;
        margin-top: 13px;
        color: #fff;
        border-right: none;
        font-size: 16px;
        float: left;
        padding: 10px;
        border-bottom-left-radius: 5px;
        border-top-left-radius: 5px;
    }

    .btn {
        width: 100px;
        height: 40px;
        background: #f80d0d;
        border: 2px solid #f80d0d;
        margin-top: 13px;
        color: #fff;
        font-size: 15px;
        border-bottom-right-radius: 5px;
        border-bottom-right-radius: 5px;
        transition: 0.2s ease;
        cursor: pointer;
    }

    .btn:hover {
        color: #000;
    }

    .btn:focus {
        outline: none;
    }

    .srch:focus {
        outline: none;
    }

    .content {
        width: 1200px;
        height: 72vh;
        margin: auto;
        color: #fff;
        position: relative;
    }

    .content .par {
        padding-left: 20px;
        padding-bottom: 25px;
        font-family: Arial;
        letter-spacing: 1.2px;
        line-height: 30px;
    }

    .content h1 {
        font-family: 'Times New Roman';
        font-size: 50px;
        padding-left: 20px;
        margin-top: 4%;
        letter-spacing: 2px;
    }

    .content .cn {
        width: 224px;
        height: 37px;
        background: #e76a05;
        border: none;
        margin-bottom: 10px;
        margin-left: 20px;
        font-size: 18px;
        border-radius: 30px;
        cursor: pointer;
        transition: .4s ease;
        box-sizing: border-box;
        position: relative;
        top: 10px;

    }

    .content .cn a {
        text-decoration: none;
        color: #000;
        transition: .3s ease;
    }

    .cn:hover {
        background-color: #fff;
    }

    .content span {
        color: #e76a05;
        font-size: 58px
    }


    .btnn {
        width: 240px;
        height: 40px;
        background: #f80d0d;
        border: none;
        margin-top: 30px;
        font-size: 18px;
        border-radius: 10px;
        cursor: pointer;
        color: #fff;
        transition: 0.4s ease;
    }

    .btnn:hover {
        background: #fff;
        color: #f80d0d;
    }

    .btnn a {
        text-decoration: none;
        color: #000;
        font-weight: bold;
    }

    .form .link {
        font-family: Arial, Helvetica, sans-serif;
        font-size: 17px;
        padding-top: 20px;
        text-align: center;
    }

    .form .link a {
        text-decoration: none;
        color: #f80d0d;
    }

    .liw {
        padding-top: 15px;
        padding-bottom: 10px;
        text-align: center;
    }

    .icons a {
        text-decoration: none;
        color: #fff;
    }

    .icons ion-icon {
        color: #fff;
        font-size: 30px;
        padding-left: 14px;
        padding-top: 5px;
        transition: 0.3s ease;
    }

    .icons ion-icon:hover {
        color: #f80d0d;
    }

    footer {
        background-color: #e86126eb;
        color: white;
        font-size: 0.8rem;
        padding: -2px 20px;
        text-align: center;
    }

    .viewport {
        box-sizing: border-box;
        height: 490px;
        width: 414px;
        position: relative;
        top: -6px;
        right: -760px;
        /* background-color: red; */
        overflow: scroll;

    }

    .viewport::-webkit-scrollbar {
    display: none;
    }
    .card{
        box-sizing: border-box;
        position: relative;
        top: 130px;
        left: 150px;
        height: 223px;
        width: 233px;
        
        /* background-color: #f80d0d; */
    }
    .info h1{
        box-sizing: border-box;
        position: relative;
        top: 53px;
        height: 30px;
        left: 170px;
       width: 200px;
        /* background-color: #f80d0d; */
    }
    table {
    box-sizing: border-box;
    position: relative;
    top: 28px;
    left: 26px;
    width: 527px;
}
</style>



<body>

    <div class="main">
        <div class="navbar">
            <div class="icon">
                <h2 class="logo">Angural Technologies</h2>
            </div>

            <div class="menu">
                <ul>
                    <li><a href="index.html">HOME</a></li>
                    <li><a href="about.html">ABOUT</a></li>
                    <li><a href="service.html">SERVICE</a></li>
                    <li><a href="Login-SignUp.html">SIGNUP</a></li>
                    <li><a href="contactUs.html">CONTACT</a></li>

                </ul>
            </div>





           
        

          
<table cellspacing="0" cellpadding="1" border="0" width="325">
        <tr>
          <td>
             <table cellspacing="0" cellpadding="1" border="1" width="550" >
              
               </tr>
             </table>
          </td>
        </tr>
        <tr>
          <td>
             <div style="width:610px; height:280px; overflow:auto; ">
               <table cellspacing="0" cellpadding="1" border="1" width="300" >
               
               <%ProjectService service=new ProjectService(); %>
               <% List<Employe> employes=service.display(); %>
                <tr style="color:white;background-color:grey">
                  <th>Id</th>
                  <th>Name</th>
                  <th>Email</th>
                 
                  <th>Mobile</th>
                  <th>Gender</th>
                  <th>Job</th>
                 
                  <th>Delete</th>
                  <th>Update</th>
               </tr>
		<%
		
		for (Employe employe :employes ) {
		%>
                <tr>
                
                
                
			<td><%=employe.getId()%></td>
			<td><%=employe.getName()%></td>
			<td><%=employe.getEmail()%></td>
			<td><%=employe.getMobile()%></td>
			<td><%=employe.getGender()%></td>
			<td><%=employe.getJob()%></td>
			
			<td> <button> <a href="deleteinside?id=<%= employe.getId()%>">Delete </button> </td>
			<td> <button> <a href="updateinsidedisplaylink?id=<%= employe.getId()%>">Update </button> </td>
		</tr>
		<%
		}
		%>
               </table>  
             </div>
          </td>
        </tr>
      </table>








        </div>
    </div>
    </div>
    </div>
    </div>
    <script src="https://unpkg.com/ionicons@5.4.0/dist/ionicons.js"></script>


    <footer>
        <div class="center">

            copyright &copy;www.AnguralTechnologies.com . all rights reserved

        </div>
    </footer>


</body>

</html>