package com.bitswilp.langLearn.api.controllers;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.bitswilp.langLearn.api.service.ImageService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("/imageOrFile")
public class ImageController {
	
	@Autowired
	private ImageService imageser;
	
	@PostMapping("/upload")
	public String saveImageOrFile(@RequestParam("file") MultipartFile file,
			@RequestParam("name") String name,
			@RequestParam("description") String description) throws IOException {
		return imageser.saveImage(file,name,description);
		
		
	}
	

}
