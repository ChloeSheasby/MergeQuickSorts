
public class Test
{

	public static void main(String[] args)
	{
		System.out.println("MERGE SORTS");
		SubList mergeIn = new SubList();
		mergeIn.add("apple");
		mergeIn.add("banana");
		mergeIn.add("cherry");
		mergeIn.add("grape");
		mergeIn.add("mango");
		mergeIn.add("passion fruit");
		mergeIn.add("peach");
		mergeIn.add("strawberry");
		System.out.println("original (in order):");
		for(int i = 0; i < mergeIn.getItemCount(); i++)
		{
			System.out.println(mergeIn.getItem(i));
		}
		System.out.println();
		
		mergeIn.mergeSort(mergeIn); 
		System.out.println("merge sort:");
		for(int i = 0; i < mergeIn.getItemCount(); i++)
		{
			System.out.println(mergeIn.getItem(i));
		}
		System.out.println();
		
		SubList mergeRev = new SubList();
		mergeRev.add("strawberry");
		mergeRev.add("peach");
		mergeRev.add("passion fruit");
		mergeRev.add("mango");
		mergeRev.add("grape");
		mergeRev.add("cherry");
		mergeRev.add("banana");
		mergeRev.add("apple");
		System.out.println("original (reverse order):");
		for(int i = 0; i < mergeRev.getItemCount(); i++)
		{
			System.out.println(mergeRev.getItem(i));
		}
		System.out.println();
		
		mergeRev.mergeSort(mergeRev); 
		System.out.println("merge sort:");
		for(int i = 0; i < mergeRev.getItemCount(); i++)
		{
			System.out.println(mergeRev.getItem(i));
		}
		System.out.println();
		
		SubList mergeRandom = new SubList();
		mergeRandom.add("grape");
		mergeRandom.add("banana");
		mergeRandom.add("peach");
		mergeRandom.add("apple");
		mergeRandom.add("strawberry");
		mergeRandom.add("mango");
		mergeRandom.add("passion fruit");
		mergeRandom.add("cherry");
		System.out.println("original (random):");
		for(int i = 0; i < mergeRandom.getItemCount(); i++)
		{
			System.out.println(mergeRandom.getItem(i));
		}
		System.out.println();
		
		mergeRandom.mergeSort(mergeRandom); 
		System.out.println("merge sort:");
		for(int i = 0; i < mergeRandom.getItemCount(); i++)
		{
			System.out.println(mergeRandom.getItem(i));
		}
		System.out.println();
		
		System.out.println("QUICK SORTS");
		SubList quickIn = new SubList();
		quickIn.add("apple");
		quickIn.add("banana");
		quickIn.add("cherry");
		quickIn.add("grape");
		quickIn.add("mango");
		quickIn.add("passion fruit");
		quickIn.add("peach");
		quickIn.add("strawberry");
		System.out.println("original (in order):");
		for(int i = 0; i < quickIn.getItemCount(); i++)
		{
			System.out.println(quickIn.getItem(i));
		}
		System.out.println();
		
		quickIn.quickSort(quickIn); 
		System.out.println("merge sort:");
		for(int i = 0; i < quickIn.getItemCount(); i++)
		{
			System.out.println(quickIn.getItem(i));
		}
		System.out.println();
		
		SubList quickRev = new SubList();
		quickRev.add("strawberry");
		quickRev.add("peach");
		quickRev.add("passion fruit");
		quickRev.add("mango");
		quickRev.add("grape");
		quickRev.add("cherry");
		quickRev.add("banana");
		quickRev.add("apple");
		System.out.println("original (reverse order):");
		for(int i = 0; i < quickRev.getItemCount(); i++)
		{
			System.out.println(quickRev.getItem(i));
		}
		System.out.println();
		
		quickRev.quickSort(quickRev); 
		System.out.println("merge sort:");
		for(int i = 0; i < quickRev.getItemCount(); i++)
		{
			System.out.println(quickRev.getItem(i));
		}
		System.out.println();
		
		SubList quickRandom = new SubList();
		quickRandom.add("grape");
		quickRandom.add("banana");
		quickRandom.add("peach");
		quickRandom.add("apple");
		quickRandom.add("strawberry");
		quickRandom.add("mango");
		quickRandom.add("passion fruit");
		quickRandom.add("cherry");
		System.out.println("original (random):");
		for(int i = 0; i < quickRandom.getItemCount(); i++)
		{
			System.out.println(quickRandom.getItem(i));
		}
		System.out.println();
		
		quickRandom.quickSort(quickRandom); 
		System.out.println("quick sort:");
		for(int i = 0; i < quickRandom.getItemCount(); i++)
		{
			System.out.println(quickRandom.getItem(i));
		}
		System.out.println();
	}

}
