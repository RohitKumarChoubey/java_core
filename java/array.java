public class array {
    public static void main(String[] args) {
        //type[] integerArray
        int[] arr=new int[10];//here ref variable is stored in stack and actual data is storef in heap
        //arrayName.length--to get size of array
        int [] arr1={1,2,3,4,5};
        for(int i:arr1){
            System.out.println(i);
        }
        int res=Integer.MIN_VALUE;
        for(int i:arr1){
            if(i>res){
                res=i;
            }
        }
        System.out.println(res);
        //for 2d array-->type[][] arr=new type[size][size]
        //for jagged array-->type[][] arr=new type[size][]
        

    }
    
}
