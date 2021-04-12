# E-CommerceSite_Test_Java 

## About Project
Purpose of this project is to automate web application "http://automationpractice.com/index.php" with BDD Cucumber, Selenium Webdriver, Maven and JUnit in Java Programming language. Implementated of page object model framework.

***This project covers following scenario:***

-> Verify successful placement of any order

      1) Clear
      2) hdfdvwkD
      3) Payment

***This project could be run following broswers:***
1. Chrome
2. Firefox
3. IE EDge

**Steps to follow to execute the tests:**

1) Install JRE and JDK and set path 
2) Install Maven and set path
3) Clone or download this project
4) Import this project as Maven project in order to install all dependencies. 
5) Run tests 
      1) From TestRunner.java file 
      2) Or using following command
      ```bash 
      mvn verify
6) **View reports** in following path
      1) /target/cucumber-html-report/index.html
      2) /target/cucumber-jvm-report-html/cucumber-html-reports/overview-features.html
7) **For Cross Browser test**
      1) Navigate to /src/test/resources/config.properties
      2) Update browserName=Chrome to browserName=Edge or browserName=Firefox

Report at Scenario level
![Screenshot](https://github.com/bintu27/E-CommerceSite_Test_Java/blob/master/Screenshorts/Report.png)

Report at Step level
![Screenshot](https://github.com/bintu27/E-CommerceSite_Test_Java/blob/master/Screenshorts/Steps%20.png)

