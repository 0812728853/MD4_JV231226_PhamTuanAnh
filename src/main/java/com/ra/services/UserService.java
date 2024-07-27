package com.ra.services;

import com.ra.models.User;

public interface UserService {
    User findByUserName(String userName);
}
