public class Taxi {
    private int Taxi_Id;
    private int Total_Earnings;
    private int Customer_Id;
    private char PickUp_Point;
    private  char Drop_Point;
    private char Current_Point;
    private int PickUp_Time;
    private int Drop_Time;
    private int lastearning;
    public Taxi(int taxi_id,char Current_Point){
        this.Taxi_Id=taxi_id;
        this.Current_Point=Current_Point;

    }
    public Taxi(Taxi other) {
    this.Taxi_Id = other.Taxi_Id;
    this.Total_Earnings = other.Total_Earnings;
    this.Customer_Id= other.Customer_Id;
    this.PickUp_Point = other.PickUp_Point;
    this.Drop_Point = other.Drop_Point;
    this.Current_Point = other.Current_Point;
    this.PickUp_Time = other.PickUp_Time;
    this.Drop_Time = other.Drop_Time;
    this.lastearning = other.lastearning;
}

    public int getTaxi_Id(){
        return Taxi_Id;
    }
    public void set_TaxiId(int id){
        this.Taxi_Id=id;
    }
     public int getCustomer_Id(){
        return Customer_Id;
    }
    public void set_CustomerId(int id){
        this.Customer_Id=id;
    }
    public int get_Total_Earnings(){
        return Total_Earnings;
    }
    public void set_Total_Earning(int earn){
        this.Total_Earnings=earn;
    }
    public int get_last_Earnings(){
        return lastearning;
    }
    public void set_last_Earning(int earn){
        this.lastearning=earn;
    }
    public char get_PickUp_Point(){
        return PickUp_Point;
    }
    public void set_PickUp_Point(char point){
        this.PickUp_Point=point;
    }
    public char get_Drop_Point(){
        return Drop_Point;
    }
    public void set_Drop_Point(char point){
        this.Drop_Point=point;
    }
       public char get_Current_Point(){
        return Current_Point;
    }
    public void set_Current_Point(char point){
        this.Current_Point=point;
    }
    public int get_PickUp_Time(){
        return PickUp_Time;
    }
    public void set_PickUp_Time(int time){
        this.PickUp_Time=time;
    }
        public int get_Drop_Time(){
        return Drop_Time;
    }
    public void set_Drop_Time(int time){
        this.Drop_Time=time;
    }

    public String toString(){
        return "Taxi Id : "+getTaxi_Id()+" \nTotal Earning : "+Total_Earnings+"\ncurrentLocation : " + Current_Point + " \ncustomerId : " + Customer_Id + " \npickupLocation : "
				+ PickUp_Point + " \ndropLocation : " + Drop_Point + " \npickupTime : " + PickUp_Time + "  \ndropTime : "
				+Drop_Time + " \nlastearnings : " + lastearning ;
	}

    }

