package core;
import view.features;
public class playbook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Human star = new Human (21,"Jens","Tanisma","Male");
		features.display(star.toString());
		professor prof_Joseph= new professor(88,"Abdel","Joseph","Male",15);
		String result =prof_Joseph.toString();
		features.display(result);
		student stud_jacques= new student(11,"Aurelie","Jacques","Female",46);
		features.display(stud_jacques.toString());
		course linux_course= new course ("linux",21,"admin","Abdel",3);
		features.display(linux_course.toString());
		
	}

}
