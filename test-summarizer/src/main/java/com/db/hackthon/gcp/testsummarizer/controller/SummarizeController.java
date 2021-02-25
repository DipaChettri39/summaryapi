package com.db.hackthon.gcp.testsummarizer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.db.hackthon.gcp.testsummarizer.pojo.SummaryPojo;
import com.db.hackthon.gcp.testsummarizer.service.SummarizerService;

@RestController
public class SummarizeController {
	@Autowired
	SummarizerService summaryService;

	@PostMapping(value = "getSummary")
	public String getSummary(@RequestBody SummaryPojo summary) {

		return summaryService.getSummarizedText(summary);
	}

}
