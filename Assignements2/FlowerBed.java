package Assignements2;

public class FlowerBed {
    public static boolean canPLaceFlowers(int[] flowerbed, int n){
        int length = flowerbed.length;

        for (int i=0; i<length; i++){
            if (flowerbed[i] == 0 && (i == 0 || flowerbed[i - 1] == 0) && (i == length - 1 || flowerbed[i + 1] == 0)) {
                flowerbed[i] =1;
                n--;
                if(n==0){
                    return  true;
                }
            }
        }
        return false;
    }


    public static void main(String[] args) {
        int[] flowerbed = {1,0,0,0,1};
        int n =2;
        boolean canPlant = canPLaceFlowers(flowerbed, n);
        System.out.println(canPlant);
    }
}
