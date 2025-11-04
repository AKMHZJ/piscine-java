public class Chifoumi {
    public static ChifoumiAction getActionBeatenBy(ChifoumiAction chifoumiAction) {
        // your code here
        ChifoumiAction Action = switch (chifoumiAction) {
            case ROCK -> chifoumiAction.SCISSOR;
            case SCISSOR -> chifoumiAction.PAPER;
            case PAPER -> chifoumiAction.ROCK;
        };
        return Action;
    }
}