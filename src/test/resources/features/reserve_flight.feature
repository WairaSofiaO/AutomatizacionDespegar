Feature: Reserve a Flight with serenity bdd
	I am a client that want to reserve a flight MDE to BOG,
	for verify by filling in my personal
 
  Scenario Outline: Reserve a Flight with serenity bdd
	Given the client that open despegar page
	When the client want to reserve a flight <CITY_OF_ORIGIN> to <CITY_OF_DESTINATION>
	Then you should see the traveler data form
	
Examples:
|CITY_OF_ORIGIN|CITY_OF_DESTINATION|
|Medellin antioquia|Bogota colombia|
