public class Main {
    public static void main(String[] args) {
    	Input input = new Input();
        InputData inputData = input.readInput();
        Calculator calculator = new Calculator();
        double result;
        try {
            switch (inputData.getfunction()) {
                case "+":
                    result = calculator.add(inputData.getX(), inputData.getY());
                    break;
                case "-":
                    result = calculator.subtract(inputData.getX(), inputData.getY());
                    break;
                case "*":
                    result = calculator.multiply(inputData.getX(), inputData.getY());
                    break;
                case "/":
                    result = calculator.divide(inputData.getX(), inputData.getY());
                    break;
                default:
                    System.out.println("Недоступная операция");
                    return;
            }
            System.out.println("Итог: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Запрещено: " + e.getMessage());
        }
    }
}
