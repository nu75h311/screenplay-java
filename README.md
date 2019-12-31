# screenplay-java
Demo showing differences between Page Objects and Screenplay patterns

`mvn clean verify -Ppageobjects` : runs the Page Objects tests.

`mvn clean verify -Pscreenplay` : runs the Screenplay tests.

If not configured in your PATH, add the webdrivers to a `src/main/resources/config.properties` file. For example:
```properties
# src/main/resources/config.properties:
webdriver.chrome.driver=C:/tools/webdrivers/chromedriver.exe
webdriver.firefox.driver=C:/tools/webdrivers/geckodriver.exe
```