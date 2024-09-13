package in.sp.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import in.java.controller.StudentCTRL;
import in.sp.entity.Student;

public class Test {

	public static void main(String[] args) {
		ApplicationContext ctx= new AnnotationConfigApplicationContext(StudentCTRL.class);
        Student st= (Student) ctx.getBean("dis");
        st.showDetails();
        Student st2=(Student) ctx.getBean("sty");
        st2.showDetails();
	}

}
