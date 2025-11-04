public class DoOp {
    public static String operate(String[] args) {
        if (args.length <= 2 || args.length > 3) {
            return "Error";
        }
        int operand1 = Integer.parseInt(args[0]);
        int operand2 = Integer.parseInt(args[2]);
        String result = switch (args[1]) {
            case "-" -> String.valueOf(operand1 - operand2);
            case "+" -> String.valueOf(operand1 + operand2);
            case "*" -> String.valueOf(operand1 * operand2);
            case "/" -> (operand2 != 0) ? String.valueOf(operand1 / operand2) : "Error";
            case "%" -> (operand2 != 0) ? String.valueOf(operand1 % operand2) : "Error";
            default -> "Error";
        };
        return result;
    }
}