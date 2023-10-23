Feature: Login Page Aplikasi Saucedemo

  Scenario: Success Login
    Given Halaman login aplikasi saucedemo
    When  Input username
    And Input password
    And Click login button
    Then User in on dashboard page

  Scenario: Failed Login
    Given Halaman login aplikasi saucedemo
    When  Input username
    And Input Invalid password
    And Click login button
    Then User get error message