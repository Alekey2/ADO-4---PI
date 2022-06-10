import java.util.Scanner;
public class Main {
    public static void main (String[] args){
        char materia;
        Scanner sc = new Scanner(System.in);
        System.out.println("Selecione a Matéria:\nA - Algoritimos e Programação I \nB - Fundamentos de Administração \nC - Matemática Para TI \nD - Conceitos de Computação \nE - Desenvolvimento de Logíca");
        materia = sc.nextLine().charAt(0);
    switch(materia){
        case 'a':
        case 'A':
            System.out.println("Resposta Incorreta");
            break;
        case 'b':
        case 'B':
              System.out.println("Resposta Incorreta");
              break;
        case 'c':
        case 'C':
            System.out.println("Resposta Incorreta");
            break;
        case 'd':
        case 'D':
            System.out.println("Resposta Incorreta");
            break;
        case 'e':
        case 'E':
            System.out.println("Resposta Correta");
            break;
    }     
     }
 }
