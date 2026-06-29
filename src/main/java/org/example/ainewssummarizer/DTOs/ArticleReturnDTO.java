package org.example.ainewssummarizer.DTOs;

import java.time.LocalDateTime;

public record ArticleReturnDTO(String source,
                               String category,
                               String content_type,
                               String title,
                               String url,
                               LocalDateTime published_date,
                               String content,
                               LocalDateTime created_at){
}
