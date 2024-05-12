package com.resourcerelationnelle.repository;

import com.resourcerelationnelle.models.Resources;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ResourcesRepository extends JpaRepository<Resources, Long> {
}
