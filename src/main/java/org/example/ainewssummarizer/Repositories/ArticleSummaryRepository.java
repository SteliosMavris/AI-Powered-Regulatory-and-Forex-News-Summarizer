package org.example.ainewssummarizer.Repositories;

import org.example.ainewssummarizer.entities.ArticleSummary;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ArticleSummaryRepository extends JpaRepository<ArticleSummary, Long> {
}
