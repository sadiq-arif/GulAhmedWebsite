package StepDefinition;

import PageObjects.GulAhmedHeader;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HeaderGulAhmed {
    @Given("User lands to GulAhmed Website")
    public void userLandsToGulAhmedWebsite() {
        System.out.println("I am Here");
    }

    @When("User should be able to see the Ideas Rewards icon in Header")
    public void userShouldBeAbleToSeeTheIdeasRewardsIconInHeader() {
        GulAhmedHeader.checkIdeasReward();
    }

    @And("User should be able to see the Return and Exchange icon in Header")
    public void userShouldBeAbleToSeeTheReturnAndExchangeIconInHeader() {
        GulAhmedHeader.checkReturnAndExchange();
    }

    @And("User should be able to see the Track Order icon in Header")
    public void userShouldBeAbleToSeeTheTrackOrderIconInHeader() {
        GulAhmedHeader.checkTrackOrder();
    }

    @Then("User should be able to see the Lookbook icon in Header")
    public void userShouldBeAbleToSeeTheLookbookIconInHeader() {
        GulAhmedHeader.checkLookbook();
    }
}
