import java.util.Scanner;

/**BMI Manager (Prac 3)
 * Created by mayank on 3/30/2015.
 */
public class App {

    private static void viewPatient(Patient patient) {
        System.out.printf("Name: %s \nAge: %d \nBMI: %.2f\n",patient.getName(),patient.getAge(),patient.getBMI());
    }

    private static void addPatient(Patient patient, Scanner scanner) {
        System.out.println("Enter Patient name: ");
        String name = scanner.nextLine();
        patient.setName(name);

        System.out.println("Enter Patient age: ");
        int age = scanner.nextInt();
        patient.setAge(age);

        System.out.println("Enter height: ");
        double height = scanner.nextDouble();
        System.out.println("Enter weight: ");
        double weight = scanner.nextDouble();
        patient.setDetails(height,weight);

    }

    public static void main(String[] args) {
        Patient patient = new Patient();
        running: while (true) {
            System.out.println("BMI Manager");
            System.out.println("Please select form the following" +
                    " menu options: \n \t1. Add new patient\n" +
                    "\t2. View patient\n\t3. Exit\n");

            System.out.print("Enter choice: ");
            Scanner scanner = new Scanner(System.in);
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1: {
                    addPatient(patient,scanner);
                    break;
                }
                case 2: {
                   viewPatient(patient);
                    break;
                }
                case 3: {
                    System.out.println("Good bye!");
                    break running;
                }
            }
        }

    }
}
