del *.class
del *.html
del *.jar
javac *.java
jar -cfv Project02Fox.jar *.java *.class
jar -ufmv Project02Fox.jar manifest.txt
java -jar Project02Fox.jar Project02Data.txt
del *.class
move *.jar jardir
move *.html jardir
