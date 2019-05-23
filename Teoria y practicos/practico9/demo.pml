byte  y1 =0;
byte y2 =0;
int crit1=0;
int crit2=0;
short in_critical =0;

ltl p0 {([]<>crit1) && ([]<>crit2)}
	//ltl pr1 {[] (!crit1 || !crit2)}
proctype p1(){
	do
	::true ->
		y1 =y2+1;
		((y2==0)||(y1<=y2));
		in_critical++;
		crit1=1;
		in_critical--;
		crit1=0;
		y1=0;
	od	
}

proctype p2(){
	do
	::true ->
		y2 =y1+1;
		((y1==0)||(y2<y1));
		in_critical++;
		crit2=1;
		in_critical--;
		crit2=0;
		y2=0;
	od	
}

init{
	run p1();
	run p2();
}
