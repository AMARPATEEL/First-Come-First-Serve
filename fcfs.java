import java.io.*;
class fcfs 
{
	public static void main(String[] args)
	throws Exception {
	int n,AT[],BT[],WT[],TAT[];
	float test=0;
	InputStreamReader isr=new InputStreamReader(System.in);
	BufferedReader br=new BufferedReader(isr);
	System.out.println("Enter no of process");
	n =Integer.parseInt(br.readLine());
	BT=new int[n];
	WT=new int[n];
	TAT=new int[n];
	AT=new int[n];
	System.out.println("Enter Burst Time for each process\n*************************************");
	for(int i=0;i<n;i++)
	{
		System.out.println("Enter BT for process"+(i+1));
		BT[i]=Integer.parseInt(br.readLine());
	}
	System.out.println("**************************************");
	for(int i=0;i<n;i++)
	{
		System.out.println("Enter AT for process"+i);
		AT[i]=Integer.parseInt(br.readLine());
	}	
	System.out.println("*************************************");
	WT[0]=0;
	for(int i=1;i<n;i++)
	{
		WT[i]=WT[i=1]+BT[i-1];
		WT[i]=WT[i]-AT[i];
	}
	for(int i=0;i<n;i++)
	{
		TAT[i]=WT[i]+BT[i];
		test=test+WT[i];
	}
	System.out.println("PROCESS BT WT TAT");
	for(int i=0;i<n;i++)
	{
		System.out.println(""+i+""+BT[i]+""+WT[i]+""+TAT[i]);
	}
	test=test/n;
	System.out.println("***************************************");
	System.out.println("Avg waiting time="+test+"\n*********************************");
	}
}