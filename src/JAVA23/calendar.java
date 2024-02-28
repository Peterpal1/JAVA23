package JAVA23;
import java.util.Scanner;

public class calendar {
     int [] days = {31,28,31,30,31,30,31,30,31,31,30,31};

    String [] months = {"Jan","Feb","Mar","Ap","May","Jun","Jul","Au","Sep","Oct","Nov","Dec"};
    int yr;
    public void leap(){
            if((yr % 4 == 0 && yr % 100 !=  0)  || yr % 400 == 0) 
            days[1] = 29 ;
            else 
            days[1]=28;

        }
        public int index(){
        int i = ((yr-1) % 4 )*5;
        i+= ((yr-1) % 100) *  4;
        i+=((yr-1) % 400 ) *6;
        i = i % 7 ; 
        return i;
        }
        public void calend(){
            int day = days[0];
            @SuppressWarnings("unused")
            String month = months[0];
            @SuppressWarnings("unused")
            int Fmonth = index();
            int i = day - 1;
            for( ; i < days[0] - 1 ;i++ ){
                i += days[i];
            }
        }

        public void calenda(){
        try (Scanner Input = new Scanner(System.in)) {
            System.out.print("Enter desired Year :");
            int yr = Input.nextInt();
            



            System.out.println(" calendar of January " + yr );
            System.out.println("Mo\tTu\tWe\tTh\tFr\tSa\tSu");
            int i = index();
            int date = 1 - i;
            for (int w = 0; w <6 ;w++ ){

                for (int d = 0; d <7 ;d++ ){
                                 
                    if (date <=0) 
                   { System.out.print(date + "\t"); } 
                    else if(date >31)
                   { break;} else
                    {System.out.print(date + " \t");}
                    date++;
                }
                System.out.println();      
            }
        }
        }


    public static void main(String[] args) {

        
    }
    
    
}
