public class Sort {
    //Método para fazer permutacao
    public void Permutacao(int[] dados, int i, int j)
    {
        int aux = dados[i];
        dados[i] = dados[j];
        dados[j] = aux;
    }

    public int[] SelectionSort(int[] dados)
    {

        //Variável para armazenar a posição do menor número do array
        int menor;
        //Loop para percorrer o array 2 vezes
        for(int i =0; i < dados.length; i++ )
        {
            //Inicialização da variável "menor" para sempre ser a posição do loop que está rodando
            menor = i;
            for(int j = i + 1; j < dados.length; j++)
            {
                //Comparação para saber em qual posição está o menor número ([j] é o segundo loop, [menor] é o primeiro loop)
                if(dados[j] < dados[menor])
                {
                    //Se o número da posição [j] for menor que o número da posição [menor] armazena-se a posição [j] na variável [menor]

                    menor = j;

                }
            }
            //Depois do primeiro loop comparar seu valor com todos os valores do segundo loop
            //é feita a permutação com a posição que estava armazenada na posição da variável menor, trocando a posição do menor valor com o analisado pelo primeiro loop


            //Permutação para mover os número dentro do array
            Permutacao(dados, i, menor);

        }
        return dados;

    }

    public void BubbleSort(int[] dados, int n)
    {
        //Variável para contar a quantidade de vezes que a permuta não acontece
        int naopermuta = 0;

        //Loop para percorrer o array
        for(int i = 0; i < n - 1; i++) {

            //Comparação da posição[i] com a posição[i + 1]
            if (dados[i] > dados[i + 1]) {

                //Permutação para mover os número dentro do array
                Permutacao(dados, i, i + 1);

            } else {
                //Contador para a quantidade de vezes que não permuta
                naopermuta++;
            }

        }
        //Se a quantidade de vezes que não aconteceu permutação for igual ao tamanho do array - 1 o array já está ordenado
        // e o loop é encerrado antes de repetir todas as vezes.
        if (naopermuta == dados.length -1)
        {
            return;
        }
        //Condição de saída da recursividade
        //Se o array ainda não chegou no fim o método BubbleSorte faz o loop mais uma vez
        //diminuindo o tamanho da lista
        else if (n -1 > 1){
            BubbleSort( dados, n - 1);
        }

        //Quando chega no tamanho da lista - 1 o método finaliza


    }

}

