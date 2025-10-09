
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
        int verbCounter = 0;
        int nounCounter = 0;
        //while statement that continues to ask the user to input something until there are no more verbs, adjectives, and nouns
        while (story.contains(n)) 
        {
            nounCounter += 1;
            if (nounCounter == 3)
            {
                System.out.print("Enter a plural noun(e.g., laptops):");
            } else {
                System.out.print("Enter a noun(e.g., laptop)");
            }
            String userInput = storyTime.nextLine();
            story = story.replaceFirst(n, userInput);
        }
        while (story.contains(v)) 
        {
            System.out.println("Enter a past-tense verb(e.g., left):");
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
        return "This year, my family and I <verb> to celebrate Dia de los Muertos. "
            +  "We built a <adjective> <noun> in our home and decorated it with candles, marigold, and photos. "
            +  "Together, we <verb> sugar skulls and <verb> them on the altar beside a <noun> full of favorite foods. "
            +  "The smell of incense filled the <noun> as we <verb> to remember our loved ones. "
            +  "At night, we <verb> through the cemetery holding <adjective> lanterns, feeling the <adjective> connnection between the living and the <noun> who came before us. "
            +  "It's truly a <adjective> celebration of life and memory.";
    }
}
