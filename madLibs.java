

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

import java.util.Scanner;

public class madLibs
{  

    public static int totalNouns(String story)
    {
        int numberofNouns = 0;
        String[] words = story.split(" ");

        for (String word : words)
        {
            if (word.equals("noun"))
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
            if (word.equals("verb"))
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
            if (word.equals("adjective"))
            {
                numberofAdjectives += 1;
            }

        }

        return numberofAdjectives;
    }
    public static void main(String[] args) 
    {
        Scanner storyTime = new Scanner(System.in);

        String n = "noun";
        String v = "verb";
        String a = "adjective";
        String story = storyTemplate();

        int nouns = totalNouns(story);
        int verbs = totalVerbs(story);
        int adjectives = totalAdjectives(story);

        while (story.contains(n)) 
        {
            System.out.println("Enter a " + n + " (e.g., tree): ");
            String userInput = storyTime.nextLine();
            story = story.replaceFirst(n, userInput);
        }
        while (story.contains(v)) 
        {
            System.out.println("Enter a " + v + " (e.g., leave):");
            String userInput = storyTime.nextLine();
            story = story.replaceFirst(v, userInput);
        }
        while (story.contains(a))
        {
            System.out.println("Enter a " + a + " (e.g., awesome):");
            String userInput = storyTime.nextLine();
            story = story.replaceFirst(a, userInput);
        }
        
        System.out.println("-----Your completed story-----");
        System.out.println(story);
        System.out.println("------------------------------");
        System.out.println("Total amount of nouns used: " + nouns + "\n Total amount of verbs used: " + verbs + "\n Total amount of adjectives used: " + adjectives);

        storyTime.close();
    }

    public static String storyTemplate() {
        return "Last night, my friends and I decided to verb to the old noun at the end of the street. It was known for its adjective decorations and adjective noises. As we approached, a giant noun suddenly verb from the roof! "
             + "We all verb in fear, clutching our bags of noun. The door creaked open with a adjective sound, and inside we saw a adjective noun holding a glowing noun. It began to verb toward us. "
             + "I bravely verb forward and offered it a noun. To our surprise, it verb and handed us a adjective prize. We verb all the way home, laughing about the adjective adventure.";
    }
}
