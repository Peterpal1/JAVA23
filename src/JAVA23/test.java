package JAVA23;
import java.util.*;
public class test {
    double rad;
    static Date date = new Date();

    test(){
        rad = 7;
    }
    test(double newrad){
        rad = newrad;
    }
    double area(){
        return rad *rad * Math.PI;
    }
 public static void main(String[] args) {
    //new test();
    @SuppressWarnings("unused")
    test t2 = new test(21) ;
    // t is gabage,nolonger needed
    @SuppressWarnings("unused")
    int t=8;
    int y =7;
    t=y;
    System.out.println(date); 
    System.out.println(); 
    System.out.println(new test().rad); 
    @SuppressWarnings("unused")
    test mytest;
    mytest = new test();
    Innertest i = new Innertest();
    System.out.println(i.name);
 }  
  
}
class Innertest {
    String name;
    Innertest(){    }
    Innertest(String newName){
        name = newName;
    }
    String tostriString(){
        return "name is" + name;

    }
public static void main(String[] args) {
    //we can only create  new objects from the main class
   //Innnertest t1 = new Innertest("Sylvan") ;
}
    
}
