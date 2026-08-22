package coreTechnology.loosecoupling;

import org.springframework.stereotype.Repository;

@Repository
public class StudentDao {
       String name="hello";
       
       public void getName() {
    	   System.out.println(this.name);
       }
}
