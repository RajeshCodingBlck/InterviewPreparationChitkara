// "static void main" must be defined in a public class.
public class Main {
    public static int BinarySearch(int [] arr){
        
        int low=0;
        int high=arr.length-1;
        int PotentialAns=-1;
        while(low<=high){
            
            int mid= (low+high)/2;
            if(arr[mid]==1){
                PotentialAns= mid;
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return PotentialAns;
    }
    public static void main(String[] args) {
       
        Scanner s= new Scanner(System.in);
        int n= s.nextInt();
        int [] arr= new int[n];
        for(int i=0; i<n;i++){
            arr[i]= s.nextInt();
        }
        
        int index= BinarySearch(arr);
        System.out.println(index);
        
    }
}
