# ATSTest
Welcome to the Search Engine on ATM List of Dutch City.

# Main Java Classes:

- DropBox_Controller - Logic to Trigger Different DropBox Link Methods

- DropBox_Service - Logic to Handle DropBox Link Data and Conversion of Handling JSON Array and Objects

- WebSecurityConfig - Handles the Security Config and Mappings and Login User Details and Roles.

- SimpleWebAppApplication - Main Class Which Triggers the webApp on port 8081.
 
# Main Resources to HTML Web Layer:
- Index.html -- In this we have main Search Engine which Searches over the JSON Objects of ATM List of Dutch City From Given DropBox Link. 
- Login.html -- In this we have the login page and authentication of user

# Main Mapping and Utility :
- Constants
- HomeController
In this we have the mappings for the Method Names of BackEnd Layer Inorder to be invoked From JS Layer and finally mapped to the Controller and Service Layers.

# Description About each File in Detail :
- DropBox_Controller.java
Description :: Here we have the DropBox Controller which has all the methods to fetch the data from DropBox Link File.

- HomeController.java
Description :: Here we have the methods which are used to invoke the respective URL Mappings to a HTML Files.

- MvcConfig.java
Description :: Here we have the View Controller which are used in URL Mappings to a HTML Path.

- SecurityConfig.java, WebSecurityConfig.java
Description :: Here we have the spring security configurations and landing into the login page on any request from URL.

- DropBox_Service.java
Description :: In this we have the DropBox Link Services which has all the methods which are used to fetch the data from DropBox Link and get the JSON Objects and Return the JSON Objects to the HTML Layer when Invoked.

- SimpleWebAppApplication.java
Description :: This is the main class file of spring application which triggeres everything and loads all beans, triggers the tomcat server and the launch of the webapp

# URL and Login Details:
To Login
http://localhost:8080/ 
Username : user
password: password

- style.css
Description :: All the css style for some divs and other texts and body of html are addded here.

- SearchController.js
Description :: In this we have the logic of Triggering the Web Call of DropBox Data From FrontEnd (JS Layer) to Backend Layer(Java)

- templates\index.html
Description :: In this we have the main HTML, Anuglar Js, BootStrap Bindings, JS Logic and the Search Engine To Search on ATM List of given DropBox Link of ATM List of Dutch City.
Integrated all the Bootstrap CSS, Angulat JS, JS Logic - Calls to Controller, Custom CSS, etc...

- templates\login.html
Description :: In this we have the login Page to login into the webapplication.

- SimpleWebAppTests.Java
JUNIT Testing Class File which calls the Methods of Controllers and Services to Check the Methods are properly working.

# Note -
All the Descriptions of methods and their explanation are written in the java classes documentation in the respective class names.

# How to start / Run :
- In Command Prompt
Navigate to Target folder and Exdecute: 
java -jar ATSTest-0.0.1-SNAPSHOT.jar

- In IDE Intellij
Clone the code from here: 
https://github.com/thannasudhir9/ATSTest.git 
Configure the Project Accordingly and Run Maven Commands
a. maven clean
b. maven install
and run the Class : SimpleWebAppApplication.Java

- Batch File Execution.
Batch File To Execute the Project Is in Target Folder.
Batch File Name : ATS_SearchEngine.bat

# Implementation / Solution :
 - In this We have a DropBox Link which has all the data of ATM List of Dutch City.
 - we fetch this data using a REST API , create a HTTP Connection and Fetch the data as a BufferReader and Add it to the String Variable.
 - Then we convert this JsonString into a JSON Array and Itertate through all the JSON Objects and add to a String ArrayList.
 - Then Using the WebSerice Call From the HTML - JS Layer we call this RESTAPI Which will return the ArrayList of JSONObjecst as String into JS Layer.
 - Finally We parse this ArrayList of JSONObjects using JSON Parse in JS Layer and Add back to an Array which contains all JSOn Objects in a Single Array In JS Layer.
 - Intially while loading the Search Engine we will show all the Records (JSON Objects)  , and on Search we filter over all the Records Using Angular JS.
 -This will do the faster performance on Search Operation and a Single REST API Call while loading of page which is a best and faster way.
 - Instead of Searching the Particular Record Directly in a REST API Call will slow down the perfromance.
 - Custom Styling, BootStrap etc are added for Enhancing the look of WebSite.

Thank you.
