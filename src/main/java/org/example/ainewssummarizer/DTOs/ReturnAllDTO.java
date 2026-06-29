package org.example.ainewssummarizer.DTOs;

import org.example.ainewssummarizer.entities.Article;

import java.time.LocalDateTime;

public record ReturnAllDTO(String source,
                           String category,
                           String content_type,
                           String title,
                           String url,
                           LocalDateTime published_date,
                           String content,
                           LocalDateTime created_at,
                           String executive_summary,
                           String impact_level,
                           String affected_parties,
                           String topics,
                           boolean is_read) {
}
