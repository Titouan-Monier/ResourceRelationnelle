package com.resourcerelationnelle.citizens;

// citizenService.java
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
// Service = Logic business amenant aux méthodes CRUD
@Service
public class CitizensService {

        @Autowired
        private  CitizensRepository citizensRepository;

        public   Citizens createCitizen(Citizens citizen) {
            return citizensRepository.save(citizen);
        }

        public  List<Citizens> getAllCitizens() {
            return citizensRepository.findAll();
        }

        public  Citizens getCitizenById(Long id) {
            return citizensRepository.findById(id).orElse(null);
        }

        public  Citizens updateCitizen(Long id, Citizens citizen) {
            citizen.setId(id);
            return citizensRepository.save(citizen);
        }
    //public  List<Citizens> listAll() {
       //     return (List<Citizens>) citizensRepository.findAll();
   // }

        public  void deleteCitizen(Long id) {
            citizensRepository.deleteById(id);
        }
        public void save (Citizens citizen) {
            citizensRepository.save(citizen);
        }
    }




