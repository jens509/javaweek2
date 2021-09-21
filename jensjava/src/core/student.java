package core;

public class student extends Human{
	private int idstudent;
	//constructor

	public student(int id, String lname, String fname, String gender, int idstudent) {
		super(id, lname, fname, gender);
		this.idstudent = idstudent;
	}
	//Getter and Setter

	public int getIdstudent() {
		return idstudent;
	}

	public void setIdstudent(int idstudent) {
		this.idstudent = idstudent;
	}

	@Override
	public String toString() {
		return "student [idstudent=" + idstudent + "]"+super.toString();
	}
	

}
