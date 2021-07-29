public abstract class Hanger {

    public abstract boolean isEmpty(Clothes clothes)throws NotSuitableHanger;

    public abstract void addClothes(Clothes c) throws NotEmptyHanger,NotSuitableHanger;


}
