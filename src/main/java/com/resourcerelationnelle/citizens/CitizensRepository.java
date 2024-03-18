package com.resourcerelationnelle.citizens;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CitizensRepository extends JpaRepository<Citizens, Long> {

}

