package com.resourcerelationnelle;
import com.resourcerelationnelle.citizens.Citizens;
import com.resourcerelationnelle.citizens.CitizensRepository;
import com.resourcerelationnelle.citizens.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
// Controller des Citizens faisant un Mapping des données
@RestController
@RequestMapping("/api/users")
public class CitizensController {
    @Autowired
    //Instance de ma classe UserService
    private UserService userService;

    @PostMapping
    public Citizens createUser(@RequestBody Citizens user) {
        return userService.createUser(user);
    }

    @GetMapping
    public List<Citizens> getAllUsers() {
        return userService.getAllUsers();
    }

    @GetMapping("/{id}")
    public Citizens getUserById(@PathVariable Long id) {
        return userService.getUserById(id);
    }

    @PutMapping("/{id}")
    public Citizens updateUser(@PathVariable Long id, @RequestBody Citizens user) {
        return userService.updateUser(id, user);
    }

    @DeleteMapping("/{id}")
    public void deleteUser(@PathVariable Long id) {userService.deleteUser(id);
    }
}


