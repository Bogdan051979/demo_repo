package exercitii.inheritance;

public class Teacher extends Person {

	/** private instance variables */
	private int numCourses;
	private String[] courses;
	private static final int MAX_COURSES = 5;

	/** construct a Teacher instance with the given name and address */
	public Teacher(String name, String address) {
		super(name, address);
		numCourses = 0;
		courses = new String[MAX_COURSES];
	}

	/** returns a self descriptive String */
	@Override
	public String toString() {
		return "Teacher: " + super.toString();
	}

	/** adds a course.Returns false if the course has already existed */
	public boolean addCourse(String course) {
		// check if the course is already in the course list
		for (int i = 0; i < numCourses; i++) {
			if (courses[i].equals(course))
				return false;
		}
		courses[numCourses] = course;
		numCourses++;
		return true;
	}

	/** removes a course.Returns false if the course cannot be found in the course list */
	public boolean removeCourse(String course) {
		boolean found = false;

		// look for the course index
		int courseIndex = -1;// need to initialize
		for (int i = 0; i < numCourses; i++) {
			if (courses[i].equals(course)) {
				courseIndex = i;
				found = true;
				break;

			}
		}
		if (found) {
			/** remove the course and re-arrange for courses array */
			for (int i = courseIndex; i < numCourses - 1; i++) {
				courses[i] = courses[i + 1];
			}
			numCourses--;
			return true;
		} else {
			return false;
		}
	}
}
