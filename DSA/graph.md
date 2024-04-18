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
Size (Number of edges) = $|E|$
