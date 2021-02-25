package Question_Tenth;
//Use Synchronize method to enable synchronization
// between multiple threads trying to access method at same time.
class Calculate{
    synchronized void cal(int n){//synchronized method
        for(int i=1;i<=10;i++){
            System.out.println(n+i);
            try{
                Thread.sleep(400);
            }catch(Exception e){System.out.println(e);}
        }

    }
}

class MyProcess1 extends Thread{
    Calculate t;
    MyProcess1(Calculate t){
        this.t=t;
    }
    public void run(){
        t.cal(5);
    }

}
class MyPrcoess2 extends Thread{
    Calculate t;
    MyPrcoess2(Calculate t){
        this.t=t;
    }
    public void run(){
        t.cal(20);
    }
}

public class Main{
    public static void main(String args[]){
        Calculate obj = new Calculate();//only one object
        MyProcess1 m1=new MyProcess1(obj);
        MyPrcoess2 m2=new MyPrcoess2(obj);
        m1.start();
        m2.start();
    }
}
