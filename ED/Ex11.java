//-------------------------------------------------------------------
/*/
	@author Maheus G. Prada
/*/
//-------------------------------------------------------------------

public class ex11 {
  public static void main (String [] args){
  
    int vetor [] = new int [100];
    int soma1 = 0, soma2 = 0, soma3 = 0, cont1 = 0, cont3 = 0;
      
    for(int x = 0; x < 100; x++){

      if( x % 2 == 0){
        vetor[x] =  1 + (int) (Math.random() * 1000); //coloca numero positivo
      }else{
        vetor[x] =  -1 * (1 + (int) (Math.random() * 1000));  //coloca numero negativo
      }
      
      if(vetor[x] > 99 && vetor[x] < 1001){ //soma os numeros de 100 a 1000
        soma1 += vetor[x];
        cont1++;
      }

      soma2 += vetor[x];  //soma os numeros para media

      if(vetor[x] < 0){ //soma os numeros negativos
        soma3 += vetor[x];
        cont3++;
      }
    }

    System.out.println("Media dos positivos: "+(soma1 / cont1)+".");
    System.out.println("Media dos numeros: "+(soma2 / 100)+".");
    System.out.println("Media dos negativos: "+(soma3 / cont3)+".");
  } 
}


