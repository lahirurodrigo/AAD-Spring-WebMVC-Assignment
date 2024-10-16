package lk.ijse.aadspringwebmvcassignment.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "lk.ijse.aadspringwebmvcassignment")
public class WebAppRootConfig {
    static Logger logger = LoggerFactory.getLogger(WebAppRootConfig.class);

    public WebAppRootConfig() {
        logger.info("WebAppRootConfig initialized");
    }
}
