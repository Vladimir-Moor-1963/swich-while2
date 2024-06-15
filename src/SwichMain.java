import java.util.Scanner;

public class SwichMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String month = scanner.nextLine();
        month = month.toLowerCase();
        System.out.println(month);
        switch (month) {
            case "january":
            case "march":
            case "august":
            case "october":
            case "december":
                System.out.println(31);
                break;
            case "februare":
                System.out.println(28);
                break;
            case "april":
            case "may":
            case "july":
            case "september":
            case "november":
                System.out.println(30);


        }
        switch (month) {
            case "january",
                    "march",
                    "august",
                    "october",
                    "december" -> System.out.println(31);
            case "april",
                    "may",
                    "july",
                    "september"
                    ,"november" -> System.out.println(30);
            case "februare" -> System.out.println(28);

        }}}

//        if (month == 1){
//            System.out.println(31);
//        }
//        if (month ==2){
//            System.out.println(28);
//        }
//        if (month ==3){
//            System.out.println(31);
//
//        }
//        if (month ==4){
//            System.out.println(30);
//        }
//        if (month ==5){
//            System.out.println(31);
//        }
//        if (month == 6){
//            System.out.println(30);
//        }




