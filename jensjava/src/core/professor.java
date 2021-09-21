package core;

public class professor extends Human {

	private int profid;
	//constructor

	public professor(int id, String lname, String fname, String gender, int profid) {
		super(id, lname, fname, gender);
		this.profid = profid;
	}
	//Getter and Setter

	public int getProfid() {
		return profid;
	}

	public void setProfid(int profid) {
		this.profid = profid;
	}

	@Override
	public String toString() {
		return "professor [profid=" + profid + "]"+ super.toString();
	}
	
	
}
