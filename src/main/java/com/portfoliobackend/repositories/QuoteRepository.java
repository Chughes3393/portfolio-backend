package com.portfoliobackend.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.portfoliobackend.models.Quotes;

@Repository
public interface QuoteRepository extends JpaRepository <Quotes, Integer> {

	List<Quotes> findByQuote(String quote);
}
