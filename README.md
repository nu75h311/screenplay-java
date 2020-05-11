# screenplay-java
Demo showing differences between Page Objects and Screenplay patterns

**I am working on/studying some improvements in the master branch, so if you want a simpler versions, check out**  
`basic-web` branch for the simple browser test implementation.  
`api-testing` branch for an example with RestAssured.

**Run with**

`mvn clean verify -Ppageobjects` : runs the Page Objects tests.

`mvn clean verify -Pscreenplay` : runs the Screenplay tests.

`mvn clean verify -Pcucumber` : runs the tests in Cucumber feature files.

If not configured in your PATH, add the webdrivers to a `src/main/resources/config.properties` file. For example:
```properties
# src/main/resources/config.properties:
webdriver.chrome.driver=C:/tools/webdrivers/chromedriver.exe
webdriver.firefox.driver=C:/tools/webdrivers/geckodriver.exe
```