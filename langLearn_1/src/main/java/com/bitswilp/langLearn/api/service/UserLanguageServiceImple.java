package com.bitswilp.langLearn.api.service;

import java.util.List;

import java.util.stream.Collectors;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bitswilp.langLearn.api.exceptions.LanguageNotFoundException;
import com.bitswilp.langLearn.api.models.UserLanguageModel;
import com.bitswilp.langLearn.api.models.UserLanguageQuizModel;
import com.bitswilp.langLearn.api.models.UserLanguageStructureModel;
import com.bitswilp.langLearn.api.models.UserLanguageYoutubeLinkModel;
import com.bitswilp.langLearn.api.repository.UserLanguageQuizRepository;
import com.bitswilp.langLearn.api.repository.UserLanguageRepository;
import com.bitswilp.langLearn.api.repository.UserLanguageStructureRepo;
import com.bitswilp.langLearn.api.repository.UserLanguageYoutubeLinkModelRepo;




@Service
public class UserLanguageServiceImple implements UserLanguageService{
	
	Logger logger = LogManager.getLogger(UserLanguageServiceImple.class);
	
	@Autowired
	private UserLanguageRepository userLangRepo;
	
	@Autowired
	private UserLanguageQuizRepository langquizrepo;
	
	@Autowired
	private UserLanguageStructureRepo langstrurepo;
	
	@Autowired
	private UserLanguageYoutubeLinkModelRepo youtubeRepo;

	@Override
	public List<UserLanguageModel> getAllLanguages() {
		List<UserLanguageModel> langs = userLangRepo.findAll();
		return langs.stream().map((lan)->mapToLang(lan)).collect(Collectors.toList());
	}

private UserLanguageModel mapToLang(UserLanguageModel langMod) {
	UserLanguageModel langsMod = new UserLanguageModel();
	langsMod.setLanguages(langMod.getLanguages());
	return langsMod;
	
}

@Override
public List<UserLanguageQuizModel> getAllLanguageQuiz() {
	logger.info("we are starting the execution of findAll () at service");
	List<UserLanguageQuizModel> langQuiz = langquizrepo.findAll();
	logger.info("fetch the language Quiz from db at service"+langQuiz);
	return langQuiz.stream().map(this::mapToLangs).collect(Collectors.toList());
}

private UserLanguageQuizModel mapToLangs(UserLanguageQuizModel langquizMod) {
	UserLanguageQuizModel langs_quiz_Mod = new UserLanguageQuizModel();
	langs_quiz_Mod.setLevel(langquizMod.getLevel());
	langs_quiz_Mod.setLanguage(langquizMod.getLanguage());
	langs_quiz_Mod.setQuestion(langquizMod.getQuestion());
	langs_quiz_Mod.setOptions(langquizMod.getOptions());
	langs_quiz_Mod.setAnswer(langquizMod.getAnswer());
	return langquizMod;
	
}

@Override
public List<UserLanguageStructureModel> getAllLanguageStructure() {
	List<UserLanguageStructureModel> langStru = langstrurepo.findAll();
	
	return langStru.stream().map((l)->mapToLangs(l)).collect(Collectors.toList());
}

private UserLanguageStructureModel mapToLangs(UserLanguageStructureModel langstruMod) {
	UserLanguageStructureModel langs_stru_Mod = new UserLanguageStructureModel();
	langs_stru_Mod.setLanguages(langstruMod.getLanguages());
	langs_stru_Mod.setLevel(langstruMod.getLevel());
	langs_stru_Mod.setEnglish_word(langstruMod.getEnglish_word());
	langs_stru_Mod.setLanguage_word(langstruMod.getLanguage_word());
	langs_stru_Mod.setWord_spell_in_english(langstruMod.getWord_spell_in_english());
	return langstruMod;
	
}
	
@Override
public List<UserLanguageYoutubeLinkModel> getAllYoutubeLink() {
	List<UserLanguageYoutubeLinkModel> youtubeLin = youtubeRepo.findAll();
	
	return youtubeLin.stream().map((l)->mapToLangs1(l)).collect(Collectors.toList());
}

private UserLanguageYoutubeLinkModel mapToLangs1(UserLanguageYoutubeLinkModel youtubeLink) {
	UserLanguageYoutubeLinkModel youtube_Link = new UserLanguageYoutubeLinkModel();
	youtube_Link.setLevel(youtubeLink.getLevel());
	youtube_Link.setLanguage(youtubeLink.getLanguage());
	youtube_Link.setLink_youtube_word(youtubeLink.getLink_youtube_word());
	
	return youtubeLink;
	
}

@Override
public UserLanguageModel getLanguageById(Long id) {
	
	return userLangRepo.findById(id).orElseThrow(
			()
			->new LanguageNotFoundException("No language id found with "+id));
}


}
