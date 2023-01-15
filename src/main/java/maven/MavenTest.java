package maven;

import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;
import shared.Main;

public class MavenTest {
    public static void main(String[] args) {
        try {
            System.out.println("Here is the html of google.com");
            System.out.println(Unirest.get("https://www.google.com").asString().getBody());
        } catch (UnirestException e) {
            throw new RuntimeException(e);
        }
    }

    /*
    <build>
        <plugins>
            <plugin>
                <groupId>org.apache.maven.plugins</groupId>
                <artifactId>maven-compiler-plugin</artifactId>
                <configuration>
                    <source>17</source>
                    <target>17</target>
                </configuration>
            </plugin>
            <plugin>
                <artifactId>maven-assembly-plugin</artifactId>
                <executions>
                    <execution>
                        <id>MavenTest</id>
                        <configuration>
                            <archive>
                                <manifest>
                                    <mainClass>maven.MavenTest</mainClass>
                                </manifest>
                            </archive>
                            <descriptorRefs>
                                <descriptorRef>jar-with-dependencies</descriptorRef>
                            </descriptorRefs>
                            <finalName>maven-test-jar</finalName>
                        </configuration>
                        <phase>package</phase>
                        <goals>
                            <goal>single</goal>
                        </goals>
                    </execution>
                </executions>
            </plugin>
        </plugins>
    </build>
     */
}
