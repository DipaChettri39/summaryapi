package com.db.hackthon.gcp.testsummarizer.service;

import org.springframework.stereotype.Service;

import com.db.hackthon.gcp.testsummarizer.pojo.SummaryPojo;

@Service
public class SummarizerService {

	public String getSummarizedText(SummaryPojo summaryPojo) {
		SummaryTool summary = new SummaryTool();
		summary.init(summaryPojo.getInputText());
		summary.extractSentenceFromContext();
		summary.groupSentencesIntoParagraphs();
		summary.printSentences();
		summary.createIntersectionMatrix();
		summary.createDictionary();
		summary.createSummary();
		return summary.printSummary();

	}

}
