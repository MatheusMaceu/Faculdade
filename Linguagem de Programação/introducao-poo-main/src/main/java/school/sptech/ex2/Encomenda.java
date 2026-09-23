package school.sptech.ex2;

public class Encomenda {

    String tamanho;
    String enderecoRemetente;
    String enderecoDestinatario;
    Double distancia;
    Double valorProduto;

    public Double calcularFrete() {
        Double retornar = 0.0;
        if(tamanho.equals("P")){
            retornar = valorProduto*0.01;
        }else if(tamanho.equals("M")){
            retornar = valorProduto*0.03;
        }else if(tamanho.equals("G")){
            retornar = valorProduto*0.05;
        }

        if(distancia<=50){
            retornar+= 3.0;
        } else if (distancia <=200) {
            retornar+= 5.0;
        } else{
            retornar+= 7.0;
        }

        return retornar;
    }

    void aplicarCupomDeDesconto (Integer percentual){
        Double percentualNovo = percentual.doubleValue();
        valorProduto = valorProduto-valorProduto*(percentualNovo/100);
    }

    public Double valorTotalDaEncomenda () {
        return valorProduto+calcularFrete();
    }
}
