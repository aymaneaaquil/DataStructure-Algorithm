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


$\underline{Binary\ Tree}$ <br/>

Definition: Tree with a maximum of 2 children. (Children = {0,1,2}) <br/>
Height vs Nodes <br/>
-If you are given heigth h: <br/>
min nodes: $n=h+1$ <br/>
max nodes: $n=2^{h+1}-1$ <br/>



