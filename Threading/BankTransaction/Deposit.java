class Deposit implements Runnable{

    private final SharedBalance obj;
    private int amount;
    private int rep;


    public Deposit(SharedBalance obj, int amount, int rep){
        this.obj = obj;
        this.amount = amount;
        this.rep = rep;
    }

    @Override
    public void run() {
            for(int i = 0; i < rep; i++){
               
                try{
                     obj.depositBalance(amount);
                    Thread.sleep(1200);
                }
                catch(InterruptedException e){
                    e.printStackTrace();
                }

            }
        
    }
}