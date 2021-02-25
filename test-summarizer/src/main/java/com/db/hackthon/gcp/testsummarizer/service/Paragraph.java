package com.db.hackthon.gcp.testsummarizer.service;
import java.util.ArrayList;

class Paragraph{
	int number;
	ArrayList<Sentence> sentences;

	Paragraph(int number){
		this.number = number;
		sentences = new ArrayList<Sentence>();
	}
}