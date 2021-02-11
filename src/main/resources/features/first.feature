Feature:  Test all regression test cases
  Scenario:  I want to search for   java in stack over flow
    Given Open the browser chrome
    When user serach for "Java script"
    Then User click on java script links


  Scenario Outline:   I want to search for   java in google
    Given Open the browser chrome
    When  User search for  "<searchkey>"
    Then validate the search restult

    Examples:
    |searchkey|
    |java     |
    |Python   |
    |Selenium |

    Scenario:  this multiple data information
      Given  open the browser
      |browser|
      |chrome |
      When User search for a key word
      |keyword|
      |Java   |
      Then User validate the result


    Scenario:  This is to test Github
      Given  user login to git
      When  login useable to see the project repositeries
      Then user select any repositeries
      Given  this new line of login with the git


    Scenatio: Test this is new add data

