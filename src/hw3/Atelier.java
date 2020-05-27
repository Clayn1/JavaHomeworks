package hw3;

public class Atelier {
    private Clothes[] clothes;


    public Atelier(Clothes ...clothes) {
        this.clothes = clothes;
    }

    public Clothes[] menChoice(){
        int arrSize = 0;
        for (Clothes clothe : clothes) {
            if (clothe instanceof MaleClothes){
                arrSize++;
            }
        }
        int i = 0;
        Clothes[] maleClothes = new  Clothes[arrSize];
        for (Clothes clothe : clothes) {
            if (clothe instanceof MaleClothes){
                maleClothes[i++] = clothe;
            }
        }
        return maleClothes;
    }
    public Clothes[] womenChoice(){
        int arrSize = 0;
        for (Clothes clothe : clothes) {
            if (clothe instanceof FemaleClothes){
                arrSize++;
            }
        }
        int i = 0;
        Clothes[] femaleClothes = new  Clothes[arrSize];
        for (Clothes clothe : clothes) {
            if (clothe instanceof FemaleClothes){
                femaleClothes[i++] = clothe;
            }
        }
        return femaleClothes;
    }
}
