import java.util.Scanner;
import java.util.ArrayList;

class Conversation implements Chatbot {

  // Attributes 
  int userInputRounds;
  ArrayList<String> chatbotResponses;

  /**
   * Constructor 
   */
  public Conversation(int num_rounds) {
    chatbotResponses = new ArrayList<>();
    chatbotResponses.add("yup");
    chatbotResponses.add("yup");
    chatbotResponses.add("yup");
    this.userInputRounds = num_rounds;
  }

  public void chat() {
    Scanner input = new Scanner(System.in);
    chat(input, userInputRounds);
    input.close();
  }

  /**
   * Starts and runs the conversation with the user
   */
  public void chat(Scanner input, int num_rounds) {
    /**loop? */
    System.out.println("Hi there!  What's on your mind?");
    int counter = 0;

    while (counter < num_rounds) {
      String user_input = input.nextLine();
      System.out.println(user_input);

      System.out.println(respond(user_input));

      counter += 1;
    }


  }

  /**
   * Prints transcript of conversation
   */
  //public void printTranscript() {

  //}

  /**
   * Gives appropriate response (mirrored or canned) to user input
   * @param inputString the users last line of input
   * @return mirrored or canned response to user input  
   */
  public String respond(String inputString) { //what do we do w inputString?
    String returnString = "Uh-huh"; 
    return returnString; 
  }

  public static void main(String[] arguments) {
    Scanner input = new Scanner(System.in); //create scanner object
    
    System.out.println("How many rounds?");
    int num_rounds = input.nextInt();
    input.nextLine(); //does this remove the new line created by user's enter key?
    
    Conversation myConversation = new Conversation(num_rounds);
    myConversation.chat();
    //myConversation.printTranscript();

    input.close();
  }
}
