Contributor:Nikhil Gupta


This Project require skills on TestNG framework , Selenium Webdriver, Maven.


The Project runs on three browsers Chrome,Firefox,Safari and their dependencies is already defined in POM.xml file.


Project Contains 5 packages 


1. Exception (User defined Exception)
2. MainPages (Signifies Different webpages)
3. Test (Main test java file)
4. Page checker (which check the webPage title)
5. Utility (contains ReporterLog,Listeners,ReadFile,BroswerChoice)


How to Run :-
1. Through testng.xml -> run as testNG suite
2. Through Test file -> run as TestNg Test


Flow of Execution :-


Go to Appdirect HomePage Url -> Verify HomePage title -> Click on Login Link -> Verify LoginPage title -> Click on Signup Button -> Verify SignUp Title -> Enter Mail Id -> Click on Submit Button ->Verify Result -> Navigate Back -> Click on SignUp button ->Enter SameMailID ->Verify result.