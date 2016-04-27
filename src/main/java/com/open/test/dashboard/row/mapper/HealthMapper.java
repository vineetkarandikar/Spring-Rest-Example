package com.open.test.dashboard.row.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.open.test.dashboard.common.model.Health;

public class HealthMapper implements RowMapper<Health> {

  public Health mapRow(ResultSet rs, int rowNum) throws SQLException {

    Health health = new Health();

    health.setId(rs.getLong("id"));

    health.setMessage(rs.getString("message"));

    return health;
  }

}
