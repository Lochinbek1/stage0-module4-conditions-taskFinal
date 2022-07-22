package school.mjc.stage0.conditions.finalTask;

public class DaysInMonth {
    public void printDays(int year, int month) {
        if(year > 0 && month < 13){
            if(year % 4 == 0 && year % 100 != 0 || year % 400 == 0 && month == 2){
                System.out.println(29);
            } else{
                switch (month){
                    case (1) :
                    case (3) :
                    case (5) :
                    case (7) :
                    case (8) :
                    case (10) :
                    case (12) :
                        System.out.println(31);
                        break;
                    case (2) :
                        System.out.println(28);
                        break;
                    case (4) :
                    case (6) :
                    case (9) :
                    case (11) :
                        System.out.println(30);

                }
            }

        }else{
            System.out.println("invalid date");
        }

    }
}
