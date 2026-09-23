package school.sptech.ex01;

public class Onibus extends BilheteUnico{

    private Integer qtdPassageiros;
    private Double valorPassagem;

    public Integer getQtdPassageiros() {
        return qtdPassageiros;
    }

    public Double getValorPassagem() {
        return valorPassagem;
    }

    public void cobrarPassagem(BilheteUnico bilhete) {

        if (bilhete == null){
            return;
        }

        Double novoValor = bilhete.getSaldo();

        if (bilhete.getBloqueado()) {
            System.out.println("bilhete único bloqueado");
            return;
        }
        Double valorPassagem = getValorPassagem();
        if (bilhete.getEstudante()) {
            valorPassagem = valorPassagem / 2;
        }
        if (bilhete.getSaldo() < valorPassagem) {
            System.out.println("Não há saldo suficiente para realizar operação");
            return;
        }
        novoValor = novoValor - valorPassagem;
        bilhete.setSaldo(novoValor);
        qtdPassageiros = getQtdPassageiros() + 1;
    }


    public void cobrarPassagem(Double dinheiro){

        if (dinheiro == null) return;

        if (dinheiro < getValorPassagem()){
            System.out.println("Dinheiro insuficiente para realizar a operação");
            return;
        }


        qtdPassageiros = getQtdPassageiros()+1;
    }

}
