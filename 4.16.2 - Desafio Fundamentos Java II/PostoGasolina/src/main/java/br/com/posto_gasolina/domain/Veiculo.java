package br.com.posto_gasolina.domain;

public class Veiculo {
    private String nomeCarro;
    private String corCarro;
    private long tanque;

    public Veiculo(String nomeCarro, String corCarro, long tanque) {
        this.nomeCarro = nomeCarro;
        this.corCarro = corCarro;
        this.tanque = tanque;
    }

    public String getNomeCarro() {
        return nomeCarro;
    }

    public String getCorCarro() {
        return corCarro;
    }

    public long getTanque() {
        return tanque;
    }
}
