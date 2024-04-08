package model;

public class Mamifero extends Animal {

    private String alimento;

 
    public Mamifero() {
        setAmbiente("Terra");
    }

    public String getAlimento() {
        return alimento;
    }

    public void setAlimento(String alimento) {
        this.alimento = alimento;
    }

    public void dados() {
        super.dados();
        System.out.println("Alimento: " + alimento);
    }
}