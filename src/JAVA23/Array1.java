package JAVA23;
import java.util.Scanner;
public class Array1 {
    static int size =6;
    static int [] CQ = new int[size];
    int count;

    public void Enqueue(int data){
    if(count==size){
        System.out.print("CQ is full");
    }else{
        for(int i = 0;i<size;i++){
        @SuppressWarnings("resource")
        Scanner in = new Scanner(System.in);
        System.out.print("Enter data:");
        CQ[i] = in.nextInt();
        count++;
    }
    System.out.println("Elements = " +count);
    }

    }  
     public void Dequeued(){
        if(count == 0){
            System.out.println("CQ is empty");
        }else{

        }
     }  
    public static void main(String[] args) {
        Array1 Obj = new Array1();
        Obj.Enqueue(CQ[0]);
        for(int x = 0;x < size ;x++){

        System.out.print(CQ[x] + " ");
    }

    }
}
