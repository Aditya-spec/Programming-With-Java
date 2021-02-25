package Question_Seventh;

public class Seventh {
    int capacity=10;
    int[] arr=new int[10];
    int min=1000;
    int top=-1;
    public void Push(int ele){
        if(!isFull()){
           // System.out.println("array not full");
            if(min>=ele){
                min=ele;
            }
            top++;
            arr[top]=ele;
            System.out.println("element added succesfully");
           // System.out.println(arr[top]);
        }
        else
        System.out.println("array is full");
    }

    public int Pop(){
        if(!isEmpty()){
            int ele = arr[top];
             // System.out.println(arr[top]);arr[top]=0;
            top--;
            int small=1000;
            if(min==ele){
                for(int i=0;i<top+1;i++){
                if(small > arr[i])
                    small = arr[i];
            }
            }
            min=small;
            return ele;

        }
        return -1;
    }

    public boolean isEmpty(){
        if(top==-1)
        return true;
        return false;
    }
   public boolean isFull(){
        if(top == capacity)
            return true;
        return false;
   }

   public void getMin(){

        System.out.println("minimum element is:" + min);
   }

   public void traverse(){
       System.out.print("Elements are:");
       for(int i=0;i< top+1;i++){

           System.out.println(arr[i]);
       }
       System.out.println("That's all.....");
   }

   public static void main(String[] args) {
        Seventh obj=new Seventh();

        obj.Push(5);
        obj.Push(7);
        obj.Push(8);
        obj.Push(2);
        obj.Push(11);
        obj.traverse();
        obj.getMin();



        System.out.println("Popped element is:"+ obj.Pop());
        System.out.println("Popped element is:"+ obj.Pop());
        obj.traverse();

        obj.Push(1);
        obj.traverse();
        System.out.println("Popped element is:"+ obj.Pop());
        obj.traverse();

        obj.getMin();



    }
}
