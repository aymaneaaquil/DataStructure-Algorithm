Min Heap: Data structure where each node is smaller than or equal than its children. --> Root is the smallest element. <br/>
Max Heap: Data structure where each node is greater than or equal than its children. --> Root is the biggest element. <br/>

## $\underline{Binary\ Heap}$
Binary tree where every level is completeley filled exept maybe the last one. <br/>
When binary tree is complete, you can store it in an array; <br/>
Node: $i$ <br/>
Left child: $2i +1$ <br/>
Right child: $2i+2$ <br/>
Parent: $\frac{i-1}{2}$ <br/>

When inserting / deleting you need to respect the heap property; <br/>

When node we wantt to change is at the bottom, apply upHeap. <br/>

When node we want to change is a the top, apply downHeap. <br/>

## Insertion: <br/>

1. find insertion node z (new last node).
2. store k at z.
3. restore heap order (up heap).

### Up Heap
* UpHeap restore the heap property by swapping k on an upward path.
* Ends when k reach root OR parent has a key smaller than or equal to k
* Runs in $O(logn)$ since heap has height of $O(logn)$

## Deletion (removeMin()): <br/>

1. return root entry
2. Swap root with last node w.
3. remove w.
4. restore heap order (down heap). 

### Down Heap

* DownHeap restore the heap property by swaping k on a downward path.
* End when k reach a leaf node OR a node whose children have keys greaten than or equal to k.
* Runs in $O(logn)$ since heap has height of $O(logn)$

# $\underline{Binary\ Tree \ Performance\ (LinkedList)}$ <br/>
| Operation                     | Complexity |
|-------------------------------|------------|
| size, isEmpty                 | $O(1)$       |
| min()           | $O(n)$       |
| insert()                    | $O(logn)$       |
| removeMin()                 | $O(logn)$       |











