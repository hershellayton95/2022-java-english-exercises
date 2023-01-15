package javainproduction._2;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Set<WaterBottle> waterBottles = Set.of(
                new WaterBottle(1_000, "Bronze"),
                new WaterBottle(2_000, "Red"),
                new WaterBottle(500, "Blue"),
                new WaterBottle(750, "Bronze")
        );
        javaStreamsFiltering(waterBottles);
    }

    private static void javaStreamsFiltering(Set<WaterBottle> waterBottles) {
        System.out.println(
                waterBottles.stream()
                .filter(waterBottle -> waterBottle.colour().equals("Bronze"))
                .map(waterBottle -> waterBottle.capacityInMl())
                .collect(Collectors.toSet()));
    }
}
