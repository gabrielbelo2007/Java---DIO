package exercicios.ex1;

public class ContaBancaria{

    private int saldo;
    private int limiteChequeEspecial;
    private int taxaChequeEspecial;

    public ContaBancaria(int saldo){
        if(saldo <= 500){
            limiteChequeEspecial = 50;
        } else {
            limiteChequeEspecial = saldo / 2;
        }
        this.saldo = saldo + limiteChequeEspecial;
    }
    
    public void ConsultarSaldo(){
        System.out.println("Saldo atual: " + saldo);
    }

    public String Depositar(int deposito){
        if(taxaChequeEspecial > 0 && taxaChequeEspecial < deposito){
            deposito -= taxaChequeEspecial;
            taxaChequeEspecial = 0;
        }
        saldo += deposito;
        ConsultarSaldo();
        return "Depositado";
    }

    public String Sacar(int saque){
        saldo -= saque;
        if(saldo < limiteChequeEspecial){
            taxaChequeEspecial = ((limiteChequeEspecial - saldo) * 20) / 100;
            limiteChequeEspecial -= (limiteChequeEspecial - saldo);
            ConsultarSaldo();
            return "Sacado";
        } 
        else{
            ConsultarSaldo();
            return "Sacado";
        }
    }

    public String PagarBoleto(int boleto){
        saldo -= boleto;
        if(saldo < limiteChequeEspecial){
            taxaChequeEspecial = ((limiteChequeEspecial - saldo) * 20) / 100;
            limiteChequeEspecial -= (limiteChequeEspecial - saldo);
            ConsultarSaldo();
            return "Pago";
        } 
        else{
            ConsultarSaldo();
            return "Pago";
        }
    }

    public void verificarChequeEspecial(){
        if(taxaChequeEspecial > 0){
            System.out.println("Está usando cheque especial");
        }
    }
}   

