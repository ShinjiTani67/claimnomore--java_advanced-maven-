package controller;

import dto.ClaimDTO;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.UUID;


@RestController
@RequestMapping("/claim")
@AllArgsConstructor
public class ClaimController {

    @Autowired
    private final ClaimService claimService;

    @PutMapping("/{uuid}")
    public ResponseEntity<?> atualizarClaim(@RequestBody ClaimDTO claimDto,
                                             @PathVariable UUID uuid) {
        try {
            claimDto.setUuid(uuid);
            return new ResponseEntity<>(claimService.atualizarClaim(claimDto), HttpStatus.OK);
        } catch (IllegalArgumentException e) {

            return new ResponseEntity<>("Tarefa com UUID não existe.", HttpStatus.NOT_FOUND);
        }
    }
}
