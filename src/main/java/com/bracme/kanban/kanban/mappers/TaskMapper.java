package com.bracme.kanban.kanban.mappers;

import org.springframework.stereotype.Component;

import com.bracme.kanban.kanban.dtos.requests.CreateTaskRequestDto;
import com.bracme.kanban.kanban.dtos.responses.TaskResponseDto;
import com.bracme.kanban.kanban.entities.Tasks;

import io.micrometer.common.lang.NonNull;
import lombok.extern.log4j.Log4j2;

@Log4j2
@Component
public class TaskMapper {
    private TaskMapper(){
    }

    public static Tasks mapToEntity(@NonNull CreateTaskRequestDto dto) {
        log.info("Dto to map: {}", dto);

		return Tasks
			.builder()
			.deadline(dto.deadline())
            .description(dto.description())
            .priority(dto.priority())
            .state(dto.state())
			.build();
    }

    public static TaskResponseDto mapToDto(@NonNull Tasks t) {
        log.info("Task to map: {}", t);

        return new TaskResponseDto(
			t.getId(),
			t.getDeadline(),
            t.getDescription(),
            t.getPriority(),
            t.getState(),
			t.getCreatedAt(),
			t.getUpdatedAt());
    }
}
