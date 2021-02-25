package com.db.hackthon.gcp.testsummarizer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.db.hackthon.gcp.testsummarizer.pojo.SummaryPojo;
import com.db.hackthon.gcp.testsummarizer.service.SummarizerService;

@RestController
public class SummarizerController {

	@Autowired
	SummarizerService summaryService;

	@GetMapping(value="getSummary")
	public String getSummary()
	{
		 SummaryPojo summary =new SummaryPojo();
		 summary.setInputText("The oldest classical Greek and Latin writing had little or no space between words and could be written in boustrophedon (alternating directions). Over time, text direction (left to right) became standardized, and word dividers and terminal punctuation became common. The first way to divide sentences into groups was the original paragraphs, similar to an underscore at the beginning of the new group.[2] The Greek parágraphos evolved into the pilcrow (¶), which in English manuscripts in the Middle Ages can be seen inserted inline between sentences. The hedera leaf (e.g. ☙) has also been used in the same way.\r\n"
		 		+ "\r\n"
		 		+ "\r\n"
		 		+ "Indented paragraphs demonstrated in the US Constitution\r\n"
		 		+ "In ancient manuscripts, another means to divide sentences into paragraphs was a line break (newline) followed by an initial at the beginning of the next paragraph. An initial is an oversized capital letter, sometimes outdented beyond the margin of the text. This style can be seen, for example, in the original Old English manuscript of Beowulf. Outdenting is still used in English typography, though not commonly.[3] Modern English typography usually indicates a new paragraph by indenting the first line. This style can be seen in the (handwritten) United States Constitution from 1787. For additional ornamentation, a hedera leaf or other symbol can be added to the inter-paragraph white space, or put in the indentation space.\r\n"
		 		+ "\r\n"
		 		+ "A second common modern English style is to use no indenting, but add vertical white space to create \"block paragraphs.\" On a typewriter, a double carriage return produces a blank line for this purpose; professional typesetters (or word processing software) may put in an arbitrary vertical space by adjusting leading. This style is very common in electronic formats, such as on the World Wide Web and email. Wikipedia itself employs this format.[citation needed]\r\n"
		 		+ "\r\n"
		 		+ "Typographical considerations\r\n"
		 		+ "Widows and orphans occur when the first line of a paragraph is the last in a column or page, or when the last line of a paragraph is the first line of a new column or page.\r\n"
		 		+ "\r\n"
		 		+ "Professionally printed material in English typically does not indent the first paragraph, but indents those that follow. For example, Robert Bringhurst states that we should \"Set opening paragraphs flush left.\"[3] Bringhurst explains as follows:\r\n"
		 		+ "\r\n"
		 		+ "The function of a paragraph is to mark a pause, setting the paragraph apart from what precedes it. If a paragraph is preceded by a title or subhead, the indent is superfluous and can therefore be omitted.[3]");
		return summaryService.getSummarizedText(summary);
	}

}
