package coreTechnology.tightcoupling;

public class StudentController {
 public static void main(String[] args) {
	 StudentService service=new StudentService(new StudentDao());//tight coupling
	 service.getName();
}
}
