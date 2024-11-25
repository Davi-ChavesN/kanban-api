package com.bracme.kanban.kanban.services;

import org.springframework.stereotype.Service;

import com.bracme.kanban.kanban.constants.LogMessages;
import com.bracme.kanban.kanban.dtos.requests.CreateTaskRequestDto;
import com.bracme.kanban.kanban.dtos.responses.TaskResponseDto;
import com.bracme.kanban.kanban.entities.Tasks;
import com.bracme.kanban.kanban.mappers.TaskMapper;
import com.bracme.kanban.kanban.repositories.TaskRepository;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Log4j2
@RequiredArgsConstructor
@Service
public class TaskService {
    private final TaskRepository taskRepository;

    public TaskResponseDto create(CreateTaskRequestDto dto) {
		log.info("{} Task Service - create", LogMessages.START_LOG_MESSAGE);
		Tasks task = TaskMapper.mapToEntity(dto);
		
		task = this.taskRepository.save(task);
		log.info("Customer: {}", task);
		
		log.info("{} Customer Service - create", LogMessages.SUCESSFUL_FINISH_LOG_MESSAGE);
		return TaskMapper.mapToDto(task);
	}
}
