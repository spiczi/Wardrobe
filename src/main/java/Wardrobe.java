import java.util.ArrayList;
import java.util.List;

public class Wardrobe {

    private int limit;
    private List<Hanger> hangers = null;

    public Wardrobe(){
        hangers = new ArrayList<Hanger>();
        this.limit = limit;
        fillWardrobe();
    }

    private void fillWardrobe(){
        for (int i = 0; i < limit; i++) {
            if (i % 2 == 0) {
                hangers.add(new ShirtHanger());
            } else {
                hangers.add(new SkirtHanger());
            }
        }
    }

    public Hanger getEmptyHanger(Clothes c) {
        int index = -1;

        for (int i = 0; i < hangers.size(); i++) {
            try {
                if (hangers.isEmpty()) {
                    index = i;

                    return hangers.get(i);
                }
            } catch (Exception e) {
            }
        }hangers.remove(index);
        return null;

    }
    public void addClotes(Hanger h) throws WardrobeLimitReached{
        if(hangers.size()>=limit){
            throw new WardrobeLimitReached();
        }else {
            hangers.add(h);
        }
    }

}