package model;


public class Carro extends Veiculo {
    private int numPortas;

    public Carro(String marca, String modelo, int numPortas) {
        super(marca, modelo);
        this.numPortas = numPortas;
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("Marca: " + marca + ", Modelo: " + modelo + ", Portas: " + numPortas);
    }
}

