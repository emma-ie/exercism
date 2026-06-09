class CalculatorConundrum {
    public String calculate(int operand1, int operand2, String operation) {
        int result = 0;    
        String resultStr = "";

        if (operation == null){
                throw new IllegalArgumentException("Operation cannot be null");
            }
            else if (operation.isEmpty()){
                throw new IllegalArgumentException("Operation cannot be empty");
            }
        else if (operation.equals("+")) {
            result = operand1 + operand2;
            resultStr = operand1 + " + " + operand2 + " = " + result;
        }
        else if (operation.equals("*")){
            result = operand1 * operand2;
            resultStr = operand1 + " * " + operand2 + " = " + result;
        }
        else if (operation.equals("/")){
            try {
                result = operand1 / operand2;
                resultStr = operand1 + " / " + operand2 + " = " + result;
            }
            catch (ArithmeticException e){
                throw new IllegalOperationException("Division by zero is not allowed", e);
            }
        }
        else {
            throw new IllegalOperationException("Operation '" + operation + "' does not exist");
        }

        return resultStr;
    }
}
