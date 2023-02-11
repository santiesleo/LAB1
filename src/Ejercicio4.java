public class Ejercicio4 {
    public int findIndex(int[] array, int index, int n){
        if(array[index] == n){
            return index;
        } else if (index == array.length) {
            return -1;
        }

        return findIndex(array, index + 1, n);
    }
}
