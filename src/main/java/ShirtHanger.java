public class ShirtHanger extends Hanger{

    private Clothes up = null;
    private Clothes down = null;

    @Override
    public boolean isEmpty(Clothes clothes) {
        if (clothes instanceof Blues || clothes instanceof Shirt) {
            return up == null;
        } else {
            return down == null;
        }
    }

    @Override
    public void addClothes (Clothes c) throws NotEmptyHanger {
        if (isEmpty(c)) {
            if (c instanceof Blues || c instanceof Shirt) {
                up = c;
            } else {
                down = c;
            }
        } else {
            throw new NotEmptyHanger();
        }
    }
}
