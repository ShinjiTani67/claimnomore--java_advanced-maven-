package service;

import dto.ClaimDTO;
import entity.Claim;
import lombok.AllArgsConstructor;
import mapper.ClaimMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import repository.ClaimRepository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
@AllArgsConstructor
public class ClaimService   {

    @Autowired
    private ClaimRepository claimRepository;

    public List<Claim> getAllClaims() {
        return claimRepository.findAll();
    }

    public Optional<Claim> getClaimById(Long id) {
        return claimRepository.findById(id);
    }

    public Claim saveClaim(Claim claim) {
        return claimRepository.save(claim);

        public void deleteClaim(Long id) {
        claimRepository.deleteById(id);
    }
}