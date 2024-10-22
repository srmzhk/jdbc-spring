package org.srmzhk.jdbcspring.Config;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import javax.sql.DataSource;

@Configuration
public class Db1DataSourceConfig {
    @Value("${spring.datasource.driver}")
    private String driver;

    @Value("${spring.datasource.db1.url}")
    private String url;

    @Value("${spring.datasource.db1.username}")
    private String username;

    @Value("${spring.datasource.db1.password}")
    private String password;

    @Primary
    @Bean("db1DataSource")
    @ConfigurationProperties(prefix = "spring.datasource.db1")
    public DataSource db1DataSource() {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName(driver);
        dataSource.setUrl(url);
        dataSource.setUsername(username);
        dataSource.setPassword(password);
        return dataSource;
    }

    @Primary
    @Bean
    public JdbcTemplate db1JdbcTemplate(@Qualifier("db1DataSource") DataSource dataSource) {
        return new JdbcTemplate(dataSource);
    }
}
