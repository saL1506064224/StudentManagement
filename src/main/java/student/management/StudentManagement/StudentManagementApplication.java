package student.management.StudentManagement;

import java.util.HashMap;
import java.util.Map;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class StudentManagementApplication {

	private String name = "finfin";
	private String age = "99";
	private Map<String, String> map = new HashMap<>();

	public static void main(String[] args) {
		SpringApplication.run(StudentManagementApplication.class, args);
	}

	@GetMapping("/studentInfo")
	public String getStudentInfo() {
		String text = "";
		for(Map.Entry<String, String> entry :map.entrySet()){
			text += entry.getKey() + " " + entry.getValue() + "sai\n";
		}
		//text += map.forEach((k ,v) -> {text.join(k); });
		return text;
	}

	@PostMapping("/studentInfo")
	public void setStudentInfo(String name, String age) {
		this.name = name;
		this.age = age;
		map.put(name, age);
	}

}
