import java.util.Scanner;
public class Mainn{
    String name;
    int id;
    public void display() {
        System.out.println(name);
        System.out.println(id);
    }
    public static void main(String[] args){
    Main obj1=new Main();
    obj1.name="Devapriya";
    obj1.id=101;
    obj1.display();

    }
}

