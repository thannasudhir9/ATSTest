# ATSTest
Welcome to the Search Engine on ATM List of Dutch City.

Main Java Classes:
1.DropBox_Controller -- Logic to Trigger Different DropBox Link Methods
2.DropBox_Service -- Logic to Handle DropBox Link Data and Conversion of Handling JSON Array and Objects
3.WebSecurityConfig -- Handles the Security Config and Mappings and Login User Details and Roles.
4.SimpleWebAppApplication - Main Class Which Triggers the webApp on port 8081.
 
Main Resources to HTML Web Layer:
1. Index.html -- In this we have main Search Engine which Searches over the JSON Objects of ATM List of Dutch City From Given DropBox Link. 
2. Login.html -- In this we have the login page and authentication of user

Main Mapping and Utility :
1. Constants
2. HomeController
In this we have the mappings for the Method Names of BackEnd Layer Inorder to be invoked From JS Layer and finally mapped to the Controller and Service Layers.

Description About each File in Detail :::
1.
In this path :: src\main\java\com\java\ATS_Exam\controller\DropBox_Controller.java
Description :: Here we have the DropBox Controller which has all the methods to fetch the data from DropBox Link File.

2.
In this path :: src\main\java\com\java\ATS_Exam\controller\HomeController.java
Description :: Here we have the methods which are used to invoke the respective URL Mappings to a HTML Files.

3.
In this path :: src\main\java\com\java\ATS_Exam\security\MvcConfig.java
Description :: Here we have the View Controller which are used in URL Mappings to a HTML Path.

4.
In this path :: src\main\java\com\java\ATS_Exam\security\SecurityConfig.java
In this path :: src\main\java\com\java\ATS_Exam\security\WebSecurityConfig.java
Description :: Here we have the spring security configurations and landing into the login page on any request from URL.

5.
In this path :: src\main\java\com\java\ATS_Exam\service\DropBox_Service.java
Description :: In this we have the DropBox Link Services which has all the methods which are used to fetch the data from DropBox Link and get the JSON Objects and Return the JSON Objects to the HTML Layer when Invoked.

6.
In this path :: src\main\java\com\java\ATS_Exam\SimpleWebAppApplication.java
Description :: This is the main class file of spring application which triggeres everything and loads all beans, triggers the tomcat server and the launch of the webapp

URL:
To Login
http://localhost:8081/ 
Username : user
password: password

7.
In this path :: src\main\resources\static\css\app\style.css
Description :: All the css style for some divs and other texts and body of html are addded here.

8.
In this path :: src\main\resources\static\js\app\SearchController.js
Description :: In this we have the logic of Triggering the Web Call of DropBox Data From FrontEnd (JS Layer) to Backend Layer(Java)

9.
In this path :: src\main\resources\templates\index.html
Description :: In this we have the main HTML, Anuglar Js, BootStrap Bindings, JS Logic and the Search Engine To Search on ATM List of given DropBox Link of ATM List of Dutch City.
Integrated all the Bootstrap CSS, Angulat JS, JS Logic - Calls to Controller, Custom CSS, etc...

10.
In this path :: src\main\resources\templates\login.html
Description :: In this we have the login Page to login into the webapplication.

11.
All the Descriptions of methods and their explanation are written in the java classes documentation in the respective class names.

Thank you.
