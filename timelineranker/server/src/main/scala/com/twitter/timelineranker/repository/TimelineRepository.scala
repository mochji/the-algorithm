package com.tw ter.t  l neranker.repos ory

 mport com.tw ter.t  l neranker.model.T  l ne
 mport com.tw ter.t  l neranker.model.T  l neQuery
 mport com.tw ter.ut l.Future

tra  T  l neRepos ory {
  def get(quer es: Seq[T  l neQuery]): Seq[Future[T  l ne]]
  def get(query: T  l neQuery): Future[T  l ne] = get(Seq(query)). ad
}

class EmptyT  l neRepos ory extends T  l neRepos ory {
  def get(quer es: Seq[T  l neQuery]): Seq[Future[T  l ne]] = {
    quer es.map(q => Future.value(T  l ne.empty(q. d)))
  }
}
