package com.bracme.kanban.kanban.dtos.responses;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.UUID;

public record TaskResponseDto(
    UUID id,
    LocalDate deadline,
    String description,
    Long priority,
    Long state,
    LocalDateTime createdAt,
    LocalDateTime updatedAt) {}