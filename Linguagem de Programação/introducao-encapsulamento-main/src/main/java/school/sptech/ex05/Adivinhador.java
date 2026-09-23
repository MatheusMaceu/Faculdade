package school.sptech.ex05;

import java.util.Random;

public class Adivinhador {
    private Integer tentativas;

    public Integer getTentativas() {
        return tentativas;
    }

    public void adivinharNumero(Integer num){
        Random aleatorio = new Random();

        for (Integer i = 1; i < Double.POSITIVE_INFINITY;i++){
            if (aleatorio.nextInt(51) == num){
                System.out.println("O numero "+num+" foi sorteado após "+i+" tentativas");
            }
        }
    }
}
