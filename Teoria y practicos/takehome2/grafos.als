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




pred fuertementeconexo (g:Grafo){
	all n,n1:g.nodos |n!=n1 implies ( n1 in n.^(g.arcos) and n in n1.^(g.arcos))
}


assert completoCiclico{
	all g:Grafo |  (all n:Nodo | n in g.nodos) &&   completo[g] implies not aciclico[g]
}



assert completoConexo{
    
	all g:Grafo |  (all n:Nodo | n in g.nodos) && completo[g] implies fuertementeconexo[g]
}



check completoCiclico for 5 but exactly 1 Grafo
check completoConexo for 5 but exactly 1 Grafo
run fuertementeconexo for 5 but exactly 1 Grafo


