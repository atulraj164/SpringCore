package coreTechnology.tightcoupling;

public class StudentDao {
       String name;
       
       public StudentDao() {
    	   this.name="ramesh";
       }
       
       public void getName() {
    	   System.out.println(this.name);
       }
}
