package model;

public class Peixe extends Animal {

    private String caracteristica;

    public Peixe() {
        setPatas(0);
        setAmbiente("Mar");
        setCor("Cinzenta");
    }


    public String getCaracteristica() {
        return caracteristica;
    }

    public void setCaracteristica(String caracteristica) {
        this.caracteristica = caracteristica;
    }

    public void dados() {
        super.dados();
        System.out.println("Característica: " + caracteristica);
    }
}