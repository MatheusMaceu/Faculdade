package school.sptech.ex5;

public class Pokemon {

    String nome;
    String tipo;
    Integer vida;
    Integer ataque;
    Integer experiencia;

    void receberAtaque(Integer atq){
        if(vida-atq < 0){
            vida = 0;
        }else if(atq < 1){

        }else{
            vida -= atq;
        }
    }

    void recuperarVida (Integer rec){
        if(vida+rec > 100){
            vida = 100;
        }else if(rec < 1){

        }else{
            vida+= rec;
        }
    }

    void ganharExperiencia (Integer exp){
        if(exp < 1){

        }else{
            experiencia+= exp;
        }
    }

    Integer calcularNivel (){
        return experiencia/100;
    }

    Integer calcularPoderDeCombate(){
        return ataque+calcularNivel()*10+vida;
    }

    void batalhar(Integer[] atqs, Integer[] pocoes){
        for (int i = 0; i < atqs.length; i++) {
            if(vida-atqs[i] < 0){
                vida = 0;
                return;
            }else if(atqs[i] < 1){

            }else{
                vida -= atqs[i];
            }

            if(vida+pocoes[i] > 100){
                vida = 100;
            }else if(pocoes[i] < 1){

            }else{
                vida+= pocoes[i];
            }
        }
    }
}
