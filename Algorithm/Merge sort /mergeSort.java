public class mergeSort {
    public static void mergeSort(int[] A){
        int length = A.length;
        int midPoint = length/2;

        if(length<2){
            return;
        }

        int [] leftSide = new int[midPoint];
        int [] rightSide = new int[length-midPoint];

        for(int i = 0; i<midPoint; i++){
            leftSide[i] = A[i];
        }
        for(int i = midPoint; i<length; i++){
            rightSide[i - midPoint] = A[i];
        }

        mergeSort(leftSide);
        mergeSort(rightSide);
        merge(A, leftSide, rightSide);
    }


    private static void merge(int [] A, int [] leftArray, int [] rightArray){
        int leftSize = leftArray.length;
        int rightSize = rightArray.length;

        int i = 0 ,j = 0 ,k = 0;

        while(i<leftSize && j <rightSize){
            if(leftArray[i] <= rightArray[j]){
                A[k] = leftArray[i];
                i++;
            }
            else{
                A[k] = rightArray[j];
                j++;
            }
            k++;
        }

        while(i < leftSize){
            A[k] = leftArray[i];
            i++;
            k++;
        }
        while(j < rightSize){
            A[k] = rightArray[j];
            j++;
            k++;
        }
    }
}
