package core;

public class Human {
private  int id;
private String lname;
private String fname;
private String gender;
//constructor
public Human(int id, String lname, String fname, String gender) {
	super();
	this.id = id;
	this.lname = lname;
	this.fname = fname;
	this.gender = gender;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getLname() {
	return lname;
}
public void setLname(String lname) {
	this.lname = lname;
}
public String getFname() {
	return fname;
}
public void setFname(String fname) {
	this.fname = fname;
}
public String getGender() {
	return gender;
}
public void setGender(String gender) {
	this.gender = gender;
}
@Override
public String toString() {
	return "Human [id=" + id + ", lname=" + lname + ", fname=" + fname + ", gender=" + gender + "]";
}

}
