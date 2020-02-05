import java.util.Scanner;
import com.nagarro.Test;


public class student {

	// public static final int count = 0;
	static int count = 0;
	int rollnumber;
	String name;
	Double percentage = 50.23; // %age is define peripheary of the class so all object should be able to access
								// it directly
	char grade;

	/* Default constructor */
	student() {
		System.out.println("Student Initialized");
		count++;
	}

	/* Parameterised Constructor */
	student(int roll) {

		count++;

	}

	/*
	 * Method should return something so should start with return type All members
	 * should be able to access here directly
	 */

	void calculateGrade() {
		if (percentage < 40) {
			System.out.println("Grade is F");
		} else if (percentage >= 40 && percentage < 60) {
			System.out.println("Grade is D");
		} else if (percentage >= 60 && percentage < 80) {
			System.out.println("Grade is C");
		} else if (percentage >= 80 && percentage < 90) {
			System.out.println("Grade is B");
		} else if (percentage >= 90) {
			System.out.print("Grade is A");
		}
		// Scanner input = new Scanner(System. in);

		// System.out.print(percentage);

	}

	void displayName() {

		System.out.println(name);

	}

	{
		// System.out.print(b);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Test test1 = new Test();
		//System.out.print(test1.a);
		//System.out.print(test1.b);
		//System.out.print(test1.c);
		//System.out.print(test1.d);
	}

}
