$\underline{Terminology}$ <br/>
1. Root --> Top node (A)
2. Parents --> Node that have one or multiple child
3. Child --> Node that have a parent (B,C,D,E,F,G,H,I,...)
4. Sibiling --> Nodes that have the same parents ({E,F},{G,H,I},{J,K},{A,B,C},{N,O})
5. Descendent --> All nodes recheable from another node (descendent(D): (G,H,I,L,N,O))
6. Ancestor --> For any nodes, any node in the path from that node to root (ancestor(M): (J,F,B,A))
7. Degree of a nodes --> Number of DIRECT children the node have (deg(B) = 2)
8. Internal node --> All nodes with degree() > 0
9. External node (Leaf) --> All nodes with degree() = 0 
10. Levels --> Starting at 1 with root, each "floor" is a level
11. Height --> Starting at 0 with root, number of edges in the DIRECT PATH until the wanted node
12. Forest --> Collection of tree

$\underline{Tree \ Performance}$ <br/>
| Operation                     | Complexity |
|-------------------------------|------------|
| size, isEmpty                 | O(1)       |
| iterator, positions           | O(n)       |
| replace()                     | O(1)       |
| root, parent                  | O(1)       |
| Children(v)                   | O($C_{v}$) <br/> where $C_{v}$ is the number of children at node C   |
| isInternal, isExternal,isRoot | O(1)       |

# $\underline{Traversals}$ <br/>
## Preorder <br/>
* root is visited first as children are traversed  --> Node is visited before its descendent (Root,Left,Right)<br/>
~~~~
Algorithm preOrder(v)
  visit(v)
  for each child w of v
   preOrder(w)
~~~~
## PostOrder <br/>
* Node is visited after its descendants  (Left,Right,Root)
~~~~
Algorithm postOrder(v)
  for each child w of v
    postOrder(w)
  visit(v)
~~~~


$\underline{Binary\ Tree}$ <br/>

Definition: Tree with a maximum of 2 children. (Children = {0,1,2}) <br/>
Height vs Nodes <br/>
Height of binary tree: $log_{2}(n+1)-1\leq h\leq n-1$ <br/>
Numbers of node in binary tree: $h+1\leq n\leq 2^{h+1}-1$ <br/>

# $\underline{Traversals}$ <br/>
## InOrder <br/>
* Node is visited after its left subtree and before its right subtree (Left,Root,Right)<br/>
~~~~
Algorithm inOrder(v)
  if hasLeft(v)
    inOrder(left(v))
  visit(v)
  if hasRight(v)
    inOrder(right(v))
~~~~

$\underline{Binary\ Tree \ Performance\ (LinkedList)}$ <br/>
| Operation                     | Complexity |
|-------------------------------|------------|
| size, isEmpty                 | O(1)       |
| iterator, positions           | O(n)       |
| replace()                     | O(1)       |
| root, parent, left, right, siblings,children                  | O(1)       |
| Children(v)                   | O(1)   |
| hasLeft, hasRight, isInternal, isExternal,isRoot, remove, insertLeft, insertRight, attach | O(1)       |






