public class Ejercicio3 {

    public Double promArray(int [] array, int n){

        //caso base
        if (n == 0){
            return (double) array[0]/array.length;
        }

        //Operación y llamado recursivo
        return (double) array[n]/array.length + promArray(array, n - 1);
    }
}
