// execute in developer tools of any browser to easily convert strings into a format which can be used for case insensitive token detection
// createCase("returnvariable") == ('r'|'R')('e'|'E')('t'|'T')('u'|'U')('r'|'R')('n'|'N')('v'|'V')('a'|'A')('r'|'R')('i'|'I')('a'|'A')('b'|'B')('l'|'L')('e'|'E')
function createCase(str) {
	var returnStr = "";
	var character = "";
	for(var i = 0; i < str.length; i++) {
		character = str.substr(i,1);
		returnStr += "('" + character.toLowerCase() + "'|'" + character.toUpperCase() + "')";
	}
	return returnStr;
}