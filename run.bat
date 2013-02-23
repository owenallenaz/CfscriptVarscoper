SET CLASSPATH=%CD%\lib\antlr-4.0-complete.jar;%CLASSPATH%
cd compiled
java org.antlr.v4.runtime.misc.TestRig Cfscript component -gui ../test.cfc
cd..