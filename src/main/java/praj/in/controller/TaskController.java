package praj.in.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import praj.in.models.Task;
import praj.in.services.TaskService;



@Controller
@RequestMapping("/tasks")
public class TaskController {
    
	private final TaskService taskservice ;
	
	public TaskController(TaskService taskService) {
		this.taskservice = taskService;
	}
	@GetMapping
	public String getTask(Model model) {
		List<Task> tasks = taskservice.getAllTasks();
		model.addAttribute("tasks" , tasks);
		return "tasks";
	}
	@PostMapping
	public String CreateTask(@RequestParam String title) {
		taskservice.createrTask(title);
		return "redirect:/tasks";
	}
@GetMapping("/{id}/delete")
public String deleteTask(@PathVariable Long id) {
	taskservice.deleteTask(id);
	return "redirect:/tasks";
}
@GetMapping("/{id}/toggle")
public String toggleTask(@PathVariable Long id) {
	taskservice.toggleTask(id);
	return "redirect:/tasks";
}

}
