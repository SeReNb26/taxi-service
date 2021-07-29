# Taxi Service
![taxi](https://www.labparlamento.it/wp-content/uploads/2017/02/TAXI.jpg)
<hr>
This project is an example of a simple taxi service. It is based on a 3-tier architecture. All visualization is implemented as a web page. The information is stored in a database.<br><br> 
The project supports the following functionality: <br><br>
<li>Driver registration</li>
<li>Creation of a new car manufacturer</li>
<li>Creation of a new car</li>
<li>Display all drivers</li>
<li>Display all manufacturers</li>
<li>Display all cars</li>
<li>Adding a driver to a car</li>
<li>Display all cars of an authorized user</li>
<hr>

## Technologies
<hr>
<li>Apache Tomcat</li>
<li>MySQL</li>
<li>JSP & SERVLETS</li>
<li>JSTL</li>
<li>JDBC</li>
<li>Logger</li>
<li>HTML</li>
<li>CSS</li>
<hr>

## Instructions for launching
<hr>
1. Add tomcat configuration <br>
2. Install MySQL & Workbench <br>
3. Go to ConnectionUtil class and change login and password to your own
4. Run the script from the init_db.sql file in the workbench <br>
5. Click on the folder with the package name and create a new folder "logs" with the file "app.log" <br>
6. Change the path to the log.app file in the configuration log4j2.xml file 
7. Run the program <br>
8. Go to http://localhost:8080 and click on "Register" to add a new driver
