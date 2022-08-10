package examples.s03;

import static net.mindview.util.Print.print;

public class SpaceShipDelegation {
    private String name;
    private SpaceShipControls controls = new SpaceShipControls();

    public SpaceShipDelegation(String name) { this.name = name; }

    public void turboBoost() { controls.turboBoost(); }

    public void up(int velocity) { controls.up(velocity); }

    public void down(int velocity) { controls.down(velocity); }

    public void left(int velocity) { controls.left(velocity); }

    public void right(int velocity) { controls.right(velocity); }

    public void forward(int velocity) { controls.forward(velocity); }

    public void back(int velocity) { controls.back(velocity); }

    public String toString() { return this.name; }

    public static void main(String[] args) {
        SpaceShipDelegation protector = new SpaceShipDelegation("NASA protector");
        print(protector);
        protector.up(1);
        protector.down(1);
        protector.left(1);
        protector.right(1);
        protector.forward(1);
        protector.back(1);
        protector.turboBoost();
    }
}