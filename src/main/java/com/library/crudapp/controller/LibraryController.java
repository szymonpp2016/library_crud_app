package com.library.crudapp.controller;

import com.library.crudapp.domain.dto.UserDto;
import com.library.crudapp.mapper.LibraryMapper;
import com.library.crudapp.service.DbLibraryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import static org.springframework.util.MimeTypeUtils.APPLICATION_JSON_VALUE;


@RestController
@RequestMapping("v1/library/")
public class LibraryController {

    @Autowired
    private DbLibraryService service;

    @Autowired
    private LibraryMapper libraryMapper;

    @RequestMapping(method = RequestMethod.GET, value = "getUsers")
    public List<UserDto> getUsers() {
        return libraryMapper.mapToUserDtoList(service.getAllTasks());
    }
    @RequestMapping(method = RequestMethod.GET, value = "getUserById")
    public UserDto getUser(int userId) {
        return libraryMapper.mapUserToUserDto(service.getUserById(userId));
    }
    @RequestMapping(method = RequestMethod.POST, value = "createUser")
    public void createUser(UserDto userDto){
        service.saveUser(libraryMapper.mapUserDtoToUser(userDto));
    }
    @RequestMapping(method = RequestMethod.PUT, value = "updateUser")
    public UserDto updateUser(UserDto userDto){
        return libraryMapper.mapDtoToUserDto(userDto);
    }
    @RequestMapping(method = RequestMethod.DELETE, value = "deletUser")
    public void deletUser(int userId){
        service.deleteUser(service.getUserById(userId));
    }
}



