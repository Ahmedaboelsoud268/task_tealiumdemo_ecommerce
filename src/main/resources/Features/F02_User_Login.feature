@smoke
  Feature: User Login
#the user login with valid credential
    Scenario Outline: validate that user can login with valid credentials
      Given user click on the Account button and select login
      Then redirct me to the login page
      And user enter valid "<email>"
      And enter valid "<password>"
      When user click on login
      Then the login is done successfully
      Examples:
        | email | password |
        | cr1@example.com | 1234567 |

#user try to login with invalid email once and empty email once and with not registered email
    Scenario Outline: validate that user can't login with invalid email fromat
      Given user click on the Account button and select login
      Then redirct me to the login page
      And user enter invalid email "<email>"
      And enter valid "<password>"
      When user click on login
      Then there error message is displayed for invalid email format
      Examples:
        | email | password |
        | testxs1.@example.com | Asd*2567# |

  #empty email
    Scenario Outline: validate that user can't login with empty email
      Given user click on the Account button and select login
      Then redirct me to the login page
      And user enter empty email "<email>"
      And enter valid "<password>"
      When user click on login
      Then there error message is displayed for empty email
      Examples:
        | email | password |
        |  | Asd*2567# |
#not registered email
    Scenario Outline: validate that user can't login with not registered email
      Given user click on the Account button and select login
      Then redirct me to the login page
      And user enter not registered email "<email>"
      And enter valid "<password>"
      When user click on login
      Then there error message is displayed for not registered email
      Examples:
        | email | password |
        |  cr100@example.com| Asd*2567# |

 #user try to login with invalid email once and empty email once and with not registered email and less than required
    Scenario Outline: validate that user can't login with invalid password for registered email
      Given user click on the Account button and select login
      Then redirct me to the login page
      And user enter valid "<email>"
      And enter invalid "<password>" for registered email
      When user click on login
      Then there error message is displayed for invalid password for registered email
      Examples:
        | email | password |
        | cr6@exampled.com | 122aaasd@ |
        | cr6@exampled.com | 122  |
    #empty password
    Scenario Outline: validate that user can't login with empty password for registered email
      Given user click on the Account button and select login
      Then redirct me to the login page
      And user enter valid "<email>"
      And enter empty "<password>" for registered email
      When user click on login
      Then there error message is displayed for empty password for registered email
      Examples:
        | email | password |
        | cr6@exampled.com |  |