package cloning;

public class ShallowCopyImpl {
	public static void main(String[] args) {
		PersonDetails p1 = new PersonDetails(1, "AL", "Madison");
		System.out.println(p1.toString());
		PersonDetails p2 = p1;
		System.out.println(p2);
		
		p1.county = "Huntsville";
		System.out.println(p1.toString());
		System.out.println(p2.toString());
	}
}


class PersonDetails{
	int id;
	String state;
	String county;
	public PersonDetails(int id, String state, String county) {
		super();
		this.id = id;
		this.state = state;
		this.county = county;
	}
	@Override
	public String toString() {
		return "PersonDetails [id=" + id + ", state=" + state + ", county=" + county + "]";
	}
}