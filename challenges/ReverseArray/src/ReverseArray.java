public class ReverseArray {
    public static void main(String[] args) {
        int [] testArr = {1,2,3};
        System.out.println(reverseArray(testArr)[0]);
    }

    public static int [] reverseArray(int [] arr){
        int[] tempArr = new int[arr.length] ;
        int indexArr = arr.length - 1;
        for(int i =0 ; i < arr.length ; i++){
            tempArr[i] = arr[indexArr];
            indexArr--;
        }
        return  tempArr ;
    }
}
