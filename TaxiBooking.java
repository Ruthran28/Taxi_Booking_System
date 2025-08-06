import java.util.ArrayList;
import java.util.List;

public class TaxiBooking {
    private static int taxiLimit=4;
    private static List<Taxi> TaxiList;
    private static List<Taxi> History;
    private static int taxi_Id_Provider=1;
    private static TaxiBooking Instance;

    private TaxiBooking(){
        TaxiList=new ArrayList<>();
        History=new ArrayList<>();
    }

    public static synchronized TaxiBooking GetInstance(){
        if(Instance==null){
            Instance=new TaxiBooking();
        }
        return Instance;
    }

    public void Book_Taxi(int Customer_Id,char PickUp_Point,char Drop_Point,int PickUp_Time){

        

        if(PickUp_Point==Drop_Point || !("ABCDEF").contains(""+PickUp_Point) || !("ABCDEF").contains(""+Drop_Point)){
            System.out.println("invalue PickupPonit and Drop Point");
            return;
        }
       if(TaxiList.size()<taxiLimit){
        TaxiList.add(new Taxi(taxi_Id_Provider++,'A'));
       }

       int min=Integer.MAX_VALUE;
       Taxi current = null;
       for(Taxi t:TaxiList){
            if(PickUp_Time>=t.get_Drop_Time() && Math.abs(PickUp_Point-t.get_Current_Point())<=min){
                    
                if(Math.abs(PickUp_Point-t.get_Current_Point())==min)
                {
                   if(current!=null && t.get_Total_Earnings()<current.get_Total_Earnings()){
                        current=t;
                   }
                }else{
                    current=t;
                    min=Math.abs(PickUp_Point-t.get_Current_Point());
                }
                
             }
         }

         if(current==null){
            System.out.println("No Taxi Available");
         }else{
            current.set_CustomerId(Customer_Id);
            current.set_PickUp_Point(PickUp_Point);
            current.set_Drop_Point(Drop_Point);
            current.set_PickUp_Time(PickUp_Time);
            current.set_Drop_Time(PickUp_Time+Math.abs(PickUp_Point-Drop_Point));
            current.set_Current_Point(Drop_Point);
            current.set_Total_Earning(current.get_Total_Earnings()+((Math.abs(PickUp_Point-Drop_Point)*15-5)*10)+100);
            current.set_last_Earning(((Math.abs(PickUp_Point-Drop_Point)*15-5)*10)+100);
            System.out.println("Taxi "+current.getTaxi_Id() +" Booked Successfully!!!");
            History.add(new Taxi(current));
            
         }

    }
    public void DisplayHistory(){
        if(History.size()==0){
            System.out.println("Empty");
        }else{
            int i=1;
            for(Taxi t:History){
                System.out.println("-----------------------------");
                System.out.println("Deatils : "+ i );
                System.out.println("------------------------------");
                System.out.println(t.toString());
                System.out.println("-----------------------------");
                i++;
            }
            System.out.println("ThankYou!!!!");
        }
    }


}