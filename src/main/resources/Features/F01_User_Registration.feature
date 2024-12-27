@smoke
Feature: User Registration
 Scenario Outline:validate that a user can successfully register with valid data
    Given user click on the Account button and select registratin
    Then redirct me to the registration page
    When user enter valid_F "<firstName>"
    And user enter valid_M "<middelName>"
    And user enter valid_L "<lastName>"
    And user enter valid_E "<email>"
    And user enter valid_P "<password>"
    And enter valid_c_p "<confirm_password>"
    And click on the sign up button
    Then the user can register successfully
    Examples:
      |firstName |middelName | lastName  |    email         |  password  | confirm_password |
      |   ahmed  | aboelsoud |maghraby   |cr8@example.com |1234567  | 1234567       |
# here we can user scenario outline to provide data to methods like data provider (data driven)

  #invalid scenario for firstname field with enter name more than 32 once and enter less than 2 digits and enter number once and enter special chars once::
  Scenario Outline: validate that APP diplay an error message when the user enter invalid firstName with more 32 digits once and less than 2 digits once and enter numbers once and enter special chars once
    Given user click on the Account button and select registratin
    Then redirct me to the registration page
    When user enter invalid_F "<firstname>"
    And user enter valid_M "<middelName>"
    And user enter valid_L "<lastName>"
    And user enter valid_E "<email>"
    And user enter valid_P "<password>"
    And enter valid_c_p "<confirm_password>"
    And click on the sign up button
    Then an error message is diplaying under the field of the firstname the text must be contain 2-32 chars and numbers and special chars not allowed
    Examples:
      |firstname|middelName|lastName|email|password|confirm_password|
      |aaaaafafaaffffffffaffafafafa|aboelsoud|maghraby|tESt013457@example.com|Asd*2567#|Asd*2567#|
      |a                           |ali      |ahmed   |TWist91243@example.com|Asd*3232#|Asd*3232#|
      |sasd2134                           |ali      |ahmed   |TWist91243@example.com|Asd*3232#|Asd*3232#|
      |@sd$#s                           |ali      |ahmed   |TWist12443@example.com|Asd*3232#|Asd*3232#|

   #invalid scenario for firstname field with enter empty name (make the field is blank)::
  Scenario Outline: validate that APP diplay an error message when the user enter  empty firstname
    Given user click on the Account button and select registratin
    Then redirct me to the registration page
    When user enter empty_F "<firstname>"
    And user enter valid_M "<middelName>"
    And user enter valid_L "<lastName>"
    And user enter valid_E "<email>"
    And user enter valid_P "<password>"
    And enter valid_c_p "<confirm_password>"
    And click on the sign up button
    Then an error message is diplaying under the field of the firstname and This is a required field
    Examples:
      | firstname | middelName | lastName | email | password | confirm_password |
      |           | aboelsoud |maghraby   |test112@example.com |Asd*2567#   | Asd*2567#        |

    #lastname filed
     #invalid scenario for lstname field with enter name more than 32 once and enter less than 2 digits and enter number once and enter special chars once::
  Scenario Outline: validate that APP diplay an error message when the user enter invalid lastname with more 32 digits once and less than 2 digits once and enter numbers once and enter special chars once
    Given user click on the Account button and select registratin
    Then redirct me to the registration page
    When user enter valid_F "<firstname>"
    And user enter valid_M "<middelName>"
    And user enter invalid_L "<lastName>"
    And user enter valid_E "<email>"
    And user enter valid_P "<password>"
    And enter valid_c_p "<confirm_password>"
    And click on the sign up button
    Then an error message is diplaying under the field of the lastname the text must be contain chars and numbers and special chars not allowed
    Examples:
      |firstname|middelName|lastName|email|password|confirm_password|
      |malak|aboelsoud|asdsdsadsallfpopododoodoodod|asd134157@example.com|Asd*2567#|Asd*2567#|
      |mohamed|ali      |a   |asd12438@example.com|Asd*3232#|Asd*3232#|
      |abdallah|ali      |Ass213   |asd123343@example.com|Asd*3232#|Asd*3232#|
      |@omar|ali      |a#@&fs   |asd142243@example.com|Asd*3232#|Asd*3232#|


   #invalid scenario for lastname field with enter empty name (make the field is blank)::
  Scenario Outline: validate that APP diplay an error message when the user enter  empty lastname
    Given user click on the Account button and select registratin
    Then redirct me to the registration page
    When user enter valid_F "<firstname>"
    And user enter valid_M "<middelName>"
    And user enter empty_L "<lastName>"
    And user enter valid_E "<email>"
    And user enter valid_P "<password>"
    And enter valid_c_p "<confirm_password>"
    And click on the sign up button
    Then an error message is diplaying under the field of the lastname and This is a required field
    Examples:
      | firstname | middelName | lastName | email | password | confirm_password |
      |    youssif| aboelsoud  |          |test2859@example.com |Asd*2567#   | Asd*2567#        |

      #email filed
     #invalid scenario for email field with enter invalid fprmat email::
  Scenario Outline: validate that APP diplay an error message when the user enter invalid format emails
    Given user click on the Account button and select registratin
    Then redirct me to the registration page
    When user enter valid_F "<firstname>"
    And user enter valid_M "<middelName>"
    And user enter valid_L "<lastName>"
    And user enter invalid_E "<email>"
    And user enter valid_P "<password>"
    And enter valid_c_p "<confirm_password>"
    And click on the sign up button
    Then an error message is diplaying under the field of the email invalid email
    Examples:
      | firstname | middelName | lastName | email | password | confirm_password |
      | ahmed | abdelrady | maghraby | ahmedyahoo.com | Asd*2567# | Asd*2567# |
      | ahmed | abdelrady | maghraby | ahmed@hot#mali.com | Asd*2567# | Asd*2567# |
      | ahmed | abdelrady | maghraby | ahme1@ gmail.com | Asd*2567# | Asd*2567# |
      | ahmed | abdelrady | maghraby | user2.@outlook.com | Asd*2567# | Asd*2567# |

    #invalid scenario for email field with enter empty email::
  Scenario Outline: validate that APP diplay an error message when the user enter empty email
    Given user click on the Account button and select registratin
    Then redirct me to the registration page
    When user enter valid_F "<firstname>"
    And user enter valid_M "<middelName>"
    And user enter valid_L "<lastName>"
    And user enter empty_E "<email>"
    And user enter valid_P "<password>"
    And enter valid_c_p "<confirm_password>"
    And click on the sign up button
    Then an error message is diplaying under the field of the email and This is a required field
    Examples:
      | firstname | middelName | lastName | email | password | confirm_password |
      | mazen | shawqy | taha |  | Asd1223# | Asd1223# |

        #invalid scenario for email field with enter exist email::
  Scenario Outline: validate that APP diplay an error message when the user enter exist email
    Given user click on the Account button and select registratin
    Then redirct me to the registration page
    When user enter valid_F "<firstname>"
    And user enter valid_M "<middelName>"
    And user enter valid_L "<lastName>"
    And user enter exist_E "<email>"
    And user enter valid_P "<password>"
    And enter valid_c_p "<confirm_password>"
    And click on the sign up button
    Then an error message is diplaying under the field of the email and There is already an account with this email address
    Examples:
      | firstname | middelName | lastName | email | password | confirm_password |
      | mazen | shawqy | taha | test@example.com | 1234567 | 1234567 |

    #password filed
     #invalid scenario for password field with enter invalid password::
  Scenario Outline: validate that APP diplay an error message when the user enter invalid password
    Given user click on the Account button and select registratin
    Then redirct me to the registration page
    When user enter valid_F "<firstname>"
    And user enter valid_M "<middelName>"
    And user enter valid_L "<lastName>"
    And user enter valid_E "<email>"
    And user enter invalid_P "<password>"
    And enter invalid_c_p "<confirm_password>" the same invalid password
    And click on the sign up button
    Then an error message is diplaying under the field of the password and please enter more chars
    Examples:
      | firstname | middelName | lastName | email | password | confirm_password |
      | malak | aboel | magh | malk1@example.com | 123 | 123 |

     #invalid scenario for password field with enter differnce confirm_password::
  Scenario Outline: validate that APP diplay an error message when the user enter differnce confirm_password
    Given user click on the Account button and select registratin
    Then redirct me to the registration page
    When user enter valid_F "<firstname>"
    And user enter valid_M "<middelName>"
    And user enter valid_L "<lastName>"
    And user enter valid_E "<email>"
    And user enter valid_P "<password>"
    And enter invalid_c_p "<confirm_password>" differnce password
    And click on the sign up button
    Then an error message is diplaying under the field of the confirm password and Please make sure your passwords match.
    Examples:
      | firstname | middelName | lastName | email | password | confirm_password |
      | malak | aboel | magh | malk1@example.com | 123dsar@ | 123fd |

         #invalid scenario for password and confirm password fields with enter empty password ::
  Scenario Outline: validate that APP diplay an error message when the user enter empty password
    Given user click on the Account button and select registratin
    Then redirct me to the registration page
    When user enter valid_F "<firstname>"
    And user enter valid_M "<middelName>"
    And user enter valid_L "<lastName>"
    And user enter valid_E "<email>"
    And user enter empty_P "<password>"
    And enter valid_c_p "<confirm_password>"
    And click on the sign up button
    Then an error message is diplaying under the field of password and This is required.
    Examples:
      | firstname | middelName | lastName | email | password | confirm_password |
      | malak | aboel | magh | malk1@example.com |  | 123fdw34 |


      #invalid scenario for password and confirm password fields with enter empty confirm password ::
  Scenario Outline: validate that APP diplay an error message when the user enter empty confirm password
    Given user click on the Account button and select registratin
    Then redirct me to the registration page
    When user enter valid_F "<firstname>"
    And user enter valid_M "<middelName>"
    And user enter valid_L "<lastName>"
    And user enter valid_E "<email>"
    And user enter valid_P "<password>"
    And enter empty_c_p "<confirm_password>"
    And click on the sign up button
    Then an error message is diplaying under the field of confirm password and This is required.
    Examples:
      | firstname | middelName | lastName | email | password | confirm_password |
      | malak | aboel | magh | malk1@example.com | asdff233 |  |
