RECURRENCE RELATION: $T(n) = 2T\left( \frac{n}{2} \right)+o(n)$

TIME COMPLEXITY: $O(n\log n)$ <br/>
--> list of size $n$ is always divided into a max of $log n$ parts and merging all sublist takes time <br /> Best case = worst case = average case

Algorithm based on DIVIDE and CONQUER to sort an array. <br/>
Will divide the array in 2 parts at each iteration until reaching the base case (1 element per array) <br/>
Once base case is reached, it will compare every subarray starting from bottom and sort them.

<img src="https://www.programiz.com/sites/tutorial2program/files/merge-sort-example_0.png" alt="alt text" width="500" height="350">


    
