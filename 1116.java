class ZeroEvenOdd {
    private int n;
    
 
    boolean isZero = true;
    
    boolean isEven = true;
     
    public ZeroEvenOdd(int n) {
        this.n = n;
    }

    // printNumber.accept(x) outputs "x", where x is an integer.
    public synchronized void zero(IntConsumer printNumber) throws InterruptedException {
        
        for(int i = 0; i < n; i ++){
            
            while( !isZero ){
                wait();
            }
            
            printNumber.accept(0);
            isZero = !isZero;
            isEven = !isEven;
            notifyAll();
        }
        
    }

    public synchronized void even(IntConsumer printNumber) throws InterruptedException {
    
    for(int i = 2; i <= n; i += 2){
        
        while(isZero || !isEven ){
            wait();
        }        
        printNumber.accept(i);
        isZero = true;
        notifyAll();
            
        }
    }

    public synchronized void odd(IntConsumer printNumber) throws InterruptedException {
    
    for(int i = 1; i <= n  ; i += 2){
        
     while(isZero || isEven ){
         
         wait();
     }   
        printNumber.accept(i);  
        isZero = true;
        notifyAll();
    }
    }
    }