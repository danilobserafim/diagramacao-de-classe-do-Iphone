package models;

import java.util.Scanner;

public class ReprodutorMusical {
    private Scanner scanner = new Scanner(System.in);
    private String[] musicas = {"Locked out of heaven - Bruno Mraz",
                                "SexyBack - Justin Timberlake",
                                "Azul da cor do mar - Tim Maia",
                                "Banana elétrica - Querosene Jacaré"};
    private boolean tocando = false;
    private int musicaSelecionada;

    public void tocar(){
        System.out.println("Tocando " + musicaSelecionada);
    }
    public void pausar(){
        System.out.println("Musica pausada");
    }
    public void selecionarMusica(){
        for (int c = 0; c< musicas.length; c++) {
            System.out.println(c + 1 + " para: " + musicas[c]);
        }
        System.out.println("Digite o índice da musica que deseja ouvir.");
        musicaSelecionada = scanner.nextInt() - 1;
        System.out.println("Tocando música: " + musicas[musicaSelecionada]);
    }

}
