public class Prueba1{
	public static void main(String[] args){
		System.out.println("Hola "+args[0]+"!");
		for(int i=0;i<args[0].length();i++){
			System.out.println(args[0].charAt(i));
		}
		System.out.println("Primera persona: "+args[0]);
		System.out.println("Ultima persona: "+args[2]);
		
	}
 }	
}

