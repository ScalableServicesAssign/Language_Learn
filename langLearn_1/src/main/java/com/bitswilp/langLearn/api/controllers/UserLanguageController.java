package com.bitswilp.langLearn.api.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bitswilp.langLearn.api.models.UserLanguageModel;
import com.bitswilp.langLearn.api.models.UserLanguageQuizModel;
import com.bitswilp.langLearn.api.models.UserLanguageStructureModel;
import com.bitswilp.langLearn.api.models.UserLanguageYoutubeLinkModel;
import com.bitswilp.langLearn.api.repository.UserLanguageRepository;
import com.bitswilp.langLearn.api.service.UserLanguageService;

import jakarta.validation.Valid;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;



@RestController
@RequestMapping("/api/v1") 
public class UserLanguageController {
	Logger logger = LogManager.getLogger(UserLanguageController.class);
	
	@Autowired
	private UserLanguageRepository userLangRepo;
	
	@Autowired
	private UserLanguageService userLangSer;
	
	
	/*
	 * @Operation( summary = "GET Operation on languages", description =
	 * "to fetch details of languages from database" )
	 */
	@GetMapping("languages")
	public ResponseEntity<List<UserLanguageModel>> getAllLanguages(){
		logger.info("started hitting the findall languages from controller");
	    List<UserLanguageModel> langg = userLangSer.getAllLanguages();
	    logger.info("fetch all languages from service in controller"+langg);
	    return ResponseEntity.ok(langg);

}
	
	@GetMapping("languages/{id}")
	public UserLanguageModel getById(@Valid @PathVariable("id") Long id) {
		//String da = userLangSer.getAllLanguages();
		return userLangSer.getLanguageById(id);
		
	}
	
	


/*
 * @Operation( summary = "GET Operation on quiz related to languages",
 * description = "to fetch quiz details of languages from database" )
 */
 
	@GetMapping("/languages_quiz")
	public ResponseEntity<List<UserLanguageQuizModel>> getAllLanguageQuiz(){
	    List<UserLanguageQuizModel> lang_quiz = userLangSer.getAllLanguageQuiz();
        return ResponseEntity.ok(lang_quiz);

}

/*
 * @Operation( summary = "GET Operation on structure of languages", description
 * = "to fetch structure details of languages from database" )
 */
	@GetMapping("/languages_structure")
	public ResponseEntity<List<UserLanguageStructureModel>> getAllLanguageStructure(){
	    List<UserLanguageStructureModel> lang_stru = userLangSer.getAllLanguageStructure();
        return ResponseEntity.ok(lang_stru);

	}
	
	
	/*
	 * @Operation( summary = "GET Operation on youtube links of languages",
	 * description = "to fetch youtube link details of languages from database" )
	 */
	 
	@GetMapping("/youtubeLink")
	public ResponseEntity<List<UserLanguageYoutubeLinkModel>> getAllYoutubeLink(){
		List<UserLanguageYoutubeLinkModel> youtube_link = userLangSer.getAllYoutubeLink();
		return ResponseEntity.ok(youtube_link);
	}

	

}
