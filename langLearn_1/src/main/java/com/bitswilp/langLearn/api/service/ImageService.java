package com.bitswilp.langLearn.api.service;

import java.io.IOException;

import org.springframework.web.multipart.MultipartFile;

import com.bitswilp.langLearn.api.models.Image;

public interface ImageService {
	
	//public String saveImage(Image image);

	public String saveImage(MultipartFile file, String name, String description) throws IOException;

}
