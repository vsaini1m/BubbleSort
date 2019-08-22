package bubble_sort;

public class sort {
public static void main(String[] args) {
	int array[]= {6,21,2,3,42,33,4};
	
		arraySort(array);
		
	for(int i=0;i<array.length;i++)
		System.out.println(array[i]);
}
public static void arraySort(int array[]) {
	int temp;
	
	for(int i=0;i<array.length-1;i++) {
		for(int j=0;j<(array.length-1)-i;j++) {
			if(array[j]>array[j+1]) {
				temp=array[j];
				array[j]=array[j+1];
				array[j+1]=temp;
			}
		}
	}
	
}



}
