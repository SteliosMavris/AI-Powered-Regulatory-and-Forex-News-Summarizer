package org.example.ainewssummarizer.Repositories;

import org.example.ainewssummarizer.entities.Article;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ArticlesRepository extends JpaRepository<Article, Long> {

}
