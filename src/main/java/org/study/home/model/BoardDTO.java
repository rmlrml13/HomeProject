package org.study.home.model;

import java.sql.Timestamp;

import lombok.Data;

@Data
public class BoardDTO {
	
	private int b_no;
	private String b_title;
	private String b_content;
	private String b_writer;
	private Timestamp b_regDate;
	private int b_count;
	private int b_recommend;
}
