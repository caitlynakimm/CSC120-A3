import java.util.Scanner;
import java.util.ArrayList;

class Conversation implements Chatbot {

  // Attributes 
  int userInputRounds;

  /**
   * Constructor 
   */
  public Conversation() {
    ArrayList<String> chatbotResponses = new ArrayList<String>();
    chatbotResponses.add("hi");
    chatbotResponses.add("hi");
    chatbotResponses.add("hi");
  }

  /**
   * Starts and runs the conversation with the user
   */
  public void chat() {
    /**loop? */
  }

  /**
   * Prints transcript of conversation
   */
  public void printTranscript() {

  }

  /**
   * Gives appropriate response (mirrored or canned) to user input
   * @param inputString the users last line of input
   * @return mirrored or canned response to user input  
   */
  public String respond(String inputString) {
    String returnString = ""; 
    return returnString; 
  }

  public static void main(String[] arguments) {
    Scanner input = new Scanner(System.in);
    String user_input = input.nextLine();
    System.out.println(user_input);
    // int num_rounds = input.nextInt();
    // input.nextline();
    // String user_input = input.nextLine();
    
    System.out.println(x:"How many rounds?");
    Conversation myConversation = new Conversation();
    myConversation.chat();
    myConversation.printTranscript();

  }
}
