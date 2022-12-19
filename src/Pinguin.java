public class Pinguin extends Waterfowl implements Swimable{
    public Pinguin(String nickName, int tail, int legs, String skin, String owner) {
        super(nickName, tail, legs, skin, owner);
    }

    @Override
    public Integer swimSpeed() {
        return 60;
    }

    @Override
    public String toString() {
        return "Pinguin" + super.toString();
    }
}
