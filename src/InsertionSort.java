//verifica de tras para frente e insere o valor na ordem que ele deve ficar tipo o 6 entre o 5 o 7
public class InsertionSort {
    public static void main(String[] args) {
        int[] vetor = new int[5];


        for (int i=0; i<vetor.length; i++) {
            vetor[i] = (int) (Math.random() * vetor.length);
        }

        //Imprime o vetor de forma aleatória

        System.out.println("Sem ordem");
        for (int i=0; i < vetor.length; i++){
            System.out.println(vetor[i]);
        }

        //Insertion Sort

        int variavelAuxiliar, j;
        for (int i=1; i<vetor.length; i++){
           variavelAuxiliar = vetor[i];
           j = i - 1;
           while(j >= 0 && vetor[j] > variavelAuxiliar){
               vetor[j+1] = vetor[j];
               j--;
           }
                vetor[j+1] = variavelAuxiliar;
        }


        //imprime o vetor na ordem correta após uso do Insertion Sort

        System.out.println("Em ordem");
        for (int i=0; i < vetor.length; i++){
            System.out.println(vetor[i]);
        }
    }
}
