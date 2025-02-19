Feature: Sample Test Scenario
@Sample
  Scenario: Login with valid credentials
    Given a CTSMS user is on the login page "https://chromatech-test-lms.com/site/login"
    When the user enters username "general@teacher.com" in username text box
    And enters password "123456" in password text box
    And clicks on the Sign In button
    Then the user is navigated to the dashboard page "https://chromatech-test-lms.com/admin/admin/dashboard"

@Sample
  Scenario: Admitting Student
    Given a CTSMS user is on the login page "https://chromatech-test-lms.com/site/login"
    When the user enters username "general@teacher.com" in username text box
    And enters password "123456" in password text box
    And clicks on the Sign In button
    When the user clicks on Student Information module
    And clicks on Student Admissions subModule
    And enters Admission Number "12345" in Admission No text box
    And enters first name "Chroma" in first name text box
    And enters last name "Tech" in last name text box
    And selects "SDET" for Class drop down
    And selects "Testing Fundamentals" for Section drop down
    And selects "Male" for gender drop down
    And selects Date of Birth "10/10/1970"
    And selects "Other" for Guardian
    And enters guardian name "Chroma"
    And enters guardian phone number "240-869-3092"

  @Sample
  Scenario Outline: Admitting Student
    Given a CTSMS user is on the login page "https://chromatech-stage-lms.com/site/login"
    When the user enters username "general@teacher.com" in username text box
    And enters password "123456" in password text box
    And clicks on the Sign In button
    When the user clicks on Student Information module
    And clicks on Student Admissions subModule
    And enters Admission Number "<Admission Number>" in Admission No text box
    And enters first name "<First Name>" in first name text box
    And enters last name "<Last Name>" in last name text box
    And selects "<Class>" for Class drop down
    And selects "<Section>" for Section drop down
    And selects "<Gender>" for gender drop down
    And selects Date of Birth "<Date of Birth>"
    And selects "<Guardian Type>" for Guardian
    And enters guardian name "<Guardian Name>"
    And enters guardian phone number "<Guardian Phone Number>"
    Examples:
      | Admission Number | First Name | Last Name | Class | Section              | Gender | Date of Birth | Guardian Type | Guardian Name | Guardian Phone Number |
      | 12345            | Chroma     | Tech      | SDET  | Testing Fundamentals | Male   | 10/10/1970    | Father        | Chroma Father | 240-869-3092          |
      | 12345            | Mark       | Seward    | SDET  | Testing Fundamentals | Male   | 10/10/1970    | Mother        | Chroma Father | 240-869-3092          |
      | 12345            | Chris      | Tech      | SDET  | Testing Fundamentals | Male   | 10/10/1970    | Other         | Chroma Father | 240-869-3092          |
      | 12345            | Victoria   | Barisova  | SDET  | Testing Fundamentals | Female | 10/10/1970    | Father        | Chroma Father | 206-214-2522          |
      | 12345            | Caleb      | DeLuise   | SDET  | Testing Fundamentals | Male   | 10/10/1970    | Mother        | Chroma Mother | 240-869-3092          |