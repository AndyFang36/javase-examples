package examples.s03;

public class SpaceShip extends SpaceShipControls {
    private String name;

    public SpaceShip(String name) { this.name = name; }

    public String toString() { return name; }

    public static void main(String[] args) {
        SpaceShip protector = new SpaceShip("NASA protector");
        System.out.println(protector);
        protector.up(1);
        protector.down(1);
        protector.left(1);
        protector.right(1);
        protector.forward(1);
        protector.back(1);
        protector.turboBoost();
    }
}