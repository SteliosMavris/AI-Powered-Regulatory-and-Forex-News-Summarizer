package org.example.ainewssummarizer.entities;

import java.time.LocalDateTime;
import java.util.Objects;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "user_article_status")
public class UserArticleStatus {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    long id;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    AppUser user;

    @ManyToOne
    @JoinColumn(name = "article_id", nullable = false)
    Article article;

    @Column(nullable = false)
    boolean is_read = false;

    @Column(nullable = true)
    LocalDateTime read_at = null;

    public UserArticleStatus() {
    }

    public long getId() {
        return id;
    }

    public AppUser getUser() {
        return user;
    }

    public void setUser(AppUser user) {
        this.user = user;
    }

    public Article getArticle() {
        return article;
    }

    public void setArticle(Article article) {
        this.article = article;
    }

    public boolean getIsRead() {
        return is_read;
    }

    public void setIsRead(boolean is_read) {
        this.is_read = is_read;
    }

    public LocalDateTime getReadAt() {
        return read_at;
    }

    public void setReadAt(LocalDateTime read_at) {
        this.read_at = read_at;
    }

    @Override
    public String toString() {
        return "UserArticleStatus{" +
                "id=" + id +
                ", user=" + user +
                ", article=" + article +
                ", is_read=" + is_read +
                ", read_at=" + read_at +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof UserArticleStatus other)) return false;
        return Long.compare(id, other.id) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, user, article, is_read, read_at);
    }
}
