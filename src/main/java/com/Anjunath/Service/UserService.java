package com.Anjunath.Service;

import com.Anjunath.Entity.User;
import com.Anjunath.dto.UserDto;

import java.util.List;

public interface UserService {

    void saveUser(UserDto userDto);

    User findByEmail(String email);

    List<UserDto> findAllUsers();
}
