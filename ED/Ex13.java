//-------------------------------------------------------------------
/*/
	@author Maheus G. Prada
/*/
//-------------------------------------------------------------------

public class ex12 {
    public static void main (String [] args){
    
      int vetor [] = new int [100];
      
        for(int x = 0; x < 100; x++){

            if( x % 2 == 0){
                vetor[x] =  1 + (int) (Math.random() * 1000); //coloca numero positivo
            }else{
                vetor[x] =  -1 * (1 + (int) (Math.random() * 1000));  //coloca numero negativo
            }

            vetor[] = BubbleSort(vetor[]);

            System.out.println("Vetor organizado:");

            for(int x = 0; x < 100; x++){
                System.out.println(vetor[x]);
            }
            
        }
    }
    
    public static int BubleSort(int vetor[]) {

        for(int x = 0; x < 100; x++){
            for(int y = 0; y < 99, y++){

                int aux = 0;

                if(vetor[y] > vetor[y + 1]){
                    aux = vetor[y];
                    vetor[y] = vetor[y+1];
                    vetor[y+1] = aux;
                }
            }
        }
        
        return vetor[];
    }
  }  