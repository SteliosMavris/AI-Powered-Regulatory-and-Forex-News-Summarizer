package org.example.ainewssummarizer.DTOs;

public record ArticleSearchDTO(String source,
                               String category,
                               String content_type,
                               String impact,
                               boolean is_read,
                               String title) {
}