class Compute {
    
    public int largest(int arr[], int n)
    {
        int largest =arr[0];
        for(int i=0; i<n ; i++){
            if(largest < arr[i]){
                largest = arr[i];
            }
        }
        return largest;
    }
}
