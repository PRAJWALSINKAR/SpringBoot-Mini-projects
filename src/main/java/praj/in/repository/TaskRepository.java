package praj.in.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import praj.in.models.Task;

public interface TaskRepository  extends JpaRepository<Task , Long >{

}
