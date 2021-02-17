//WAP to show object cloning in java using cloneable and copy constructor both.
package Fifth;


    class Using_clone implements Cloneable{
       int a;
       int b;

        Using_clone(int a,int b){
            this.a=a;
            this.b=b;
        }

        public Object clone()throws CloneNotSupportedException{
            return super.clone();
        }

        public static void main(String args[]){
            try{
                Using_clone s1=new Using_clone(101,202);

                Using_clone s2=(Using_clone) s1.clone();
                // Using_clone s2=(Using_clone) s1.clone();
                System.out.println(s1.a+" "+s1.b);
                System.out.println(s2.a+" "+s2.b);

            }catch(CloneNotSupportedException c){}

        }
    }

