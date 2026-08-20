package Configuration;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import dto.Employe;



@Configuration
@ComponentScan(basePackages={"Dto","coreTechnology"})
public class MyApplicationConfiguration {
 
	static ApplicationContext context=new 
			AnnotationConfigApplicationContext(MyApplicationConfiguration.class);
	
	public static void main(String[] args) {
		Employe emp=(Employe) context.getBean("employe");
		coreTechnology.Employe emp2=(coreTechnology.Employe)context.getBean("coreemp");
	    emp.getEmploye();
		emp2.getEmploye();
	}

}
