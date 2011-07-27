package br.com.video.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tb_movie")
public class Movie {
	@Id	@GeneratedValue @Column (name="movie_id")
	private Integer id;
	
	@Column (name="original_title",length=150,nullable=true)
	private String originalTitle;
	
	@Column (length=150,nullable=false)
	private String title;
	
	@Column (length=150,nullable=false)
	private String genre;
	
	@Column (length=3,nullable=true)
	private int duration;
	
	@Column (name="production_year",length=4,nullable=true)
	private Date productionYear;
	
	@Column (length=150,nullable=true)
	private String director;
	
	@Column (length=150,nullable=true)
	private String age;
	
	@Column (length=1000,nullable=true)
	private String sinopse;
	
	@Column (name="media_type",length=1,nullable=false)
	private int mediaType;
	
	@Column (name="picture_path",nullable=false)
	private String picturePath;
}