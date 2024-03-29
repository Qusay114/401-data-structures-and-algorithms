import java.util.Arrays;

public class ArrayInsertShift {
    public static void main(String[] args){
        int [] testArr = {42,8,15,23} ;
        System.out.println(Arrays.toString(insertShiftArray(testArr , 3)));

    }

    public static int[] insertShiftArray(int[] arr , int newValue){
        int[] tempArr = new int[arr.length + 1];
        int shiftIndex = 0 ;
        for(int i = 0 ; i < arr.length ; i++){
            if( i == (Math.ceil(((float)arr.length / 2))))
            {
                tempArr[i] = newValue ;
                shiftIndex = 1 ;
            }
            tempArr[i + shiftIndex] = arr[i] ;
        }
        return  tempArr ;
    }
}
