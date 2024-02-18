//strategy pattern is used to create an interchangeable family of behaviours from which the required process is chosen at run-time
public class StrategyExample{
    //context object holds a reference to a strategy object and can switch between strategies at run-time
    public static class Context {
        private Strategy strategy;
        public Context(Strategy strategy){
            this.strategy = strategy;
        }
        public int executeStrategy(int num1, int num2){
            return strategy.doOperation(num1, num2);
        }
    }
    public interface Strategy{
        public int doOperation(int num1, int num2);
    }
    public static class OperationAdd implements Strategy{
        public int doOperation(int num1, int num2){
            return num1 + num2;
        }
    }
    public static class OperationSubtract implements Strategy{
        public int doOperation(int num1, int num2){
            return num1 - num2;
        }
    }
   
    public static class OperationMultiply implements Strategy{
        public int doOperation(int num1, int num2){
            return num1 * num2;
        }
    }
  
    public static void main(String[] args){
        Context context = new Context(new OperationAdd());
        System.out.println("10 + 5 = " + context.executeStrategy(10, 5));
        context = new Context(new OperationSubtract());
        System.out.println("10 - 5 = " + context.executeStrategy(10, 5));
        context = new Context(new OperationMultiply());
        System.out.println("10 * 5 = " + context.executeStrategy(10, 5));
    }    
}       