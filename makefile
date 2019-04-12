
all: SCalc.class

SCalc.class : ScalcLexer.java ScalcParser.java
	javac -cp ".;beaver-rt-0.9.11.jar" SCalc.java
	
	
ScalcLexer.java: 
	java -jar JFlex.jar SCalc.flex
	

ScalcParser.java:
	java -cp ".;beaver-rt-0.9.11.jar" -jar beaver-cc-0.9.11.jar -T SCalc.grammar
	
	
clean:  cleanGens
	del /s /q *.class
	
	
cleanGens: cleanScanner cleanParser  
	del Terminals.java 

cleanScanner: 
	del ScalcLexer.java

cleanParser:  
	del ScalcParser.java

teste: SCalc.class
	java -classpath ".;beaver-rt-0.9.11.jar" SCalc teste.txt
