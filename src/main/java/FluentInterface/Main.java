package FluentInterface;

import static FluentInterface.PlayerDetails.*;

public class Main {
    Game g1 = new Game();
    Game g2 = new Game();

    Game g3 = (Game) Game.createGame()
            .withPlayer( name("Zed"), age(31), level(13) )
            .withPlayer( name("Zoe"), age(1023), level(15) )
            .withPlayer( name("Nocturne"), age(597), level(16) ).asMaster()
            .withAdversary(g1)
            .setOnEarth()
            .withPlayer( name("Fizz"))
            .withPlayer( age(27), level(18))
            .withAdversary(g2.withPlayer( name("Jinx"), level(12)).setInSpace().finish())
            .finish();
}
