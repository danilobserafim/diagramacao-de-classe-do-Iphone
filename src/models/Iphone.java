package models;

public class Iphone {
    private Telefone telefone = new Telefone();
    private Internet internet = new Internet();
    private ReprodutorMusical reprodutorMusical = new ReprodutorMusical();

    public Telefone getTelefone() {
        return telefone;
    }

    public void setTelefone(Telefone telefone) {
        this.telefone = telefone;
    }

    public Internet getInternet() {
        return internet;
    }

    public void setInternet(Internet internet) {
        this.internet = internet;
    }

    public ReprodutorMusical getReprodutorMusical() {
        return reprodutorMusical;
    }

    public void setReprodutorMusical(ReprodutorMusical reprodutorMusical) {
        this.reprodutorMusical = reprodutorMusical;
    }
}
