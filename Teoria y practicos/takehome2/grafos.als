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

run completo for 5 but exactly 1 Grafo


