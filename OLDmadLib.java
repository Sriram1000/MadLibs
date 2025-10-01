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

public class madLibs {

    public static int stringAmount(String totalWords) {
        String[] wordAmount = totalWords.trim().split("\\s+");
        return wordAmount.length;
    }

    public static void main(String[] args) {
        Scanner storyTime = new Scanner(System.in);

        System.out.println("Choose an adjective: (e.g., slimy)");
        String input1 = storyTime.nextLine();
        System.out.println("Choose a verb (ending in -ing): (e.g., screaming)");
        String input2 = storyTime.nextLine();
        System.out.println("Choose a type of candy (Plural): (e.g., Gummies)");
        String input3 = storyTime.nextLine();
        System.out.println("Choose a body part: (e.g., elbow)");
        String input4 = storyTime.nextLine();
        System.out.println("Choose an adverb: (e.g., angrily)");
        String input5 = storyTime.nextLine();
        System.out.println("Choose a noun (Plural): (e.g., pigeons)");
        String input6 = storyTime.nextLine();
        System.out.println("Choose an exclamation: (e.g., Yikes!)");
        String input7 = storyTime.nextLine();
        System.out.println("Choose a past tense verb: (e.g., shouted)");
        String input8 = storyTime.nextLine();
        System.out.println("Choose a fiction character: (e.g., Spongebob Squarepants)");
        String input9 = storyTime.nextLine();
        System.out.println("Choose an adverb: (e.g., magical)");
        String input10 = storyTime.nextLine();

        System.out.println("\nSTORYTIME! ----------");

        String entireStory = storyFunction(input1, input2, input3, input4, input5, input6, input7, input8, input9, input10);
        System.out.println(entireStory);
        System.out.println("----------");

        String totalWords = input1 + " " + input2 + " " + input3 + " " + input4 + " " + input5 + " " +
                            input6 + " " + input7 + " " + input8 + " " + input9 + " " + input10;

        int wordCount = stringAmount(totalWords);
        System.out.println("Amount of words used: " + wordCount);
    }

    public static String storyFunction(String input1, String input2, String input3, String input4, String input5,
                                       String input6, String input7, String input8, String input9, String input10) {
        return "My friends and I were dressed in our " + input1 +
               " costumes, ready for a serious night of trick-or-treating. We were already " + input2 +
               " down the street, our bags overflowing with " + input3 +
               " when we saw the neighborhood's most legendary haunted house. " +
               "Daredevil Dave bet us a whole bag of " + input3 +
               " that we wouldn't stick our " + input4 +
               " into the creepy mailbox. I bravely walked up and reached inside. Suddenly, something grabbed my wrist! " +
               "I yanked my arm back " + input5 +
               " and tripped over a bush filled with fake plastic " + input6 + ". " + input7 +
               " The noise woke up the guy inside, who immediately " + input8 +
               " and came outside. Turns out, he was dressed as " + input9 +
               " and just wanted to hand out more candy. We left with our candy bags feeling extra " + input10 +
               " about our successful, if slightly embarrassing, Halloween night.";
    }
}
