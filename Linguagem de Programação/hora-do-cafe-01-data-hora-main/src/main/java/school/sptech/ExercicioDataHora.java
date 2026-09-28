package school.sptech;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class ExercicioDataHora {

    public Boolean isPassado(LocalDateTime dataHoraInicio, LocalDateTime dataHoraFim){
        if(dataHoraFim.isAfter(dataHoraInicio)){
            return true;
        }else{
            return false;
        }
    }

    public Integer calcularIdade (LocalDate dataNascimento, LocalDate dataAtual){
        return Period.between(dataNascimento,dataAtual).getYears();
    }

    public Boolean isFinalDeSemana(LocalDate data){
        if(data.getDayOfWeek().getValue()==(6)  || data.getDayOfWeek().getValue()==7){
            return true;
        }
        return false;
    }

    public LocalDate proximoDiaUtil(LocalDate data){
        if (data.getDayOfWeek().getValue() == 6){
            data = data.plusDays(2);
        }else if (data.getDayOfWeek().getValue() == 7){
            data = data.plusDays(1);
        }else if(data.getDayOfWeek().getValue() < 5){
            data = data.plusDays(1);
        }else{
            data = data.plusDays(3);
        }
        return data;
    }

    public String formatarDataHora (LocalDateTime dataHora){
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("MM/dd/yyyy hh:mm:ss a '(nanosegundos: 'SSS')'");
        return dataHora.format(formato);
    }

    public static List<LocalDate> gerarReunioesSemanais(LocalDate dataComeco, LocalDate dataFim, List<Integer> diasDaSemana) {
        List<LocalDate> reunioes = new ArrayList<>();
        LocalDate dataAtual = dataComeco;

        while (!dataAtual.isAfter(dataFim)) {
            Integer diaSemanaAtual = dataAtual.getDayOfWeek().getValue();
            if (diasDaSemana.contains(diaSemanaAtual)) {
                reunioes.add(dataAtual);
            }
            dataAtual = dataAtual.plusDays(1);
        }
        return reunioes;
    }

    public LocalDate calcularDiaDosPais(Integer ano){
        String dataTexto = ano+"-08-01";
        LocalDate data = LocalDate.parse(dataTexto);
        Integer filtro = 0;
        for (int i = 0; i < 32; i++) {
            if (data.getDayOfWeek().getValue() == 7) {
                filtro++;
                if (filtro == 2) {
                    i = 99;
                }
            }
            if (filtro!=2){
                data = data.plusDays(1);
            }
        }
        return data;
    }

}
