package org.example.ainewssummarizer.entities;

import java.time.LocalDateTime;
import java.util.Objects;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "article")
public class Article {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    long id;

    @Column(nullable = false)
    String source;

    @Column(nullable = false)
    String category;

    @Column(nullable = false)
    String content_type;

    @Column(nullable = false)
    String title;

    @Column(unique = true, nullable = false)
    String url;

    @Column(nullable = true)
    LocalDateTime published_date = null;

    @Column(nullable = true)
    String content = null;

    @Column(nullable = false)
    LocalDateTime created_at = LocalDateTime.now();

    public Article() {
    }

    public long getId() {
        return id;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getContentType() {
        return content_type;
    }

    public void setContentType(String content_type) {
        this.content_type = content_type;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public LocalDateTime getPublishedDate() {
        return published_date;
    }

    public void setPublishedDate(LocalDateTime published_date) {
        this.published_date = published_date;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public LocalDateTime getCreatedAt() {
        return created_at;
    }

    public void setCreatedAt(LocalDateTime created_at) {
        this.created_at = created_at;
    }

    @Override
    public String toString() {
        return "Article{" +
                "id=" + id +
                ", source='" + source + '\'' +
                ", category='" + category + '\'' +
                ", content_type='" + content_type + '\'' +
                ", title='" + title + '\'' +
                ", url='" + url + '\'' +
                ", published_date=" + published_date +
                ", content='" + content + '\'' +
                ", created_at=" + created_at +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Article other)) return false;
        return Long.compare(id, other.id) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, source, category, content_type, title, url, published_date, content, created_at);
    }
}
