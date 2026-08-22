package coreTechnology.tightcoupling;

public class StudentService {

	StudentDao dao;
	
	
	public StudentService(StudentDao dao) {
		this.dao=dao;
	}
	


	public void getName() {
		dao.getName();
	}
}
