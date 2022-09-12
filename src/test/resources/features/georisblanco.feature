# Autor: Georis Manuel Blanco Escobar
@stories
Feature: create a new user
  We are looking to create a new user on the Utest.com page
  @scenario1
  Scenario: create a new user to enter the Utest page
    Given create a new user for the page Utest
    When the user enters the required data in the form
    | strFirstName  | strLastName | strEmail               | strBirthDayMonth | getStrBirthDayDay | getStrBirthDayYear | StrLanguajesSpoken | strCityName | strPostalCode | strCountryName | StrComputerSo | StrComputerVersion | StrLanguaje | StrTypeMovil | StrModelMovil | StrMovilSo | StrPassword |
    | Georis        | Blanco      | georisblanco@gmail.com | January          | 14                | 2000               | Spanish            | Barranquilla| 080004        | Colombia       | Windows       | Windows 11 pro     | Spanish     | Xiaomi       | Mi 11T        | Android 12 | Geo1234556  |
    Then ends with user registration
    | StrFinalText |
    | Complete Setup|