package org.example.ainewssummarizer.DTOs;

public record ArticleSearchDTO(String source,
                               String category,
                               String type,
                               String impact,
                               boolean status,
                               String title) {
}