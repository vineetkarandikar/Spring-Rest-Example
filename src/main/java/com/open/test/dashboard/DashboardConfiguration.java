package com.open.test.dashboard;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

/**

 * @since 4/14/2016
 * Database configuration
 */


@Configuration
public class DashboardConfiguration {

  @Value("${db.driver}")
  private String databaseDriverName;

  @Value("${db.url}")
  private String host;

  @Value("${db.username}")
  private String userName;
  
  @Value("${db.password}")
  private String password;

  @Bean(name = "dataSource")
  public DriverManagerDataSource dataSource() {
    DriverManagerDataSource driverManagerDataSource = new DriverManagerDataSource();
    driverManagerDataSource.setDriverClassName(databaseDriverName);
    driverManagerDataSource.setUrl(host);
    driverManagerDataSource.setUsername(userName);
    driverManagerDataSource.setPassword(password);
    return driverManagerDataSource;
  }
}
