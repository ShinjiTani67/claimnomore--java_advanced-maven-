package dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class DentistDTO {

    private UUID uuid;

    private String name;

    private int CPF;

    private String CRO;

    private String adress;

    private int phone;

    private String email;

    private int birthdate;
}