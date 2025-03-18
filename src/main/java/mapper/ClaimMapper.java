package mapper;

import dto.ClaimDTO;
import entity.Claim;
import org.mapstruct.Mapper;


@Mapper(componentModel = "spring")
public interface ClaimMapper {
    ClaimDTO toDto(Claim claim);
    Claim toEntity(ClaimDTO projectDTO);
}
