package constructorInjection;

public class Person {

	private int pid;
	private String pname;
	private String pemail;
	public Person() {
	}
	public Person(int pid, String pname, String pemail) {
		this.pid = pid;
		this.pname = pname;
		this.pemail = pemail;
	}
	@Override
	public String toString() {
		return "Person [pid=" + pid + ", pname=" + pname + ", pemail=" + pemail + "]";
	}
	
}
