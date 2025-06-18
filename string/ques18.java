class Q18_RockPaperScissors {
    public static String getComputerChoice() {
        int choice = (int)(Math.random() * 3);
        return switch (choice) {
            case 0 -> "rock";
            case 1 -> "paper";
            default -> "scissors";
        };
    }

    public static String getWinner(String user, String comp) {
        if (user.equals(comp)) return "draw";
        if ((user.equals("rock") && comp.equals("scissors")) ||
            (user.equals("paper") && comp.equals("rock")) ||
            (user.equals("scissors") && comp.equals("paper"))) {
            return "user";
        }
        return "computer";
    }

    public static void showStats(List<String[]> history) {
        int userWin = 0, compWin = 0, draws = 0;
        for (String[] game : history) {
            if (game[2].equals("user")) userWin++;
            else if (game[2].equals("computer")) compWin++;
            else draws++;
        }
        int total = history.size();
        System.out.printf("\n%-10s %-10s %-10s %-10s\n", "Game", "User", "Computer", "Result");
        for (int i = 0; i < history.size(); i++) {
            String[] g = history.get(i);
            System.out.printf("%-10d %-10s %-10s %-10s\n", i + 1, g[0], g[1], g[2]);
        }
        System.out.printf("\nUser Wins: %d (%.2f%%)\n", userWin, userWin * 100.0 / total);
        System.out.printf("Computer Wins: %d (%.2f%%)\n", compWin, compWin * 100.0 / total);
        System.out.printf("Draws: %d (%.2f%%)\n", draws, draws * 100.0 / total);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String[]> gameHistory = new ArrayList<>();

        System.out.print("Enter number of games: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print("Enter your choice (rock/paper/scissors): ");
            String user = sc.next().toLowerCase();
            String comp = getComputerChoice();
            String result = getWinner(user, comp);
            gameHistory.add(new String[]{user, comp, result});
        }

        showStats(gameHistory);
    }
}
