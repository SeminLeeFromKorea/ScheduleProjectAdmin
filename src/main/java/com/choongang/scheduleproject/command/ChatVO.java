package com.choongang.scheduleproject.command;

import java.sql.Date;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ChatVO {
	private int chat_num;
	private int pj_num;
	private String chat_writer;
	private String chat_content;
	private Date chat_regdate;
}
