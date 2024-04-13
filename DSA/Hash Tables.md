Stores element in key value pairs.

## Hashing
Process of getting a new index where to store the value using the key. <br/>

Let k be a key and h(x) be a hash function --> h(k) will give you a new index to store the element linked with k. <br/>

### Hash functions

Usualy specified as the composition of two functions.
1) Hash code: mapping key to integer
2) Compression function: Compress integer from (1) to array size.




### Hash colisions
When hash function generate the same index for multiple keys. <br/>
Can be resolved using one of the following: <br/> 
* Chaining
* Open addressing

#### Chaining

If hash function gives the same index. The elements are stored in the same index using a doubly linked list.

#### Open Addressing

No index has more than one element. <br/>
Collision will be handled with different techniques. <br/>

1. Linear probing <br/>
if Hash Code for entry (k,v) indicates that it should go into A[i] but A[i] is used, attempt insertion at $A[(i+1) mod\ n]$, $A[(i+2) mod\  n]$.... (circularly)
2. Quadratic probing <br/>
If Hash Code for entry (k,v) indicates that it should go into A[i] but A[i] is used, attempt insertion at $A[(i+1^2) mod\ n]$, $A[(i+2^2) mod\  n]$.... (circularly)
3. Double hashing <br/>


