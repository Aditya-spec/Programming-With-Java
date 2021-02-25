// WAP to produce NoClassDefFoundError and ClassNotFoundException exception.

package Question_Third;
//to get no class found exception,we need to delete the class"delete_class_after_compilation"
// after we have compiled the code

class delete_class_after_compilation{
    void hello(){
    System.out.println("hello");
};
}
public class noclassdeffound {
    public static void main(String[] args) {
        delete_class_after_compilation obj=new delete_class_after_compilation();
        obj.hello();
    }
}
