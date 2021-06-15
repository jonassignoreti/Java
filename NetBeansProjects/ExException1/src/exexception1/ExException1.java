package exexception1;

class MyException extends Exception{
   String str1;

   MyException(String str2) {
	str1=str2;
   }
   @Override
   public String toString(){ 
	return ("Ocorrreu a minha exceção: "+str1) ;
   }
}

public class ExException1 {
    
    public static void main(String[] args)
    {
        try{
		System.out.println("Início do bloco try...");
		// Laço minha exceção usando o comando throw
		throw new MyException("Minha mensagem de erro!");
	}
	catch(MyException exp){
		System.out.println("Bloco catch") ;
		System.out.println(exp) ;
	}
    }
}
