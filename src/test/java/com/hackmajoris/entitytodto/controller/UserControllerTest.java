package com.hackmajoris.entitytodto.controller;

import static org.junit.Assert.assertEquals;

import com.hackmajoris.entitytodto.model.dtos.UserCreateDTO;
import com.hackmajoris.entitytodto.model.dtos.UserReadDTO;
import com.hackmajoris.entitytodto.model.dtos.UserUpdateDTO;
import com.hackmajoris.entitytodto.service.UserService;
import org.junit.Test;

public class UserControllerTest {
    @Test
    public void testConstructor() {
        new UserController(new UserService());
    }

    @Test
    public void testCreatePost() {
        UserController userController = new UserController(new UserService());

        UserCreateDTO userCreateDTO = new UserCreateDTO();
        userCreateDTO.setEmail("jane.doe@example.org");
        userCreateDTO.setPassword("iloveyou");
        userCreateDTO.setName("Name");
        assertEquals("jane.doe@example.org", ((UserCreateDTO) userController.createPost(userCreateDTO)).getEmail());
        assertEquals("iloveyou", ((UserCreateDTO) userController.createPost(userCreateDTO)).getPassword());
        assertEquals("Name", ((UserCreateDTO) userController.createPost(userCreateDTO)).getName());
    }

    @Test
    public void testReadUser() {
        assertEquals("Email number 1", ((UserReadDTO) (new UserController(new UserService())).readUser()).getEmail());
        assertEquals("User number 1", ((UserReadDTO) (new UserController(new UserService())).readUser()).getName());
    }

    @Test
    public void testUpdateUser() {
        UserController userController = new UserController(new UserService());

        UserUpdateDTO userUpdateDTO = new UserUpdateDTO();
        userUpdateDTO.setEmail("jane.doe@example.org");
        userUpdateDTO.setPassword("iloveyou");
        userUpdateDTO.setName("Name");
        assertEquals("jane.doe@example.org", ((UserUpdateDTO) userController.updateUser(userUpdateDTO)).getEmail());
        assertEquals("iloveyou", ((UserUpdateDTO) userController.updateUser(userUpdateDTO)).getPassword());
        assertEquals("Name", ((UserUpdateDTO) userController.updateUser(userUpdateDTO)).getName());
    }
}

