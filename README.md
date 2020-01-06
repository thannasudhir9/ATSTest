# ATSTest
Welcome to the Search Engine on ATM List of Dutch City.

Main Java Classes:

1.DropBox_Controller - Logic to Trigger Different DropBox Link Methods

2.DropBox_Service - Logic to Handle DropBox Link Data and Conversion of Handling JSON Array and Objects

3.WebSecurityConfig - Handles the Security Config and Mappings and Login User Details and Roles.

4.SimpleWebAppApplication - Main Class Which Triggers the webApp on port 8081.
 
Main Resources to HTML Web Layer:
1. Index.html -- In this we have main Search Engine which Searches over the JSON Objects of ATM List of Dutch City From Given DropBox Link. 
2. Login.html -- In this we have the login page and authentication of user

Main Mapping and Utility :
1. Constants
2. HomeController
In this we have the mappings for the Method Names of BackEnd Layer Inorder to be invoked From JS Layer and finally mapped to the Controller and Service Layers.

Description About each File in Detail :::
1. DropBox_Controller.java
Description :: Here we have the DropBox Controller which has all the methods to fetch the data from DropBox Link File.

2. HomeController.java
Description :: Here we have the methods which are used to invoke the respective URL Mappings to a HTML Files.

3. MvcConfig.java
Description :: Here we have the View Controller which are used in URL Mappings to a HTML Path.

4. SecurityConfig.java, WebSecurityConfig.java
Description :: Here we have the spring security configurations and landing into the login page on any request from URL.

5. DropBox_Service.java
Description :: In this we have the DropBox Link Services which has all the methods which are used to fetch the data from DropBox Link and get the JSON Objects and Return the JSON Objects to the HTML Layer when Invoked.

6. SimpleWebAppApplication.java
Description :: This is the main class file of spring application which triggeres everything and loads all beans, triggers the tomcat server and the launch of the webapp

URL:

To Login
http://localhost:8080/ 
Username : user
password: password

7. style.css
Description :: All the css style for some divs and other texts and body of html are addded here.

8. SearchController.js
Description :: In this we have the logic of Triggering the Web Call of DropBox Data From FrontEnd (JS Layer) to Backend Layer(Java)

9. templates\index.html
Description :: In this we have the main HTML, Anuglar Js, BootStrap Bindings, JS Logic and the Search Engine To Search on ATM List of given DropBox Link of ATM List of Dutch City.
Integrated all the Bootstrap CSS, Angulat JS, JS Logic - Calls to Controller, Custom CSS, etc...

10. templates\login.html
Description :: In this we have the login Page to login into the webapplication.

11. SimpleWebAppTests.Java
JUNIT Testing Class File which calls the Methods of Controllers and Services to Check the Methods are properly working.

Note -
All the Descriptions of methods and their explanation are written in the java classes documentation in the respective class names.

How to start / Run :
1. In Command Prompt
Navigate to Target folder and Exdecute: 
java -jar ATSTest-0.0.1-SNAPSHOT.jar

2.In IDE Intellij
Clone the code from here: 
https://github.com/thannasudhir9/ATSTest.git 
Configure the Project Accordingly and Run Maven Commands
a. maven clean
b. maven install
and run the Class : SimpleWebAppApplication.Java

3.Batch File Execution.
Batch File To Execute the Project Is in Target Folder.
Batch File Name : ATS_SearchEngine.bat

Thank you.
