package service;

import entity.Dentist;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.DentistRepository;

import java.util.List;
import java.util.Optional;


@Service
@AllArgsConstructor
public class DentistService {

    @Autowired
    private DentistRepository dentistRepository;

    public List<Dentist> getAllDentists() {
        return dentistRepository.findAll();
    }

    public Optional<Dentist> getDentistById(Long id) {
        return dentistRepository.findById(id);
    }

    public Dentist saveDentist(Dentist dentist) {
        return (Dentist) dentistRepository.save(dentist);
    }

    public void deleteDentist(Long id) {
        dentistRepository.deleteById(id);
    }

}
