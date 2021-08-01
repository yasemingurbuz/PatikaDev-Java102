# Patika Dev Java-102 Homework



- [Adventure Game](https://github.com/yasemingurbuz/PatikaDev-Java102#adventure-game)
- [List Class](https://github.com/yasemingurbuz/PatikaDev-Java102#list-class)
- [Book Sorter](https://github.com/yasemingurbuz/PatikaDev-Java102#book-sorter)
- [Match Fixture](https://github.com/yasemingurbuz/PatikaDev-Java102#match-fixture)
- [Patika Store](https://github.com/yasemingurbuz/PatikaDev-Java102#patika-store)
- [Incurance Management System](https://github.com/yasemingurbuz/PatikaDev-Java102#incurance-management-system)
- [Race of Thread](https://github.com/yasemingurbuz/PatikaDev-Java102#race-of-thread)
- [List of Book]()



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

# Match Fixture

A class should be written that creates random match fixtures for teams entered with Java.

Rules :

Double Term League method will be applied. Each team will play two matches against other teams, at home and away.


The left side of the list shows the home team and the right side shows the away team.


If an odd number of teams is entered, another team named "Mr" must be added to complete the even number. Teams matching Mr. means they won't play that week.

![](https://github.com/yasemingurbuz/PatikaDev-Java102/blob/main/MatchFixture/MatchFixtureOutpu1.png)                     ![](https://github.com/yasemingurbuz/PatikaDev-Java102/blob/main/MatchFixture/MatchFixtureOutpu2.png)

# Patika Store

Patika team decided to open a virtual store where electronic goods are sold and adds that this store will make the product management system from you, the trail volunteers.

![](https://github.com/yasemingurbuz/PatikaDev-Java102/blob/main/PatikaStore/PatikaStoreOutput1.png)

![](https://github.com/yasemingurbuz/PatikaDev-Java102/blob/main/PatikaStore/PatikaStoreOutput2.png)

# Incurance Management System

Software for insurance company.

# Race of Thread

Create an ArrayList of numbers from 1 to 10000 (10 thousand). Next, divide the 10 thousand elements in this ArrayList into 4 equal parts to be 2500 elements. Design 4 separate Threads that find odd and even numbers in these 4 separate 2500-element ArrayLists.



4 Thread will add the even numbers it finds to a common ArrayList.


4 Thread will add the odd numbers it finds to a common ArrayList.


ArrayLists holding odd and even numbers will be empty when first created. And they will be two ArrayLists.

4 When Thread starts processing its own 2500-element ArrayList, it will fill the odd and even number ArrayLists.

# List of Book

The Book class consists of the name of the book, the number of pages, the name of the author, and the date of publication.

Create 10 objects from the Book class and store them in an ArrayList structure. Using the stream structure and lambda expressions, write it to create a new Map<String, String> with the name of the author opposite the book name.

Make the enhancement that filters the books with more than 100 pages from this 10-element Book list and returns them as a new list. (You can use Stream and Lambda expressions.)

![](https://github.com/yasemingurbuz/PatikaDev-Java102/blob/main/ListofBook/ListofBookOutput.png)

