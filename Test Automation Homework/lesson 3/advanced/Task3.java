package advanced;
import java.util.Scanner;

public class Task3 {
	static int passedTc;
	static int failedTc;							 // Less than 20 %
	static int numberOfUnresolvedIssuesHigh;        // max 10 OR
	static int numberOfUnresolvedIssuesBlocker;     // OR max 5
	static int numberOfUnresolvedIssuesCritical;    // OR max 5
	
	public void enterData (){
		Scanner in = new Scanner(System.in);
		System.out.println("Please enter the passed number of test cases: ");
		passedTc = in.nextInt();
		System.out.println("Please enter the failed number of test cases: ");
		failedTc = in.nextInt();		
		System.out.println("Please enter the number of unresolved issues (bugs) with HIGH priority: ");
		numberOfUnresolvedIssuesHigh = in.nextInt();
		System.out.println("Please enter the number of unresolved issues (bugs) with Blocker severity: ");
		numberOfUnresolvedIssuesBlocker = in.nextInt();
		System.out.println("Please enter the number of unresolved issues (bugs) with Critical severity: ");
		numberOfUnresolvedIssuesCritical = in.nextInt();
	}
	
	public static void main(String[] args) {

		System.out.println("Happy Test Manager\n"
				+ "Pre-conditions: \n"
				+ "Your Test Manager is a good guy but unfortunately he doesn't understand how to decide whether \n"
				+ "the last build is stable for release or it isn't. Let's imagine that he has a test report with \n"
				+ "the follow data:\n"
				+ "- passed/failed number of test cases (TC)\n"
				+ "- complete number of unresolved issues \n"
				+ "- number of unresolved issues (bugs) with HIGH priority \n"
				+ "- number of unresolved issues (bugs) with Blocker and Critical severity \n"
				+ "The customer demands that every successful release has less than 20% failed TC. \n"
				+ "In addition he doesn't accept application with more than 10 unresolved issues with HIGH priority \n"
				+ "or 5 unresolved issues with Blocker/Critical severity. His wife throws in her two cents and insists \n"
				+ "that number of unresolved Blocker issues should be less than 5% of complete issues' number \n"
				+ "Challenge: \n"
				+ "Please help your Test Manager and create a program which will read above-mentioned test report data as \n"
				+ "a user input, calculate all metrics and print build result (stable or not) to the console. In case if \n"
				+ "build isn't stable, output some additional explanation for Test Manager. \n"
				+ "Additional requirements: \n"
				+ "Please realize logic for build metrics calculation and their reference values in the separate class \n"
				+ "(for ex. Metrics). User input, comparison and the others action should be in the main class");
        System.out.println("======================= Solution ==============================");
		Task3 One = new Task3();
		One.enterData();
		if (advanced.Task3Metrics.isStable(passedTc, failedTc, 
				numberOfUnresolvedIssuesHigh, numberOfUnresolvedIssuesBlocker, numberOfUnresolvedIssuesCritical) == true) {
			System.out.println("The system is stable.");
		}
		else {
			advanced.Task3Metrics.showAdditionalExplanationForTestManager();
		}
	}
}
