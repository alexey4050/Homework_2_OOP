public abstract class Waterfowl {
    private String nickName;
    private int tail;
    private int legs;
    private String skin;
    private  String owner;



    public String getNickName() {
        return nickName;
    }

    public int getTail() {
        return tail;
    }

    public int getLegs() {
        return legs;
    }

    public String getSkin() {
        return skin;
    }

    public String getOwner() {
        return owner;
    }
    public Waterfowl(String nickName, int tail, int legs, String skin, String owner) {
        this.nickName = nickName;
        this.tail = tail;
        this.legs = legs;
        this.skin = skin;
        this.owner = owner;
    }

    @Override
    public String toString() {
        return "{" +
                "nickName='" + nickName + '\'' +
                ", tail=" + tail +
                ", legs=" + legs +
                ", skin='" + skin + '\'' +
                ", owner='" + owner + '\'' +
                '}';
    }


}
