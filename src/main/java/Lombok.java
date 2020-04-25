import lombok.SneakyThrows;
import lombok.val;

import java.util.Comparator;
import java.util.stream.Collectors;

public class Lombok {

    @SneakyThrows
    public static void main(String[] args) {
        System.out.println("Lombok Test");
        System.out.println("---------------------------");

        val footballers = new FootballerReader().getFootballers();

        footballers.stream()
                .filter(footballPlayer -> footballPlayer.getNationality().equals("Poland"))
                .sorted(Comparator.comparing(FootballPlayer::getAge))
                .collect(Collectors.toList()).forEach(System.out::println);
    }
}
