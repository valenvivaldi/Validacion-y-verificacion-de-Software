module grafos

sig Grafo{
	nodos : set Nodo,
	arcos:nodos->nodos

}

sig Nodo{

}

pred aciclico(g:Grafo){
 	all  n:g.nodos | n not in n.^(g.arcos )

}

pred nodirigido (g:Grafo){
	 all n,n1:g.nodos | n1 in n.(g.arcos) implies n in n1.(g.arcos)
}

pred completo (g:Grafo){
	 all n,n1:g.nodos | n != n1 implies n1 in n.(g.arcos)
}


pred conexo (g:Grafo){
	 all n,n1:g.nodos | n != n1 implies n1 in n.^(g.arcos) or n in n1.^(g.arcos)
}

pred fuertementeconexo (g:Grafo){
	all n,n1:g.nodos | n != n1 implies n1 in n.^(g.arcos) and  n in n1.^(g.arcos)
}

assert completoCiclico{
	all g:Grafo |    (not(no g.nodos)   and completo[g]) implies not aciclico[g]
}

assert completoCiclico2{
	//completo[g] implies ciclico[g]
	all g:Grafo |  ( not(no g.nodos) and aciclico[g]) implies not(completo[g])
}


assert completoConexo{
	all g:Grafo |  completo[g] implies conexo[g]
}

check completoConexo

run completo for 5 but exactly 1 Grafo


