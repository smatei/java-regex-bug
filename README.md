# java-regex-bug

for the file [src/main/resources/sample.html](https://github.com/smatei/java-regex-bug/blob/main/src/main/resources/sample.html), applying the regex "<html.*(?:</html|</body)"

I get the error:

java.lang.StackOverflowError
	at java.util.regex.Pattern$Curly.match0(Pattern.java:4264)
	at java.util.regex.Pattern$Curly.match0(Pattern.java:4277)
	at java.util.regex.Pattern$Curly.match0(Pattern.java:4277)
	at java.util.regex.Pattern$Curly.match0(Pattern.java:4277)
	at java.util.regex.Pattern$Curly.match0(Pattern.java:4277)
	at java.util.regex.Pattern$Curly.match0(Pattern.java:4277)
	at java.util.regex.Pattern$Curly.match0(Pattern.java:4277)
	at java.util.regex.Pattern$Curly.match0(Pattern.java:4277)

java version:

java -version
java version "1.8.0_301"
Java(TM) SE Runtime Environment (build 1.8.0_301-b09)
Java HotSpot(TM) 64-Bit Server VM (build 25.301-b09, mixed mode)
