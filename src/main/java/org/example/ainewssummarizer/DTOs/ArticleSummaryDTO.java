package org.example.ainewssummarizer.DTOs;

public record ArticleSummaryDTO(String executive_summary,
                                String impact_level,
                                String affected_parties,
                                String topics) {
}
