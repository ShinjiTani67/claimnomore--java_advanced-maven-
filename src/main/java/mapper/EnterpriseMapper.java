package mapper;


import dto.EnterpriseDTO;
import entity.Enterprise;

@Mapper(componentModel = "spring")
public interface EnterpriseMapper {
    EnterpriseDTO toDto(Enterprise enterprise);
    Enterprise toEntity(Enterprise EnterpriseDto);
}
