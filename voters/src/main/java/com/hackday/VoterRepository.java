package com.hackday;

import java.util.List;

import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;


@RepositoryRestResource(collectionResourceRel = "voters", path = "voters")
public interface VoterRepository {
	List<Voter> findByName(@Param("name") String name);
}
