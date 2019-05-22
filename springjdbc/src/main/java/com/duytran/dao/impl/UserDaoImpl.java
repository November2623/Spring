package com.duytran.dao.impl;

import com.duytran.dao.UserDAO;
import com.duytran.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Repository
public class UserDaoImpl implements UserDAO {

    @Autowired
    private JdbcTemplate jdbcTemplate;


    @Override
    public List<User> getAllUser() {
        String sql = "SELECT * FROM user";

        return jdbcTemplate.query(sql, new RowMapper<User>(){
            @Override
            public User mapRow(ResultSet rs, int i) throws SQLException {
                User user = new User();
                user.setId(rs.getInt("id"));
                user.setUser_name(rs.getString("user_name"));
                user.setPassword(rs.getString("password"));
                return user;
            }
        });
    }

}
