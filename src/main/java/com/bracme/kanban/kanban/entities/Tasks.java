package com.bracme.kanban.kanban.entities;

import java.time.LocalDate;

import com.bracme.kanban.kanban.entities.abstracts.BaseEntity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Builder
@Entity
@Table(name = "task")
public class Tasks extends BaseEntity {
    @Column(name = "deadline", nullable = false)
    private LocalDate deadline;

    @Column(name = "deadline", nullable = false)
    private String description;

    @Column(name = "deadline", nullable = false)
    private Long priority;

    @Column(name = "deadline", nullable = false)
    private Long state;
}
