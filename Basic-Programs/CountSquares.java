int countSquares(int N) {
        int count=0;
        
        for(int i=1; i*i < N; i++){
            count++;
        }
        
        return count;
    }
