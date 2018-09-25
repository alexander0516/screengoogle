package co.com.bancolombia.certification.googlesuite.userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class GoogleAppsComponent {
	//located cuando se va a buscar el elemento por id
	//gb_8 gb_9c gb_R gb_g
    public static final Target GOOGLE_APPS = Target.the("Google apps button").located(By.id("gbwa"));
	//public static final Target GOOGLE_APPS = Target.the("Google apps button").located(By.className("gb_8 gb_9c gb_R"));
    public static final Target GOOGLE_TRANSLATE = Target.the("Google translate Option").located(By.id("gb51"));
  //  public static final Target GOOGLE_PRESENTACION = Target.the("Google translate new").located(By.id("gb_wa gb_Ad gb_jd"));
}
