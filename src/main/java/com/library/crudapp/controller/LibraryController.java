package com.library.crudapp.controller;

import com.library.crudapp.domain.dto.UserDto;
import com.library.crudapp.mapper.LibraryMapper;
import com.library.crudapp.service.DbLibraryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.springframework.util.MimeTypeUtils.APPLICATION_JSON_VALUE;

@CrossOrigin(origins = "*")
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
    public UserDto getUser(@RequestParam int userId) {
        return libraryMapper.mapUserToUserDto(service.getUserById(userId));
    }
    @RequestMapping(method = RequestMethod.POST, value = "createUser", consumes = APPLICATION_JSON_VALUE)
    public void createUser(@RequestBody UserDto userDto){
        service.saveUser(libraryMapper.mapUserDtoToUser(userDto));
    }
    @RequestMapping(method = RequestMethod.PUT, value = "updateUser")
    public UserDto updateUser(@RequestBody UserDto userDto){
        return libraryMapper.mapUserToUserDto(service.saveUser(libraryMapper.mapUpadteUserDtoToUser(userDto)));
    }
    @RequestMapping(method = RequestMethod.DELETE, value = "deleteUser")
    public void deletUser(@RequestParam int userId){
        service.deleteUser(userId);
    }
}



