package module14.contribuintes.entities;

public abstract class Pessoa {
    private String name;
    private Double rendaAtual;

    protected Pessoa(String name, Double rendaAtual) {
        this.name = name;
        this.rendaAtual = rendaAtual;
    }

    public Double getRendaAtual() {
        return rendaAtual;
    }

    public void setRendaAtual(Double rendaAtual) {
        this.rendaAtual = rendaAtual;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract Double calculaImposto();
}
