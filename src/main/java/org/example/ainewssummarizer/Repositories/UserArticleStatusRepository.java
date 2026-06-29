package org.example.ainewssummarizer.Repositories;

import org.example.ainewssummarizer.entities.UserArticleStatus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserArticleStatusRepository extends JpaRepository<UserArticleStatus, Long> {
}
