package coreTechnology.loosecoupling;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import Configuration.MyApplicationConfiguration;



@Controller
public class StudentController {
	
	

  public static void main(String[] args) {

      StudentService service =
          MyApplicationConfiguration.context.getBean(StudentService.class);

	  service.getName();
}
}
