package com.tukdyadas.ServiceImple;

import com.tukdyadas.Dao.UserDao;
import com.tukdyadas.POJO.User;
import com.tukdyadas.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImple implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public void addUser(User user) {

        try{

          userDao.save(user);

        }catch (Exception e){
            e.printStackTrace();
        }

    }



}
