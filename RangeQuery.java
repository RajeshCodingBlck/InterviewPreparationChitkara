// "static void main" must be defined in a public class.
public class Main {
    public static void main(String[] args) {
       
        Scanner s= new Scanner(System.in);
        int n= s.nextInt();
        int [] arr= new int[n];
        for(int i=0; i<n;i++){
            arr[i]= s.nextInt();
        }
        int [] prefixSum= new int [n];
        prefixSum[0]=arr[0];
        for(int i=1; i<n;i++){
            prefixSum[i]= prefixSum[i-1]+arr[i];
        }
        
        int q=s.nextInt();
        for(int i=1;i<=q;i++){
            int l= s.nextInt();
            int r= s.nextInt();
            
            if(l==0){
                System.out.println(prefixSum[r]);
            }else{
                System.out.println(prefixSum[r]-prefixSum[l-1]);
            }
        }
        
    }
}
