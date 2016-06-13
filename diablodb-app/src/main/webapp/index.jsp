<!DOCTYPE html>
<html lang="en">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

  <head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->
    <meta name="description" content="">
    <meta name="author" content="">

    <title>DiabloDB: the forum for something</title>

    <!-- Custom styles for this template -->
    <link href="../css/index.css" rel="stylesheet">

  </head>

  <body role="document">

    <!-- Fixed navbar -->
    <nav class="navbar navbar-default navbar-fixed-top">
      <div class="container">
        <div class="navbar-header">
          <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar" aria-expanded="false" aria-controls="navbar">
            <span class="sr-only">Toggle navigation</span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
          </button>
          <a class="navbar-brand" href="index.html">DiabloDB <span class="glyphicon glyphicon-fire" aria-hidden="true"></span></a>
        </div>
        <div id="navbar" class="navbar-collapse collapse">
          <ul class="nav navbar-nav">
            <li><a href="pages_list.html">Your Pages</a></li>
            <li><a href="threads_list.html">Your Threads</a></li>
            <li><a href="comments_list.html">Your Comments</a></li>
          </ul>
                      <ul class="nav navbar-nav navbar-right">
            <li><a href="user.html">Profile</a></li>
            <li><a id="login" href="sign_in.html">Log in</a></li>
            <!-- <li class="dropdown">
              <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">Dropdown <span class="caret"></span></a>
              <ul class="dropdown-menu">
                <li><a href="#">Action</a></li>
                <li><a href="#">Another action</a></li>
                <li><a href="#">Something else here</a></li>
                <li role="separator" class="divider"></li>
                <li class="dropdown-header">Nav header</li>
                <li><a href="#">Separated link</a></li>
                <li><a href="#">One more separated link</a></li>
              </ul>
            </li> -->
          </ul>
          </ul>
        </div><!--/.nav-collapse -->
      </div>
    </nav>
<jsp:forward page="/poster">
    <jsp:include page="list-pages.jsp" />
  </jsp:include>
</jsp:forward>

    <!-- <div class="container theme-showcase" role="main">

      <div class="jumbotron">
        <h1>DiabloDB <span class="glyphicon glyphicon-fire" aria-hidden="true"></h1>
        <p>Your cloud based solution for machine intelligence content and delivery network.</p>
      </div>

      <div class="sidebar">
        <a href="create_page.html"><button class="btn btn-primary">Create Page</button></a>
                <a href="sign_up.html"><button class="btn btn-primary">Create Account</button></a>
      </div>

      <div class="row">
        <div class="col-md-12">
          <table class="table table-striped">
            <thead>
              <tr>
                <th>Status</th>
                <th>Page</th>
                <th>Thread Name</th>
                <th>Poster</th>
              </tr>
            </thead>
            <tbody>
              <tr>
                <td><span class="label label-success">Rising</span></td>
                <td><a href="page.html">UrPage1</a></td>
                <td><a href="page.html">What stuff do you have in your closet?</a></td>
                <td><a href="">Brett</td></a>
              </tr>
              <tr>
                <td><span class="label label-default">Neutral</span></td>
                <td><a href="page.html">UrPage2</td></a>
                <td><a href="page.html">Backhoes and fronthoes: the great debate</t></a>
                <td><a href="">Josh</td></a>
              </tr>
              <tr>
                <td><span class="label label-danger">Falling</span></td>
                <td><a href="page.html">UrPage3</a></td>
                <td><a href="page.html">Belligerence in the courtroom is a felony</a></td>
                <td><a href="">Sam</td></a>
              </tr>
              <tr>
                <td><span class="label label-success">Rising</span></td>
                <td><a href="page.html">UrPage4</a></td>
                <td><a href="page.html">2001: The Based God oddesy</a></td>
                <td><a href="">Eric</td></a>
              </tr>

            </tbody>
          </table>
        </div>
      </div>


    </div> --> <!-- /container --> <!--
<div class="container">
    <nav>
  <ul class="pagination">
    <li>
      <a href="#" aria-label="Previous">
        <span aria-hidden="true">&laquo;</span>
      </a>
    </li>
    <li><a href="#">1</a></li>
    <li><a href="#">2</a></li>
    <li><a href="#">3</a></li>
    <li><a href="#">4</a></li>
    <li><a href="#">5</a></li>
    <li>
      <a href="#" aria-label="Next">
        <span aria-hidden="true">&raquo;</span>
      </a>
    </li>
  </ul>
</nav>
</div> -->


    <!-- Bootstrap core JavaScript
    ================================================== -->
    <!-- Placed at the end of the document so the pages load faster -->
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
    <!-- Latest compiled and minified CSS -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css" integrity="sha384-1q8mTJOASx8j1Au+a5WDVnPi2lkFfwwEAa8hDDdjZlpLegxhjVME1fgjWPGmkzs7" crossorigin="anonymous">

    <!-- Optional theme -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap-theme.min.css" integrity="sha384-fLW2N01lMqjakBkx3l/M9EahuwpSfeNvV63J5ezn3uZzapT0u7EYsXMjQV+0En5r" crossorigin="anonymous">

    <!-- Latest compiled and minified JavaScript -->
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js" integrity="sha384-0mSbJDEHialfmuBBQP6A4Qrprq5OVfW37PRR3j5ELqxss1yVqOtnepnHVP9aJ7xS" crossorigin="anonymous"></script>
  </body>
</html>
