package com.bitswilp.langLearn.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bitswilp.langLearn.api.models.Image;

public interface ImageRepository extends JpaRepository<Image, Long>{

}
