package com.Utest.certification.retotecnico.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PersonalRegisterPage {
    public static final Target REGISTER_BUTTON = Target.the("button that shows us the form to register")
            .located(By.xpath("//div[@class='unauthenticated-nav-bar__sign-up']'Join Today')]"));
    public static final Target INPUT_FIRSTNAME = Target.the("where do we write the firstname")
            .located(By.id("firstName"));
    public static final Target INPUT_LAST_NAME = Target.the("where do we write the lastname")
            .located(By.id("lastName"));
    public static final Target INPUT_EMAIL = Target.the("where do we write the email")
            .located(By.id("email"));
    public static final Target INPUT_BIRTHMONTH = Target.the("where do we write the birthmonth")
            .located(By.id("birthMonth"));
    public static final Target INPUT_BIRTHDAY = Target.the("where do we write the birtday")
            .located(By.id("birthDay"));
    public static final Target INPUT_BIRTHYEAR = Target.the("where do we write the birthYear")
            .located(By.id("birthYear"));
    public static final Target INPUT_LANGUAGES = Target.the("where do we write the languages")
            .located(By.id("languages"));
    public static final Target NEXT_BUTTON = Target.the("button next")
            .located(By.xpath("//a[contains(@class='btn btn-blue')]"));

}


