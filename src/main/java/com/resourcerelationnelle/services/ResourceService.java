package com.resourcerelationnelle.services;

import com.resourcerelationnelle.models.Citizens;
import com.resourcerelationnelle.models.Resources;
import com.resourcerelationnelle.repository.ResourcesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ResourceService {
    @Autowired
    private ResourcesRepository resourceRepository;
    public Resources createResource(Resources resource) {
        return resourceRepository.save(resource);
    }

    public List<Resources> getAllResource() {
        return resourceRepository.findAll();
    }

    public  Resources getResourceById(Integer id) {
        return resourceRepository.findById(id).orElse(null);
    }

    public  Resources updateResource(Long id, Resources resource) {
        resource.setId(id);
        return resourceRepository.save(resource);
    }

    public  void deleteCitizen(Integer id) {
        resourceRepository.deleteById(id);
    }
    public void save (Resources resource) {
        resourceRepository.save(resource);
    }
}


