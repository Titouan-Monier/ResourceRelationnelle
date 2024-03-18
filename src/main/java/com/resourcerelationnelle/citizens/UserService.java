package com.resourcerelationnelle.citizens;

// UserService.java
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
// Service = Logic business amenant aux méthodes CRUD, attention ces méthodes sont en static
@Service
public class UserService {

        @Autowired
        private  CitizensRepository citizensRepository;

        public   Citizens createUser(Citizens user) {
            return citizensRepository.save(user);
        }

        public  List<Citizens> getAllUsers() {
            return (List<Citizens>) citizensRepository.findAll();
        }

        public  Citizens getUserById(Long id) {
            return citizensRepository.findById(id).orElse(null);
        }

        public  Citizens updateUser(Long id, Citizens user) {
            user.setId(id);
            return citizensRepository.save(user);
        }

        public  void deleteUser(Long id) {
            citizensRepository.deleteById(id);
        }
    }




