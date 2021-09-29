import java.awt.List;

@SuppressWarnings("serial")
public class SubList extends List
{
	public void mergeSort(SubList list)
	{
		if(list.getItemCount() > 1)
		{
			int middle = list.getItemCount() / 2;
			SubList tempLeft = new SubList();
			SubList tempRight = new SubList();
			tempLeft = partitionMerge(list, 0, middle);
			tempRight = partitionMerge(list, middle, list.getItemCount());
			mergeSort(tempLeft);
			mergeSort(tempRight);
			merge(list, tempLeft, tempRight);
		}
	}
	
	private void merge(SubList list, SubList tempLeft, SubList tempRight)
	{
		int i = 0;
		
		while(tempLeft.getItemCount() != 0 && tempRight.getItemCount() != 0 && i < list.getItemCount())
		{
			if(beforeAlphabetically(tempLeft.getItem(0), tempRight.getItem(0)))
			{
				list.replaceItem(tempLeft.getItem(0), i);
				tempLeft.remove(0);
			}
			else
			{
				list.replaceItem(tempRight.getItem(0), i);
				tempRight.remove(0);
			}
			i++;
		}
		
		while(tempLeft.getItemCount() != 0 && i < list.getItemCount())
		{
			list.replaceItem(tempLeft.getItem(0), i);
			tempLeft.remove(0);
			i++;
		}
		while(tempRight.getItemCount() != 0 && i < list.getItemCount())
		{
			list.replaceItem(tempRight.getItem(0), i);
			tempRight.remove(0);
			i++;
		}
		
	}
	
	private SubList partitionMerge(SubList list, int beg, int end)
	{
		SubList tempList = new SubList();
		for(int i = beg; i < end; i++)
		{
			tempList.add(list.getItem(i), i);
		}
		return tempList;
	}
	
	public void quickSort(SubList list)
	{
		if(list.getItemCount() < 2)
			return;
		SubList L = new SubList();
		SubList E = new SubList();
		SubList G = new SubList();
		String pivot = list.getItem(0);	// using first as pivot
		while(list.getItemCount() != 0)
		{
			String y = list.getItem(0);
			if(beforeAlphabetically(y, pivot) && !y.equals(pivot))
			{
				L.add(y);
			}
			else if(!beforeAlphabetically(y, pivot))
			{
				G.add(y);
			}
			else if(y.equals(pivot))
			{
				E.add(y);
			}
			list.remove(0);
		}
		
		quickSort(L);
		quickSort(G);
		
		while(L.getItemCount() != 0)
		{
			list.add(L.getItem(0));
			L.remove(0);
		}
		while(E.getItemCount() != 0)
		{
			list.add(E.getItem(0));
			E.remove(0);
		}
		while(G.getItemCount() != 0)
		{
			list.add(G.getItem(0));
			G.remove(0);
		}

	}
	
	private Boolean beforeAlphabetically(String s1, String s2)
	{
		if(s1.compareTo(s2) <= 0)
			return true;
		else
			return false;
	}
}
