package com.choongang.scheduleproject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin")
public class AdminController {

	@GetMapping("/manageMember")
	public String manageMember() {
		return "/admin/adminManageMember";
	}
	@GetMapping("/manageProject")
	public String manageProject() {
		return "/admin/adminManageProject";
	}
	@GetMapping("/manageStatistics")
	public String manageStatistics() {
		return "/admin/adminManageStatistics";
	}
	@GetMapping("/noticeContent")
	public String noticeContent() {
		return "/admin/adminNoticeContent";
	}
	@GetMapping("/noticeModify")
	public String noticeModify() {
		return "/admin/adminNoticeModify";
	}
	@GetMapping("/noticeRegist")
	public String noticeRegist() {
		return "/admin/adminNoticeRegist";
	}
	@GetMapping("/noticeTableList")
	public String noticeTableList() {
		return "/admin/adminNoticeTableList";
	}
	@GetMapping("/noticeLogin")
	public String noticeLogin() {
		return "/admin/adminNoticeLogin";
	}
	
}
