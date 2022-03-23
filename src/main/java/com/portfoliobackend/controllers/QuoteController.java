package com.portfoliobackend.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
//import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.PutMapping;
//import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.portfoliobackend.exceptions.ResourceNotFoundException;
import com.portfoliobackend.models.Quotes;

import com.portfoliobackend.repositories.QuoteRepository;


@RestController
@CrossOrigin
@RequestMapping ("/api/v1/portfolio-back/")
public class QuoteController {
	
	@Autowired
	private QuoteRepository quoteRepo;
	
	@GetMapping("allquotes")
	public List<Quotes> getAllQuotes() {
		return quoteRepo.findAll();
	}
	
	////////
	
//	@GetMapping("quotes/{id}")
//	public ResponseEntity<Quotes> geQuotesById(@PathVariable int id) {
//		Quotes quotes = quoteRepo.findById(id)
//				.orElseThrow(() -> new ResourceNotFoundException("Quote not found."));
//				return ResponseEntity.ok(quotes);
//	}
//	
//	@GetMapping("allquotes")
//	public List<Quotes> getQuotesByQuote(@PathVariable String quote) {
//		List<Quotes> quotes = quoteRepo.findByQuote(quote);
//		if(quotes.isEmpty()) {
//			System.out.println(new ResourceNotFoundException("Quote with the name " + quote + " not found."));
//		}
//		return quoteRepo.findByQuote(quote);
//	}
	
	

}
