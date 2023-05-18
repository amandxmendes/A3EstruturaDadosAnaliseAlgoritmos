//é tipo organizar pessoas em fila por ordem de altura com as menores na frente das maiores
public class SelectionSort {
    public static void main(String[] args) {
        int[] vetor = new int[5];


        for (int i=0; i<vetor.length; i++) {
            vetor[i] = (int) (Math.random() * vetor.length);
        }

        //Imprime o vetor de forma aleatória

        System.out.println("Sem ordem");
        for (int i=0; i<vetor.length; i++){
            System.out.println(vetor[i]);
        }

        //Selection Sort

        int posicaoMenor, variavelAuxiliar;
        for (int i=0; i<vetor.length; i++){
            posicaoMenor = i;
            for (int j = i+1; j < vetor.length; j++){
                if (vetor[j] < vetor[posicaoMenor]){
                    posicaoMenor = j;
                }
            }

            variavelAuxiliar = vetor[posicaoMenor];
            vetor[posicaoMenor] = vetor[i];
            vetor[i] = variavelAuxiliar;

        }

        //imprime o vetor na ordem correta após uso do Selection Sort

        System.out.println("Em ordem");
        for (int i=0; i<vetor.length; i++){
            System.out.println(vetor[i]);
        }

    }
}
