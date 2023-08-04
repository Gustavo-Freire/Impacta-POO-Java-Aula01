import java.util.*;

public class App {
    public static void main(String[] args){
        Scanner escolha = new Scanner(System.in);
        while (true) {
        
            System.out.println("Escolha uma opção:");

            System.out.println("0 - Sair");
            System.out.println("1 - Pedra");
            System.out.println("2 - Papel");
            System.out.println("3 - Tesoura");

            int continuar = escolha.nextInt();  
            
            System.out.println(continuar);

            if (continuar == 0){
                System.out.println("Parando de Jogar");
                break;
            } else if (continuar == 1){
                System.out.println("Escolheu Pedra");
                break;
            } else if (continuar == 2){
                System.out.println("Escolheu Papel");
                break;
            } else if (continuar == 3){
                System.out.println("Escolheu Tesoura");
                break;
            } else {
                System.out.println("resposta invalida");
            }   
        }
        escolha.close();
    }
}

