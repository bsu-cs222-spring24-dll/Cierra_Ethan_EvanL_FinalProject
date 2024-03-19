package cs.edu.bsu;
import java.util.ArrayList;
public class JsonArray {

    ArrayList<JsonObject> array = new ArrayList<JsonObject>();
    public int size() {
    return 0;
    }

    public JsonObject getJsonObject(int i) {

        return array.get(i);
    }
}
