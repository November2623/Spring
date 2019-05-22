package com.duy.DAO;

import java.util.Arrays;
import java.util.List;

public class JbdcUserDAO implements UserDAO {

    @Override
    public List<String> getAllUserName() {
        System.out.println("Getting username from test");
        return Arrays.asList("Duy","Chau", "Rob");
    }
}
