# 1.2.10 Mad Libs 
  
## Overview

This project is a **Mad Libs generator** written in Java. Basically, it prompts the user to input various words (*nouns, verbs, adjectives*) and inserts them into a predefined story template. The completed story is then displayed along with counts for each type of placeholder used.

## Key Concepts
- String manipulation (`split()`, `replaceAll()`, `replaceFirst()`)
- Loops and conditionals
- Modular programming using methods
- User input via the `Scanner` class
- Counting placeholder occurrences

## Features

1) Accepts user input for **nouns**, **verbs**, and **adjectives**  
2) Substitutes user input into a **story template**  
3) Prompts dynamically (e.g., plural vs. singular noun)  
4) Displays a **completed story**  
5) Counts total nouns, verbs, and adjectives used  

## Program Structure

### **Class:** `madLibs`
Main class that drives the program 

### **Methods**
| Method | Description |
|--------|--------------|
| `totalNouns(String story)` | Counts the number of `<noun>` placeholders |
| `totalVerbs(String story)` | Counts the number of `<verb>` placeholders |
| `totalAdjectives(String story)` | Counts the number of `<adjective>` placeholders |
| `storyTemplate()` | Returns the story string with placeholders |
| `main(String[] args)` | Handles the basics (user input and replacement logic) |

## Logic Flow

1. First, we have to **load the templates**, where the `storyTemplate()` method defines a story containing placeholder tags (`<noun>`, `<verb>`, `<adjective>`)
2. Then, we have to **count the placeholders**, where the program counts how many of each type appear using the counting methods 
3. Next, we have to **prompt for the user input**, where we use a `Scanner` to ask for user words based on placeholder type
4. Consequently, we have to **replace the placeholders**, where we replaces each tag using `replaceFirst()` one at a time  
5. Finally, we **display the results**, where it simply prints the completed story and placeholder counts

## Example Output


# Execution 

## Timeline: 

```mermaid
timeline
    title Mad Libs Project Development
    section Planning
        Brainstorm Story Ideas : Week 1
        Define Placeholders : Week 1
    section Development
        Code Main Logic : Week 2
        Add Counting Methods : Week 2
    section Testing
        Debug and Test Inputs : Week 3
    section Documentation
        Write README and Upload to GitHub : Week 4


