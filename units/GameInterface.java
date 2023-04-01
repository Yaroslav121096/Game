package seminar1.units;

import java.util.ArrayList;

public interface GameInterface {

    void step(ArrayList<BaseHero> enemyTeam);

    String getInfo();

}