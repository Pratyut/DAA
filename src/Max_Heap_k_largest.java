import java.util.*;

public class Max_Heap_k_largest {
int[] a;
public Max_Heap_k_largest(int[] array)
{
	this.a=array;
	}

public void print_Heap()
{
	for(int i=0;i<a.length;i++)
	{
      
		System.out.println(" \n        "+a[i]+"\n");
      
}
	}
public int[] sort_Max_Heap(int root_node)
{
	int i=a.length-1;
	int item=a[i];
	 int node=root_node;
	 int l=2*(root_node)+1;
	int r= 2*(root_node)+2;
	int greatest=node;
//   while(item>a[i] && i>=1)
	//   while(l<a.length && r<a.length)
		   {
	   
		   if(a[l]>a[node] && l<=i)
		   {   greatest=l;
		   }
		   else if(a[r]>a[node] && r<=i)
		   {   greatest=r;
		   }
		   
		   if(greatest!=node)
		   {
			   int temp=a[node];
			   a[node]=a[greatest];
			   a[greatest]= temp;
			   
		  sort_Max_Heap(node);
		   }
		   
		   
		   }

return a;
}

public int[] delete_Max(int[] array)
{
int i=0;
	
int n=a.length;
System.out.println("\n"+i+"+++"+n);
i=2*i+1;
while(i<a.length)
{
	
	int item=a[i];
	System.out.println("\nppppppppp"+a[(i-1)/2]+""+a[i]+""+a[i+1]);
	if( /*zaroorat ni written in while ----  i<n &&*/ item<a[i+1])
	{
		System.out.println("\n in 1st");
		i=i+1;
	}
	else if(a[i+1]<item)
	{

		System.out.println("\n in 2d");
	
		break;
	}
	a[(i-1)/2]=a[i];
	System.out.println("\n"+(i-1)/2+"$$$"+i+"-------"+a[(i-1)/2]+"%%%%%"+a[i]);
	System.out.println("\n/////"+a[0]);
	i=2*i+1;
}
int c=0;
while(c<a.length)
{
	System.out.println("\n^^^^^"+a[c]);
c++;	
}
return a;
}

public static void main(String[] args)
{
	int[] axo= {5,6,8,4,2,1,3,0};
	System.out.print("Input");
	int t=0;
	while(t<axo.length)
	{
		System.out.print(axo[t]+"--");
		t++;	
	}
	Max_Heap_k_largest dosp=new Max_Heap_k_largest(axo);
	dosp.sort_Max_Heap(0);
	//for just sorting display//dosp.print_Heap();
	
	axo=dosp.delete_Max(dosp.a);
	dosp.a=axo;
	dosp.print_Heap();
	
	}
}
