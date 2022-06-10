import java.util.Scanner;
public class Main {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        char Menu;
        
        do{
        System.out.println("Escolha uma das Seguintes Opções :");
        System.out.println("\n1 Intruções \n2 Jogar \n3 Créditos \n4 Sair");
        Menu = sc.nextLine().charAt(0);
      
        switch(Menu){
        case '1':
            System.out.println("oi");
                break;
        case '2':
            System.out.println("Start The Game");
                break;
        case '3':
            System.out.println("Everybody Hates Chris");
                break;
        case '4':
            System.out.println("Sair");
                break;
        default:
           System.out.println("Digite novamente");
        }
         }while(Menu != '4');
             System.out.println("Até a Próxima!!");
    }
 }

