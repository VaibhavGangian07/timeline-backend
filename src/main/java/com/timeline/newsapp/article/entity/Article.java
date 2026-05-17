package com.timeline.newsapp.article.entity;

import com.timeline.newsapp.category.entity.Category;
import com.timeline.newsapp.common.entity.BaseEntity;
import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "articles")
public class Article  extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long Id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "category_id", nullable = false)
    private Category category;

    @Column(nullable = false)
    private String title;

    @Column(unique = true)
    private String slug;

    @Column(name = "short_summary")
    private String shortSummary;

    @Column(columnDefinition = "TEXT")
    private String content;

    @Column(name = "image_url")
    private String imageUrl;

    @Column(name = "author_name")
    private String authorName;

    @Enumerated(EnumType.STRING)
    private ArticleStatus status;

    @Column(name = "published_at")
    private String publishedAt;

}
