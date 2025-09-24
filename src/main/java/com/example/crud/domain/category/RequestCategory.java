package com.example.crud.domain.category;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public record RequestCategory(
        @NotBlank
        @Size(max = 50)
        String category
) {}
