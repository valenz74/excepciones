import java.util.Scanner;
public class Excepciones {
    public static void main(String[] args) {
        /*
        EXCEPCIONES: Sirven para controlar errores "poco" frecuentes. Controla errores
        en tiempo de ejecucion.
        SINTAXIS:
        try {
            En este bloque se coloca el código que puede tener errores en tiempo
            de ejecución.
        }
        catch (Parametros de excepcion) {
            Manejamos la excepcion
        }
        finaly (opcional) {
            En este bloque colocaremos lo que queremos que se ejecute ocurra o no
            ocurra una excepcion.
        }
         */
        //Creamos el objeto Escanner para capturar los datos:
        Scanner sc = new Scanner(System.in);
        //Le decimos a la persona que es un programa para dividir:
        System.out.println("Programa para Dividir");
        System.out.println();
        //Definimos las 3 variables que se van a necesitar
        int numerador, denominador, resultado;
        //Pedimos que se digiten los dos valores:
        System.out.println("Digite el Numerador : ");
        //Solicitar que se digite el valor par el numerador:
        numerador = sc.nextInt();
        //Hacemos los mismo con el denominador:
        System.out.println("Digite el denominador : ");
        denominador = sc.nextInt();
        //Calcular el resultado:
        try {
            resultado = numerador / denominador;
            System.out.println("El resultado es : " + resultado);
            //Aqui puede venir mas codigo

        } catch (ArithmeticException ae) {
            System.out.println("No se puede dividir por cero");
            //Aqui puede venir mas codigo

        } finally {
            System.out.println("Esta linea siempre se ejecuta");
        }
        //Mostramos resultados en pantalla:

        System.out.println("Programa Terminado");
    }
}
