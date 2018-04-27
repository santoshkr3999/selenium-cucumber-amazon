Feature: MMT_EndToEnd
	Scenario: User is able to search a flight
		Given User launches MMT
		When User enters "Chennai" as source city
		And User enters "Hyderabad" as destination city
		And User selects Round Trip
		And User enters "12 May, Sat" as departure date
		And User enters "13 May, Sun" as return date
		And User clicks on search button
		Then User should be able to see flight list
#		And User waits for 60 seconds
		
