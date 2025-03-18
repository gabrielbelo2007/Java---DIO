package abstracao;

public record Cliente(String name, int age){

    public Cliente{

    }

    public Cliente(String name){
        this(name, 18);
    }

    public String getInfo(){
        return "Name: " + name + " age: " + age;
    }
}
