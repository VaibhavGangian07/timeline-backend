package com.timeline.newsapp.category.service.impl;

import com.timeline.newsapp.category.dto.CategoryResponseDto;
import com.timeline.newsapp.category.entity.Category;
import com.timeline.newsapp.category.repository.CategoryRepository;
import com.timeline.newsapp.category.service.CategoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CategoryServiceImpl implements CategoryService {

    private final CategoryRepository categoryRepository;

    @Override
    public List<CategoryResponseDto> getAllCategories() {

        List<Category> categories =
                categoryRepository.findByActiveTrueOrderByDisplayOrderAsc();

        return categories.stream()
                .map(category -> CategoryResponseDto.builder()
                        .id(category.getId())
                        .name(category.getName())
                        .slug(category.getSlug())
                        .description(category.getDescription())
                        .build())
                .toList();
    }
}