public static void insertionSort(int[] A){
        for(int i = 1; i < A.length; i++){
            int current = A[i];
            int j = i - 1;
            while(j >= 0 && A[j] > current){
                A[j + 1] = A[j];
                j--;
            }
            A[j+1] = current;
        }
    }
