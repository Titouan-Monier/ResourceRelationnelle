package com.resourcerelationnelle;

import com.resourcerelationnelle.citizens.Citizens;
import com.resourcerelationnelle.citizens.CitizensService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;


@Controller
public class MainController {
    @Autowired
    //Instance de ma classe CitizenService
    private CitizensService citizenService;
    @GetMapping("/index")
    public String showHomePage(){
        return "index";
    }
//showCitizenList doit être au niveau du bon controller pour pointer vers le bon URL
@GetMapping("/citizens")
public String showCitizenList(Model model) {
    List<Citizens> listCitizens = citizenService.getAllCitizens();
    model.addAttribute("listCitizens",listCitizens);
    return "citizens";

    }
    @GetMapping("/nouveau")
    public String showForm(Model model) {
        model.addAttribute("citizen", new Citizens());
        return "citizen_form";
    }
    @GetMapping("/citizen_connexion")
    public String showLoginForm() {
        return "citizen_connexion";
    }
    @PostMapping("/citizen_form")
    public String saveUser(Citizens citizen){
        citizenService.save(citizen);
        return"redirect:/citizen_connexion";
    }
}
