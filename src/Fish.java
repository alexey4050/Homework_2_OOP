public class Fish  extends Waterfowl implements Swimable{
    public Fish(String nickName, int tail, int legs, String skin, String owner) {
        super(nickName, tail, legs, skin, owner);
    }

    @Override
    public Integer swimSpeed() {
        return 20;
    }
    @Override
    public String toString() {
        return "Fish" + super.toString();
    }
}
