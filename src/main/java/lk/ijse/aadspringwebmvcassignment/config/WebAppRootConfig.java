package lk.ijse.aadspringwebmvcassignment.config;

import org.modelmapper.ModelMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@ComponentScan(basePackages = "lk.ijse.aadspringwebmvcassignment")
@EnableJpaRepositories(basePackages = "lk.ijse.aadspringwebmvcassignment.dao")
@EnableTransactionManagement
public class WebAppRootConfig {
    static Logger logger = LoggerFactory.getLogger(WebAppRootConfig.class);

    public WebAppRootConfig() {
        logger.info("WebAppRootConfig initialized");
    }

    @Bean
    public ModelMapper modelMapper() {
        return new ModelMapper();
    }
}
