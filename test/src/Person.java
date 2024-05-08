
public class Person {
	private String name;
	private int id;
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		if(name.length()>16)
		      return "Name is too large!";
		   else
		      return name;

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public static void main(String[] args) {
		
		Person p = new Person();
		p.setName("Dhruv");
		p.setId(23);
		"School".equalsIgnoreCase("school");
		System.out.println("Name is "+ p.getName()+" and Id is "+ p.getId());
	}
}
