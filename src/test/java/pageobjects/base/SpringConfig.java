package pageobjects.base;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "pageobjects.pages")
public class SpringConfig {
}
