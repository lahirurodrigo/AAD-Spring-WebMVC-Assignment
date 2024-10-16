package lk.ijse.aadspringwebmvcassignment.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@ComponentScan(basePackages = "lk.ijse.aadspringwebmvcassignment")
@EnableWebMvc
public class WebAppConfig {
    static Logger logger = LoggerFactory.getLogger(WebAppConfig.class);
    public WebAppConfig() {
        logger.info("WebAppConfig Constructor");
    }
}
