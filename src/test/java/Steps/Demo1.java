package Steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Demo1 {

	@Given("regression Scenario step1")
	public void regression_scenario_step1() {

		System.out.println("regression Scenario step1");
		System.out.println("For the Github Practice Purpose i entered this syso statement");
		System.out.println("For the Github Practice Purpose i entered this syso statement2");
		System.out.println("For the Github Practice Purpose i entered this syso statement3");
	}

	@When("regression Scenario step2")
	public void regression_scenario_step2() {

		System.out.println("regression Scenario step2");
		System.out.println("For the Github Practice Purpose i entered this syso statement");
		System.out.println("For the Github Practice Purpose i entered this syso statement2");
		System.out.println("For the Github Practice Purpose i entered this syso statement3");
	}

	@Then("regression Scenario step3")
	public void regression_scenario_step3() {

		System.out.println("regression Scenario step3");
		System.out.println("For the Github Practice Purpose i entered this syso statement");
		System.out.println("For the Github Practice Purpose i entered this syso statement2");
		System.out.println("For the Github Practice Purpose i entered this syso statement3");
	}

}
