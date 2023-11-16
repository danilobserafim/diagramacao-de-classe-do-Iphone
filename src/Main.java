import models.Iphone;

import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Iphone iphone = new Iphone();
        int app;
        int funcaoApp;

        while (true){
            System.out.println("Escolha seu app:");
            System.out.println("1 para Telefone");
            System.out.println("2 para Internet");
            System.out.println("3 para Reprodutor Musical");
            app = scanner.nextInt();

            switch (app){
                case 1:
                    System.out.println("1 para ligar");
                    System.out.println("2 para atender");
                    System.out.println("3 para iniciando correio de voz");
                    funcaoApp = scanner.nextInt();

                    switch (funcaoApp){
                        case 1:
                            iphone.getTelefone().ligar();
                            break;
                        case 2:
                            iphone.getTelefone().atender();
                            break;
                        case 3:
                            iphone.getTelefone().iniciarCorreioDeVoz();
                            break;

                    }
                    break;
                case 2:
                    System.out.println("1 para Adicionar nova aba");
                    System.out.println("2 para Atualizar página");
                    System.out.println("3 para exibir página");
                    funcaoApp = scanner.nextInt();

                    switch (funcaoApp){
                        case 1:
                            iphone.getInternet().adicionarNovaAba();
                            break;
                        case 2:
                            iphone.getInternet().atualizarPagina();
                            break;
                        case 3:
                            iphone.getInternet().exibirPagina();
                            break;

                    }
                    break;
                case 3:
                    System.out.println("1 para selecionar musica");
                    System.out.println("2 para pausar musica");
                    System.out.println("3 para dar o play");
                    funcaoApp = scanner.nextInt();
                    switch (funcaoApp){
                        case 1:
                            iphone.getReprodutorMusical().selecionarMusica();
                            break;
                        case 2:
                            iphone.getReprodutorMusical().pausar();
                            break;
                        case 3:
                            iphone.getReprodutorMusical().tocar();
                            break;
                    }
                    break;
            }
        }
    }
}