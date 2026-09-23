package school.sptech.ex03;

public class Data {

    private Integer dia;
    private Integer mes;
    private Integer ano;

    public Integer getAno() {
        return ano;
    }

    public Integer getMes() {
        return mes;
    }

    public Integer getDia() {
        return dia;
    }

    public void definirData(Integer d, Integer m, Integer a) {
        if (d == null || m == null || a == null) return;

        if (a < 0 || m < 1 || m > 12 || d < 1 || d > 31) {
            return;
        }

        Integer diasNoMes;

        if (m == 2) {
            Boolean anoBissexto = (a % 400 == 0) || (a % 4 == 0 && a % 100 != 0);
            diasNoMes = anoBissexto ? 29 : 28;
        } else if (m == 4 || m == 6 || m == 9 || m == 11) {
            diasNoMes = 30;
        } else {
            diasNoMes = 31;
        }

        if (d <= diasNoMes) {
            dia = d;
            mes = m;
            ano = a;
        }
    }

    public String formatarData() {
        String ano = getAno().toString();
        if (getAno() < 1000 && getAno() > 99) {
            ano = "0" + getAno();
        } else if (getAno() < 100 && getAno() > 9) {
            ano = "00" + getAno();
        } else if (getAno() < 10) {
            ano = "000" + getAno();
        }
        if (getDia() < 10 && getMes() > 9) {
            return "0" + getDia() + "/" + getMes() + "/" + ano;
        } else if (getDia() >= 10 && getMes() < 10) {
            return getDia() + "/0" + getMes() + "/" + ano;
        } else if (getMes() < 10 && getDia() < 10) {
            return "0" + getDia() + "/0" + getMes() + "/" + ano;
        } else {
            return getDia() + "/" + getMes() + "/" + ano;
        }
    }

    public Integer compararDatas(Integer d, Integer m, Integer a) {
        if(a == null || m == null || d == null) return null;
        if (a > getAno()) {
            return 1;
        } else if (a < getAno()) {
            return -1;
        }
        if (m > getMes()) {
            return 1;
        } else if (m < getMes()) {
            return -1;
        }
        if (d > getDia()) {
            return 1;
        } else if (d < getDia()) {
            return -1;
        }
        return 0;
    }


}
