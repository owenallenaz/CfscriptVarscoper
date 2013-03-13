java org.antlr.v4.Tool Cfscript.g4 -o %CD%\compiled\
javac -source 1.6 -target 1.6 compiled\Cfscript*.java
javac -source 1.6 -target 1.6 java\*.java -d compiled\