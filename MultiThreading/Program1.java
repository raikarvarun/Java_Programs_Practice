import java.util.Arrays;
import java.util.Random;

class Multiplication implements  Runnable{
	int array[];
	int start;
	int end;
	
	public Multiplication(int[] array, int start, int end) {
		super();
		this.array = array;
		this.start = start;
		this.end = end;
	}

	public void run() {
		for(int i = start ;i<end ;i++) {
			array[i] *= 45;
		}
	}
}

class MultiplicationWithout{
	int array[];
	
	MultiplicationWithout(int[] array) {
		super();
		this.array = array;
	}

	public void runStart() {
		for(int i = 0 ;i<array.length ;i++) {
			array[i] *= 45 ;
            array[i] /= 5 ;
            array[i] *= 5 ;
            array[i] *= 55 ;
		}
	}
}
public class Program1 {

    public static void WithMultithreading() throws InterruptedException{
        double avg = 0 ; 
        for(int i1 = 0 ; i1 < 100 ; i1++){
            //Start time
            long begin = System.currentTimeMillis();

            int array[] = new int[21474836];
            Random rand = new Random();
            for(int i = 0 ; i<array.length ; i++) {
                array[i] = 25;
            }
            int numThreads = 10 ; 
            int chunkSize = array.length / numThreads;
            Thread[] threads = new Thread[numThreads];
            
            for(int i = 0 ; i< numThreads ; i++) {
                int start = i * chunkSize;
                int end = (i == numThreads - 1) ? array.length : start + chunkSize;
                threads[i] = new Thread(new Multiplication(array, start, end));
                threads[i].start();
            }
            
            for (Thread thread : threads) {
                thread.join();
            }
            //System.out.println("Result: " + Arrays.toString(array));
        
            
            //End time
            long end = System.currentTimeMillis();      
        
            long time = end-begin;
            avg+=time;
            
        }
        System.out.println("With MultiThreading: "+avg +" milli seconds");

    }

    public static void WithoutMultithreading(){
        double avg = 0 ; 
        for(int i1 = 0 ; i1 < 100 ; i1++){
            //Start time
            long begin = System.currentTimeMillis();

            int array[] = new int[21474836];
            Random rand = new Random();
            for(int i = 0 ; i<array.length ; i++) {
                array[i] = 25;
            }

            
            MultiplicationWithout obj = new MultiplicationWithout(array);
            //System.out.println("Result: " + Arrays.toString(array));
        
            
            //End time
            long end = System.currentTimeMillis();      
        
            long time = end-begin;
            avg+=time;
            
        }
        System.out.println("Without MultiThreading: "+avg +" milli seconds");
    }
	public static void main(String args[]) throws InterruptedException{
        WithoutMultithreading();
        WithMultithreading();
        
	}
}

