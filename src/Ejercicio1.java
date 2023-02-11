public class Ejercicio1 {
    public int sumArray(int [] array, int n){

        //caso base
        if (n == 0){
            return array[0];
        }

        //operación y llamado recursivo
        return array[n] + sumArray(array, n - 1);
    }
}
