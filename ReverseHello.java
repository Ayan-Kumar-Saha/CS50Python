// Reverse Hello Problem

class NewThread implements Runnable{

    Thread t;
    int count;

    public NewThread(int count) {
        t = new Thread(this,"Thread "+count);
        this.count = count;
    }

    public void run() {
        if(count<=5) {
            ++count;
            NewThread nt = new NewThread(count);
            nt.t.start();
            try {
                nt.t.join();
                System.out.println("Hello from "+t.getName());
            } catch (InterruptedException e) {
                System.out.println(nt.t.getName()+" interrupted");
            }
        }
        
    }
}

class ReverseHello {
    public static void main(String[] args) {

        NewThread nt = new NewThread(1);
        nt.t.start();
    }
}