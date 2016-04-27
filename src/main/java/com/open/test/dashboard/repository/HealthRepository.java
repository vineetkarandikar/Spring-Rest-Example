package com.open.test.dashboard.repository;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.open.test.dashboard.common.Constant;
import com.open.test.dashboard.common.model.Health;
import com.open.test.dashboard.row.mapper.HealthMapper;



@Repository
public class HealthRepository {

  @Autowired
  DriverManagerDataSource dataSource;

  @Autowired
  JdbcTemplate jdbcTemplateObject;

  private static final Logger LOGGER = LoggerFactory.getLogger(HealthRepository.class);

  @Transactional
  public List<Health> healthService() {
    LOGGER.info(Constant.LOGGERMESSAGESTART + "HEALTH CHECK "
        + Constant.LOGGERMESSAGEEND);
    return jdbcTemplateObject.query(Constant.HEALTHCHECKSQL,new HealthMapper());
   }
}
