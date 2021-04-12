# E-CommerceSite_Test_Java 

## About Project
Purpose of this project is to automate web application "http://automationpractice.com/index.php" with BDD Cucumber, Selenium Webdriver, Maven and JUnit in Java Programming language, leveraged Page Object Model for all modules and implemented reporting for all feature files with test cases status.


***This project covers following scenario:***

-> Verify successful placement of any order

      1) Add to cart - women cloths, 
            1. Printed dress 
            2. Printer summer dress
      3) Validate only selected items in checkout screen
      4) Clear the cart, then select size and pick any 2 cloths and validate selected items on the checkout screen
      5) Place an order 

***This project supports cross-browser functionality and could be run with following broswers:***
1. Chrome
2. Firefox
3. IE EDge

**Steps to follow to execute the tests:**

1) Install JRE and JDK and set path 
2) Install Maven CLI plugin and set path to run test from command line.
3) Clone or download this project
4) Import this project as Maven project in order to install all dependencies. 
5) Run tests 
      1) From TestRunner.java file 
      2) Or using following command
      ```bash 
      mvn verify
6) **View reports** Generated reports can be viewed from below paths: 
      1) /target/cucumber-html-report/index.html
      2) /target/cucumber-jvm-report-html/cucumber-html-reports/overview-features.html
      
7) **For Cross Browser test**
      1) Navigate to /src/test/resources/config.properties
      2) Update browserName=Chrome to browserName=Edge or browserName=Firefox

Report at Scenario level
![Screenshot](https://github.com/bintu27/E-CommerceSite_Test_Java/blob/master/Screenshorts/Report.png)

Report at Step level
![Screenshot](https://github.com/bintu27/E-CommerceSite_Test_Java/blob/master/Screenshorts/Steps%20.png)

