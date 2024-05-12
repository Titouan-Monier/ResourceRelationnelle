package com.resourcerelationnelle;

import com.resourcerelationnelle.models.Citizens;
import com.resourcerelationnelle.models.Resources;
import com.resourcerelationnelle.repository.ResourcesRepository;
import com.resourcerelationnelle.services.CitizensService;

import com.resourcerelationnelle.services.ResourceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;


@Controller
public class MainController {
    @Autowired
    private ResourceService resourceService;
    @Autowired
    //Instance de ma classe CitizenService
    private CitizensService citizenService;
    @GetMapping("/index")
    public String showIndex(Model model) {
        List<Resources> listResource = resourceService.getAllResource();
        model.addAttribute("listResource", listResource);

        return "index";
    }
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
    @GetMapping("/creation_publication")
    public String showResourceForm(Model model) {
        model.addAttribute("resource", new Resources());
        return "creation_publication";
    }
    @GetMapping("/citizen_connexion")
    public String showLoginForm() {
        return "citizen_connexion";
    }

    @PostMapping("/creation_publication")
    public String saveResources(Resources resource){
        resourceService.save(resource);
        return"redirect:index";
    }
    @PostMapping("/citizen_form")
    public String saveUser(Citizens citizen){
        citizenService.save(citizen);
        return"redirect:index";
    }
}
