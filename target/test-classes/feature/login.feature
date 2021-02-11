Feature: Validate that user should be able enter items to cart

Scenario Outline: Validate that user is able to select items 
Given User should be able to login with valid credentials
When Validate that user is able to click <item1> and <item2> and <item3>
Then User should be able to add items to the Cart <item1> and <item2> and <item3>
When Validate that user should be able to click on PRODUCT CARD ICON
Then User should be able to click on the product icon
When Validate user should be able to click on PROCEED TO CART icon
Then User should be able to see PROCEED TO CART icon

Examples:
|item1|item2|item3|
|Brocolli|Cucumber|Beetroot|
