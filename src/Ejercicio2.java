public class Ejercicio2 {
    public String reverseString(String cadena, int i){
        //Caso base
        if(i == 0){
            return "";
        }

        //Operación + llamado recursivo
        return cadena.charAt(i-1) + reverseString(cadena, i-1);
    }
}
