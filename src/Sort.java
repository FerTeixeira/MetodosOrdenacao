public class Sort {

    public int[] SelectionSort(int[] dados)
    {
        //Variável para armazenar a posição de um número durante a permutação
        int aux;
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
                    //Se o número da posição [j] for menor que o número da posição [menor] armazena-se a variável [j] na variável [menor]
                    menor = j;

                }
            }
            //Permutação para mover os número dentro do array
            aux = dados[i];
            dados[i] = dados[menor];
            dados[menor] = aux;
        }
        return dados;

    }
    public int[] BubbleSort(int[] dados)
    {
        //Variável para não permitir que o loop faça comparação do último item com o próximo(que é inexistente)
        int coluna = 1;
        //Variável para armazenar a posição de um número durante a permutação
        int aux;
        //Loop para percorrer o array 2 vezes
        for(int i = 0; i < dados.length - 1; i++)
        {
            //Variável para contar a quantidade de vezes que a permuta não acontece
            int naopermuta = 0;
            for (int j = 0; j < dados.length - coluna; j++)
            {
                //Comparação da posição[j] com a posição[j + 1]
                if (dados[j] > dados[j + 1])
                {
                    //Permutação para mover os número dentro do array
                    aux = dados[j];
                    dados[j] = dados[j + 1];
                    dados[j + 1] = aux;
                }
                else
                {

                    naopermuta++;
                }

            }
            coluna++;
            //Se a quandade de vezes que não aconteceu permutação for igual ao tamanho do array - 1 o array já está ordenado
            // e o loop é encerrado antes de repetir todas as vezes.
            if (dados.length - 1 == naopermuta)
            {
                return dados;

            }
        }

        return dados;
    }


}
