package eosclifenmr;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
class EmployeeController {

	private final EmployeeRepository repository;

	EmployeeController(EmployeeRepository repository) {
		this.repository = repository;
	}

	// Aggregate root

	@GetMapping("/employees")
	List<Employee> all() {
		return repository.findAll();
	}
}