package view;


import model.Frota;
import model.Carro;
import model.Moto;
import model.Veiculo;

public class Principal {
    public static void main(String[] args) {
        // Cria a frota
        Frota frota = new Frota();

        // Cria veículos
        Carro carro = new Carro("Ford", "Fiesta", 4);
        Moto moto = new Moto("Yamaha", "MT-07", 700);

        // Adiciona veículos à frota
        frota.adicionarVeiculo(carro);
        frota.adicionarVeiculo(moto);

        // Exibe os detalhes de todos os veículos na frota
        frota.exibirVeiculos();
    }
}

