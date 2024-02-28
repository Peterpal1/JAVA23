package JAVA23;
public class App {

    public static void main(String[] args) throws Exception {
        System.out.println("Mon\tTue\tWed\tThu\tFr\tSa\tSu");

        int yr=2022;
        int i = 0;
         i = ((yr-1)%4)*5;
        i+=((yr-1)%100)*4;
        i+=((yr-1)%400)*6;
        i=i%7;
        System.out.println("i="+i);

        int date = 1-i;
        System.out.println("date="+date);

        for(int w = 0; w < 6 ; w++){
            for(int d = 0 ; d < 7 ; d++){
                if(date<=0)
                System.out.print("\t");
                else if(date>31)
                break;
                else System.out.print(date+"\t");
                date+=1;
            }
           System.out.println("\n");
        }
    }
}
