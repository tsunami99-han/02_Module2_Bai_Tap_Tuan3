import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        StudenManagement studentManager=new StudenManagement();
        Scanner sc = new Scanner(System.in);
        System.out.println("StudentManagement");
        while (true){
            System.out.println("Menu:");
            System.out.println("1.Display.");
            System.out.println("2.Add new student.");
            System.out.println("3.Find by ID");
            System.out.println("4.Find by name");
            System.out.println("5.Delete by ID");
            System.out.println("6.Edit by ID");
            System.out.println("7.Sort by name");
            System.out.println("8.Sort by class");
            System.out.println("0.Exit");
            System.out.println("Enter your choice:");
            int choice=sc.nextInt();
            switch (choice){
                case 1:
                    studentManager.displayStudent();
                    break;
                case 2:
                    studentManager.addNewStudent();
                    break;
                case 3:
                    studentManager.findByID();
                    break;
                case 4:
                    studentManager.findByName();
                    break;
                case 5:
                    studentManager.deleteByID();
                    break;
                case 6:
                    studentManager.editByID();
                    break;
                case 7:
                    studentManager.sortByName();
                    break;
                case 8:
                    studentManager.sortByClass();
                    break;
                case 0:
                    System.exit(0);
                    break;
                default:
                    System.out.println("No choice!");
                    break;
            }
        }
    }
}