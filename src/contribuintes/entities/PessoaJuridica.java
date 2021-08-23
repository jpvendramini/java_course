package contribuintes.entities;

public class PessoaJuridica extends Pessoa{
    private int funcionarios;

    public PessoaJuridica(String name, Double rendaAtual, int funcionarios) {
        super(name, rendaAtual);
        this.funcionarios = funcionarios;
    }

    public int getFuncionarios() {
        return funcionarios;
    }

    public void setFuncionarios(int funcionarios) {
        this.funcionarios = funcionarios;
    }

    @Override
    public Double calculaImposto() {
        if (funcionarios > 10){
            return getRendaAtual() * 0.14;
        }else{
            return getRendaAtual() * 0.16;
        }
    }
}
