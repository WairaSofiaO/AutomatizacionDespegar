package com.accenture.automatizacion.stepdefinitions;

import org.openqa.selenium.WebDriver;
import com.accenture.automatizacion.tasks.GoTo;
import com.accenture.automatizacion.tasks.SearchAFlight;
import com.accenture.automatizacion.tasks.OpenTheBrowser;
import com.accenture.automatizacion.userinterfaces.DespegarFlightsPage;
import com.accenture.automatizacion.userinterfaces.DespegarHomePage;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;

public class ReserveFlightStepDefinition {
	
	//Instanciar Interfaces
	private DespegarHomePage despegarHomePage;
	//Instanciar el actor
	private Actor actor = Actor.named("Sofia");
	//Instanciar el WebDriver
	@Managed(driver = "chrome") 
	public WebDriver driver;
	
	@Before
	public void setUp() {
		actor.can(BrowseTheWeb.with(driver));
	}
			
	@Given("^the client that open despegar page$")
	public void theClientThatOpenDespegarPage(){
	    // Write code here that turns the phrase above into concrete actions
		actor.wasAbleTo(OpenTheBrowser.on(despegarHomePage));
				
	}
	
	@When("^the client want to reserve a flight (.*) to (.*)$")
	public void theClientWantToReserveAFlightMDEToBOGAndBOGToMDE(String cityOrigin, String cityDestination) {
	    actor.attemptsTo(SearchAFlight.at(cityOrigin, cityDestination));
	    
	}

	@Then("^you should see the traveler data form$")
	public void youShouldSeeTheTravelerDataForm() {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

}
