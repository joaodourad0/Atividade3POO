package model;

public class AnimalTeste {

	public static void main(String[] args) {
		Peixe tubarao = new Peixe();
        tubarao.setNome("Tubarão");
        tubarao.setComprimento(300);
        tubarao.setVelocidade(1.5f);
        tubarao.setCaracteristica("Barbatanas e Cauda");

        Mamifero ursoCanada = new Mamifero();
        ursoCanada.setNome("Urso-do-Canadá");
        ursoCanada.setComprimento(180);
        ursoCanada.setVelocidade(0.5f);
        ursoCanada.setCor("Castanho");
        ursoCanada.setAlimento("Mel");

        // Mostrando os dados dos animais
        System.out.println("Dados do Tubarão:");
        tubarao.dados();
        System.out.println();

        System.out.println("Dados do Urso-do-Canadá:");
        ursoCanada.dados();
    }
}