package activities;


import java.util.Arrays;

public class Activity4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] sorting= {4,3,2,10,12,1,5,6};
		int size = sorting.length,i;
		for (i = 1; i < size; i++) {
            int key = sorting[i];
            int j = i - 1;
            
            while (j >= 0 && key < sorting[j]) {
                sorting[j + 1] = sorting[j];
                --j;
            }
            sorting[j + 1] = key;
            System.out.println(Arrays.toString(sorting));
        }
		System.out.println("Sorted Array in Ascending Order: ");
        System.out.println(Arrays.toString(sorting));
		}
		

	}


