// Purpose: To show the use of switch statement in java
class switch_statement {
    public static void main(String[] args) {
        int day = 4;
        switch (day) {   // switch statement is used to execute a block of code based on different cases.
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("TuesDay");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("ThursDay");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("SaturDay");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid Day");
        }
    }
    
}
