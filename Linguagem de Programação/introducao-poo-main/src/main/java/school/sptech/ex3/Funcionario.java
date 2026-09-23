package school.sptech.ex3;

public class Funcionario {

    String nome;
    String cargo;
    Double salario;

    void reajustarSalario(Integer reajuste){
        salario = salario+salario*(reajuste.doubleValue()/100);
    }

    public Double calcularValorHora(){
        return salario/220;
    }

    public Double calcularHoraExtra(Integer extra, Integer percentual){
        Double total = extra+extra*(percentual.doubleValue()/100);

        return calcularValorHora()*total;
    }

    public Double calcularBonificacaoAnual() {
        Double boni = 0.;
        if(salario <= 2500){
            boni = 0.15;
        } else if (salario <= 6000) {
            boni = 0.10;
        } else {
            boni = 0.05;
        }
        return salario*boni;
    }

}
