package com.timeline.newsapp.article.repository;

import com.timeline.newsapp.article.entity.Article;
import com.timeline.newsapp.article.entity.ArticleStatus;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface ArticleRepository extends JpaRepository<Article, Long> {

    Optional<Article> findBySlug(String slug);

    List<Article> findByStatus(ArticleStatus status);

    List<Article> findByCategorySlugAndStatus(
            String slug,
            ArticleStatus status
    );
}
