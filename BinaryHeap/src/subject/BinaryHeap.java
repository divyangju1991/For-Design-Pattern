package subject;


public class BinaryHeap {

	public int[] array;
	public int count; //Number of elements in Heap
	public int capacity; //Size of the Heap
	public int heap_type; //Min Heap or Max Heap
	public static int MAX_HEAP = 1;
	public static int MIN_HEAP = 0;
	//Time Complexity: O(1) 
	public BinaryHeap(int capacity, int heap_type){
		this.heap_type = heap_type;
		this.capacity = capacity;
		count = 0;
		this.array = new int[capacity];
	}
	
	//Parent of a Node
	//Time Complexity: O(1)
	public int Parent(int i) {
		
		if(i <= 0 || i>= this.count){
			return -1;
		}
		
		return (i-1)/2;
	}
	
	//Children of a Node
	//Time Complexity: O(1)
	public int leftChild(int i){
		
		int left = 2 * i + 1;
		
		if(left >= this.count) {
			return -1;
		}
		
		return left;
	}
	
	//Children of a Node
	//Time Complexity: O(1)
	public int rightChild(int i){
		
		int right = 2 * i + 2;
		
		if(right >= this.count){
			return -1;
		}
		
		return right;
	}
	
	//Getting the Maximum Element
	//Time Complexity O(1)
	public int getMaximum(){
		
		if(this.count == 0){
			return -1;
		}
		
		return this.array[0];
	}
	
	//heapifying the element at location
	//Time Complexity : O(logn)
	//Space Complexity : O(1)
	public void percolateDown(int i){
		
		int l, r, max, temp;
		
		max = i;
		l = leftChild(i);
		r = rightChild(i);
		
		if(l != -1 && array[l] > array[max]){
			max = l;
		} 
		
		if(r != -1 && array[r] > array[max]){
			max = r;
		} 
		
		//Swap array
		if(max != i){
			
			temp = array[i];
			array[i] = array[max];
			array[max] = temp;
			
			percolateDown(max);
		}
	}
	
	
	public void percolateUp(int i){
		
		int l, r, min, temp;
		
		min = i;
		l = leftChild(i);
		r = rightChild(i);
		
		if(l != -1 && array[l] < array[min]){
			min = l;
		} 
		
		if(r != -1 && array[r] < array[min]){
			min = r;
		} 
		
		//Swap array
		if(min != i){
			
			temp = array[i];
			array[i] = array[min];
			array[min] = temp;
			
			percolateUp(min);
		}
	}
	
	//Deleting an Element
	//Time Complexity : O(logn)
	public int deleteMax(){
		
		if(count == -1){
			return -1;
		}
		
		int data = array[0];
		array[0] = array[count-1];
		
		count--;
		
		percolateDown(0);
		
		return data;
	}
	
	//Deleting an Element
	//Time Complexity : O(logn)
	public int deleteMin(){
		
		if(count == -1){
			return -1;
		} 
		
		int data = array[0];
		array[0] = array[count-1];
		
		count--;
		
		percolateUp(0);
			
		return data;
	}
	
	public void insert(int data){
		
		int i;
		
		if(count == capacity){
			resizeHeap();
		}
		count++;
		i = count-1;
		
		while(i > 0 && data > array[(i-1)/2]) {
			array[i] = array[(i-1)/2];
			i = (i-1)/2;
		}
		array[i] = data;
	}
	
	public void resizeHeap() {
		
		int[] array_old = new int[capacity];
		System.arraycopy(array, 0, array_old, 0, capacity);
		array = new int[capacity * 2];
		
		if(array == null){
			System.out.println("Memory Error");
			return;
		}
		
		capacity *= 2;
		System.arraycopy(array_old, 0, array, 0, array_old.length);
		array_old = null;
	}
	
	
	public void DestroyHeap() {
		count = 0;
		array = null;
	}
	
	public boolean isEmpty(){
		return (count == 0);
	}
}
