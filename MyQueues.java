package actividad6;

public class MyQueues {
	 	int max;
	    char[] queue;
	    int tail;
	    int head;
	    int cSize;
	    
	    public MyQueues (int queuesize) {
			queue = new char[queuesize];
			max = this.queue.length;
			head = 0;
	        tail = -1;
	        cSize = 0;
	    }
	    public void insert(char data) {
	        if (tail == max -1 ) {
	            System.out.println("Queue is full");
	        }
	        else {
	        tail++;
	        queue[tail] = data;
	       
	        }
	    }
		public char delete() {
			{
		        if (tail == 0) {
		            return '#';
		        }
		        char var = queue[head];
		        head++;
		        if (head == max) {
		            head = 0;
		        }
		        tail--;
		        return var;
		}
	}
}

