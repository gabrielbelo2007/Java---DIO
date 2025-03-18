package abstracao;

public class Main {
    public static void main(String[] args) {
        // var male = new Person("Gabriel");   
        // var female = new Person("Isabel");

        // System.out.println("Male name: " + male.getName() + " age: " + male.getAge());
        // System.out.println("Female name: " + female.getName() + " age: " + female.getAge());


        var cliente =  new Cliente("Gabriel");
        System.out.println(cliente);
        System.out.println(cliente.name());
        System.out.println(cliente.getInfo());
    }
}
