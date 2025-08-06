import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        TaxiBooking Instance=TaxiBooking.GetInstance();
        Scanner scan=new Scanner(System.in);
        while (true) {
            System.out.println("---------------------");
            System.out.println("1.Book Taxi");
            System.out.println("2.Display History");
            System.out.println("3.Exit");
            System.out.println("---------------------");

            int choice=scan.nextInt();
            scan.nextLine();

            switch (choice) {
                case 1:
                    System.out.println("Enter Customer Id");
                    int id=scan.nextInt();
                    scan.nextLine();
                    System.out.println("Enter Pick Up Point A-F in UpperCase");
                    char PickUp_Point=scan.nextLine().charAt(0);
                    System.out.println("Enter Drop Point A-F in UpperCase");
                    char Drop_Point=scan.nextLine().charAt(0);
                    System.out.println("Enter PickUp Time");
                    int PickUp_Time=scan.nextInt();
                    Instance.Book_Taxi(id, PickUp_Point, Drop_Point, PickUp_Time);
                    break;
                case 2:
                    Instance.DisplayHistory();
                    break;
                case 3:
                    scan.close();
                    return;    
                default:
                    break;
            }
            
        }

    }
}
