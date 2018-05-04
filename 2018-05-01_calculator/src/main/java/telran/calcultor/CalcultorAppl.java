package telran.calcultor;

import java.util.*;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import telran.calcultor.dto.CalculateData;

@SpringBootApplication
@RestController 
public class CalcultorAppl {
	Calculator calcultor= new Calculator();
	@RequestMapping(value="greetings")
	String greetings() {
		return "Hello";
	}
	@RequestMapping(value="operations")
	Set<String> getOperations(){
		return calcultor.getOperations();
	}
	@PostMapping(value="calculate")
	int getResult(@RequestBody CalculateData data) {
		return calcultor.getResult(data.operation, data.op1, data.op2);
	}
	public static void main(String[] args) {
SpringApplication.run(CalcultorAppl.class, args);


	}

}
