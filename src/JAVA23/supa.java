package JAVA23;
public class supa extends Object{
    public int y;
    public supa(int x){
        y = x;
    }
    public void  area(){
        System.out.println("errors");
    }
    public static void main(String[] args) {
        supa s = new supa(0);
        s.area();

    }

public class minor extends supa{
    public minor(){
        super(3);
    }

    @Override
    public void area(){
        System.out.println("open");;
    }
    
} 

}