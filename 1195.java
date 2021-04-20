class FizzBuzz {
    private int n;
    
    int fibu;
    int fi;
    int bu;
    
    boolean fizz = false;
    boolean number = true;
    boolean buzz = false;
    boolean fizzbuzz = false;
  
    public FizzBuzz(int n) {
        this.n = n;
        fibu = n/15;
        fi = n/3 - fibu;
        bu = n/5 - fibu;
    }

    // printFizz.run() outputs "fizz".
    public synchronized void fizz(Runnable printFizz) throws InterruptedException {
   for(int i = 0; i < fi; i ++){
       
        while(!fizz) {
        
            wait();
        }
        
  
        printFizz.run();
        number = true;
        fizz = false;
        notifyAll();
         
        }
    }

    // printBuzz.run() outputs "buzz".
    public synchronized void buzz(Runnable printBuzz) throws InterruptedException {
     for(int i = 0 ; i< bu ; i++) {
        while(!buzz) 
        {
            wait();
        }
        printBuzz.run();
        number = true;
        buzz = false;
        notifyAll();
     }
    }

    // printFizzBuzz.run() outputs "fizzbuzz".
    public synchronized void fizzbuzz(Runnable printFizzBuzz) throws InterruptedException {
    for(int i = 0; i < fibu; i ++){ 
        while(!fizzbuzz) 
        {
            wait();
        }
        printFizzBuzz.run();
        number = true;
        fizzbuzz = false;
        notifyAll();
    }
    }
    // printNumber.accept(x) outputs "x", where x is an integer.
    public synchronized void number(IntConsumer printNumber) throws InterruptedException {
        
   
        for(int i = 1; i <= n; i ++){
        while(!number){
            wait();
            }
            
            
            if( i % 3 ==0 && i % 5 == 0){
                
                
                number = false;
                fizzbuzz = true;
                notifyAll();
                continue;
                
            }
            
             if( i % 5 ==0){
                
                number = false;
                buzz = true;
                notifyAll();
                continue;
                
            }
            
             if( i % 3 == 0){
                number = false;
                fizz = true;
                notifyAll();            
                continue;
                        
            }
            
            printNumber.accept(i);            
            
        }

        
        
    }
}