package service;

import dto.ClaimDTO;
import entity.Claim;
import lombok.AllArgsConstructor;
import mapper.ClaimMapper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import repository.ClaimRepository;
import java.util.Optional;
import java.util.UUID;

@Service
@AllArgsConstructor
public class ClaimService   {
    private final ClaimRepository claimRepository;
    private final ClaimMapper claimMapper;

    public Optional<ClaimDTO>buscarUUID(UUID uuid) {
        return claimRepository.findByUuid(uuid).map(claimMapper::toDto);
    }

    @Transactional
    public ClaimDTO atualizarClaim(ClaimDTO  claimDTO) {

        Optional<Claim> claimExistente = claimRepository.findByUuid(claimDTO.getUuid());

        if (claimExistente.isEmpty()) {
            throw new IllegalArgumentException("Sinistro com UUID não existente.");
        }
        Claim claim = claimMapper.toEntity(claimDTO);
        Claim savedClaim = (Claim) claimRepository.save(claim);
        return claimMapper.toDto(savedClaim);
    }
}
