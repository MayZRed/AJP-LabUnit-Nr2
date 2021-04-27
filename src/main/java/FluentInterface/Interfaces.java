package FluentInterface;

public interface Interfaces extends CreateIF, PlayerIF, PlayerDetailsIF, AsMasterIF, SetInSpaceIF, SetOnEarthIF, SetUnderwaterIF, FinishIF { }

interface CreateIF extends PlayerIF { }

interface PlayerIF extends AsMasterIF, SetOnEarthIF, SetInSpaceIF, SetUnderwaterIF, FinishIF {
    PlayerIF withPlayer(PlayerDetailsIF... playerDetail);
    Interfaces withAdversary(PlayerIF game);
}

interface PlayerDetailsIF {
    PlayerDetailsIF name(String name);
    PlayerDetailsIF age(int age);
    PlayerDetailsIF level(int level);
}

interface AsMasterIF extends SetUnderwaterIF, SetOnEarthIF, SetInSpaceIF {
    PlayerIF asMaster();
}

interface SetInSpaceIF extends FinishIF {
    PlayerIF setInSpace();
}

interface SetOnEarthIF extends FinishIF {
    PlayerIF setOnEarth();
}

interface SetUnderwaterIF extends FinishIF {
    PlayerIF setUnderwater();
}

interface FinishIF {
    Interfaces finish();
}
