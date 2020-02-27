import java.util.Scanner;
public class weekday {
    public static void main (String [] args){
        Scanner input = new Scanner (System.in);

        System.out.println("\nPlease enter an integer between 1 and 7 to represent the weekdays: \t 1. Monday\t 2. Tuesday\t 3. Wednesday\t 4. Thursday\t 5. Friday\t 6. Saturday\t 7. Sunday");

        int UserInput = input.nextInt();

        System.out.println(getChosenDay(UserInput));
    }

    // Function includes a switch for each of the days

    public static String getChosenDay (int day){


        String dayName = "";

        switch (day){
            case 1: dayName = "You entered 1 for Monday."; break;
            case 2: dayName = "You entered 2 for Tuesday."; break;
            case 3: dayName = "You entered 3 for Wednesday."; break;
            case 4: dayName = "You entered 4 for Thursday."; break;
            case 5: dayName = "You entered 5 for Friday."; break;
            case 6: dayName = "You entered 6 for Saturday."; break;
            case 7: dayName = "You entered 7 for Sunday."; break;
            default: dayName = "Invalid entry."; break;

        } return dayName;
    }
}
