package com.practice.blogapplication.services;

import com.practice.blogapplication.dto.UserDto;

import java.util.List;

public interface userService {

    UserDto createUser(UserDto user);

    UserDto updateUser(UserDto user, Integer userId);

    UserDto getUserById(Integer id);

    List<UserDto> getAllUsers();

    void deleteUser(Integer id);


}
