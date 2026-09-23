package school.sptech.ex4;

public class Turma {

    String turma;
    Integer capacidadeMaxima;
    Integer quantidadeAlunosMatriculados;

    void matricularAluno(Integer quantia) {
        if(quantia < 1 || quantidadeAlunosMatriculados+quantia > capacidadeMaxima){

        }else{
            quantidadeAlunosMatriculados+= quantia;
        }
    }

    Double encontrarMaiorNota (Double[] vetor){
        Double maior = Double.NEGATIVE_INFINITY;

        for (Double v : vetor) {
            if(maior < v){
                maior = v;
            }
        }

        return maior;
    }

    Double calcularMediaTurma(Double[] vetor){
        Double media = 0.;
        for (Double v : vetor) {
            media+=v;
        }
        return media/vetor.length;
    }

    Integer contarAprovados(Double[] vetor){
        Integer aprovados = 0;
        for (Double v : vetor) {
            if (v>=6){
                aprovados++;
            }
        }
        return aprovados;
    }

    Boolean validarQuantidadeNotas (Double[] vetor){
        Boolean retorno = false;
        Integer qtd = 0;

        for (Double v : vetor) {
            qtd++;
        }

        if (qtd.equals(quantidadeAlunosMatriculados)) retorno = true;

        return retorno;
    }

    Double encontrarNotaMaisProximaDaMedia(Double[] vetor) {
        Double media = calcularMediaTurma(vetor);
        Double calc =  media- vetor[0];
        calc = Math.abs(calc);
        Double prox = vetor[0];

        for (int i = 1; i < vetor.length; i++) {
            if(Math.abs(media - vetor[i]) < calc){
                calc = Math.abs(vetor[i]-media);
                prox = vetor[i];
            }
        }
        return prox;
    }

}
