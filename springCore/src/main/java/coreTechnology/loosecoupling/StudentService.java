package coreTechnology.loosecoupling;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

	//types of dependency injection
	
 /*  FIELD INJECTION-1
     @Autowired
	StudentDao dao;
	*/
	
	//CONSTRUCTOR INJECTION-2
	/*	@Autowired 
    	public StudentService(StudentDao dao,SubjectDao sdao) {
		this.dao=dao;
		this.sdao=sdao;
		
	}
*/
		//Setter INJECTION-3
	@Autowired
	public void injectDependencies(StudentDao dao,SubjectDao sdao) {
		this.dao=dao;
		this.sdao=sdao;
	}
	
		public void getSubject() {
		sdao.getSubject();
	}

	public void getName() {
		dao.getName();
	}
}
