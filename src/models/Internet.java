package models;

import java.util.Scanner;

public class Internet {
    private Scanner scanner = new Scanner(System.in);
    private String paginaUrl;

    public void exibirPagina(){
        if (paginaUrl == null){
            adicionarNovaAba();
        }else{
            System.out.println("Abrindo pagina: " + paginaUrl);
        }
    }
    public void adicionarNovaAba(){
        System.out.println("Digite a página que deseja abrir.");
        paginaUrl = scanner.nextLine();
        System.out.println("Abrindo pagina: " + paginaUrl);
    }
    public void atualizarPagina(){
        if (paginaUrl == ""){
            System.out.println("Não ha pagina para atualizar.");
            adicionarNovaAba();
        }else{
            System.out.println("Atualizando pagina");
        }
    }

    public String getPaginaUrl() {
        return paginaUrl;
    }

    public void setPaginaUrl(String paginaUrl) {
        this.paginaUrl = paginaUrl;
    }
}
