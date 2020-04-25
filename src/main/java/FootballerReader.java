import lombok.Cleanup;
import lombok.val;

import java.util.ArrayList;
import java.util.Scanner;


public class FootballerReader {

    public ArrayList<FootballPlayer> getFootballers(){
        @Cleanup Scanner scanner = new Scanner(Lombok.class.getResourceAsStream("/fifa18_clean.csv"));

        val players = new ArrayList<FootballPlayer>();
        val NAME_INDEX = 2;
        val AGE_INDEX = 3;
        val NATIONALITY_INDEX = 5;
        val CLUB_INDEX = 9;

        scanner.nextLine();
        while(scanner.hasNextLine()){
        val line = scanner.nextLine().split(",");
            players.add(new FootballPlayer(line[NAME_INDEX], Integer.parseInt(line[AGE_INDEX]), line[NATIONALITY_INDEX], line[CLUB_INDEX]));
        }

        return players;
    }



}