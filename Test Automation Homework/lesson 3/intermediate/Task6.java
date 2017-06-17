package intermediate;

public class Task6 {
    String tmp = "";
    String maxWord = "";
    
	public void maxWord (String text){
        for (int i = 0; i <= text.length(); i++){
            if (i == text.length() || text.charAt(i) == ' '){
                maxWord = maxWord.length() < tmp.length() ? tmp : maxWord;
                tmp = "";
            }
            else tmp += text.charAt(i);
        }
        System.out.println("======================= Solution ==============================");
        System.out.print("The longest word is \"" + maxWord + "\"");
	}
	
    public static void main(String[] args) {
        String text = "\"Write a method which returns the longest word in the input string\"";
           System.out.println("The longest word.\n"
        		+ "Write a method which returns the longest word in the input string.\n"
        		+ "Compare only letters separated by space symbol.");
           System.out.println("=====================================================================");
        System.out.println("Initial String = \n"
        		+ "" + text);
        Task6 One = new Task6 ();
        One.maxWord(text);
        
    }
}