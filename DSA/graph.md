 |   for simple graph  |Edge List|Adjacency list|Adjacency matrix|
|--------|--------|--------|--------|
| Space |n+m |n+m| $n^2$ |
| incidentEdges(v) |m |deg(v)| n |
| areAdjacent(v,w) |m |min(deg(v),deg(w))| 1 |
| insertVertex(o) |1 |1| $n^2$ |
| insertEdge(v,w,o) |1 |1| 1 |
| removeVertex(v) |m |deg(v)| $n^2$ |
| removeEdge(e) |1 |1| 1 |


Order (Number of vertices) = $|V|$ <br/>
Size (Number of edges) = $|E|$ <br/>

Propertie (n: number of vertices and m: number of edges): <br/>

1. $\sum_{v}deg(v)=2m$ for undiredcted graphs <br/>
2. $\sum_{v}indeg(v)=\sum_{v}outdeg(v) =m$ for directed graphs.<br/>
3. $m\leq \frac{n(n-1)}{2}$ for undirected graphs<br/>


| Degree of v     | name     |
|--------|--------|
| 0 | isolated vertex |
| 1 | end vertex (leaf) |
| 2n | even vertex |
| 2n+1 | odd vertex |

Eulerian path/cycles: path/cycle that visits all edges exactly once.(You can visit the vertices more than once) <br/>
Hamiltonian path/cycles: path/cycle that visits all vertices exactly once. <br/>

BFS vs DFS <br/>

BFS: uses queue <br/>
DFS: uses stack <br/>

| Application     | DFS     |BFS|
|--------|--------|--------|
| Spanning forest,connected components,path,cycles | x |x|
| Shortest path |  |x|
| Biconnected components | x ||

DFS: <br/>
~~~
 function DFS(G, v)
    visit(v)
      for w in G.neighbors(v) do
        dfs(G,w)
 ~~~



