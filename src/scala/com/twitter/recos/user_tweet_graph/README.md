# UserT etGraph (UTG)

## What  s  
User T et Graph (UTG)  s a F nalge thr ft serv ce bu lt on t  GraphJet fra work.  n ma nta ns a graph of user-t et engage nts and serves user recom ndat ons based on traversals of t  graph.

## How  s   used on Tw ter
UTG recom nds t ets based on collaborat ve f lter ng & random walks. UTG takes a set of seed users or seed t ets as  nput, and performs
1-hop, 2-hop, or even 3+hop traversals on t  engage nt graph.
UTG's user-t et engage nt edges are b -d rect onal, and t  enables   to perform flex ble mult -hop traversals. T  fl ps de to t   s 
UTG  s more  mory demand ng compared to ot r GraphJet serv ces l ke UTEG, whose engage nt edges are s ngle d rect onal. 

UTG  s a stateful serv ce and rel es on a Kafka stream to  ngest & pers st states. T  Kafka stream  s processed and generated by Recos- njector. 
  ma nta ns an  n- mory user engage nts over t  past 24-48 h s. Older events are dropped and GC'ed. 

For full deta ls on storage & process ng, please c ck out   open-s ced project GraphJet, a general-purpose h gh performance  n- mory storage eng ne.
- https://g hub.com/tw ter/GraphJet
- http://www.vldb.org/pvldb/vol9/p1281-sharma.pdf
