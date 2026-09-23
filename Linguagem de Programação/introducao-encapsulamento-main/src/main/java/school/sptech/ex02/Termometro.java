package school.sptech.ex02;

public class Termometro {
    private Double temperaturaAtual;
    private Double temperaturaMaxRegistrada;
    private Double temperaturaMinRegistrada;


    public Termometro(Double temperaturaAtual) {
        this.temperaturaAtual = temperaturaAtual;
        this.temperaturaMaxRegistrada = temperaturaAtual;
        this.temperaturaMinRegistrada = temperaturaAtual;
    }

    public Double getTemperaturaAtual() {
        return temperaturaAtual;
    }

    public Double getTemperaturaMaxRegistrada() {
        return temperaturaMaxRegistrada;
    }

    public Double getTemperaturaMinRegistrada() {
        return temperaturaMinRegistrada;
    }

    public void alterarTemperatura(Double novaTemperatura){
        if(novaTemperatura == null) return;

        temperaturaAtual=novaTemperatura;

        if(getTemperaturaAtual()>getTemperaturaMaxRegistrada()){
            temperaturaMaxRegistrada=getTemperaturaAtual();
        } else if (getTemperaturaAtual()<getTemperaturaMinRegistrada()) {
            temperaturaMinRegistrada=getTemperaturaAtual();
        }
    }

    public Double converterParaKelvin() {
        return getTemperaturaAtual()+273.15;
    }

    public Double converterParaFahrenheit(){
        return getTemperaturaAtual()*1.8+32;
    }

}
