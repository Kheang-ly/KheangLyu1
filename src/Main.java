import java.util.ArrayList;


public class Main {
    public static void main(String[] args) {
        ArrayList<Student> studentsList = new ArrayList<>();
        int choice=0;
        do
        {
            choice = SubClass.menu();
            switch (choice) {
                case 1:
                    SubClass.input(studentsList);
                    break;
                case 2:
                    SubClass.displayInfo(studentsList);
                    break;
                case 3:
                    SubClass.search(studentsList);
                    break;
                case 6:
                    System.out.println(" Thank You for using our system ");
                    break;
                default:
                    System.out.println(" Error 404 not found ");
                    break;
            }
        } while (choice != 6);
    }
}