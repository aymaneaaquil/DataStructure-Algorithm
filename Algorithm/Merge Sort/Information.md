RECURRENCE RELATION: $T(n) = 2T\left( \frac{n}{2} \right)+o(n)$

TIME COMPLEXITY: $O(n\log n)$ <br/>
--> list of size $n$ is always divided into a max of $log n$ parts and merging all sublist takes time <br /> Best case = worst case = average case

Algorithm based on DIVIDE and CONQUER to sort an array. <br/>
Will divide the array in 2 parts at each iteration until reaching the base case (1 element per array) <br/>
Once base case is reached, it will compare every subarray starting from bottom and sort them.

MergeSort

    mergeSort(Array A)
    
        if A < 2
            return
            
        Int mid = A/2
        Array B w/ size mid
        Array C w/ size A length - mid

        for i = 0 to mid do 
            B[i] = A[i]

        for i = mid to A do
            C[i] = A[i]

        mergeSort(B)
        mergeSort(C)
        merge(A,B,C)
Merge

    merge(Arrays A,B,C)
        integers i,j,k

        while i < B AND j < C do 
            if B[i] <= C[j] do 
                A[k] = B[i]
                i++
            else 
                A[k] = C[j] 
                j++
            k++

        while i < B do 
            A[k] = B[i] 
            i++
            k++

        while j < C do 
            A[k] = C[j] 
            j++ 
            k++


            
    

<img src="https://www.programiz.com/sites/tutorial2program/files/merge-sort-example_0.png" alt="alt text" width="500" height="350">


    
