package com.bracme.kanban.kanban.dtos.requests;

import java.time.LocalDate;

import jakarta.validation.constraints.NotNull;

public record CreateTaskRequestDto(
    @NotNull(
        message = "")
    LocalDate deadline,

    @NotNull(
        message = "")
    String description,

    @NotNull(
        message = "")
    Long priority,

    @NotNull(
        message = "")
    Long state) {}
