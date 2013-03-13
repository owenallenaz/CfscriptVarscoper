// primary test component. This should test both positive and negative cases in order to assure that we can handle all language constructs and all types of unvarred variables
CoMpOnEnT aCceSsors = "true" {
	PrOpErTy test1;
	property name = "testing" type = "string";
	
	fail = "should not be detected";
	
	ReMoTe VoId fuNcTioN testArguments(required string pass_1 = "test", string pass_2 = { fail_1 = testOuter }, pass_3 = "another") {
		pass_1 = "varred";
		pass_2 = "varred";
		pass_3 = "Varred";
	}
	
	function testUnvarred() {
		pass = "I am unvarred";
	}
	
	function testScopes() {
		request.fail = 1;
		session.fail = 1;
		application.fail = 1;
		variables.fail = 1;
		this.fail = 1;
		local.fail = 1;
		arguments.fail = 1;
		
		// fail = "something that should be commented out";
		// totally bogus construction { = [}-{134} = something function() { fail = "should be ignored"; }
	}
	
	function testSavecontent() {
		// the system should pick this up as unvarred
		savecontent variable = "pass" {
			writeOutput("complete");
		}
		
		savecontent variable = "local.fail" {
			writeOutput("completed2");
		}
	}
	
	function testForLoop() {
		// testing unvarred in for declaration, this should be deteced as unvarred
		for(pass = 1; pass <= 1; pass++) {
			request.fail = "should not be marked";
		}
		
		// testing varred in for declaration
		for(local.fail = 1; local.fail <= 1; local.fail++) {
			// testing varred in for loop
			arguments.fail = "should not be marked";
		}
		
		for(local.fail2 = 2; local.fail2 <= 2; local.fail2++) {
			// testing unvarred inside for loop
			pass_2 = "should be marked";
		}
	}

	function testConditionals() {
		if (local.test) {
			pass_1 = "should be marked";
			session.fail = "should not be marked";
		} else if (fail) {
			pass_2 = "should be marked";
			application.fail = "should not be marked";
		} else if (blah == test && another.more[0](foo) is "return") {
			pass_3 = "should be marked";
			url.fail = "some value" eq "some value" ? true : false;
		} else {
			pass_4 = "something be marked";
			variables.url.local.fail = unvarred;
		}
		
		// testing conditional operators to be sure they don't crash our grammar
		if (1 is 2 AND 3 eq 4 AND 5 < 6 AND 6 > 7 AND 8 >= 9 AND 10 <= 11 AND 12 gt 13 AND 13 lt 14 AND 15 gte 16 AND 17 lte 18 AND 19 is not 20 OR anotherValue || yetanotherValue && lastValue) {
			pass_4 = "should be marked";
		}
	}
	
	function testExpressions() {
		// testing various equality expressions to ensure they don't crash grammar
		local.test = "a value";
		local.test &= "another value";
		local.test += "another value";
		local.test -= "another value";
		local.test = !testValue;
		local.test = ~testValue;
	}

	/* testing commented out function
	public function commentedOut() {
		fail = "fail";
	}
	*/
}