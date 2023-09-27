class Programmer{ //Parent class or Super class or Extended class
    void work(){
        System.out.println("Let's Work");
    }
}
class Employee extends Programmer{ //Child class or Sub class or Base class
    void rest(){
        System.out.println("Let's Rest");
    }
}
public class InheritTest {
    public static void main(String[] args) {
Employee obj=new Employee();
obj.work();
obj.rest();
    }
}
