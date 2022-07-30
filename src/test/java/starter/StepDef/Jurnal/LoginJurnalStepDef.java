package starter.StepDef.Jurnal;

import io.cucumber.java.en.Given;
import net.thucydides.core.annotations.Steps;
import starter.Step.Jurnal.LoginJurnalStep;

public class LoginJurnalStepDef {

    @Steps
    LoginJurnalStep loginJurnalStep;
    @Given("I already logged in")
    public void iAlreadyLoggedIn() {
        loginJurnalStep.loginInJurnal();
    }
}
