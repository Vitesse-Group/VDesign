package com.vitesse.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public interface AppRepositoryCustom {

	List<String> Names();
}
