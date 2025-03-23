package exercicios.ex2;

public class Carro {

    private int velocidade;
    private boolean ligado;
    private int marcha = 0;

    public Carro(){
        ligado = false;
        System.out.println("Carro desligado!");
    }

    public void ligarCarro() {
        ligado = true;
        System.out.println("Carro ligado!");
    }

    public void desligarCarro() {
        if(marcha == 0 && velocidade == 0){
            ligado = false;
            System.out.println("Carro desligado!");
        } else {
            System.out.println("Não é possível desligar o carro!");
        }
    }

    public void verificarVelocidade(){
        System.out.println("Velocidade: " + velocidade);
    }

    public void acelerar() {
        if(ligado){
            if(marcha == 1 && velocidade < 20){
                velocidade += 1;
                System.out.println("Acelerando! Velocidade: " + velocidade);
            } else if(marcha == 2 && velocidade < 40) {
                velocidade += 1;
                System.out.println("Acelerando! Velocidade: " + velocidade);
            } else if(marcha == 3 && velocidade < 60) {
                velocidade += 1;
                System.out.println("Acelerando! Velocidade: " + velocidade);
            } else if(marcha == 4 && velocidade < 80) {
                velocidade += 1;
                System.out.println("Acelerando! Velocidade: " + velocidade);
            } else if(marcha == 5 && velocidade < 100) {
                velocidade += 1;
                System.out.println("Acelerando! Velocidade: " + velocidade);
            } else if(marcha == 6 && velocidade < 120) {
                velocidade += 1;
                System.out.println("Acelerando! Velocidade: " + velocidade);
            } else {
                System.out.println("Não é possível acelerar!");
            }
        } else{
            System.out.println("Carro desligado!");
        }    
    }   

    public void desacelar() {
        if(ligado){
            if(marcha == 1 && velocidade > 0){
                velocidade -= 1;
                System.out.println("Desacelerando! Velocidade: " + velocidade);
            } else if(marcha == 2 && velocidade > 21) {
                velocidade -= 1;
                System.out.println("Desacelerando! Velocidade: " + velocidade);
            } else if(marcha == 3 && velocidade > 41) {
                velocidade -= 1;
                System.out.println("Desacelerando! Velocidade: " + velocidade);
            } else if(marcha == 4 && velocidade > 61) {
                velocidade -= 1;
                System.out.println("Desacelerando! Velocidade: " + velocidade);
            } else if(marcha == 5 && velocidade > 81) {
                velocidade -= 1;
                System.out.println("Desacelerando! Velocidade: " + velocidade);
            } else if(marcha == 6 && velocidade > 101) {
                velocidade -= 1;
                System.out.println("Desacelerando! Velocidade: " + velocidade);
            } else {
                System.out.println("Não é possível acelerar!");
            }
        } else{
            System.out.println("Carro desligado!");
        }   
    }

    public void virarParaEsquerda() {
        if(ligado){
            if(velocidade >= 1 && velocidade <= 40){
                System.out.println("Virando para a Esquerda!");
            } else {
                System.out.println("Não é possível virar para a esquerda!");
            }
        } else{
            System.out.println("Carro desligado!");
        }
    }

    public void virarParaDireita(){
        if(ligado){
            if(velocidade >= 1 && velocidade <= 40){
                System.out.println("Virando para a Direita!");
            } else {
                System.out.println("Não é possível virar para a direita!");
            }
        } else{
            System.out.println("Carro desligado!");
        }
    }

    public void passarMarcha(String mudar){
        if(ligado){
            switch (mudar) {
                case "+" -> {
                    switch (velocidade) {
                        case 0 -> {
                            marcha = 1;
                            System.out.println("Marcha: " + marcha);
                        }
                        case 20 -> {
                            marcha = 2;
                            velocidade += 1;
                            System.out.println("Marcha: " + marcha);
                        }
                        case 40 -> {
                            marcha = 3;
                            velocidade += 1;
                            System.out.println("Marcha: " + marcha);
                        }
                        case 60 -> {
                            marcha = 4;
                            velocidade += 1;
                            System.out.println("Marcha: " + marcha);
                        }
                        case 80 -> {
                            marcha = 5;
                            velocidade += 1;
                            System.out.println("Marcha: " + marcha);
                        }
                        case 100 -> {
                            marcha = 6;
                            velocidade += 1;
                            System.out.println("Marcha: " + marcha);
                        }
                        default -> {
                            System.out.println("Não é possível passar de marcha!");
                        }
                    }
                }
                case "-" -> {
                    switch (velocidade) {
                        case 0 -> {
                            marcha = 0;
                            System.out.println("Marcha: " + marcha);
                        }
                        case 21 -> {
                            marcha = 1;
                            velocidade -= 1;
                            System.out.println("Marcha: " + marcha);
                        }
                        case 41 -> {
                            marcha = 2;
                            velocidade -= 1;
                            System.out.println("Marcha: " + marcha);
                        }
                        case 61 -> {
                            marcha = 3;
                            velocidade -= 1;
                            System.out.println("Marcha: " + marcha);
                        }
                        case 81 -> {
                            marcha = 4;
                            velocidade -= 1;
                            System.out.println("Marcha: " + marcha);
                        }
                        case 101 -> {
                            marcha = 5;
                            velocidade -= 1;
                            System.out.println("Marcha: " + marcha);
                        }
                        default -> {
                            System.out.println("Não é possível passar de marcha!");
                        }
                    }
                }
            }
        } else {
            System.out.println("Carro desligado!");
        }
    }
}
