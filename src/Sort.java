public class Sort {

    public int[] SelectionSort(int[] dados)
    {
        int aux;
        int menor;
        for(int i =0; i < dados.length; i++ )
        {
            menor = i;
            for(int j = i + 1; j < dados.length; j++)
            {
                if(dados[j] < dados[menor])
                {
                    menor = j;

                }
            }
            aux = dados[i];
            dados[i] = dados[menor];
            dados[menor] = aux;
        }
        return dados;

    }
    public int[] BubbleSort(int[] dados)
    {
        int coluna = 1;
        int aux;

        for(int i = 0; i < dados.length - 1; i++)
        {
            int naopermuta = 0;
            for (int j = 0; j < dados.length - coluna; j++)
            {
                if (dados[j] > dados[j + 1])
                {

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
            if (dados.length - 1 == naopermuta)
            {
                return dados;

            }
        }

        return dados;
    }


}
