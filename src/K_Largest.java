
class K_largest {
int[] a;
public K_largest(int[] array)
{
	this.a=array;
	}

public void print_Heap()
{
	for(int i=0;i<a.length;i++)
	{
      
		System.out.println("         "+a[i]+"\n");
      
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
}



//public class K_Largest {
//
//}
