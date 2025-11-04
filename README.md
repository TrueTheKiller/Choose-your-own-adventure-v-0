Title: The Strongest Adventurer

Description: This is an adventure of you, your struggles, and the struggles
you have yet to face. This adventure follows you through a story you control.
A story of your triumphant rise to the spotlight as you recover from the attack
on your village from a dragon. Without spoiling too much you will forever be
greatful and stronger because of some of the events that happened that day, while
the other events will leave you forever scarred...

Overview: This project is a simple choose your own adventure where the decisions
you make will effect how the story unfolds. The simplest way to use it is to answer
the questions that are proposed to you throughout the narrative. In almost every case the
questions will be repeated if either an unexpected answer or no answer is given.

Installation ans setup: For installation and setup the best suggestions I have are
to go to the website codeHS.com and open the sandbox tab in the top left. When you
open the sandbox tab there should be something near the middle of your screen that
looks like a textbox. In that textbox type the name you want to call this game 
(doesn't matter what you pick) and click create program, then select the java console
option in the menu that appears, it should be the third row option in the far left
part of the menu.

Alternative installation: For those who don't want to use the previous installation
method the anternative requires some know-how when it comes to Java. The easiest way
that I know of to install this is to find a program that will run java (an IDE) and
paste all of the code in there in seperate documents with the same names I have given
them. Java is picky so you will have to make sure that all of the names are exactly correct.
This file specifically doesn't need to be in the program. The names of all required files in this
program are as follows:

evilWizard.java

MyProgram.java
OR
Main.java

Randomizer.java

Once you have successfully installed all of those files you will have to correct any code
requiring a specific file name if you chose an anternative file. You will also
likely have to remove the "extends ConsoleProgram" part of the 
MyProgram.java file OR Main.java file at the top. If you changed the file name you will have to replace "MyProgram" 
with whatever you called it CAPS SENSATIVE.

Example run - first 3 steps.

Start by giving your name or leave it blank for a random name, example name = John

Second the game will explain some of the story, giving you the choice of
whether you want to start the game, if you don't pick yes the game 
will prompt you again, there is no time limit of any kind here so take your time,
if you have to do something step away from the game.

Third the game will ask if you want to gather some Items. In this section depending
on if you are a completionist or not I would suggest following what you want to do,
saying no will give you the first obtainable ending - Bad ending 1 I have noticed
that occasionally this can have an error that causes it to continue the story anyway,
if this happens ignore it and restart the program to restart the game (This should be fixed!). Saying yes on 
the second run through will lead you to a fourth question where you can continue on your own, Good luck!

Current Features: In terms of current features as of project 4 there aren't that many.
There is obviously a simple choose your own adventure style story that has been started but
as I am not very creative and as I have not finished this project in its entirety
I have only made 1 ending thus far.
A simple list of coding features would be:

Input variables, There are many input variables in this program, ranging from your name to what
weapon you would like to take with you for either defense or to attack the dragon.

Looping questions, most questions will loop if you answer them with an unexpected answer.

Arrays, I currently have only 2 arrays, one that holds random names, and the other that will
act as the players inventory for future usage.

There are also branching paths, each will eventually lead to a new ending, but for now the
only branch that leads to an ending is the 3rd question.

Features I would like to add in the future: As the evilWizard file suggests there may eventually be
combat with other characters, if I can figure it out I would like to add some way for the player
to fight themselves from previous itterations, however, I believe that may have been copyrighted
by Nintendo so I'm not sure if I can do that. I would also like to add some form of a magic system
but I'm not entirely sure how I would want that to work.



For the first chapter I decided to simply add a few small options throughout the first part of the story.
I started with a question about whether they wanted to gather some stuff. If they chose yes they would survive.
If they chose no they would die because they had nothing to defend themselves with.

If the player chooses to search around they will find a chest and in that chest there will be 3 items
Currently I'm not sure what to do with each item so this is where I decided to end off.
Right after they choose an item the game end with a simple "this is the end of project 5, there will be more in the future!"

For the third project I decided to store the users items in an array and to allow for random name
choosing for those who are less creative. All names are gender neutral and while there are
only 13 currently there will eventually be more.

For the first project of semester 2 I've decided to just add another simple question, this time I've decided to use the already 
existing ans variable, this way it should save some memory by deleting the previously used question answer. This should not 
cause any problems but if it does please report it! I've also decided to add a class called Inventory to store the player's inventory,
Since there will only ever be 1 player I'm not going to add a player class as I only need to store the information for the player that
currently exists which can be done with variables.


THE INVENTORY COMMAND IS NOT BEING USED YET BUT WILL BE MOST LIKELY WITHIN THE NEXT FEW PROJECTS.
