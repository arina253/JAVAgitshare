package gitshare;

public class Aug20Testb {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//3) Inheritance
		
		ProfessorZ Ram = new ProfessorZ("ram","science","newroad",9000);
		System.out.println(Ram.name);
		System.out.println(Ram.major);
		System.out.println(Ram.address);
		System.out.println(Ram.salary);
		Ram.displayName();

	}

}

class LecturerZ{
	String name;
	String major;
	String address;
	
	public LecturerZ (String nm,String mj,String ad) {
		this.name = nm;
		this.major = mj;
		this.address = ad;
	}
	
	public void displayName(){
		System.out.println(this.name);
	}
}

class ProfessorZ extends LecturerZ{
	 int salary;

	public ProfessorZ(String nm, String mj, String ad, int sl) {
		super(nm, mj, ad);
		this.salary = sl;
	}
	

}



