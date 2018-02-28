package ngdemo.service;

import ngdemo.service.*;
import ngdemo.domain.*;


public class UserService {

    public User getDefaultUser() {
        User user = new User();
        user.setFirstName("JonFromREST");
        user.setLastName("DoeFromREST");
        return user;
    }
}
