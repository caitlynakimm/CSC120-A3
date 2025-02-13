import java.util.Scanner;
import java.util.ArrayList;

class Conversation implements Chatbot {

  // Attributes 
  int userInputRounds;

  /**
   * Constructor 
   */
  public Conversation(int num_rounds) {
    ArrayList<String> chatbotResponses = new ArrayList<String>();
    chatbotResponses.add("yup");
    chatbotResponses.add("yup");
    chatbotResponses.add("yup");
    this.userInputRounds = num_rounds;
  }

  /**
   * Starts and runs the conversation with the user
   */
  public void chat(int num_rounds) {
    /**loop? */
    this.userInputRounds = num_rounds;
    System.out.println("Hi there!  What's on your mind?");
    int counter = 0;
    while (counter < num_rounds) {
      
      counter += counter;
    }


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
    String returnString = "Uh-huh"; 
    return returnString; 
  }

  public static void main(String[] arguments) {
    Scanner input = new Scanner(System.in); //create scanner object
    
    System.out.println("How many rounds?");
    input.nextLine();
    int num_rounds = input.nextInt();

    String user_input = input.nextLine();
    System.out.println(user_input);
    
    Conversation myConversation = new Conversation();
    myConversation.chat();
    myConversation.printTranscript();

    input.close();
  }
}
