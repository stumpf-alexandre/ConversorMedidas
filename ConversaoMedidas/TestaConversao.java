package ConversaoMedidas;

import java.util.Scanner;

/*Criar uma classe “ConversãoDeMedidas”, que deve converter metros para jardas, metros para quilômetros, metros para
milhas, milhas para quilômetros, milhas para jardas. Todos os métodos serão estáticos e não possui atributos apenas
retorno;*/

public class TestaConversao {
    public static void main(String[] args) {
        double metros;
        double milhas;
        Scanner tc=new Scanner(System.in);
        ConversaoDeMedidas con=new ConversaoDeMedidas();
        System.out.println("Digite um valor em metros: ");
        metros=tc.nextDouble();
        System.out.println("Digite um valor em milhas: ");
        milhas=tc.nextDouble();

        System.out.println(metros+" metros convertido para "+con.metrosJardas(metros)+" jardas");
        System.out.println(metros+" metros convertido para "+con.metrosKm(metros)+" Km");
        System.out.println(metros+" metros convertido para "+con.metrosMilhas(metros)+" milhas");
        System.out.println(milhas+" milhas convertido para "+con.milhasKm(milhas)+" Km");
        System.out.println(milhas+" milhas convertido para "+con.milhasJardas(milhas)+" jardas");
    }
}
