public class Bandejas extends Caixa{
    private int valorFace;
    private int qtdNotas;
    protected double saldoB1;
    protected double saldoB2;
    protected double saldoB3;
    protected double saldoB4;
    protected double saldo;
    
    Bandejas(String codigo, String logradouro, String numRua, String cidade, String estado, int valorFace, int qtdNotas){
        super(codigo, logradouro, numRua, cidade, estado);
        this.valorFace = valorFace;
        this.qtdNotas = qtdNotas;
    }
   
    public double saldoBandeja1(){
        saldoB1 = 100*20 ;
        return saldoB1;
    }
    
    public double saldoBandeja2(){
        saldoB2 = 50*15 ;
        return saldoB2;
    }
    
    public double saldoBandeja3(){
        saldoB3 = 20*10 ;
        return saldoB3;
    }
    
    public double saldoBandeja4(){
        saldoB4 = 5*20 ;
        return saldoB4;
    }
    
    public double saldoTotal(){
        saldo = saldoB1 + saldoB2 + saldoB3 + saldoB4;
        return saldo;
    }
    
}