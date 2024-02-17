package actividad6;

public class Ejecturar {
	public void Ejecutar() {
        MyQueues queue = new MyQueues(4);
        queue.insert('s');
        queue.insert('d');
        queue.insert('f');
        queue.insert('a');
//        queue.insert('q');
        
        
        System.out.println(queue.delete()); 
        System.out.println(queue.delete()); 
        System.out.println(queue.delete()); 
        System.out.println(queue.delete());
        System.out.println(queue.delete()); 
        
        
        MyStacks myStack = new MyStacks(5);
        myStack.push('h');
        myStack.push('o');
        myStack.push('l');
        myStack.push('a');
        myStack.push('s');
        myStack.push('s');

        char elem;
        while ((elem = myStack.pop()) != 0) {
            System.out.println(elem);
            
        }
        
        MyStacks stackInv = new MyStacks(10);
     
        String cadena = "anita lava la tina";
        String cadenaInv = stackInv.cadenaInvertida(cadena);
        System.out.println(cadenaInv);
        
    	String lowerString = cadenaInv.toLowerCase();
    	String replacesp = lowerString.replace(" ", "");
    	String cadenainv = ""; 
    	for (int n = replacesp.length() - 1; n >= 0; n--) {
    		cadenainv += replacesp.charAt(n); 
    		}
    	Boolean result = cadenainv.equals(replacesp);
    	if (result == true) {
    		System.out.println("Tu cadena es un palindromo"); 
    	}
    	else {
    		System.out.println("Tu cadena no es un palindromo"); 
    	}
    	
    }

}
