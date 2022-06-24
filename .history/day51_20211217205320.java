class sampleDemo
implemnts Runnable
{
    private Thread t;
    Private String threadname;

    SampleDemo (String threadname) {
        this.threadname = threadname;
    }

    public void run() {
        while (true) {
            System.out.print(threadname);
        }
    }

    public void start() {
        if (t == null) {
            t = new Thread(this, threadname);
            t.start();
        }
    }
}

public class testThread {
    public static void main(String[] args) {
        sampleDemo A = new SampleDemo("A");
        sampleDemo B = new SampleDemo("B");
        B.start();
        A.start();
    }
}