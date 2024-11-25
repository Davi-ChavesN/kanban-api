package com.bracme.kanban.kanban.repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bracme.kanban.kanban.entities.Tasks;

@Repository
public interface TaskRepository extends JpaRepository<Tasks, UUID>{   
}
