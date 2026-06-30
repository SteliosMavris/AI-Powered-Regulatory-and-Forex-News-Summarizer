package org.example.ainewssummarizer.Repositories;

import org.example.ainewssummarizer.DTOs.ArticleReturnDTO;
import org.example.ainewssummarizer.entities.Article;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.List;

@Repository
public interface ArticlesRepository extends JpaRepository<Article, Long> {


    /*search:
       String source,
       String category,
       String content_type,
       String impact,
       boolean status,
       String title
    */


    /*return
    String source,
    String category,
    String content_type,
    String title,
    String url,
    LocalDateTime published_date,
    String content,
    LocalDateTime created_at
    */


    @Query("SELECT new org.example.ainewssummarizer.DTOs.ArticleReturnDTO(a.source, a.category, a.content_type, " +
            "a.title, a.url, a.published_date, a.content, a.created_at) " +
            "FROM Article a LEFT JOIN ArticleSummary ars ON a.id = ars.article.id LEFT JOIN UserArticleStatus uas ON (uas.article = a AND uas.user = :user)" +
            "WHERE (a.source = :source OR :source IS NULL) AND (a.category = :category OR :category IS NULL)" +
            "AND (a.content_type = :content_type OR :content_type IS NULL) " +
            "AND (ars.impact_level = :impact OR :impact IS NULL)" +
            "AND (uas.is_read = :is_read OR uas.is_read IS NULL) " +
            "AND (a.title = :title OR :title IS NULL)")
    List<ArticleReturnDTO> findBySourceFilter(@Param("source") String source, @Param("category") String category,
                                              @Param("content_type") String content_type, @Param("impact_level") String impact_level,
                                              @Param("is_read") boolean is_read, @Param("title") String title);


}
