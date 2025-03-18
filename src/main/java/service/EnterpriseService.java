package service;


import dto.EnterpriseDTO;
import lombok.AllArgsConstructor;
import mapper.EnterpriseMapper;
import org.springframework.stereotype.Service;
import repository.EnterpriseRepository;
import java.util.Optional;
import java.util.UUID;

@Service
@AllArgsConstructor
public class EnterpriseService {
    private final EnterpriseRepository enterpriseRepository;
    private final EnterpriseMapper enterpriseMapper;

    Optional<EnterpriseDTO> buscarUUID(UUID uuid) {
        return enterpriseRepository.findByUuid(uuid).map(enterpriseMapper::toDto);
    }
}
