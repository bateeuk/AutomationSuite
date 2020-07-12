 Feature: Check the registration of a Car
 
 Scenario: Check the registration of used cars
 Given User would logged into the Car registration screen
 And should be present at the Free Car Check screen
 When User clicks and enters REG Number
 And User selects the Free Car Check button
 Then User is directed to the Vehicle Identity screen
 And User logs down vehicle details
