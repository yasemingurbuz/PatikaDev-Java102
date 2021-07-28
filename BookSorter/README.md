[TOC]



# Adventure Game

We are making a text-based adventure game with Java.

#### Tasks

1- In order to finish the game, after all the enemies in the war zones have been cleared, the zone specific reward must be added to the player's inventory. If the player can collect all the prizes and return to "Safe House", they win the game. In addition, it is not possible to re-enter the region where the award was won.



Regional Awards:

- Cave => Food

- Forest => Wood (Firewood)
- River => Water



2 - 50% chance to determine who will make the first move when the player encounters a monster. 

3 - A new war zone should be added. The purpose of this zone is to have a chance to randomly earn money, weapons or armor from defeated opponents.



**Region Name : Mine**

- 
  Monster: Snake (1-5 Pieces)


- 
  Feature : War and Loot


- 
  Item: Money, Weapon or Armor


**Snake Features:**

- ID: 4


- 
  DAMAGE: Random (between 3 and 6)


- 
  HEALTH: 12


- 
  MONEY: None (Probability of gaining items instead)




**Items dropped from a defeated opponent:**

- Weapon Chance: 15%


- 
  Rifle Chance of Winning: 20%


- 
  Sword Probability: 30%


- 
  Pistol Chance of Winning: 50%


- 
  Armor Chance: 15%


- 
  Chance to Gain Heavy Armor: 20%


- 
  Medium Armor Chance: 30%


- 
  Light Armor Chance: 50%


- 
  Chance of Making Money : 25%


- 10 Chances of Winning: 20%

- 5 Chances of Making Money: 30%

- 1 Chance of Winning: 50%

- 
  Chances of not winning anything: 45%

### Characters

| Characters | ID   | Damage | Health | Money |
| ---------- | ---- | ------ | ------ | ----- |
| Samurai    | 1    | 5      | 21     | 15    |
| Archer     | 2    | 7      | 18     | 20    |
| Knight     | 3    | 8      | 24     | 5     |

### Monsters

| Canavar | ID   | Hasar | Sağlık | Para |
| ------- | ---- | ----- | ------ | ---- |
| Zombie  | 1    | 3     | 10     | 4    |
| Vampire | 2    | 4     | 14     | 7    |
| Bear    | 3    | 7     | 20     | 12   |

### Weapons

| Weapon | ID   | Damage | Money |
| ------ | ---- | ------ | ----- |
| Gun    | 1    | 2      | 25    |
| Sword  | 2    | 3      | 35    |
| Rifle  | 3    | 7      | 45    |

### Armors

| Armor  | ID   | Block | Money |
| ------ | ---- | ----- | ----- |
| Light  | 1    | 1     | 15    |
| Medium | 2    | 3     | 25    |
| Heavy  | 3    | 5     | 40    |

### Places

| Places     | Feature              | Monster            | Item                |
| ---------- | -------------------- | ------------------ | ------------------- |
| Cave       | War + Loot           | Zombie(1-3 piece)  | Food                |
| Forest     | War + Loot           | Vampire(1-3 piece) | Firewood            |
| River      | War + Loot           | Bear (1-3 piece)   | Water               |
| Mine       | War+ Loot            | Snake(1-5 piece)   | Money, Gun or Armor |
| Safe House | Life is renewed      |                    |                     |
| Tool Store | Buy supportive items |                    |                     |

## Class Diagram

![class-diagram](https://github.com/yasemingurbuz/PatikaDev-Java102/blob/main/AdventureGame/class-diagram.jpg)



# List Class

#### Task

We are designing a class in Java where we hold data using the generic construct.

The purpose of the class is to keep a dynamic Array in it and dynamically retrieve the data type. For this, a generic class must be created.

#### Output

![ListClassOutput](https://github.com/yasemingurbuz/PatikaDev-Java102/blob/main/ListClass/ListClassOutput.png)

# Book Sorter

Design a class called Book. Inherit from this class Comparable interface and override the "compareTo" method. Inside this method, write the code that sorts the book by name from A to Z. Create 5 objects of this class and store the objects in a Set type structure. Then use a Set type data structure a second time and have it sort the books by page count.

The Book class consists of the name of the book, the number of pages, the name of the author, and the date of publication.

#### Output

![Book Sorter Output](https://github.com/yasemingurbuz/PatikaDev-Java102/blob/main/BookSorter/BookSorterOutput.png)

