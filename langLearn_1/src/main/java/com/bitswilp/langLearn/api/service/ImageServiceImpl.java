package com.bitswilp.langLearn.api.service;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.bitswilp.langLearn.api.models.Image;
import com.bitswilp.langLearn.api.repository.ImageRepository;

@Service
public class ImageServiceImpl implements ImageService{
	
	@Autowired
	private ImageRepository imageRepo;

	@Override
	public String saveImage(MultipartFile file, String name, String description) throws IOException{
		Image img = new Image();
		img.setName(name);
		img.setDescription(description);
		img.setImage(file.getBytes());
		imageRepo.save(img);
		return "Image saved in db";
	}

}
