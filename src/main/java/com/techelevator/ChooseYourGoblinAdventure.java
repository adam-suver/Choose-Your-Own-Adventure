package com.techelevator;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ChooseYourGoblinAdventure {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Decisions decisions = new Decisions();
        String escapeMethod = "";
        String partnersName = "";
        String lockPicking = "";
        String guardTalk = "";
        String leaveOrBonk = "";
        String keyChoice = "";
        String intimidation = "";
        String noEscape = "";
        String foolTheGuard = "";


        String name = decisions.intro();
        String guardOrPartner = decisions.talkToGuardOrPartner();


        if (guardOrPartner.equalsIgnoreCase("a")) {
            partnersName = decisions.meetPartner();
            System.out.println("'So how are we getting out of here, " + name + "?' " + partnersName + " asks.");
            escapeMethod = decisions.howToEscape();
        } else if (guardOrPartner.equalsIgnoreCase("b")) {
            foolTheGuard = decisions.aboutTheGuard();
        }
            if (escapeMethod.equalsIgnoreCase("a")) {
            lockPicking = decisions.toPickTheLock();
            }
            if (escapeMethod.equalsIgnoreCase("b")) {
                guardTalk = decisions.aboutTheGuard();
            }
            if (lockPicking.equalsIgnoreCase("a")) {
                guardTalk = decisions.aboutTheGuard();
            }
            if (lockPicking.equalsIgnoreCase("b")) {
                System.out.println("With an ominous clang, the door opens slightly. Do you want to (a) sneak up the stairs with " +
                        partnersName + " or (b) bonk the sleeping guard over the head with his own club? ");
                leaveOrBonk = input.nextLine();
            }
            if (guardTalk.equalsIgnoreCase("a")) {
                keyChoice = decisions.turnTheKeyOrWait();
            }
            if (guardTalk.equalsIgnoreCase("b")) {
                intimidation = decisions.bribeTheGuard();
            }
            if (keyChoice.equalsIgnoreCase("a")) {
                decisions.notToday();
                System.exit(1);
            }
            if (keyChoice.equalsIgnoreCase("b")) {
                decisions.nightEscape();
                if (partnersName != "") {
                    System.out.println(partnersName + " follows you to freedom!");
                } else {
                    System.out.println("You escape into the night!");
                }
            }
            if (leaveOrBonk.equalsIgnoreCase("b")) {
                System.out.println("'Huh?' the guard says in the solitary moment his eyes are open between sleep and unconsciousness.");
                System.out.println("You ascend the stairs with " + partnersName + ". To freedom!");
                System.exit(1);
            }
            if (leaveOrBonk.equalsIgnoreCase("a")) {
                System.out.println("The guard snores loudly, and you freeze, hold your breath, and wait. He does not wake up. " +
                        "You silently leap up the stairs into the freedom of the night.");
                System.exit(1);
            }
        }
    }






