//Design classes having attributes for furniture where there are wooden c
// hairs and tables, metal chairs and tables.
// There are stress and fire tests for each products.
interface Furniture{
    public void stressTest();
    public void fireTest();

}

abstract class Chair implements Furniture {
   String color;
   int cost;
   boolean cushion;
    public abstract void chairType();

}
abstract class Table implements Furniture {
    String color;
    int cost;
    int height;
    int width;
    int length;
    public abstract void tableType();
}

class MetalChair extends Chair {
    @Override
    public void stressTest() {
        System.out.println("Stress test of metal chair");
    }

    @Override
    public void fireTest() {
        System.out.println("Fire test of metal chair");
    }


    @Override
    public void chairType() {
   System.out.println("Chair type: Metal");
    }
}
class MetalTable extends Table {
    @Override
    public void stressTest() {

        System.out.println("Passed Stress Test");

    }

    @Override
    public void fireTest() {
        //To change body of implemented methods use File | Settings | File Templates.
        System.out.println("Passed Fire Test");
    }

    @Override
    public void tableType() {
        System.out.println("table type: Metal");
    }

    }


class WoodenTable extends Table {
    @Override
    public void stressTest() {
        //To change body of implemented methods use File | Settings | File Templates.
        System.out.println("Failed Stress Test");
    }

    @Override
    public void fireTest() {
        //To change body of implemented methods use File | Settings | File Templates.
        System.out.println("Failed Fire Test");
    }

    @Override
    public void tableType() {
        System.out.println("table type: Wooden");
    }



}
class WoodenChair extends Chair {
    @Override
    public void stressTest() {
        System.out.println("Stress test of wooden chair");

    }

    @Override
    public void fireTest() {

        System.out.println("Fire test of wooden chair");
    }


    @Override
    public void chairType() {
        System.out.println("Chair type Wooden");

            }
}



public class Ninth  {
    public static void main(String[] args){
        Table table = null;
        String str="wooden";

        if(str.equals("wooden")){
            table = new WoodenTable();
            table.tableType();
            table.stressTest();
            table.fireTest();

        }
        else if (str.equals("metal")){
            table = new MetalTable();
            table.tableType();
            table.fireTest();
            table.stressTest();

        }


    }
}
