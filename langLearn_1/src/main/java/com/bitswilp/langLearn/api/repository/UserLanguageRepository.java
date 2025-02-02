package com.bitswilp.langLearn.api.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bitswilp.langLearn.api.models.UserLanguageModel;

@Repository
public interface UserLanguageRepository extends JpaRepository<UserLanguageModel, Long>{

	//Optional<UserLanguageModel> findByLangName(String name);

}
