package FluentInterface;

public class Game implements Interfaces {

    @Override
    public PlayerIF withPlayer(PlayerDetailsIF... playerDetail) {
        return this;
    }

    @Override
    public Game withAdversary(PlayerIF game) {
        return this;
    }

    @Override
    public PlayerDetailsIF age(int age) {
        return this;
    }

    @Override
    public PlayerDetailsIF level(int level) {
        return this;
    }

    @Override
    public PlayerDetailsIF name(String name) {
        return this;
    }

    @Override
    public PlayerIF asMaster() {
        return this;
    }

    @Override
    public PlayerIF setInSpace() {
        return this;
    }

    @Override
    public PlayerIF setOnEarth() {
        return this;
    }

    @Override
    public PlayerIF setUnderwater() {
        return this;
    }

    public static Game createGame() {
        return new Game();
    }

    @Override
    public Game finish() {
        return this;
    }
}
