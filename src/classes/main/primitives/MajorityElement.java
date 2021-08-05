package classes.main.primitives;

public class MajorityElement {


    public static void main(String[] args) {
        int[] inputtedArray = {2,2,1,1,1,2,2};
        int maxValue = 0;


        for (int value : inputtedArray){
            if (value > maxValue){
                maxValue = value;
            }
        }

        int[] indexedArray = new int[maxValue + 1];

        for(int value : inputtedArray){
            indexedArray[value]++;
        }

        for(int i = 0; i< indexedArray.length; i++){
            if(indexedArray[i] > inputtedArray.length / 2 ){
                System.out.format("Majority value = %s", i);
                break;
            }
        }

    }
}
