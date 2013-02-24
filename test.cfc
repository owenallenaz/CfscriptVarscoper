component something = "foo" another = "more" persistent = "true" datasource = "#application.env.dsn#" {
	local.nuts.method = "multi-chain scope requirement";
	 
	var method = something.foo.yourmom;
	testing = something.foo[10];
	testingagain = something.foo["this is a test"];
	nuts["testing"]++;
	blah.test().yourmom["test"]();

	var math = 1 + 2 - blah.test().yourmom["test"];

	var test = something;
	var testing = somethingelse;
	var testing = { 
		test = more, 
		mystuff = { 
			interior = test 
		},
		third = "third key"
	};
	other = "Idunno homie";
	methodCall(interiorMethod());

	public function test1() {
		var newVar = "somebody i used to know";
		something = [1, 2, 3];
		local.yourmom.hasfleas = something;
	}

	function test2(required string test1 = "first", string test = "second", test3 = "third") {

	}
 
	private boolean function test3() {
		var this = "something else";
	}
}