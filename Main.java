import java.util.Scanner;
import java.lang.*;
public class Main extends ConsoleProgram
{
    public void setInv(String[] inventory, int space, String item)
    {
        inventory[space] = item;
    }
    public String getInv(String[] inventory)
    {
        return "Weapon: " + inventory[0] + " Helm: " + inventory[1] + " Chest: " + inventory[2] + " Legs: " + inventory[3];
    }
    public String getInv(int space, String[] inventory)
    {
        if(space - 1 == 0)
        {
            return "Weapon: " + inventory[0];
        }
        else if(space - 1 == 1)
        {
            return "Helm: " + inventory[1];
        }
        else if(space - 1 == 2)
        {
            return "Chest: " + inventory[2];
        }
        else if(space - 1 == 3)
        {
            return "Legs: " + inventory[3];
        }
        else
        {
            return "too high or low, try again.";
        }
    }
    public void run()
    {
        Scanner scnr = new Scanner(System.in);
        System.out.println("This game is utilizing a system based on an anime called 'Ossan newbie adventurer' so if you know anything about that you may have a small advantage in this journey.\n");
        System.out.print("Hello and welcome to this game, we'll start with something simple. \nWhat is your name? (Leave blank for random)");
        String[] names = {"Java", "Sam", "Amari", "Jessie", "Ash", "Basil", "Lux", "Onyx", "Garnet", "Everest", "Robin", "Sage", "Scout", "Rory"};
        String name;
        name = scnr.nextLine();
        if(name.equals(""))
        {
            name = names[Randomizer.nextInt(0, 13)];
        }
        System.out.println("\nPrologue:\n     You are a simple peasant from a village of mostly mediocre people. There isn't much to do here but you tend to enjoy the basic parts of this place. Despite not having a job you tend to visit the farm because the farmer allows you to train in their unused fields. You dream of becoming an adventurer, however are unsure of whether or not you will be able to make it.");
        System.out.println("\n     Unfortunately it seems you may not be able to find out as your village is currently under attack by a giant dragon! You must work quickly to pack your stuff and leave, or perhaps you should just run away now? Unsure of which to choose you decide to think for a minute. Luckily there is no actual time limit since this is a game and it is entirely up to you as to when the danger may begin, this will only occur if you decide to continue past the first tough decision.");
        String ans = "default";
        boolean cont = false;
        boolean introFin = false;
        System.out.println("\nHello " + name + " This game is a very simple choose your own adventure. Would you like to begin? (Y/N)");
        while(ans != "y")
        {
            ans = scnr.nextLine();
            ans = ans.toLowerCase();
            if(ans.equals("y"))
            {
                while(introFin = false)
                {
                    if(ans.equals("y"))
                    {
                        System.out.println("Here we go!\nYou start in a small hut, there is a chest, a window, and a door. Which do you want to go to?");
                        cont = true;
                        introFin = true;
                    }
                    else if (ans.equals("n"))
                    {
                        System.out.println("Alright, have a good day, bye!");
                        cont = false;
                        introFin = true;
                    }
                    else
                    {
                        System.out.println("Unknown input, please try again ");
                    }
                }
                
                //when or if the user decides to continue it continues the story from this decision structure.
                
                if(cont = true)
                {
                    System.out.println("Would you like to gather stuff before you run away? (Y/N)");
                    String gatherStuff;
                    gatherStuff = scnr.nextLine();
                    gatherStuff = gatherStuff.toLowerCase();
                    
                    //this just checks if the answer is correct. Not sure if this is the best way to do it but it should work.
                    
                    while(!gatherStuff.equals("y") || !gatherStuff.equals("n"))
                    {
                        if(gatherStuff.equals("y"))
                        {
                            break;
                        }
                        else if(gatherStuff.equals("n"))
                        {
                            System.out.println("You run away and are eaten by the dragon because you have nothing to defend yourself with - bad ending 1");
                            break;
                        }
                        else
                        {
                            System.out.println("Seems like you may have made a mistake don't worry though you can always try again (Y/N)");
                            gatherStuff = scnr.nextLine();
                            gatherStuff = gatherStuff.toLowerCase();
                        }
                    }
                    if(gatherStuff.equals("n"))
                    {
                        break;
                    }
                    //simply repeats the phrase "searching..." 3 times, didn't know where to use the for loop you wanted so I just added this.
                    
                    for(int i = 0; i < 3; i++)
                    {
                        System.out.println("Searching...");
                    }
                    System.out.print("While looking around you find a chest with 3 items in it, an axe, a sword, and a shield. You only have time to grab one, Which would you like to pick?\n1. axe\n2. sword\n3. shield\n");
                    String weaponOption1 = "default";
                    
                    //This is where you pick your first weapon. 
                    
                    weaponOption1 = scnr.nextLine();
                    weaponOption1 = weaponOption1.toLowerCase();
                    String[] inventory = new String[4];
                    while(!weaponOption1.equals("1") || !weaponOption1.equals("2") || !weaponOption1.equals("3"))
                    {
                        if(weaponOption1.equals("1"))
                        {
                            System.out.println("You have chosen the axe! You now have access to the /inventory command");
                            inventory[0] = "Axe";
                            break;
                        }
                        else if(weaponOption1.equals("2"))
                        {
                            System.out.println("You have chosen the sword! You now have access to the /inventory command");
                            inventory[0] = "Sword";
                            break;
                        }
                        else if(weaponOption1.equals("3"))
                        {
                            System.out.println("You have chosen the shield! You now have access to the /inventory command");
                            inventory[0] = "Shield";
                            break;
                        }
                        else
                        {
                            System.out.println("Seems like you may have made a mistake don't worry though you can always try again (1/2/3)");
                            weaponOption1 = scnr.nextLine();
                            weaponOption1 = weaponOption1.toLowerCase();
                            
                        }
                    }
                    
                    //From here on there will always be an if at any time there is player input for the /inventory command, not the most efficient way but works for now.
                    System.out.println("\nYou run outside and see a giant dragon! You haven't been noticed yet, but you're sure that if the dragon saw you you'd be killed immediately. How should you handle the next choice?\nShould you run away (1) or should you stay and fight (2)?");
                    while(!ans.equals("1") || !ans.equals("2"))
                    {
                        ans = scnr.nextLine();
                        if (ans.equals("1"))
                        {
                            System.out.println("\nYou run away, nothing special happens and you are safe.\n\nGood ending 1, You survived but that's about all anyone remembers you as, a survivor.");
                            System.exit(0);
                        }
                        else if(ans.equals("2"))
                        {
                            System.out.println("You choose to stay and fight the dragon!");
                            break;
                        }
                        else
                        {
                            System.out.println("Seems you've made a mistake! Don't worry you can always try again! remember the answer options are 1 (Run) and 2 (Fight)");
                        }
                    }
                    System.out.println("You decide to fight the dragon, for now this is the end as this is just project 1 of semester 2, however there will be more in the future!");
                    System.exit(0);
                }
                else
                {
                    System.out.println("The End - boring ending.");
                }
            }
            else if(ans.equals("n"))
            {
                System.out.println("Ok! just tell me when you're ready with a simple 'y' or 'Y'");
            }
            else
            {
                System.out.println("Seems like you may have made a mistake don't worry though you can always try again (Y/N)");
            }
        }
        
    }
}
