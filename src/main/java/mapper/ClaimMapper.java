package mapper;

import dto.ClaimDTO;
import entity.Claim;


@Mapper(componentModel = "spring")
public interface ClaimMapper {
    ClaimDTO toDto(Claim claim);
    Claim toEntity(ClaimDTO projectDTO);
}
