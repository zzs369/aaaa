package com.example.spring.demo.mapper;

import com.example.spring.demo.entity.user;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface usermapper {
    user getById(int id);
    public boolean insert(String name);
    public List<user> getUsers();
    public boolean updateUser(user user);
    public boolean deleteUser(int id);
    public boolean deleteAllUsers();
}
