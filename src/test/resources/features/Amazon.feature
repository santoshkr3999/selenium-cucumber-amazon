Feature: Amazon 
	As a customer 
I want to place an order
So that I receive the product

Scenario: Validate login 
	Given I am on amazon website 
	When I click on sign in button 
	And I enter xxxxxx as username 
	And I click on contine button 
	And I enter xxxxx as password 
	And I click on login 
	Then I should be logged in as "Santosh" 
	
Scenario Outline: Add a product to cart 
	Given I am logged in as "Santosh" 
	And I Search Studds 
	And I select <ItemName> 
	And I navigate to new tab 
	And I add the product to cart 
	And I navigate to cart 
	Then I should see <ItemName> added in the cart 
	Examples: 
		|ItemName												  |
		|Studds Marshall SUS_MOFH_BLKL Open Face Helmet (Black, L)|
		
Scenario Outline: Verify magnified image of a product 
	Given I am logged in as "Santosh" 
	When I Search <ItemName> 
	And I select <ItemToSelect> 
	And I hover the product
	Then I should see magnified image of the product 
	Examples: 
		|ItemName	|PriceRange	 |GenderAndAge|ItemToSelect					  |
		|Nike tshirt|1,000-1,500	 |		Men   |Nike Off White Test Polo Cricket Tshirts|
		
		
		
