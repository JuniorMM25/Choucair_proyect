package co.com.choucair.certificaction.proyectobase.tasks;

import co.com.choucair.certificaction.proyectobase.userinterface.SearchCoursePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class Search implements Task {
    public Search(String course) {
        this.course = course;
    }

    private final String course;
    public static Search the(String course) {return Tasks.instrumented(Search.class,course); }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(SearchCoursePage.BUTTON_CC),
                Enter.theValue(course).into(SearchCoursePage.INPUT_COURSE),
                Click.on(SearchCoursePage.BUTTON_GO),
                Click.on(SearchCoursePage.SELECT_COURSE)


        );


    }
}
