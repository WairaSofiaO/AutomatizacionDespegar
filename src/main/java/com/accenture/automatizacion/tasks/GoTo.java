package com.accenture.automatizacion.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import static net.serenitybdd.screenplay.Tasks.instrumented;

import com.accenture.automatizacion.userinterfaces.DespegarFlightsPage;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.targets.Target;

public class GoTo implements Task {
	
	public GoTo() {
	}
	
	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Click.on(DespegarFlightsPage.FLIGHTS));
	}
	
	public static GoTo FlightProduct() {
		// TODO Auto-generated method stub
		return instrumented(GoTo.class);
	}

}
