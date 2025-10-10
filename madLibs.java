

import java.util.Scanner; // import Scanner class


public class madLibs // create public class
{  
    // create methods to count number of nouns, verbs, adjectives
    public static int totalNouns(String story)  
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
    public static int totalVerbs(String story) 
    {
        int numberofVerbs = 0;
        String[] words = story.split(" "); 

        for (String word : words) 
        {
            word = word.replaceAll("[^a-z A-Z <>]", ""); 
            if (word.equals("<verb>"))
            {
                numberofVerbs += 1;
            }

        }

        return numberofVerbs;
    }
    public static int totalAdjectives(String story) 
    {
        int numberofAdjectives = 0;
        String[] words = story.split(" "); 

        for (String word : words) 
        {
            word = word.replaceAll("[^a-z A-Z <>]", ""); 
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
        String story = storyTemplate();
        String n = "<noun>";
        String v = "<verb>";
        String a = "<adjective>";

        int nouns = totalNouns(story);
        int verbs = totalVerbs(story);
        int adjectives = totalAdjectives(story);
        int nounCounter = 0;
        //continues to ask the user to input something until there are no more verbs, adjectives, and nouns
        while (story.contains(n)) 
        {
            nounCounter += 1;
            if (nounCounter == 3) //fixes grammar mistakes in the madLib story
            {
                System.out.print("Enter a plural noun(e.g., laptops):");
            } else {
                System.out.print("Enter a noun(e.g., laptop)");
            }
            String userInput = storyTime.nextLine();
            int index = story.indexOf(n);
            if (index != -1)
            {
                story = story.substring(0,index)
                      + userInput
                      + story.substring(index + n.length());
            }

        }
        while (story.contains(v)) 
        {
            System.out.println("Enter a past-tense verb(e.g., left):");
            String userInput = storyTime.nextLine();
            int index = story.indexOf(v);
            if (index != -1)
            {
                story = story.substring(0,index)
                      + userInput
                      + story.substring(index + v.length());
            }
         
        }
        while (story.contains(a))
        {
            System.out.println("Enter an adjective(e.g., left):");
            String userInput = storyTime.nextLine();
            int index = story.indexOf(a);
            if (index != -1)
            {
                story = story.substring(0,index)
                      + userInput
                      + story.substring(index + a.length());
            }
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
