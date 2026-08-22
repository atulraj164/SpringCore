package coreTechnology.loosecoupling;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {
	
    @Autowired
	StudentDao dao;
	
	
	public void getName() {
		dao.getName();
	}
}
