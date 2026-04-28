public class Main {
    public static void main(String[] args) {
        IOperator op;
        System.out.println("--- Simulation Started ---");

        op = new Sum();
        int sumResult = op.perform(10, 5);
        System.out.println("Sum Result (10 + 5) = " + sumResult);

        op = new Subtract();
        int subResult = op.perform(10, 5);
        System.out.println("Subtract Result (10 - 5) = " + subResult);

        System.out.println("--- Simulation Ended ---");
    }
}