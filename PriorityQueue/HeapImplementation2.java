package PriorityQueue;

public class HeapImplementation2 {
	static int n =0;
	static int[] heap = new int[100];
	 
	public static void swap(int a, int b) {
		int temp = heap[a];
		heap[a] = heap[b];
		heap[b] = temp;
	}
	
	public static void insert(int x) {
		n++;
		//insert element at last position - to maintain CBT
		heap[n-1] = x;
		int i = n-1;
		//if parent is smaller than swap
		while(i>0 && heap[(i-1)/2 ] < heap[i]){
			swap((i-1)/2, i);
			i=(i-1)/2;
		}
	}
	
	public static void print() {
		for(int i=0;i<n;i++) {
			System.out.print(heap[i]+" ");
		}
	}
	public static int deletion() {
		int deleted = heap[0];
		//replace root with last element - 0 with n-1;
		heap[0] = heap[n-1];
		n--;//size will reduce -after deletion
		int i=0;
		while(i<(n-1)/2) {
			//swap if child id greater
			if(heap[2*i+1]>heap[i] || heap[2*i+2] > heap[i]) {
				int max = (heap[2*i+1]>heap[2*i+2])? 2*i+1 : 2*i+2;
				swap(i, max);
				i = max;
			}
			
		}
		return deleted;
	}
	public static void main(String[] args) {
		insert(50);
		insert(30);
		insert(40);
		insert(10);
		insert(5);
		insert(20);
		insert(30);
		System.out.println("Before insertion : ");
		print();
		insert(60);
		System.out.println();
		System.out.println("After insertion :");
		print();
		deletion();
		System.out.println();
		System.out.println("After deletion : ");
		print();
		
	}
}
