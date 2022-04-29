package org.study.home.model;

import java.sql.Timestamp;

import lombok.Data;

@Data
public class NoticeBoardDTO {

	private int notice_no;
	private String notice_title;
	private String notice_content;
	private Timestamp notice_regdate;
	private int notice_count;
}
