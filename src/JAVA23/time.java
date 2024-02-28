package JAVA23;
public class time{
    private int hr;
    private int min;
    private int sec;

    public void nextTime(){
      if(getHr()==23 && getMin()==59 && getSec()==59){
         hr = 00;
         min = 00; 
         sec = 00;  
      } else if(getSec() == 59 && getMin() == 59 ){
         hr +=1; 
         min = 00; 
         sec = 00;
      } else if ( getSec() == 59){
         min +=1; 
         sec = 0;
      }else sec +=1;

    }
     public void addTime( int x){
      for(int i = 0 ; i< x ;i++){
         nextTime();
      }
     }

     public void setHr(int h){
      hr = h;
     }
     public void setMin( int min){
      this.min = min;
     }
     public void setSec(int sec){
      this.sec = sec;
     }
     public int getHr(){
      return hr;
     }
     public int getMin(){
      return min;
     }
     public int getSec(){
      return sec;
     }
     public void display(){
      System.out.println("TIME =" + hr + ":" + min + ":" + sec);
     }
     public static void main( String [] args){
      time t = new time();
      t.nextTime();
      t.setHr(23);
      t.setMin(59);
      t.setSec(59);
      t.display();
      t.addTime(20);
     } 

 }