package mapper;


import dto.DentistDTO;
import entity.Dentist;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface DentistMapper {
    DentistDTO toDto(Dentist dentist);
    Dentist toEntity(Dentist DentistDto);
}
