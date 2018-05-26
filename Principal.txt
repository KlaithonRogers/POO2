import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        
        String codigo;
        String logradouro;
        String numRua;
        String cidade;
        String estado;
        float quantidade = 0;
        float saque;
        
        System.out.println("Preencha as informações a seguir: ");
        System.out.println();
        
        System.out.print("Código: ");
        codigo = in.nextLine();
        
        System.out.print("Logradouro: ");
        logradouro = in.nextLine();
        
        System.out.print("Número da rua: ");
        numRua = in.nextLine();
        
        System.out.print("Cidade: ");
        cidade = in.nextLine();
        
        System.out.print("Estado: ");
        estado = in.nextLine();
        
        Caixa c1 = new Caixa(codigo, logradouro, numRua, cidade, estado);
        
        while (c1.validaCod(codigo) == false) {
            if(c1.validaCod(codigo) == true) 
                System.out.println("Código válido.");
            else {
                System.out.println("Código não é válido.");
                System.out.println();
                System.out.print("Código: ");
                codigo = in.nextLine();
            }
        }
        
       System.out.println(c1.getPainel());
       
        Bandejas b1 = new Bandejas(codigo, logradouro, numRua, cidade, estado, 100, 10);
        Bandejas b2 = new Bandejas(codigo, logradouro, numRua, cidade, estado,  50, 20);
        Bandejas b3 = new Bandejas(codigo, logradouro, numRua, cidade, estado,  20, 15);
        Bandejas b4 = new Bandejas(codigo, logradouro, numRua, cidade, estado,  10, 10);
        
        System.out.println("Saldo da bandeja 1: " + b1.saldoB1);
        System.out.println("Saldo da bandeja 2: " + b2.saldoB2);
        System.out.println("Saldo da bandeja 3: " + b3.saldoB3);
        System.out.println("Saldo da bandeja 4: " + b4.saldoB4);
        
        System.out.println("Saldo do caixa: " + b1.saldo);
        
        System.out.println("Digite o valor que deseja sacar: ");        
        saque = in.nextFloat();

        if(saque%5!=0)
            System.out.print("Não há notas disponíveis.");

        if(saque%100==0){
            quantidade=saque/100;
            b1.saldoB1 -= saque;
        }
        else if(saque%50==0) {
            quantidade=saque/50;
            b2.saldoB2 -= saque;
        }
        
        else if(saque%20==0) {
            quantidade=saque/20;
            b3.saldoB3 -= saque;
        }
        
        else if(saque%10==0) {
            quantidade=saque/10;
            b4.saldoB4 -= saque;
        }

        System.out.print("Quantidade de notas retornada: " + quantidade);
        System.out.print("Valor do saque: " + saque);
}

}
