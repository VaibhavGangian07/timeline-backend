package com.timeline.newsapp.category.service;

import com.timeline.newsapp.category.dto.CategoryResponseDto;

import java.util.List;

public interface CategoryService {

    List<CategoryResponseDto> getAllCategories();
}
