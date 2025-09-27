package fundamentals.fuelefficiencytracker;

import java.util.Scanner;

public class FuelEfficiencyTracker {
    public static void main(String[] Args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to: 'Fuel Efficiency Tracker'");
        System.out.println("Lets simular the cost of fuel");


        System.out.println("Qual a distância pecorrida? (KM):");
        float simularKm = sc.nextFloat();

        System.out.println("Qual a quantidade de gasolina gasta (L)");
        float simularLitro = sc.nextFloat();


        System.out.println(calculo(simularKm, simularLitro) + "KM/L");
    }

    private static float calculo(float distancia, float fuel) {
        if (distancia <= 0 || fuel <= 0) {
            System.out.println("Valor informado não aceito!");

        } else {
            return (distancia / fuel);
        }
    }



