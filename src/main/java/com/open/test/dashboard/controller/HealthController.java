package com.open.test.dashboard.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.open.test.dashboard.common.Constant;
import com.open.test.dashboard.common.model.Health;
import com.open.test.dashboard.service.HealthService;

@RequestMapping("/health/v1")
@RestController
public class HealthController {

  @Autowired
  HealthService healthService;

  private static final Logger LOGGER = LoggerFactory.getLogger(HealthController.class);

  @RequestMapping(value = "/test", method = RequestMethod.GET)
  public List<Health> generateRating() {
    LOGGER
        .info(Constant.LOGGERMESSAGESTART + "Health Check Controller " + Constant.LOGGERMESSAGEEND);
    return healthService.healthCheck();
  }

}
