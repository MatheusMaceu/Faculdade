package school.sptech.ex04;

public class EntradaCinema {

    private String nome;
    private Integer hora;
    private Integer sala;
    private Double valor;
    private Boolean[] assentosDisponiveis;

    public String getNome() {
        return nome;
    }

    public Integer getHora() {
        return hora;
    }

    public Integer getSala() {
        return sala;
    }

    public Double getValor() {
        return valor;
    }

    public Boolean[] getAssentosDisponiveis() {
        return assentosDisponiveis;
    }

    public void aplicarDesconto( Integer idade, Boolean estudante){
        if (idade == null || estudante == null) {
            return;
        }else if (idade < 0){
            return;
        }

        if (idade < 3){
            valor = 0.;
        } else if (idade < 12) {
            valor = valor*0.50;
        } else if (idade < 16 && estudante) {
            valor = valor *0.60;
        } else if (idade < 21 && estudante) {
            valor = valor * 0.70;
        } else if (estudante) {
            valor = valor *0.80;
        }
    }

    public void aplicarDescontoHorario() {
        if (getHora() < 16){
            valor = valor*0.90;
        }
    }

    public Boolean comprarIngresso(Integer indiceAssento, Double pagamento, Integer idade, Boolean estudante) {

        Boolean[] assentos = getAssentosDisponiveis();

        if (indiceAssento == null || pagamento == null || idade == null || estudante == null || idade < 0) {
            return false;
        }
        if (indiceAssento < 0 || indiceAssento >= assentos.length) {
            return false;
        }
        if (!assentos[indiceAssento]) {
            return false;
        }
        Double valorOriginal = valor;
        aplicarDesconto(idade, estudante);
        aplicarDescontoHorario();

        if (pagamento < valor) {
            valor = valorOriginal;
            return false;
        }
        assentosDisponiveis[indiceAssento] = false;
        return true;
    }
}
