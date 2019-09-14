//-------------------------------------------------------------------
/*/
	@author Maheus G. Prada
/*/
//-------------------------------------------------------------------

public class ex12 {
    public static void main (String [] args){
    
      int vetor [] = new int [5];
      int fatorial [] = new int [5];
      int aux = 0;
        
      for(int x = 0; x < 5; x++){

        vetor[x] =  1 + (int) (Math.random() * 10); //coloca numero positivo
        System.out.println(vetor[x]);
        fatorial[x] = fatorial(vetor[x]);
        System.out.println(fatorial[x]);
      }
    }
    
    public static int fatorial(int vetor) {

        int y = 0, fat = vetor, aux = 0;
        y = vetor;
        if(y == 1 || y == 0){
            if( y == 0){
                y++;
            }
            return y;
        }else{
            aux = fat;
            for( y = 1; y < aux; y++ ){
                fat = fat * y;
            }
        }
        return fat;
    }
  }
  
  
  