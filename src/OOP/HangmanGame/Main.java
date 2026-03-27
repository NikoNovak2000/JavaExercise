package OOP.HangmanGame;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        String filePath = "src\\OOP\\HangmanGame\\words.txt";
        ArrayList<String> words = new ArrayList<>();

        try(BufferedReader reader = new BufferedReader(new FileReader(filePath))) {

            String line;
            while((line = reader.readLine()) != null){
                words.add(line);
            }
        }
        catch(FileNotFoundException e){
            System.out.println("Could not locate file");
        }
        catch(IOException e){
            System.out.println("Something went wrong!");
        }

        String randomWord = getRandomWord(words);

        Scanner scanner = new Scanner(System.in);
        ArrayList<Character> wordState = new ArrayList<>();
        ArrayList<Character> attemptedWords = new ArrayList<>();
        int wrongGuesses = 0;

        for(int i = 0; i < randomWord.length(); i++){
            wordState.add('_');
        }

        System.out.println("************************");
        System.out.println("Welcome to Java Hangman!");
        System.out.println("************************");

        while (wrongGuesses < 6){

            System.out.println(getHangmanArt(wrongGuesses));

            System.out.print("Word: ");
            for (char c : wordState){
                System.out.print(c + " ");
            }
            System.out.println();

            System.out.print("Guess a letter: ");
            char guess = scanner.next().trim().toLowerCase().charAt(0);

            if(randomWord.indexOf(guess) >= 0){
                System.out.println("Correct guess!");

                for(int i = 0; i < randomWord.length(); i++){
                    if (randomWord.charAt(i) == guess){
                        wordState.set(i, guess);
                    }
                }

                if(!wordState.contains('_')){
                    System.out.println(getHangmanArt(wrongGuesses));
                    System.out.println("YOU WIN!");
                    System.out.println("The word was: " + randomWord);
                    break;
                }
            }
            else {
                if (attemptedWords.contains(guess)){
                    wrongGuesses += 2;
                    System.out.println("You already tried this letter. This is a double penalty.");
                }
                else{
                    attemptedWords.add(guess);
                    wrongGuesses ++;
                    System.out.println("Wrong guess!");
                }
            }
        }

        if (wrongGuesses >= 6){
            System.out.println(getHangmanArt(wrongGuesses));
            System.out.println("GAME OVER!");
            System.out.println("The word was: " + randomWord);
        }

        scanner.close();
    }
    static String getHangmanArt(int wrongGuesses){
        return switch(wrongGuesses){
            case 0 -> """
                       
                       
                       
                      """;
            case 1-> """
                      o 
                       
                       
                      """;
            case 2 -> """
                       o
                       |
                       
                      """;
            case 3 -> """
                       o
                      /|
                       
                      """;
            case 4 -> """
                       o
                      /|\\
                       
                      """;
            case 5 -> """
                       o
                      /|\\
                      /
                      """;
            case 6, 7 ->"""
                         o
                        /|\\
                        / \\
                        """;
            default -> "";
        };
    }

    static String getRandomWord(ArrayList<String> words){
        Random random = new Random();
        int index = random.nextInt(words.size());
        String randomWord = words.get(index);

        return randomWord;
    }
}
