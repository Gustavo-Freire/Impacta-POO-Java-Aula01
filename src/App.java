import java.util.*;

public class App {
    public static void main(String[] args){
        Scanner escolha = new Scanner(System.in);
        System.out.println("Deseja jogar?(S/N)");
        String continuar = escolha.nextLine();  // Read user input
        escolha.close();
        System.out.println(continuar);
        if (continuar.equals("S")){
            System.out.println("Jogando");
        }else if (continuar.equals("N")){
            System.out.println("Parando de Jogar");
        }else{
            System.out.println("resposta invalida");
        }
    }
}

