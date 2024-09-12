public class Ruunable{
    public static void main(String[] args){
    Person person1 = new Person("Jane", 45, 6);
        System.out.println("The name of the person is:" + person1.getName());
        System.out.println("The age of the person is:" + person1.getAge());
        System.out.println("The height of the person is:" + person1.getHeight());
    }
}