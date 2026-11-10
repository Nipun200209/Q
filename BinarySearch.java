public class BinarySearch{
	public static void main(String[]args){
		int[]arr={10,20,30,40,50};
		int key=50;
		int low=0;
		int high=arr.length-1;
		int position=-1;
		
		while(low<=high){
			int mid=low+(high-low)/2;
			if(arr[mid]==key){
				position=mid;
				break;
			}
			else if(arr[mid]<key){
				low=mid+1;
			}
			else{
				high=mid-1;
			}
			
		}
		if(position!=-1){
			System.out.println("elements found at index:"+ position);
		}
		else{
			System.out.println("elements not found");
		}
	
	}
}