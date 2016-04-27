package com.open.test.dashboard.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.open.test.dashboard.common.Constant;
import com.open.test.dashboard.common.model.Health;
import com.open.test.dashboard.repository.HealthRepository;

@Service
public class HealthService {

  @Autowired
  HealthRepository userRatingRepository;

  private static final Logger LOGGER = LoggerFactory.getLogger(HealthService.class);

  public List<Health> healthCheck() {
    LOGGER.info(Constant.LOGGERMESSAGESTART + "Health Check " + Constant.LOGGERMESSAGEEND);
    return userRatingRepository.healthService();
  }

}
