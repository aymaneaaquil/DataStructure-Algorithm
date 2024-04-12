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

Insertion: <br/>










