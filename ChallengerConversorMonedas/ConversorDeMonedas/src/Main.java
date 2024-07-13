import java.io.IOException;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        Calculo calculo = new Calculo();
        int seleccion;
        double cantidadConvertir;

        //Presentacion
        System.out.println("Bienvenido a este conversor de Divisas\n\n");

        do {
            //Menu
            System.out.println("******************************************************");
            System.out.println("Seleccione el tipo de conversion que desea realizar\n");
            System.out.println("1) Dolar    ->>    P. mxn");//MXN
            System.out.println("2) P. mxn   ->>    Dolar");
            System.out.println("3) Dolar    ->>    R. brl");//BRL
            System.out.println("4) R. brl   ->>    Dolar");
            System.out.println("5) Dolar    ->>    P. cop");//COP
            System.out.println("6) P. cop   ->>    Dolar");
            System.out.println("7) SALIR");
            System.out.println("******************************************************\n");
            seleccion = Integer.valueOf(lectura.nextLine());

            if (0<seleccion && seleccion<7){
                //Monto a convertir
                System.out.print("Ingresa la cantidad que quieres convertir: $");
                cantidadConvertir = Double.valueOf(lectura.nextLine());
                calculo.setCantidadConvertir(cantidadConvertir);
            }

            switch (seleccion){
                case 1:
                    calculo.setTipoDivisa("USD");
                    calculo.setDivisaAConvertir("MXN");
                    calculo.CalculoFinal();
                    break;
                    case 2://MXN
                        calculo.setTipoDivisa("MXN");
                        calculo.setDivisaAConvertir("USD");
                        calculo.CalculoFinal();
                        break;
                    case 3:
                        calculo.setTipoDivisa("USD");
                        calculo.setDivisaAConvertir("BRL");
                        calculo.CalculoFinal();
                        break;
                    case 4:
                        calculo.setTipoDivisa("BRL");
                        calculo.setDivisaAConvertir("USD");
                        calculo.CalculoFinal();
                        break;
                    case 5:
                        calculo.setTipoDivisa("USD");
                        calculo.setDivisaAConvertir("COP");
                        calculo.CalculoFinal();
                        break;
                    case 6:
                        calculo.setTipoDivisa("COP");
                        calculo.setDivisaAConvertir("USD");
                        calculo.CalculoFinal();
                        break;
                    case 7:
                        System.out.println("Hasta luego, vuelva pronto");
                        break;
                    default:
                        System.out.println("Ingrese una opcion valida\n");
                        break;
                }


        }while (seleccion!=7);
    }

}