package school.mjc.stage0.conditions.finalTask;

public class TriangleSidesValidator {
    public void validate(double firstSide, double secondSide, double thirdSide) {
        if(secondSide > 0 && secondSide == thirdSide && firstSide > 0){
            System.out.println("this is a valid triangle");
        } else {
            System.out.println("it's not a triangle");
        }

    }
}
