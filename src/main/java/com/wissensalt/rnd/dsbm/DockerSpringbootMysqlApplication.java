package com.wissensalt.rnd.dsbm;

import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequiredArgsConstructor(onConstructor = @__(@Autowired))
@RestController
@SpringBootApplication
public class DockerSpringbootMysqlApplication {

	private final EmployeeDAO employeeDAO;

	public static void main(String[] args) {
		SpringApplication.run(DockerSpringbootMysqlApplication.class, args);
	}

	@GetMapping("/health")
	public String checkHealth() {
		return "UP";
	}

	@GetMapping("/employee/all")
	public List<Employee> findAll() {
		return employeeDAO.findAll();
	}

	@PostMapping("/employee/insert")
	public Employee insert(@RequestBody RequestEmployeeDTO requestEmployee) {
		return employeeDAO.save(Employee.builder().code(requestEmployee.code).name(requestEmployee.name).build());
	}

	@Data
	private class RequestEmployeeDTO {
		private String code;
		private String name;
	}
}
