package actividad6;

public class MyStacks {
	int max;
	int top;
	public char[] stack;
	
	public MyStacks (int stacksize) {
		stack = new char[stacksize];
		max = this.stack.length;
		top = -1;
	}
	
	public void push(char data) {
		if(top == max -1) {
			System.out.println("Stack is full");
		return;
		}
	stack[++top] = data;
			
	}

	public char pop() 
	{
        if (top == -1) 
        {
            System.out.println("Stack is empty");
            return 0;
        }
        else {
        char value = stack[top];
        top-- ; 
        return value; 
        }
    }
	public String cadenaInvertida (String cadena) {
		MyStacks stack = new MyStacks(cadena.length());
		 for (int i = 0; i < cadena.length(); i++) {
	            stack.push(cadena.charAt(i));
		 }
		 String cadenainv = "";
		 while (stack.top != -1) {
			 cadenainv = cadenainv + stack.pop();
		 }
		return cadenainv;
	}
}




