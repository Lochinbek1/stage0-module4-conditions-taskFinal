package school.mjc.stage0.conditions.finalTask;

public class IntegerDivider {
    public void printCompletelyDivided(int dividend, int divider) {
        if(dividend + divider != dividend){
            int division = dividend / divider;
            int result = dividend - (division * divider);
            if(result == 0){
                System.out.println("can be divided completely");
            }else{
                System.out.println("cannot be divided completely");
            }
        } else {
            System.out.println("division by zero");
        }

    }
}
