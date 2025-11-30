# Assignment 7 – War Card-Game Simulation
Classic kids’ card game simulated with queues; collects stats over 1 000 runs.

| File | What it shows |
| ---- | ------------- |
| `Card.java` | value + suit POJO |
| `Deck.java` | builds 54-card deck, shuffle, deal |
| `Player.java` | queue of cards |
| `War.java` | game logic, wars, rounds |
| `AnalyzeWars.java` | runs 1 000 games, prints win-rate & averages |

Run:  
javac *.java && java AnalyzeWars
