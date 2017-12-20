import java.io.*; 

class FCFS { 
 
	public static void main(String args[]) throws Exception { 
		int n, at[], bt[], wt[], tat[]; 
		float awt = 0, att = 0; 
		InputStreamReader isr = new InputStreamReader(System.in); 
		BufferedReader br = new BufferedReader(isr); 
		System.out.print("Enter no. of processes: "); 
		n = Integer.parseInt(br.readLine()); 
  
		wt = new int[n]; 
		tat = new int[n]; 
		bt = new int[n];
		at = new int[n];
  
		System.out.println("Enter Burst time for each process"); 
		for(int i = 0; i < n; i++) { 
			System.out.println("Process[" + (i+1) + "]"); 
			bt[i] = Integer.parseInt(br.readLine()); 
		} 
		System.out.println("\nEnter Around Time"); 
		for(int i = 0; i < n; i++) { 
			System.out.println("Process[" + i + "]"); 
			at[i] = Integer.parseInt(br.readLine()); 
		} 
		wt[0] = 0; 
		for(int i = 1; i < n; i++) { 
			wt[i] = wt[i - 1] + bt[i - 1]; 
			wt[i] = wt[i] - at[i]; 
		} 
		for(int i = 0; i < n; i++) { 
			tat[i] = wt[i] + bt[i]; 
			att = att + tat[i];
			awt = awt + wt[i]; 
		} 
		System.out.println("\nPROCESS\t\tBURST-TIME\tWAITING-TIME\tTURNAROUND TIME"); 
		for(int i = 0; i < n; i++) {
			System.out.println(i + "\t\t" + bt[i] + "\t\t" + wt[i] + "\t\t" + tat[i]);
		} 
		awt = awt/n; 
		att = att/n;
		System.out.println("\n"); 
		System.out.println("Average Waiting Time = " + awt); 
		System.out.println("Average Turnaround Time = " + att);
	} 
} 