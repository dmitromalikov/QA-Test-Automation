package advanced;

public class Task3Metrics {
	public boolean stable = false;
	private static float percentageOfFailedTc;

	public static boolean isStable (int passedTc, int failedTc, int numberOfUnresolvedIssuesHigh, int numberOfUnresolvedIssuesBlocker, int numberOfUnresolvedIssuesCritical){
	percentageOfFailedTc = 100 * failedTc / (passedTc + failedTc); // max 20 %
	if (percentageOfFailedTc >= 20 | numberOfUnresolvedIssuesHigh >= 10 | numberOfUnresolvedIssuesBlocker >= 5 | numberOfUnresolvedIssuesCritical >= 5){
		return false;
	}
	else return true;
	}
	
	public static void showAdditionalExplanationForTestManager (){
		System.out.println("The system is NOT stable.");
		System.out.println("Additional explanation for Test Manager : ");
		System.out.println("Percentage of failed TC = " + percentageOfFailedTc + " % - Should be less than 20%");
		System.out.println("Number of unresolved issues High priority = " + Task3.numberOfUnresolvedIssuesHigh + " - Should be a maximum 10");
		System.out.println("Number of unresolved issues Blocker severity = " + Task3.numberOfUnresolvedIssuesBlocker + " - Should be a maximum 5");
		System.out.println("Number of unresolved issues Critical severity = " + Task3.numberOfUnresolvedIssuesCritical + " - Should be a maximum 5");
	}
}

