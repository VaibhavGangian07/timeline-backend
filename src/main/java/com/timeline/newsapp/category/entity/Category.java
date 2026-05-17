package com.timeline.newsapp.category.entity;

import com.timeline.newsapp.common.entity.BaseEntity;
import jakarta.persistence.*;
import lombok.*;

import java.util.UUID;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "catrgories")
public class Category extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true)
    private String name;

    @Column(nullable = false, unique = true)
    private String slug;

    private String description;

    @Column(name = "display_order")
    private Integer displayOrder;

    private Boolean active;

}
