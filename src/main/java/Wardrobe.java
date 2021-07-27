import java.util.ArrayList;
import java.util.List;

public class Wardrobe {

    private int limit;
    private List<Hanger> hangers = null;

    public Wardrobe (int limit) {
        hangers = new ArrayList<Hanger>();
        this.limit = limit;
        fillWardrobe();
    }

    private void fillWardrobe() {
        for (int i=0; i<limit; i++){
            if (i % 2==0 ){
                hangers.add(new ShirtHanger());
            } else {
                hangers.add(new SkirtHanger());
            }
        }
    }

    public Hanger getEmptyHanger() {

    }

}
