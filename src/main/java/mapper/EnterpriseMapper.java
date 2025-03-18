package mapper;


import dto.EnterpriseDTO;
import entity.Enterprise;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface EnterpriseMapper {
    EnterpriseDTO toDto(Enterprise enterprise);
    Enterprise toEntity(Enterprise EnterpriseDto);
}
