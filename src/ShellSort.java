//organiza em ordem fazendo saltos de 2 em 2 e validando os valores
public class ShellSort {
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

        //Shell Sort

        int h = 1;
        int n = vetor.length;
        while(h < n){
            h = h * 3 + 1;
        }

        h = (int) Math.floor(h/3);

        int c, j;
        while(h > 0){
            for (int i = h; i < n; i++){
                c = vetor[i];
                j = i;
                while(j >= h && vetor[j - h] > c){
                     vetor[j] = vetor[j - h];
                     j = j - h;
                }

                vetor[j] = c;
            }
            h = h/2;
        }

        //imprime o vetor na ordem correta após uso do Shell Sort

        System.out.println("Em ordem");
        for (int i=0; i < vetor.length; i++){
            System.out.println(vetor[i]);
        }

    }
}
