package coreTechnology.loosecoupling;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

	//types of dependency injection
	
 /*  FIELD INJECTION
     @Autowired
	StudentDao dao;
	*/
	public void getName() {
		dao.getName();
	}
}
