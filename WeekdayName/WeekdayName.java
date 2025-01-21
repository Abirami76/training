import java.util.Scanner;
 class WeekdayName {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Pick a day");
        System.out.println("1.Sun");
        System.out.println("2.Mon");
        System.out.println("3.Tue");
        System.out.println("4.Wed");
        System.out.println("5.Thur");
        System.out.println("6.Fri");
        System.out.println("7.Sat");
        int dayNumber = scanner.nextInt();
        String dayName;
        switch (dayNumber) {
            case 1:
                dayName = "Sunday";
                break;
            case 2:
                dayName = "Monday";
                break;
            case 3:
                dayName = "Tuesday";
                break;
            case 4:
                dayName = "Wednesday";
                break;
            case 5:
                dayName = "Thursday";
                break;
            case 6:
                dayName = "Friday";
                break;
            case 7:
                dayName = "Saturday";
                break;
            default:
                dayName = "Invalid input! Please enter a number between 1 and 7.";
        }
        System.out.println();
        System.out.println("The meeting is on "+dayName);
        System.out.println("Everyone must attend!!!");
    }
}