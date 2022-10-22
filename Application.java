import java.util.Arrays;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite quantas temperaturas serão transformadas: ");
        int n = sc.nextInt();

        if (n <= 0){
            System.out.println("Quantidade inválida");
        } else {
        System.out.printf("1- Celsius %n2- Fahrenheit %n3- Kelvin %nDigite a unidade de origem da temperatura: ");
        int origem = sc.nextInt();

        System.out.println();

        System.out.printf("1- Celsius %n2- Fahrenheit %n3- Kelvin %nDigite a unidade para qual a temperatura deve ser transformada: ");
        int destino = sc.nextInt();

        if (origem > 3 || destino > 3){
            System.out.println("Operação inválida");

        } else {
            System.out.println();

            double[] temperaturas = new double[n];
            double[] temperaturasTransformadas = new double[n];

            for (int i = 0; i < n; i++){
                System.out.println("Digite a temperatura: " );
                temperaturas[i] = sc.nextDouble();
            }

            double soma = 0;
            for (int i = 0; i < temperaturas.length; i++){
                soma += temperaturas[i];
            }

            double media = soma/temperaturas.length;

            for (int i = 0; i < temperaturas.length; i++){
                if (origem == 1 && destino == 2){
                    System.out.println(temperaturas[i] + " Graus Celsius" + " -> " + "Unidade escolhida: Fahrenheit" + " -> " + celsiusToFahre(temperaturas[i]) + " Graus Fahrenheit");
                    temperaturasTransformadas[i] = celsiusToFahre(temperaturas[i]);
                } else if (origem == 1 && destino == 3){
                    System.out.println(temperaturas[i] + " Graus Celsius" + " -> " + "Unidade escolhida: Kelvin" + " -> " + celsiusToKelvin(temperaturas[i]) + " Graus Kelvin");
                    temperaturasTransformadas[i] = celsiusToKelvin(temperaturas[i]);
                } else if (origem == 2 && destino == 1){
                    System.out.println(temperaturas[i] + " Graus Farenheit" + " -> " + "Unidade escolhida: Celsius" + " -> " + farehToCelsius(temperaturas[i]) + " Graus Celsius");
                    temperaturasTransformadas[i] = farehToCelsius(temperaturas[i]);
                } else if (origem == 2 && destino == 3){
                    System.out.println(temperaturas[i] + " Graus Farenheit" + " -> " + "Unidade escolhida: Kelvin" + " -> " + farehToKelvin(temperaturas[i]) + " Graus Kelvin");
                    temperaturasTransformadas[i] = farehToKelvin(temperaturas[i]);
                } else if (origem == 3 && destino == 1){
                    System.out.println(temperaturas[i] + " Graus Kelvin" + " -> " + "Unidade escolhida: Celsius" + " -> " + kelvinToCelsius(temperaturas[i]) + " Graus Celsius");
                    temperaturasTransformadas[i] = kelvinToCelsius(temperaturas[i]);
                } else if (origem == 3 && destino == 2){
                    System.out.println(temperaturas[i] + " Graus Kelvin" + " -> " + "Unidade escolhida: Fahrenheit" + " -> " + kelvinToFahre(temperaturas[i])+ " Graus Fahrenheit");
                    temperaturasTransformadas[i] = kelvinToFahre(temperaturas[i]);
                }
            }

            int soma2 = 0;
            for (int i = 0; i < temperaturas.length; i++){
                soma2 += temperaturasTransformadas[i];
            }
            double mediaFinal = (double) soma2 / temperaturasTransformadas.length;

            System.out.println("A média das temperaturas inicias é: "+ media);
            System.out.println("A média das temperaturas transformadas é: "+ mediaFinal);
        }
        }
    }

    //Celsius para Kelvin e Fahrenheit.
    public static double celsiusToKelvin(double celsius){
        double kelvin = (celsius + (double) 273.15 );
        return kelvin;
    }
    public static double celsiusToFahre(double celsius){
        double fahrenheit = (celsius * (double) 9/5) + 32;
        return fahrenheit;
    }

    //Kelvin para Celsius e Fahrenheit.
    public static double kelvinToCelsius(double kelvin){
        double celsius = (kelvin - (double) 273.15 );
        return celsius;
    }

    public static double kelvinToFahre(double kelvin){
        double fahrenheit = ((kelvin - (double) 273.15 ) * ((double) 9/5) + 32);
        return fahrenheit;
    }

    //Fahrenheit para Celsius e Kelvin
    public static double farehToCelsius(double fahrenheit){
        double celsius = (double) ((fahrenheit - 32)/9) * 5;
        return celsius;
    }

    public static double farehToKelvin(double fahrenheit){
        double kelvin = (fahrenheit - 32) * ((double) 5/9) + ((double) 273.15);
        return kelvin;
    }
}

