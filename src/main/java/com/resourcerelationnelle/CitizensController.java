package com.resourcerelationnelle;
import com.resourcerelationnelle.models.Citizens;
import com.resourcerelationnelle.services.CitizensService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
// Controller des Citizens faisant un Mapping des données

@RestController
@RequestMapping("/api")
public class CitizensController {
    @Autowired
    //Instance de ma classe CitizenService
    private CitizensService citizenService;

    @PostMapping
    public Citizens createCitizens(@RequestBody Citizens Citizen) {
        return citizenService.createCitizen(Citizen);
    }

    @GetMapping
    public List<Citizens> getAllCitizens() {
        return citizenService.getAllCitizens();
    }

    @GetMapping("/{id}")
    public Citizens getCitizenById(@PathVariable Long id) {
        return citizenService.getCitizenById(id);
    }

    @PutMapping("/{id}")
    public Citizens updateCitizen(@PathVariable Integer id, @RequestBody Citizens citizen) {
        return citizenService.updateCitizen(id, citizen);
    }

    @DeleteMapping("/{id}")
    public void deleteCitizen(@PathVariable Long id) {citizenService.deleteCitizen(id);
    }




}


