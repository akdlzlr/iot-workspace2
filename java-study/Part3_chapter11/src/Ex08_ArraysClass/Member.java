package Ex08_ArraysClass;

public class Member implements Comparable<Member>{

	String name;
	String email;
	
	public Member(String name,String email) {
		this.name = name;
		this.email = email;
	}

	@Override
	public int compareTo(Member o) {
		return name.compareTo(o.name);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Member other = (Member) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Member [name=" + name + ", email=" + email + "]";
	}	
}