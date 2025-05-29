package com.luciosalomao.bookstoremanager.dto;

import jakarta.annotation.Nonnull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import jakarta.validation.constraints.*;


@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AuthorDTO {
    private Long id;
    @NotBlank(message = "Name is required")
    @Size(max = 200)
    private String name;
    @NotNull
    @Size(max = 100)
    private Integer age;
}
