package com.bitswilp.langLearn.api.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Entity
@Table(name="tbl_language_structure")
public class UserLanguageYoutubeLinkModel {
	
	@Id
	private long id;
	
	@Column(name = "level")
	private String level;
	
	@Column(name = "language")
	private String language;
	
	@Column(name = "link_youtube_word")
	private String link_youtube_word;

	public String getLevel() {
		return level;
	}

	public void setLevel(String level) {
		this.level = level;
	}

	public String getLink_youtube_word() {
		return link_youtube_word;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}
	
	public void setLink_youtube_word(String link_youtube_word) {
		this.link_youtube_word = link_youtube_word;
	}

	public UserLanguageYoutubeLinkModel(String level,String language,String link_youtube_word
			) {
		super();
		this.level = level;
		this.language = language;
		this.link_youtube_word = link_youtube_word;
	}

	public UserLanguageYoutubeLinkModel() {
		
	}

	
	
	
	
	

}
