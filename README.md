## Description
**Basic POC of log4j CVE-2021-44228 originally forked from [LiveOverflow/log4shell](https://github.com/LiveOverflow/log4shell)**

POC application that can be used to see how log4j vulnerability can be combined with Java deserialization vulnerability to obtain RCE even with an updated version on Java.

The application uses a vulnerable version of log4j 2 core and also imports Apache Commons Collections, I refer you [here](https://github.com/frohoff/ysoserial#description) for a really great summary on how "gadget chains" can be used to obtain unsafe deserialization of objects which ultimately leads to Remote Code Execution.

## How to build

To build the application you will need [`maven`](https://maven.apache.org/what-is-maven.html), after you have installed it just run `mvn package` and the compiled .jar will be inside a folder named *target*.

At any point you can play with the source code by updating *src/main/java/HelloLog.java* and then recompile the project to test things out.

## How to use it

## References
* [Zero-Day Exploit Targeting Popular Java Library Log4j](https://www.govcert.ch/blog/zero-day-exploit-targeting-popular-java-library-log4j/)
* [CVE-2021-44228](https://cve.mitre.org/cgi-bin/cvename.cgi?name=cve-2021-44228)
* [A JOURNEY FROM JNDI/LDAP
MANIPULATION TO REMOTE CODE
EXECUTION DREAM LAND](https://www.blackhat.com/docs/us-16/materials/us-16-Munoz-A-Journey-From-JNDI-LDAP-Manipulation-To-RCE.pdf)
* [Serialization and deserialization in Java: explaining the Java deserialize vulnerability](https://snyk.io/blog/serialization-and-deserialization-in-java/)
* [pimps/ysoserial-modified](https://github.com/pimps/ysoserial-modified)
* [pimps/JNDI-Exploit-Kit](https://github.com/pimps/JNDI-Exploit-Kit)
