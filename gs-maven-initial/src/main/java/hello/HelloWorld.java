package hello;

import org.joda.time.LocalTime;

public class HelloWorld {
  public static void main(String[] args) {
    LocalTime currentTime = new LocalTime();
    System.out.println("The current local time is: " + currentTime);

    Greeter greeter = new Greeter();
    System.out.println(greeter.sayHello());
  }
}
//
//To try out the build, issue the following at the command line:
//
//
//	$ mvn compile
//	This will run Maven, telling it to execute the compile goal. When it's finished, you should find the compiled .class files in the target/classes directory.
//
//	Since it's unlikely that you'll want to distribute or work with .class files directly, you'll probably want to run the package goal instead:
//
//
//	$ mvn package
//	The package goal will compile your Java code, run any tests, and finish by packaging the code up in a JAR file within the target directory. The name of the JAR file will be based on the project's <artifactId> and <version>. For example, given the minimal pom.xml file from before, the JAR file will be named gs-maven-initial-0.1.0.jar.

//  $ mvn install
//The install goal will compile, test, and package your project's code and then copy it into the local 
//dependency repository, ready for another project to reference it as a dependency.