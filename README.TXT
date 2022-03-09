------------------------------------------------------------------------
This is the project README file. Here, you should describe your project.
Tell the reader (someone who does not know anything about this project)
all he/she needs to know. The comments should usually include at least:
------------------------------------------------------------------------

PROJECT TITLE:
PURPOSE OF PROJECT:
VERSION or DATE:
HOW TO START THIS PROJECT:
AUTHORS:
USER INSTRUCTIONS:

  
# MyWorld()   
MyWorld is a repository of codes which includes the basic functions of the game including the game start, end, and the state. Within MyWorld, there are several sub-sections which are coded to do different things.

## MyWorld():
This is a subsystem within the MyWorld system. This is a system that only runs once upon the start. This is the initial code that first creates the basics of the. game. In this function, these things are represented:
  - Size of game: pixel size of 600x400. 
  - State of the game (background of the game): 1; default to the first stage.
  - Spawning of the Cars in random locations: Each stage will have 2 cars of varying speed.
  - Spawning of the character: spawn the king into the world
    - The position/ form of the character: king will always face foward in the start of game. 
  
## State();
The state function determines the background of the game at any moment. There are a total of 5 stages in the game, each stage containing 4 different steps. Once  the 4 steps are completed, the character is spawned back on the ground with a different background image. This function keeps track of the state or the stage of the game, changing the background at its appropriate time. This code is also responsible for spawnning the baseplates of the 5 stages. There is a designated y-coordinate for the baseplates. The value of the x-coordinate is set to be random with the consideration of the position of the character and its jump distance. This function includes the following: 
  - State of the base: 5 stages, levels 1 through 5. Each stage is designated to a specific background and baseplate image. 
  - Creation of baseplates: All four baseplates are deleted to then be spawned in another random position. designated y-coordinate, x-coordinate is dependent on the position of the character.
  - CarSpawn(): cars spawn in different spots upon reaching a different level

## CarSpawn();
  - deletion of cars: cars are deleted indivdually upon stage change
  - position of cars: cars are spawned in one of 8 designated spots: right, left, top, 2nd, 3rd, 4th
  
## gameOver();
  - Scoreboard: scoreboard representing gameover is spawned once character falls out of stage 1 (length and width are 1/2 size of game)
  
## gameWin();
  - Scoreboard: scoreboard representing game win is spawned once character completes stage 5 (length and width are 1/2 size of game)
    
# Base()
This code represents the imagine of the baseplates set according to the stage level.

## Base(): 
  - baseplate image: Stage level is recived then code changes baseplate image

# Cars()
This code includes the basic function of the car. The character's progress is resetted to the first baseplate of the stage upon touch with the car.

## String(): 
  - images per car: right, left. String list contain image links for right and left. 
  - speed: the number of the image in the list + 2 equals speed of car

## Cars(): 
  - image scale: 160x110 pixels. 
  - car spawn: spawned in imagineR position. This code is ran once in the creation of game. 

## act(): 
  - edge: calls edge function 
  - movement is set to speed

## edge(): 
  - check for edge: function checks if car is at edge
  - at edge: car's image changes correspondingly to the direction, car moves the other way

