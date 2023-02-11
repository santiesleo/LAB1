public class Ejercicio5{
    public int[] divRestasSucesivas(int n, int m, int i, int[] numeros){


        //Caso base
        if(n <= m){
            numeros[0] = n;
            return numeros;
        }

        //Operación
        n = n - m;
        i++;
        numeros[1] = i;
        //Llamado recursivo
        divRestasSucesivas(n, m, i, numeros);
        return numeros;

    }
}
