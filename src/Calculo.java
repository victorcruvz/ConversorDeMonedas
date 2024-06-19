import java.io.IOException;
import java.util.Map;

public class Calculo {
    private String tipoDivisa;
    private String divisaAConvertir;
    private double cantidadConvertir;
    private double resultado;

    public String getTipoDivisa() {
        return tipoDivisa;
    }
    public void setTipoDivisa(String tipoDivisa) {
        this.tipoDivisa = tipoDivisa;
    }

    public double getCantidadConvertir() {
        return cantidadConvertir;
    }
    public void setCantidadConvertir(double cantidadConvertir) {
        this.cantidadConvertir = cantidadConvertir;
    }

    public double getResultado() {
        return resultado;
    }
    public void setResultado(double resultado) {
        this.resultado = resultado;
    }

    public String getDivisaAConvertir() {
        return divisaAConvertir;
    }
    public void setDivisaAConvertir(String divisaAConvertir) {
        this.divisaAConvertir = divisaAConvertir;
    }

    public void CalculoFinal(){
        ConsultaDivisa consulta = new ConsultaDivisa();
        try {
            Divisa divisa = consulta.buscaDivisa(tipoDivisa);
            Map<String, Double> conversionRates = divisa.conversion_rates();
            double allRate = conversionRates.get(divisaAConvertir);
            //Obtener el resultado de la divisa
            resultado = cantidadConvertir * allRate;
            //System.out.println(divisa);
            //Crear el archivo de historial
            GeneradorDeArchivo generador = new GeneradorDeArchivo();
            generador.guardarJson(divisa,divisaAConvertir,cantidadConvertir,resultado);
            //Imprimiendo el resultado
            System.out.println("El resultado de la conversion es: $"+resultado+" "+divisaAConvertir+"\n\n");
        }catch (NumberFormatException e){
            System.out.println("Divisa no encontrada "+e.getMessage());
        }catch(RuntimeException | IOException e){
            System.out.println(e.getMessage());
        }
    }

}
