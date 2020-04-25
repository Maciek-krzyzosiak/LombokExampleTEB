import lombok.*;

@Data
public class FootballPlayer {
    @NonNull private String name;
    @NonNull private int age;
    @NonNull private String nationality;
    @NonNull private String club;
}