import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random; 

class Conversation implements Chatbot {

  // Attributes 
  int userInputRounds;
  ArrayList<String> printTranscript;

  /**
   * Constructor 
   */
  public Conversation(int num_rounds) {
    this.userInputRounds = num_rounds;
    this.printTranscript = new ArrayList<>();
  }

  public void chat() { //implements chatbot's chat() method, matches interface
    Scanner input = new Scanner(System.in);
    chat(input, userInputRounds);
    input.close();
  }

  /**
   * Starts and runs the conversation with the user
   */
  public void chat(Scanner input, int num_rounds) {

    System.out.println("Hi there!  What's on your mind?");
    printTranscript.add("Hi there! What's on your mind?"); //adds greeting to transcript
    int counter = 0;

    while (counter < num_rounds) {
      String user_input = input.nextLine();
      printTranscript.add(user_input); // adds the users input to the transcript

      String response = respond(user_input);
      System.out.println(response);
      printTranscript.add(response); // adds chatbots responses to the transcript

      counter += 1;
    }
    System.out.println("Bye!");
    printTranscript.add("Bye!"); //adds bye to transcript
  }

  /**
   * Prints transcript of conversation
   */
  public void printTranscript() {
    System.out.println("\nTRANSCRIPT:");
    for (String line : this.printTranscript) {
      System.out.println(line);
    }
  }

  /**
   * Gives appropriate response (mirrored or canned) to user input
   * @param inputString the users last line of input
   * @return mirrored or canned response to user input  
   */
  public String respond(String inputString) { 
    String returnString = " "; 

    //list of mirrored words
    List<String> mirrorWords = new ArrayList<>(Arrays.asList("i", "me", "you", "am", "my", "your", "are")); 

    //list of canned responses 
    List<String> cannedResponses = new ArrayList<>(Arrays.asList("uh-huh", "mhmm", "totally!", "that's cool!", "great!", "wow!"));

    //create a random object
    Random random = new Random();

    //random index for canned responses 
    int randomIndex = random.nextInt(cannedResponses.size());

    //flag to check if mirror word is found 
    boolean mirrorWordFound = false;

    String [] words = inputString.split(" "); //splits the sentence 
    for (int i = 0; i < words.length; i++){ //iterating i through the user's sentence
      String word = words[i]; //access word in words list corresponding to index

      String lowercaseWord = word.toLowerCase(); //converts the word to lowercase to so case doesn't matter
  
       //loop for split sentence  
      if (mirrorWords.contains(lowercaseWord)) { //check if users input has mirror words 
        mirrorWordFound = true; //flags true that there is a mirror word

        if (lowercaseWord.equals("i") ){
          words[i] = "you";
        }
        else if (lowercaseWord.equals("me")){
          words[i]  = "you";
        } 
        else if (lowercaseWord.equals("you")){
          words[i] = "I";
        }  
        else if (lowercaseWord.equals("am")){
          words[i] = "are";
        }
        else if (lowercaseWord.equals("are")){
          words[i] = "am";
        }
        else if (lowercaseWord.equals("my")){
          words[i] = "your";
        }
        else if (lowercaseWord.equals("your")){
          words[i] = "my";
        } 
      }
    }

    //mirrors sentence if there is a mirror word 
    if (mirrorWordFound) {
      returnString = String.join(" ", words);  
    }

    //gives a canned response if there is no mirror word 
    else {
      returnString = cannedResponses.get(randomIndex);
    }

    return returnString; 
  }

  public static void main(String[] arguments) {
    Scanner input = new Scanner(System.in); //create scanner object
    
    System.out.println("How many rounds?");
    int num_rounds = input.nextInt();
    
    input.nextLine(); 
    
    Conversation myConversation = new Conversation(num_rounds);
    myConversation.chat();
    myConversation.printTranscript();

    input.close();
  }
}
