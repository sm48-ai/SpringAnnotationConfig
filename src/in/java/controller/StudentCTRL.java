package in.java.controller;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import in.sp.entity.Student;

@Configuration
public class StudentCTRL {
	@Bean("dis")
	public Student display() {
		Student std=new Student();
		std.setSid(111);
		std.setSname("satish");
		std.setSemail("srp9473@gmail.com");
		return std;
	}
	@Bean("sty")
	public Student display2() {
		Student std=new Student();
		std.setSid(222);
		std.setSname("satish");
		std.setSemail("srp9473@gmail.com");
		return std;
	}

}
