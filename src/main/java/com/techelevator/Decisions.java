package com.techelevator;

import java.util.Scanner;

public class Decisions {
    public Decisions() {
    }

    Scanner input = new Scanner(System.in);

    public String intro() {
        System.out.println("Welcome, goblin, to the dungeon. This is a short and somewhat silly choose your own adventure game inspired by fantasy settings."
        );
        System.out.println("You awake in a chilly cell. You're not sure how you got here. Wait--'What's my name?' you ask yourself.");
        System.out.print("The cloud in your mind begins to clear. It comes back. Enter your name: ");
        String characterName = input.nextLine();
        return characterName;
    }

    public String talkToGuardOrPartner() {
        System.out.println("More returns to your mind. You were caught pickpocketing the merchants on Pluffer Street.");
        System.out.println("You look around the cell. A wooden stool, a bucket, a rough straw mattress raised just off the ground.");
        System.out.println("At several points, you will be asked to make a choice. Enter an a for the first option or b for the second option.");
        System.out.print("Your first choice is (a) Call out to see if anyone is in the cell next you or (b) Try to convince the guard to come over near your cell: ");
        String whoToSpeakTo = input.nextLine();
        return whoToSpeakTo;
    }

    public String meetPartner() {
        System.out.println("'Is anyone there?' you call out in a hoarse whisper.");
        System.out.println("'I'm here, you idiot,' a familiar voice replies.");
        System.out.println("You remember your partner, her name is: ");
        String partner = input.nextLine();
        return partner;
    }

    public String howToEscape() {
        System.out.println("Do you want to (a) Try to pick the lock or (b) Get the guard's attention? ");
        String avenueOfEscape = input.nextLine();
        return avenueOfEscape;
    }

    public String toPickTheLock() {
        System.out.println("You break the thin metal rod off of the bucket, quietly. The portly guard hasn't woken up yet. " +
                "You reach your hand through the iron bars and push the rod (a) up or (b) down.");
        String upOrDown = input.nextLine();
        return upOrDown;
    }

    public String aboutTheGuard() {
        System.out.println("The guard wakes, shakes his head wearily. 'What do you want?' he demands, ambling in your direction." +
                " You withdraw from the lock before he notices. Do you want to (a) try to steal his keys or " + "" +
                "(b) ask him if he will let you out if you throw a few coins his way? ");
        String talkingToGuard = input.nextLine();
        return talkingToGuard;
    }

    public String turnTheKeyOrWait() {
        System.out.println("The guard bangs his club against the bars of your cell. 'You're going to be here for " +
                "a long, long time,' he says with a chuckle. Just when he turns his back, you snatch the key ring from his belt. " +
                "Do you want to (a) shove the key in now or (b) wait until the guard isn't paying attention?");
        String nowOrLater = input.nextLine();
        return nowOrLater;
    }

    public String bribeTheGuard() {
        System.out.println("'Ha! Is the thief descended from nobility? Because it would take a fortune to " +
                "make ol' Drake here forget his integrity!' he replies, then rests his hand on one of the bars. " +
                "Would you like to (a) bite his hand like the ferocious goblin you are or (b) convince him you " +
                "are of noble blood, and if he does not let you out immediately, you'll see to it that his life " +
                "ends with him penniless and bereft of companionship?");
        String biteOrThreaten = input.nextLine();
        return biteOrThreaten;
    }
    public void notToday() {
        System.out.println("The guard hears the metal key clink against the door, and immediately turns" +
                " back around. 'You sneaky little gerblin! Not on my watch!' he shouts, then wrests the" +
                " key from your grasp.");
        System.out.println("You were unsuccessful in your escape attempt today. Perhaps you will escape someday." +
                " Or perhaps not!");
    }
    public void nightEscape() {
        System.out.println("You wait hours, enduring more taunting from the guard. Eventually, he tires himself out" +
                " and he falls asleep in his chair. You turn the key and open the door.");
    }
    public void errorMessage() {

        System.out.println("Oops! Something went wrong. Please begin your adventure anew.");
    }


}
