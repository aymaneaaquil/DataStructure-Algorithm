RECURRENCE RELATION: $T(n) = 2T\left( \frac{n}{2} \right)+o(n)$

TIME COMPLEXITY: $O(n\log n)$

Recursive algorithm to sort a data set.
DIVIDE AND CONQUER type of algorithm.
DIVIDE: 
Takes an array, RECURSIVELY divides it into multiple sub-arrays until reaching the base case.
Base Case: 1 element per array.

                  [5,1,9,2,0]
                  
     [5,1]                          [9,2,0]
     
    [5] [1]                      [9]     [2,0]
    
    [5] [1]                      [9]    [2] [0]             BASE CASE

After the base case we "Conquer"

take every sub array

    [5] [1]                      [9]    [2] [0]   
    
      5>1                                 2>0
      
     [1,5]                       [9]     [0,2]
     
     [1,5]                           9>0 --> [0,]
     
                                     9>2 --> [0,2]
                                     
                                     reached last --> [0,2,9]
                                     
     [1,5]                         [0,2,9]
     
                1>0 --> [0]
                
                1<2 --> [0,1]
                
                5>2 --> [0,1,2]
                
                5<9 --> [0,1,2,5]
                
                 9  --> [0,1,2,5,9]
                 

Sorted array: [0,1,2,5,9]



