This is lecture notes for 'Union-Find' 


#### Dynamic Connectivity

Steps to developing a usable algorithm
* model the problem
* find an algorithm to solve
* fast enough?
* if not, figure out why
* find a way to address the problem
* iterate until satisfied

union command: connect two objects (ex: connected(0, 7))
find/connected query: is there a path connecting the two objects?(ex: union(5, 0))

Modeling the connections:
* reflexive: p is connected to p
* symmetric: if p is connected to q, then q is connected to p
* transitive: if p is connected to q and q is connected to r, then p is connected to r

Connected components: 
* Maximal set of objects that are mutually connected.
{ 0 } { 1 4 5 } { 2 3 6 7 }
 
### Quick Find (eager approach)

- data structure:
  - integer array id[] of size N
  - interpretation: p and q are connected iff (if and only if) they have the same id


### Quick Union (lazy approach)

- quick find is too slow because it has to check all element items
- 


 
