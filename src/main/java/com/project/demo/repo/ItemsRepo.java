package com.project.demo.repo;

import com.project.demo.entity.Items;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

@Repository
@EnableJpaRepositories
public interface ItemsRepo extends JpaRepository<Items, Integer> {
}
