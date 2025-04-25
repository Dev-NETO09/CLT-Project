package calculadora.imc;

public class Imc {

    int altura;
    int peso;
    double imc;

    public Imc(int altura, int peso) {
        this.altura = altura;
        this.peso = peso;

        double alturaMetro = altura / 100.0;
        this.imc = peso / (alturaMetro * alturaMetro);
    }

    public double getImc() {
        return this.imc;
    }

    public String statusImc() {
        if (this.imc < 18.5) {
            return "Baixo peso";

        } else if (this.imc < 25.0) {
            return "normal";

        } else if (this.imc < 30.0) {
            return "obes I";

        } else if (this.imc < 35.0) {
            return "obes I";

        } else if (this.imc < 40.0) {
            return "obes II";

        } else {
            return "Obeso III";
        }
    }
}
