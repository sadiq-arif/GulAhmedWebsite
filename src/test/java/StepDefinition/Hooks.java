package StepDefinition;

import Utils.BaseClass;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks extends BaseClass {

    @Before
    public void setup() {
        initializeDriver();
    }

    @After
    public void close() {
        closeDriver();
    }
}
