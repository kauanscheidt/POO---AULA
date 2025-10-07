public class matriz_laplace
{
    public static double calcular(double[][] matriz)
    {
        int tamanho = matriz.length;
        for (double[] linha : matriz)
        {
            if (linha.length != tamanho)
            {
                throw new IllegalArgumentException("A matriz precisa ser quadrada");
            }
        }
        return determinante(matriz);
    }

    private static double determinante(double[][] m)
    {
        int n = m.length;

        if (n == 1)
        {
            return m[0][0];
        }
        if (n == 2)
        {
            return m[0][0] * m[1][1] - m[0][1] * m[1][0];
        }
        if (n == 3)
        {
            double somaPos = m[0][0] * m[1][1] * m[2][2] + m[0][1] * m[1][2] * m[2][0] + m[0][2] * m[1][0] * m[2][1];
            double somaNeg = m[0][2] * m[1][1] * m[2][0] + m[0][0] * m[1][2] * m[2][1] + m[0][1] * m[1][0] * m[2][2];
            return somaPos - somaNeg;
        }

        int indiceMelhor = -1;
        boolean usarLinha = true;
        int maxZeros = -1;

        for (int i = 0; i < n; i++)
        {
            int contZeros = 0;
            for (int j = 0; j < n; j++)
            {
                if (m[i][j] == 0.0)
                {
                    contZeros++;
                }
            }
            if (contZeros > maxZeros)
            {
                maxZeros = contZeros;
                indiceMelhor = i;
                usarLinha = true;
            }
        }

        for (int j = 0; j < n; j++)
        {
            int contZeros = 0;
            for (int i = 0; i < n; i++)
            {
                if (m[i][j] == 0.0)
                {
                    contZeros++;
                }
            }
            if (contZeros > maxZeros)
            {
                maxZeros = contZeros;
                indiceMelhor = j;
                usarLinha = false;
            }
        }

        double resultado = 0.0;

        if (usarLinha)
        {
            if (maxZeros == n) return 0.0;

            for (int j = 0; j < n; j++)
            {
                double valor = m[indiceMelhor][j];
                if (valor == 0.0) continue;
                double[][] menor = submatriz(m, indiceMelhor, j);
                double sinal = (((indiceMelhor + j) % 2) == 0) ? 1.0 : -1.0;
                resultado += sinal * valor * determinante(menor);
            }
        }
        else
        {
            if (maxZeros == n) return 0.0;

            for (int i = 0; i < n; i++)
            {
                double valor = m[i][indiceMelhor];
                if (valor == 0.0) continue;
                double[][] menor = submatriz(m, i, indiceMelhor);
                double sinal = (((i + indiceMelhor) % 2) == 0) ? 1.0 : -1.0;
                resultado += sinal * valor * determinante(menor);
            }
        }

        return resultado;
    }

    private static double[][] submatriz(double[][] matriz, int linhaRemovida, int colunaRemovida)
    {
        int n = matriz.length;
        double[][] nova = new double[n - 1][n - 1];
        int ni = 0;
        for (int i = 0; i < n; i++)
        {
            if (i == linhaRemovida) continue;

            int nj = 0;
            for (int j = 0; j < n; j++)
            {
                if (j == colunaRemovida) continue;
                nova[ni][nj++] = matriz[i][j];
            }
            ni++;
        }
        return nova;
    }

    public static void main(String[] args)
    {
        double[][] matriz = {
                {2, 0, -1, 3, 0, 4},
                {0, 5, 0, -2, 1, 0},
                {3, 0, 2, 0, -1, 5},
                {0, -3, 0, 4, 2, 0},
                {1, 0, 3, 0, 5, -2},
                {0, 2, 0, 1, 0, 3}
        };

        System.out.println("Determinante = " + calcular(matriz));
    }
}