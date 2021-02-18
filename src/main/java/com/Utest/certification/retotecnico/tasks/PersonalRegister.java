package com.Utest.certification.retotecnico.tasks;

import com.Utest.certification.retotecnico.userinterface.PersonalRegisterPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;

public class PersonalRegister implements Task {
    private String  strFirstName;
    private String strLastName;
    private String strEmailAddress;
    private String strMonthOfBirth;
    private String strDayOfBirth;
    private String strYearOfBirth;
    private String strLanguages;

    public PersonalRegister(String strFirstName,String strLastName, String strEmailAddress, String strMonthOfBirth, String strDayOfBirth, String strYearOfBirth, String strLanguages){
        this.strFirstName = strFirstName;
        this.strLastName = strLastName;
        this.strEmailAddress = strEmailAddress;
        this.strMonthOfBirth = strMonthOfBirth;
        this.strDayOfBirth = strDayOfBirth;
        this.strYearOfBirth = strYearOfBirth;
        this.strLanguages = strLanguages;
    }
    public static PersonalRegister onThePage(String strFirstName,String strLastName, String strEmailAddress, String strMonthOfBirth, String strDayOfBirth, String strYearOfBirth, String strLanguages){
        return Tasks.instrumented(PersonalRegister.class,strFirstName,strLastName,strEmailAddress,strMonthOfBirth,strDayOfBirth,strYearOfBirth,strLanguages);
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(PersonalRegisterPage.REGISTER_BUTTON),
                Enter.theValue(strFirstName).into(PersonalRegisterPage.INPUT_FIRSTNAME),
                Enter.theValue(strLastName).into(PersonalRegisterPage.INPUT_LAST_NAME),
                Enter.theValue(strEmailAddress).into(PersonalRegisterPage.INPUT_EMAIL),
                SelectFromOptions.byValue(strMonthOfBirth).from(PersonalRegisterPage.INPUT_BIRTHMONTH),
                SelectFromOptions.byValue(strDayOfBirth).from(PersonalRegisterPage.INPUT_BIRTHDAY),
                SelectFromOptions.byValue(strYearOfBirth).from(PersonalRegisterPage.INPUT_BIRTHYEAR),
                Enter.theValue(strLanguages).into(PersonalRegisterPage.INPUT_LANGUAGES),
                Click.on(PersonalRegisterPage.NEXT_BUTTON)
        );
    }
}
