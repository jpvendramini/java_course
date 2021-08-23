package module14.contribuintes.entities;

public class PessoaFisica extends Pessoa{
    private Double gastoSaudde;

    public PessoaFisica(String name, Double rendaAtual, Double gastoSaudde) {
        super(name, rendaAtual);
        this.gastoSaudde = gastoSaudde;
    }

    public Double getGastoSaudde() {
        return gastoSaudde;
    }

    public void setGastoSaudde(Double gastoSaudde) {
        this.gastoSaudde = gastoSaudde;
    }

    @Override
    public Double calculaImposto() {
        if (getRendaAtual() <= 20000){
            return (getRendaAtual() * 0.15) - (gastoSaudde / 2);
        }else{
            return (getRendaAtual() * 0.25) - (gastoSaudde / 2);
        }
    }
}
