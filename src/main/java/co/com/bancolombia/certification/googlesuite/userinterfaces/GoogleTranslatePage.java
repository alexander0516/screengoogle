package co.com.bancolombia.certification.googlesuite.userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class GoogleTranslatePage {
	public static final Target SOURCE_LANGUAGE_OPTIONS = Target.the("Source language button").located(By.id("gt-sl-gms"));
	public static final Target TARGET_LANGUAGE_OPTIONS = Target.the("Target language button").located(By.id("gt-tl-gms"));
    public static final Target SOURCE_LANGUAGE = Target.the("Source language").locatedBy("//div[@id='gt-sl-gms-menu']/table/tbody/tr/td//div[contains(text(),'inglés')]"); //En cada instancia del navegador puede variar el nombre del elemento inglés/Inglés
    public static final Target TARGET_LANGUAGE = Target.the("Source language").locatedBy("//div[@id='gt-tl-gms-menu']/table/tbody/tr/td//div[contains(text(),'español')]");
    public static final Target SOURCE_LANGUAGE_TEXTAREA = Target.the("Source language textarea").located(By.id("source"));
    public static final Target TARGET_LANGUAGE_RESULT = Target.the("Target language result area").located(By.id("gt-res-dir-ctr"));		
    public static final Target TRANSLATE_BUTTON = Target.the("translate button").located(By.id("gt-submit"));
    
    public static final Target TARGET_LANGUAGE_TEXTAREA = Target.the("target language textarea").located(By.id("result_box"));
}
