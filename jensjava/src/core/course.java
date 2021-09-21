package core;

public class course {
	private String name;
	private int idcourse;
	private String objective;
	private String prof;
	private int credit;
	//constructor
	public course(String name, int idcourse, String objective, String prof, int credit) {
		super();
		this.name = name;
		this.idcourse = idcourse;
		this.objective = objective;
		this.prof = prof;
		this.credit = credit;
	}
	//Getter and Setter
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getIdcourse() {
		return idcourse;
	}
	public void setIdcourse(int idcourse) {
		this.idcourse = idcourse;
	}
	public String getObjective() {
		return objective;
	}
	public void setObjective(String objective) {
		this.objective = objective;
	}
	public String getProf() {
		return prof;
	}
	public void setProf(String prof) {
		this.prof = prof;
	}
	public int getCredit() {
		return credit;
	}
	public void setCredit(int credit) {
		this.credit = credit;
	}
	@Override
	public String toString() {
		return "course [name=" + name + ", idcourse=" + idcourse + ", objective=" + objective + ", prof=" + prof
				+ ", credit=" + credit + "]";
	}
	
}
