Searchable collection of key-value entries. <br/>
Multiple entries w/ same key are NOT allowed. <br/>

## List Based Map

### Unsorted List

* Store items in a list S (Doubly Linked List) <br/>

Get(k)
~~~
get(k)
    B = s.position (B is an iterator of the positions in list S)
    while B.hasNext() do 
        p = B.next
        if p.element().getKey() = k then
            return p.element().getValue()
    return null
~~~
Put(k,v)
~~~
put(k,v)
    B = S.position()
    while B.hasNext() do 
        p = B.next()
        if p.element().getKey() = k then
            t = p.element().getValue()
            S.set(p,(k,v))
            return t (old value)
    S.addLast((k,v))
    n = n + 1
    return null

~~~

Remove(k)
~~~
remove(k)
    B = S.position()
    while B.hasNext() do 
        p = B.next()
        if p.element().getKey() = k then
            t = p.element().getValue()
            S.remove(p)
            n = n - 1
            return t
    return null

~~~


## Performance of a list based map

| Operation                     | Complexity |
|-------------------------------|------------|
| put()               | $O(n)$       |
| get(),remove()          | $O(n)$       |
