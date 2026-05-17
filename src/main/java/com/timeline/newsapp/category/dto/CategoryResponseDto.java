package com.timeline.newsapp.category.dto;

import lombok.*;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder

public class CategoryResponseDto {

    private Long id;

    private String name;

    private String slug;

    private String description;
}
