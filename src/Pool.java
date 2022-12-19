import java.util.ArrayList;
import java.util.List;

public class Pool {
    public List<Waterfowl> getWaterfowls(){
        return waterfowls;
    }
    private List<Waterfowl> waterfowls = new ArrayList<>();

    public Pool addWaterfowl(Waterfowl waterfowl){
        waterfowls.add(waterfowl);
        return this;
    }

    @Override
    public String toString() {
        return "Pool{" +
                "waterfowl=" + waterfowls +
                '}';
    }
    public List<Swimable> getSwimable() {
        List<Swimable> swimables = new ArrayList<>();
        for (Waterfowl item : waterfowls) {
            if (item instanceof Swimable) {
                swimables.add((Swimable) item);
            }
        }
        return swimables;
    }
    public int getChampionSpeed() {
        int max = 0;
        for (Swimable item : getSwimable()) {
            if (item.swimSpeed() > max) {
                max = item.swimSpeed();
            }
        }
        return max;
    }

}
