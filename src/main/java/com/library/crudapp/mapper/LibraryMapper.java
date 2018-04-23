package com.library.crudapp.mapper;

import com.library.crudapp.domain.User;
import com.library.crudapp.domain.dto.UserDto;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class LibraryMapper {

    public User mapUpadteUserDtoToUser(final UserDto userDto) {
        return new User(
                userDto.getUserId(),
                userDto.getFirstName(),
                userDto.getLastName(),
                userDto.getRegistartionDate());
    }

    public User mapUserDtoToUser(final UserDto userDto) {
        return new User(
                userDto.getFirstName(),
                userDto.getLastName(),
                userDto.getRegistartionDate());

    }
    //tymczasowa metoda dla próby -ale nic nie dała
    public UserDto mapDtoToUserDto(final UserDto userDto) {
        return new UserDto(
                userDto.getUserId(),
                userDto.getFirstName(),
                userDto.getLastName(),
                userDto.getRegistartionDate());
    }

    public UserDto mapUserToUserDto(final User user) {
        return new UserDto(
                user.getUserId(),
                user.getFirstName(),
                user.getLastName(),
                user.getRegistartionDate());
    }

    public List<UserDto> mapToUserDtoList(final List<User> taskList) {
        return taskList.stream()
                .map(t -> new UserDto(t.getUserId(), t.getFirstName(), t.getLastName(),t.getRegistartionDate()))
                .collect(Collectors.toList());
    }
}
