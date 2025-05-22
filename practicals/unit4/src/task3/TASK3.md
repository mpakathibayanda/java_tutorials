## ✅ **Task 3a: ChessGame class**

**Summary:** Two players play chess for many rounds. We store each round's score in a table.

```java
public class ChessGame {
    protected String playerOneName;
    protected String playerTwoName;
    protected final int numberOfRounds = 9;
    
    protected double[][] gameScores; // [2 players][rounds]

    public ChessGame() {
        gameScores = new double[2][numberOfRounds];
        // {(),()....()}
        // {(i,j), ...}
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < numberOfRounds; j++) {
                gameScores[i][j] = 0.0; // gameScores
            }
        }
    }

    public void setPlayerOneName(String name) {
        playerOneName = name;
    }

    public void setPlayerTwoName(String name) {
        playerTwoName = name;
    }

    public String getPlayerOneName() {
        return playerOneName;
    }

    public String getPlayerTwoName() {
        return playerTwoName;
    }

    public void setScore(int playerNumber, int roundNumber, double score) {
        gameScores[playerNumber][roundNumber] = score;
    }

    public double getScore(int playerNumber, int roundNumber) {
        return gameScores[playerNumber][roundNumber];
    }

    public double getTotalScore(int playerNumber) {
        double total = 0.0;
        for (int i = 0; i < numberOfRounds; i++) {
            total += gameScores[playerNumber][i];
        }
        return total;
    }
}
```

---

## ✅ **Task 3b: ProfessionalGame and AmateurGame (shorter matches)**

```java
public class ProfessionalGame extends ChessGame {
    public ProfessionalGame() {
        super();
        gameScores = new double[2][7];
    }
}

public class AmateurGame extends ChessGame {
    public AmateurGame() {
        super();
        gameScores = new double[2][5];
    }
}
```

---

## ✅ **Task 3c: DemoChessGame.java – Play a game and show winner**

```java
import java.util.Scanner;

public class DemoChessGame {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ChessGame game;

        System.out.println("Choose Game Type:");
        System.out.println("1 = Professional (7 rounds)");
        System.out.println("2 = Amateur (5 rounds)");
        int choice = input.nextInt();
        input.nextLine();

        if (choice == 1) {
            game = new ProfessionalGame();
        } else {
            game = new AmateurGame();
        }

        // Set player names
        System.out.print("Enter Player 1 name: ");
        game.setPlayerOneName(input.nextLine());

        System.out.print("Enter Player 2 name: ");
        game.setPlayerTwoName(input.nextLine());

        int rounds = game.gameScores[0].length;

        // Enter scores for each round
        for (int i = 0; i < rounds; i++) {
            System.out.println("\nRound " + (i + 1) + ":");

            System.out.print("Enter score for " + game.getPlayerOneName() + " (1 = win, 0.5 = draw, 0 = loss): ");
            game.setScore(0, i, input.nextDouble());

            System.out.print("Enter score for " + game.getPlayerTwoName() + " (1 = win, 0.5 = draw, 0 = loss): ");
            game.setScore(1, i, input.nextDouble());
        }

        // Show total and winner
        double total1 = game.getTotalScore(0);
        double total2 = game.getTotalScore(1);

        System.out.println("\n--- Final Scores ---");
        System.out.println(game.getPlayerOneName() + ": " + total1);
        System.out.println(game.getPlayerTwoName() + ": " + total2);

        if (total1 > total2) {
            System.out.println(game.getPlayerOneName() + " wins!");
        } else if (total2 > total1) {
            System.out.println(game.getPlayerTwoName() + " wins!");
        } else {
            System.out.println("It's a tie!");
        }

        input.close();
    }
}
```