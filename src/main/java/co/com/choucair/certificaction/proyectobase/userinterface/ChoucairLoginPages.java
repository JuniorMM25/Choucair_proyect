package co.com.choucair.certificaction.proyectobase.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ChoucairLoginPages extends PageObject {
    public static final Target LOGIN_BUTTOM = Target.the("Buttom that show us the form to login")
            .located(By.xpath("//*[@id=\"nav-menu\"]/ul[2]/li/a/strong"));
    public static final Target INPUT_USER =Target.the("Where do we write the user").located(By.id("username"));
    public static final Target INPUT_PASSWORD =Target.the("Where do we write password").located(By.id("password"));
    public static final Target ENTER_BOTTON =Target.the("Buttom to confirm login").located(By.xpath("//button[@type='submit']"));

}
