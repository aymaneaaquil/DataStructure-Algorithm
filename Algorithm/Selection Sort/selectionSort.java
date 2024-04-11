public static void selectionSort(int [] A){
        int size = A.length;
        for(int i = 0; i<size - 1; i++){
            int indexOfMin = i;
            for(int j = i+1; j < size; j++){
                if(A[j] < A[indexOfMin]){
                        indexOfMin = j;
                }
            }
            int temp = A[i];
            A[i] = A[indexOfMin];
            A[indexOfMin] = temp;
        }
    }
