public class SkirtHanger extends Hanger {
    private Clothes up=null;


    @Override
    public boolean isEmpty(Clothes clothes) throws NotSuitableHanger{
        if(clothes instanceof Blues || clothes instanceof Shirt){
           return up==null;
        }else throw new NotSuitableHanger();

    }

    @Override
    public void addClothes(Clothes c) throws NotEmptyHanger, NotSuitableHanger {
        if(isEmpty(c)){
            up = c;
        }else {throw new NotEmptyHanger();}
    }



}
