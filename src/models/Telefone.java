package models;

import java.util.Scanner;

public class Telefone {
    private Scanner scanner = new Scanner(System.in);
    private int numero;
    public void ligar(){
        System.out.println("Disque o numero que deseja ligar.");
        numero = scanner.nextInt();
        System.out.println("Ligando para: " + numero);
    }
    public void atender(){
        System.out.println("Atendendo telefone");
    }
    public void iniciarCorreioDeVoz(){
        System.out.println("Iniciando correio de voz");
    }

}
