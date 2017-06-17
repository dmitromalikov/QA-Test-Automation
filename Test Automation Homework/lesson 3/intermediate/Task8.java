package intermediate;

public class Task8 {
	public static String camelText = "checkChangingProfilePicture";
	String text = "";
	
	public String camelCaseSeparator(String camelText){
	        for (int i = 0; i < camelText.length(); i++) {
	        	if (i == 0) {
	                text += Character.toUpperCase(camelText.charAt(0));	
        	}
        	else {
	            if (Character.isUpperCase(camelText.charAt(i))) {
	            	text += " ";
	                text += Character.toLowerCase(camelText.charAt(i));
	            }
	                else {
	                	text += camelText.charAt(i);
	                }
	        }
	        }
			return text;
	}

	public static void main(String[] args) {
        System.out.println("CamelCaseSeparator.\n"
        		+ "Some testing frameworks can read names of test methods and include them to the report\n"
        		+ "like a beautiful sentence. As you know, we use camelCaseNamingPolicy during writing our tests.\n"
        		+ "Please write a method which takes a test name and returns beautiful sentence for report."
        		+ "\n"
        		+ "Example: \n"
        		+ "Input: \"checkChangingProfilePicture\n"
        		+ "Output: \"Check changing profile picture\"");
        System.out.println("======================= Solution ==============================");
        Task8 One = new Task8();
	    System.out.println("Initial test name = " + camelText);
	    System.out.println("Modified text = " + One.camelCaseSeparator(camelText));    
}
}