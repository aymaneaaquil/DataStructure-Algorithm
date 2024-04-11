Takes smallest element in an unsorted array and place it at the beggining of the "new" array at each iteration. <br/>

$\underline{Time \ Complexity}$ <br/> <br/>
Worst Case: $O(n^2)$ <br/> 
Happens when we want to sort in ascending order but list is in descending order.

Best Case: $\Omega(n)$ <br/>
happens when array is already in order.

Average Case: $\Theta(n^2)$ <br/>
Happens when elements in array are in no particular order <br/>

$\underline{Time \ Complexity}$ <br/> <br/>
$O(n)$

Selection Sort

    selectionSort(Array A)
      int size = lenght of A
      for i = 0 to size - 1 
        int indexOfMin = i
        
        for j = i+1 to size 
          if A[j] < A[indexOfMin] do
            indexOfMin = j

        swap A[i] w/ A[indexOfMin


