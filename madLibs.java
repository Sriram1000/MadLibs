

/* Requirements in code:

- Accept multiple user inputs for different word types (nouns, verbs, adjectives)

- Insert user-provided words into a predefined story template

- Handle at least 5-7 word substitutions

- Implement at least two functions: (optional)
        Input collection function
        Story generation function

- Include comments explaining code logic [4]

- parse noun, verb, adjective
    - n for noun
    - v for verb
    - a for adjective



*/

// import scanner class
import java.util.Scanner;


//create main class
public class madLibs
{  

    public static int totalNouns(String story)   //create method to count number of nouns
    {
        int numberofNouns = 0;
        String[] words = story.split(" "); //splits all strings 

        for (String word : words)  //for statement that finds each noun
        {
                word = word.replaceAll("[^a-z A-Z <>]", ""); // remove punctuation
            if (word.equals("<noun>"))
            {
                numberofNouns += 1;
            }

        }

        return numberofNouns;
    }
    public static int totalVerbs(String story) //create method to count number of verbs
    {
        int numberofVerbs = 0;
        String[] words = story.split(" "); //splits all strings 

        for (String word : words) // for statement that finds each verb
        {
            word = word.replaceAll("[^a-z A-Z <>]", ""); // remove punctuation
            if (word.equals("<verb>"))
            {
                numberofVerbs += 1;
            }

        }

        return numberofVerbs;
    }
    public static int totalAdjectives(String story) //create method to count number of adjectives
    {
        int numberofAdjectives = 0;
        String[] words = story.split(" "); //splits all strings

        for (String word : words) // for statement that finds each adjective
        {
            word = word.replaceAll("[^a-z A-Z <>]", ""); // remove punctuation
            if (word.equals("<adjective>"))
            {
                numberofAdjectives += 1;
            }

        }

        return numberofAdjectives;
    }
    public static void main(String[] args) //main method
    {
        Scanner storyTime = new Scanner(System.in); //create an object and assign it to an instance

        //initiate variables
        String n = "<noun>";
        String v = "<verb>";
        String a = "<adjective>";
        String story = storyTemplate();

        int nouns = totalNouns(story);
        int verbs = totalVerbs(story);
        int adjectives = totalAdjectives(story);
        //while statement that continues to ask the user to input something until there are no more verbs, adjectives, and nouns
        while (story.contains(n)) 
        {
            System.out.println("Enter a noun(e.g., tree): ");
            String userInput = storyTime.nextLine();
            story = story.replaceFirst(n, userInput);
        }
        while (story.contains(v)) 
        {
            System.out.println("Enter a verb(e.g., leave):");
            String userInput = storyTime.nextLine();
            story = story.replaceFirst(v, userInput);
        }
        while (story.contains(a))
        {
            System.out.println("Enter an adjective(e.g., awesome):");
            String userInput = storyTime.nextLine();
            story = story.replaceFirst(a, userInput);
        }
        
        // print outputs
        System.out.println("-----Your completed story-----");
        System.out.println(story);
        System.out.println("------------------------------");
        System.out.println("Total amount of nouns used: " + nouns + "\nTotal amount of verbs used: " + verbs + "\nTotal amount of adjectives used: " + adjectives);
        System.out.println("------------------------------");
        storyTime.close();
    }

    public static String storyTemplate() //string method of the story template
    {
        return "Last night, my friends and I decided to <verb> to the old house at the end of the street. It was known for its absurd decorations and <adjective> noises. As we approached, a giant <noun> suddenly <verb> from the roof! "
             + "We all <verb> in fear, clutching our bags of <noun>. The door creaked open with an eerie sound, and inside we saw a <adjective> chicken holding a glowing <noun>. It began to <verb> toward us. "
             + "I bravely stepped forward and offered it a <noun>. To our surprise, it <verb> and handed us a <adjective> prize. We walked back all the way home, laughing about the <adjective> adventure.";
    }
}
