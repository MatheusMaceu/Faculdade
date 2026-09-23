package school.sptech.ex1;

import org.w3c.dom.ls.LSOutput;

public class Bolo {

    String sabor;
    Double valor;
    Integer quantidadeVendida;
    Integer quantidadeEmEstoque;

    void venderBolo(Integer desejo){
        if(quantidadeEmEstoque < desejo || desejo < 1){

        }else {
            quantidadeEmEstoque-=desejo;
            quantidadeVendida+=desejo;
        }
    }

    void aumentarEstoque(Integer desejo){
        if(desejo < 1){

        }else{
            quantidadeEmEstoque+=desejo;
        }
    }

    public Integer quantidadeDisponivel(){
        return quantidadeEmEstoque;
    }

    public Double totalVendido(){
        return valor*quantidadeVendida;
    }

}
