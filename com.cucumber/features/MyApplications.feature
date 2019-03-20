Feature: Test Facebook Smoke Scenario
     
     Scenario: Test login with valid credentials
     Given Open firefox and start application
     When I enter valid "sai753535@gmail.com" and valid "sai@smart123"
     Then user should be able to login successfully 
     
     