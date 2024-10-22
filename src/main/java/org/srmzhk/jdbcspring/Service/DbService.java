package org.srmzhk.jdbcspring.Service;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
import org.srmzhk.jdbcspring.Model.User;

import java.util.List;

@Service
public class DbService {
    private final JdbcTemplate db1JdbcTemplate;

    public DbService(@Qualifier("db1JdbcTemplate") JdbcTemplate db1JdbcTemplate) {
        this.db1JdbcTemplate = db1JdbcTemplate;
    }

    public int getRecordCount() {
        String sql = "SELECT COUNT(*) FROM table1";
        return db1JdbcTemplate.queryForObject(sql, Integer.class);
    }

    public List<User> getAllUsers() {
        String sql = "SELECT * FROM table1";
        return db1JdbcTemplate.query(sql, (rs, rowNum) -> {
            User user = new User();
            user.setId(rs.getInt("ID"));
            user.setName(rs.getString("Name"));
            user.setPhoneNumber(rs.getString("PhoneNumber"));
            user.setEmail(rs.getString("Email"));
            return user;
        });
    }
}
