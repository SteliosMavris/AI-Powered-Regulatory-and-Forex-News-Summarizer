package org.example.ainewssummarizer.DTOs;

public record UserArticleStatusDTO(String username,
                                   String title,
                                   boolean is_read) {
}