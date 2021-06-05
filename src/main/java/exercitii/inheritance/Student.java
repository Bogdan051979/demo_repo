package exercitii.inheritance;

public class Student extends Person {
	/** private instance variable */
	private int numCourses;
	private String[] courses;
	private int[] grades;
	private static final int MAX_COURSES = 30;

	/** constructs a Student instance with the given name and address */
	public Student(String name, String address) {
		super(name, address);
		numCourses = 0;
		courses = new String[MAX_COURSES];
		grades = new int[MAX_COURSES];
	}

	/** returns a self descriptive String */
	@Override
	public String toString() {
		return "Student: " + super.toString();
	}

	/** adds a course and its grades - no input validation */
	public void addCourseGrade(String course, int grade) {
		courses[numCourses] = course;
		grades[numCourses] = grade;
		++numCourses;
	}

	/** print all courses taken and their grade */
	public void printGrades() {
		System.out.print(this);
		for (int i = 0; i < numCourses; i++) {
			System.out.println(" " + courses[i] + ":" + grades[i]);
		}
		System.out.println();
	}

	/** compute the average grade */
	public double getAverageGrade() {
		int sum = 0;
		for (int i = 0; i < numCourses; i++) {
			sum += grades[i];
		}
		return (double) sum / numCourses;
	}

}
