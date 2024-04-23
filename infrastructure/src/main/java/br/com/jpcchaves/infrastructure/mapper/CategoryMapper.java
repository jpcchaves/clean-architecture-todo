package br.com.jpcchaves.infrastructure.mapper;

import br.com.jpcchaves.core.domain.Category;
import br.com.jpcchaves.infrastructure.dto.CategoryRequestDTO;
import br.com.jpcchaves.infrastructure.dto.CategoryResponseDTO;
import br.com.jpcchaves.infrastructure.persistence.entity.CategoryEntity;
import br.com.jpcchaves.infrastructure.utils.MapperUtils;
import java.util.List;
import org.springframework.stereotype.Component;

@Component
public class CategoryMapper {
  private final MapperUtils mapperUtils;

  public CategoryMapper(MapperUtils mapperUtils) {
    this.mapperUtils = mapperUtils;
  }

  public Category toCoreCategory(CategoryEntity createdCategory) {
    return mapperUtils.parseObject(createdCategory, Category.class);
  }

  public Category toCoreCategory(CategoryRequestDTO categoryRequestDTO) {
    return mapperUtils.parseObject(categoryRequestDTO, Category.class);
  }

  public CategoryEntity toCategoryEntity(Category category) {
    return mapperUtils.parseObject(category, CategoryEntity.class);
  }

  public CategoryResponseDTO toDto(Category category) {
    return mapperUtils.parseObject(category, CategoryResponseDTO.class);
  }

  public List<Category> toCoreCategoryList(List<CategoryEntity> categoryEntityList) {
    return mapperUtils.parseObjectsCollection(categoryEntityList, Category.class);
  }
}
