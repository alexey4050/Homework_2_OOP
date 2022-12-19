import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class AlbumWaterfowls {
    public void save(List<Waterfowl> waterfowls) {
        try (FileWriter writer = new FileWriter("album", false)) {
            for (Waterfowl item : waterfowls) {
                writer.write(item.toString() + "\n");
            }
            writer.flush();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}


