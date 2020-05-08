package cucumber.helpers;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "screenplay.models")
public class SpringConfig {
}
