package org.example.ainewssummarizer.entities;

import java.time.LocalDateTime;
import java.util.Objects;

import jakarta.persistence.*;

@Entity
@Table(name = "article_summary")
public class ArticleSummary {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    long id;

    @OneToOne
    @JoinColumn(name = "article_id", nullable = false)
    Article article;

    @Column(nullable = true)
    String executive_summary = null;

    @Column(nullable = true)
    String impact_level = null;

    @Column(nullable = true)
    String affected_parties = null;

    @Column(nullable = true)
    String topics = null;

    @Column(nullable = false)
    LocalDateTime created_at = LocalDateTime.now();

    public ArticleSummary() {
    }

    public long getId() {
        return id;
    }

    public Article getArticle() {
        return article;
    }

    public void setArticle(Article article) {
        this.article = article;
    }

    public String getExecutiveSummary() {
        return executive_summary;
    }

    public void setExecutiveSummary(String executive_summary) {
        this.executive_summary = executive_summary;
    }

    public String getImpactLevel() {
        return impact_level;
    }

    public void setImpactLevel(String impact_level) {
        this.impact_level = impact_level;
    }

    public String getAffectedParties() {
        return affected_parties;
    }

    public void setAffectedParties(String affected_parties) {
        this.affected_parties = affected_parties;
    }

    public String getTopics() {
        return topics;
    }

    public void setTopics(String topics) {
        this.topics = topics;
    }

    public LocalDateTime getCreatedAt() {
        return created_at;
    }

    public void setCreatedAt(LocalDateTime created_at) {
        this.created_at = created_at;
    }

    @Override
    public String toString() {
        return "ArticleSummary{" +
                "id=" + id +
                ", article=" + article +
                ", executive_summary='" + executive_summary + '\'' +
                ", impact_level='" + impact_level + '\'' +
                ", affected_parties='" + affected_parties + '\'' +
                ", topics='" + topics + '\'' +
                ", created_at=" + created_at +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ArticleSummary other)) return false;
        return id == other.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, article, executive_summary, impact_level, affected_parties, topics, created_at);
    }
}
