SET CLASSPATH=%CD%\lib\antlr-4.0-complete.jar;%CLASSPATH%
java org.antlr.v4.Tool Cfscript.g4 -o %CD%\compiled\
javac compiled\Cfscript*.java