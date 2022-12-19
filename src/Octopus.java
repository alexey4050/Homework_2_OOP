public class Octopus extends Waterfowl implements Swimable {
    public Octopus(String nickName, int tail, int legs, String skin, String owner) {
        super(nickName, tail, legs, skin, owner);
    }

    @Override
    public Integer swimSpeed() {
        return 40;
    }
    @Override
    public String toString() {
        return "Octopus" + super.toString();
    }
}
