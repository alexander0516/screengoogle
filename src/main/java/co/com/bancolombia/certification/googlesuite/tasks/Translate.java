package co.com.bancolombia.certification.googlesuite.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import co.com.bancolombia.certification.googlesuite.userinterfaces.GoogleTranslatePage;

public class Translate implements Task {

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Click.on(GoogleTranslatePage.SOURCE_LANGUAGE_OPTIONS),
				         Click.on(GoogleTranslatePage.SOURCE_LANGUAGE),
				         Click.on(GoogleTranslatePage.TARGET_LANGUAGE_OPTIONS),
				         Click.on(GoogleTranslatePage.TARGET_LANGUAGE),
				         Enter.theValue("cheese").into(GoogleTranslatePage.SOURCE_LANGUAGE_TEXTAREA),
				         Click.on(GoogleTranslatePage.TRANSLATE_BUTTON)					         
				);		
	}

	public static Translate the() {
		// TODO Auto-generated method stub
		return instrumented(Translate.class);
	}

}
