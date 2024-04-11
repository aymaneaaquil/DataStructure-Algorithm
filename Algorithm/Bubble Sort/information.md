Each iteration you decrease the reached element by 1 <br/>
First: n-1 <br/>
Second: n-2 <br/>
Third: n-3 <br/>
... <br/>
Last: 1 <br/>
You decrease the reached element by 1 at each iteration because last element after an iteration is always sorted.

$\underline{TIME \ COMPLEXITY}$ <br/>
Worst Case: $O(n^2)$ <br/>
Happens when trying to sort in ascending order but list is in descneding order. <br/>
Best Case: $\Omega(n)$ <br/>
Happens when input array is already sorted<br/>
Average Case: $\Theta(n^2)$ <br/>
Happens when elements in array are in no particular order <br/>

$\underline{SPACE \ COMPLEXITY}$ <br/>
$O(n)$

Bubble Sort

    bubbleSort(Array A) 
      for i = 0 to A size - 1 
        swapped = false
        for j = 0 to A size - i - 1 
          if A[j] > A[j+1] do 
            swap(j,j+1)
            swapped = true
        if !swapped do
          end bubbleSort()

        
      








