package com.bracme.kanban.kanban.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bracme.kanban.kanban.services.TaskService;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@RestController
@RequestMapping(path = "/tasks")
//	http://localhost:8080/tasks
public class TaskController {
    private final TaskService taskservice;
}
