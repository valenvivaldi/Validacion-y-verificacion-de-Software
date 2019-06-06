chan puenteIda = [0] of {short,short};
	chan puenteVuelta= [0] of {short};	

int tiempos[4]={5,10,20,25};

int time =0;

bit hereUNSAFE[4]={1,1,1,1};
bit hereSAFE[4]={0,0,0,0};





ltl p0 {(<>(time >60))}

active proctype Unsafe(){	
	
	
	short soldado1,soldado2;
	do ::

		
		
		if
		::(hereUNSAFE[0]==1)->
			hereUNSAFE[0]=0;
			soldado1=0;
			
		::(hereUNSAFE[1]==1)->
			hereUNSAFE[1]=0;
			soldado1=1;
			
		::(hereUNSAFE[2]==1)->
			hereUNSAFE[2]=0;
			soldado1=2;
			
		::(hereUNSAFE[3]==1)->
			hereUNSAFE[3]=0;
			soldado1=3;
			
		fi
		
		if
		::(hereUNSAFE[0]==1)->
			hereUNSAFE[0]=0;
			soldado2=0;
			
		::(hereUNSAFE[1]==1)->
			hereUNSAFE[1]=0;
			soldado2=1;
			
		::(hereUNSAFE[2]==1)->
			hereUNSAFE[2]=0;
			soldado2=2;
			
		::(hereUNSAFE[3]==1)->
			hereUNSAFE[3]=0;
			soldado2=3;
		fi
		
		
		
		

		
		puenteIda!soldado1,soldado2;
	

		if
		::(hereUNSAFE[0]==0&&hereUNSAFE[1]==0&&hereUNSAFE[2]==0&&hereUNSAFE[3]==0)->break;
		::else->skip;
		fi
		
		
		

		
		puenteVuelta?soldado1;
		hereUNSAFE[soldado1]=1;

		time=tiempos[soldado1]+time;
		
		
		
		
	od
}
active proctype Safe(){

	
short soldado1,soldado2;
	
	do ::
		
		puenteIda?soldado1,soldado2;
		hereSAFE[soldado1]=1;
		hereSAFE[soldado2]=1;
		
		
		

		
		time=time+tiempos[soldado1];
		if
		:: (tiempos[soldado2]>tiempos[soldado1])->time=time+tiempos[soldado2]-tiempos[soldado1];
		::else->skip;
		fi
		
		if
		::(hereSAFE[0]==1&&hereSAFE[1]==1&&hereSAFE[2]==1&&hereSAFE[3]==1)->break;
		::else->skip;
		fi

		if
		::(hereSAFE[0]==1)->
						hereSAFE[0]=0;
						soldado1=0;
						
		::(hereSAFE[1]==1)->
						hereSAFE[1]=0;
						soldado1=1;
						
		::(hereSAFE[2]==1)->
						hereSAFE[2]=0;
						soldado1=2;
						
		::(hereSAFE[3]==1)->
						hereSAFE[3]=0;
						soldado1=3;
						
		
		fi
		puenteVuelta!soldado1;
		
	od
}



