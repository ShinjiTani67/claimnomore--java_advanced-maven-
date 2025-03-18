package mapper;

import dto.UserDTO;
import dto.UserDto;
import entity.User;
import model.User;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UserMapper {

    UserDTO toDto(User user);
    User toEntity(User UserDto);
}
