package model;

import java.util.ArrayList;

public class Frota {
    private ArrayList<Veiculo> veiculos;

    public Frota() {
        veiculos = new ArrayList<>();
    }

    public void adicionarVeiculo(Veiculo veiculo) {
        veiculos.add(veiculo);
    }

    public void exibirVeiculos() {
        for (Veiculo v : veiculos) {
            v.exibirDetalhes();
        }
    }
}
