package exercicios.ex3;

public class Maquina {
    private boolean usando;
    private int agua;
    private int shampoo;
    private boolean pet;

    public Maquina(){
        usando = false;
        agua = 30;
        shampoo = 10;
        pet = false;
        System.out.println("Máquina pronta!" );
        System.out.println("Água: " + agua);
        System.out.println("Shampoo: " + shampoo);
        System.err.println("==================================================");
    }

    public void darBanho(){
        if(usando){
            System.out.println("Dando banho...");
            try {
                agua -= 10;
                shampoo -= 2;
                pet = true;
            } catch (Exception e) {
                System.out.println("Precisa reabastecer a máquina!");
                verificarAgua();
                verificarShampoo();
            } 
        } else {
            System.out.println("Precisa colocar o pet!");
        }
    }

    public void colocarPet(){
        if(usando){
            System.out.println("Já está em uso!");
        } else {
            System.out.println("Colocando pet...");
            usando = true;
        }
    }

    public void retirarPet(){
        if(usando){
            usando = false;
            System.out.println("Pet retirado!");
            if(pet == false){
                System.out.println("Pet saiu sem banho!");
                limparMaquina();
            } else {
                System.out.println("Pet limpo!");
                pet = false;
            }
        } else {
            System.out.println("Não tem pet!");
        }
    }

    private void limparMaquina(){
        agua -= 3;
        shampoo -= 1;
    }

    public void verificarAgua(){
        System.out.println("Água: " + agua);
    }

    public void verificarShampoo(){
        System.out.println("Shampoo: " + shampoo);
    }

    public void verificarPet(){
        if(usando){
            System.out.println("Pet na máquina!");
        } else {
            System.out.println("Pet fora da máquina!"); 
        }
    }

    public void abastecerAgua(){
        if((agua + 2) > 30){
            System.out.println("Água cheia!");
        } else {
            agua += 2;
            System.out.println("Abastecendo água...");
        }
    }

    public void abastecerShampoo(){
        if((shampoo + 2) > 10){
            System.out.println("Shampoo cheio!");
        } else {
            shampoo += 2;
            System.out.println("Abastecendo shampoo...");
        }
    }
}
