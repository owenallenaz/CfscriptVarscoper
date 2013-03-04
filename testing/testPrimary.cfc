component {
	fail = "should not be detected";
	
	remote void function testArguments(required string pass_1 = "test", string pass_2 = { fail_1 = testOuter }, pass_3 = "another") {
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
		savecontent variable = "pass" {
			writeOutput("complete");
		}
		
		savecontent variable = "local.fail" {
			writeOutput("completed2");
		}
	}
	
	function testForLoop() {
		// testing unvarred in for declaration
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

	/* testing commented out function
	public function commentedOut() {
		fail = "fail";
	}
	*/
}