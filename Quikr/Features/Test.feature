Feature: Quickr website

Background:
    Given Launch the chrome browser
    When user opens URL 
   

  Scenario: Successful Login through Mobile Number
    When user enters valid Mobile number
    And enters the valid OTP came in the Mobile Number
    And click Verify and Continue
    Then Login should be successful
    
  Scenario: Successful Login through Email Id
    When user enters valid Email address
    And enters correct password
    Then user got logged in

  Scenario: Unsuccessful Login through Mobile Number
    When user enters invalid Mobile Number
    Then Warning Invalid Mobile Number should be displayed
    
   Scenario: Unsuccessful Login through Email Id
    When user enters invalid Email address
    Then  Warning Invalid Email address should be displayed
    
    Scenario: Verifying Search box with valid credentials
      When webpage launched successfully 
      And select bangalore from dropdown
      And Select from All category cars and bikes
      And enter cars in textbox
      And click on search
      Then it should show all available product


    Scenario: Verifying Search box with invalid credentials
     When webpage launched successfully 
     And select bangalore from dropdown
     And Select from All category cars and bikes
     And keep textbox blank
     And click on search
     Then it should show warning


     Scenario: Post Your ad
      When user selet category for ad
      And user select subcategory for ad
      Then user should redirect on next page of category
 
     Scenario: Valid details for post your ad
       Given  user selected category for ad
       And user selected subcategory for ad
       When user select Brand 
       And user select Model
       And  user select Year of Registration
       And user enter KMS Driven
       And user enter City or Pin Code
       And user enter expected selling price
       And user enter Name
       And user enter valid Mobile number
       And user enter valid email
       And user select post Free ad or Premium ad or Gold ad
       And user click on to Post Your Ad
       Then User should redirect on next page
    

     Scenario: Empty details for Post your ad 
        Given  user selected category for ad
        And user selected subcategory for ad
        When user does not select Brand 
        And user does not select Model
        And  user does not select Year of Registration
         And user enter nothing in KMS Driven
 And user enter nothing in  City or Pin Code
 And user enter nothing in expected selling price
 And user enter nothing in Name
 And user enter nothing in Mobile number
 And user enter nothing in email
 And user select post Free ad or Premium ad or Gold ad
 And user click on to Post Your Ad
 Then user should  stay on the same page
 And error message should display for each field
 And user should not able to post ad
  
 Scenario: Invalid details for post your ad
 Given  user selected category for ad
 And user selected subcategory for ad
 When user select Brand 
 And user select Model
 And  user select Year of Registration
 And user enter invalid KMS Driven
 And user enter City or invalid Pin Code
 And user enter expected selling price
 And user enter Name
 And user enter invalid Mobile number
 And user enter invalid email
  And user select post Free adPremium ad or Gold ad
 And user click on to Post Your Ad
 Then user should stay on the same Page
 And error message should diplay for invalid credentials
 And user should not able to post ad
 
 
 Scenario Outline: Invalid details for post your ad
 Given user Select <category> and <subcategory>
 When user select  brand <brand>
 And user select model<model>
 And user select YOF<Year of Registration>
 And user enter  invalid <KMS Driven> and <City or PinCode> and <Expected Selling price> and  <Mobile number> and  <email>
 And user select post Free ad or Premium ad or Gold ad
 And click to post your ad
 Then Status should be <status>
 Examples: 
|category    |subcategory     |brand  |model      |Year of Registration |KMS Driven |City or PinCode |Expected Selling price |Name |Mobile number |email    |status |
|Car & Bikes |Bikes & Scooters|TVS    |TVS Jupiter| 2019                | .00000    |123             |20000                  |Abcd |sdfkjkjfklj   |Shreya23 | fail  |
 
 

