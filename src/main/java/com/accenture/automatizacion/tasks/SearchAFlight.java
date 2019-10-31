package com.accenture.automatizacion.tasks;

import org.openqa.selenium.Keys;

import com.accenture.automatizacion.userinterfaces.DespegarFlightsPage;

//import com.accenture.automatizacion.userinterfaces.DespegarFlightsPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
/*Libreria is Enable*/
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isEnabled;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import net.serenitybdd.screenplay.matchers.statematchers.IsEnabledMatcher;
import net.serenitybdd.screenplay.matchers.statematchers.IsVisibleMatcher;
import net.serenitybdd.screenplay.waits.WaitUntil;

public class SearchAFlight implements Task{
	private String cityDestination;
	private String cityOrigin;

	public SearchAFlight(String cityOrigin,String cityDestination) {
		this.cityDestination=cityDestination;
		this.cityOrigin=cityOrigin;
	}
	
	@Override
	public <T extends Actor> void performAs(T actor) {
	
		actor.attemptsTo(
				Enter.theValue(cityOrigin).into(DespegarFlightsPage.CITY_OF_ORIGIN)
				);
		DespegarFlightsPage.CITY_OF_ORIGIN.resolveFor(actor).sendKeys(Keys.ENTER);
		actor.attemptsTo(
				WaitUntil.the(DespegarFlightsPage.CITY_OF_ORIGIN,isEnabled()),
				Enter.theValue(cityDestination).into(DespegarFlightsPage.CITY_OF_DESTINATION)
				);
		DespegarFlightsPage.CITY_OF_DESTINATION.resolveFor(actor).sendKeys(Keys.ENTER);	
		actor.attemptsTo(
				Click.on(DespegarFlightsPage.GOING),
				Click.on(DespegarFlightsPage.DATE_GOING),
				Click.on(DespegarFlightsPage.DATE_RETURN),
				Click.on(DespegarFlightsPage.SEARCH)
				);
		
	}
	public static SearchAFlight at(String cityOrigin, String cityDestination) {
		return instrumented(SearchAFlight.class, cityOrigin, cityDestination);
	}


}
