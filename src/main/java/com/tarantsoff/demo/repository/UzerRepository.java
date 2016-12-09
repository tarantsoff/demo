package com.tarantsoff.demo.repository;

import com.tarantsoff.demo.jpa.Uzer;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 * Created by ozzy on 11/30/16.
 */
@RepositoryRestResource(path = "user", collectionResourceRel = "user")

public interface UzerRepository extends PagingAndSortingRepository<Uzer, Integer> {
}
