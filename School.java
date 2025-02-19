package collectionPrograms;

public class School {
	Student s;
	Teacher t;

	public School(Student s, Teacher t) {
		this.s = s;
		this.t = t;
	}

	@Override
	public String toString() {
		return "School [s=" + s + ", t=" + t + "]";
	}
    
}
