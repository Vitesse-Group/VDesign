package com.vitesse.repository;

import com.vitesse.model.Test;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AppRepository extends JpaRepository<Test,Long>, AppRepositoryCustom{

}
