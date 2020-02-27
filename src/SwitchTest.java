public class SwitchTest {

    public static void main (String [] args){
        char grade = 'A';

        switch (grade) {
            case 'A':
                System.out.println("You made an A");
                break;

            case 'B':
                System.out.println("You made a B");
                break;

            case 'C':
                System.out.println("You made a C");
                break;

            case 'D':
                System.out.println("You made a D");
                break;

            case 'E':
                System.out.println("You made an E");
                break;

            default:
                System.out.println(" ");
        }

    }
}
