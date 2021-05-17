
package juego_8reinas;

public class Juego_8Reinas {

    private int contador;
    private String[][] tablero;
    public int[] vec1 = new int [8];
    public int[] vec2 = new int [8];
    public int[] vec3 = new int [8];
    public int[] vec4 = new int [8];
    public int[] vec5 = new int [8];
    
    public void iniciarJuego() {
        
        tablero = generaTablero();
        colocaReina(tablero, 0);   
    }
    
    public void colocaReina(String[][] tablero, int columna){
        
       for (int i = 0; i < tablero.length; i++){
            if (validaPosicion(tablero, i, columna)) {
                tablero[i][columna] = "D";

                if (columna < tablero.length - 1) {
                    colocaReina(tablero, columna + 1);
                    
                }else{
                    contador++;
                    guardaSolucion(tablero, contador);
                    
                }
                tablero[i][columna] = " ";
            }
            if (contador == 5) {
                break;
            }
        }
    }
    
    public boolean validaPosicion(String[][] tablero, int fila, int columna){
        
        for (int c = 0; c < columna; c++) { 
            if (tablero[fila][c].equals("D")) { // Revisa cada elemento de la fila para ubicar una reina.
                return false; // Si la encuentra devuelve false.
            }
        }
        
        for (int aux = 0; aux < tablero.length && (fila - aux) >= 0 && (columna - aux) >= 0; aux++) { 
            if (tablero[fila - aux][columna - aux].equals("D")) {
                return false;
            }
        }
        
        for (int aux = 0; aux < tablero.length && (fila + aux) < tablero.length && (columna - aux) >= 0; aux++) {
            if (tablero[fila + aux][columna - aux].equals("D")) {
                return false;
            }
        }
        
        return true;
    }
    
    public String[][] generaTablero(){
        String[][] tableroVacio = new String[8][8];
        for (int i = 0; i < tableroVacio.length; i++) {
            for (int j = 0; j < tableroVacio.length; j++) {
                tableroVacio[i][j] = " ";
            }
        }
        return tableroVacio;
    }

    public void guardaSolucion(String[][] tablero, int contador) {
    
        int [] vec = new int [8];

        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero.length; j++) {

                if (tablero[i][j] == "D") {
                    vec[i] = j;
                }
            } 
        }

        
        switch(contador){
            case 1:{
                for (int i = 0; i <vec.length; i++) {
                    vec1[i] = vec[i];
                }
                break;
            }
 
            case 2:{
                for (int i = 0; i <vec.length; i++) {
                    vec2[i] = vec[i];
                }
                break;
            }
            
            case 3:{
                for (int i = 0; i <vec.length; i++) {
                    vec3[i] = vec[i];
                }
                break;
            }
            
            case 4:{
                for (int i = 0; i <vec.length; i++) {
                    vec4[i] = vec[i];
                }
                break;
            }
            
            case 5:{
                for (int i = 0; i <vec.length; i++) {
                    vec5[i] = vec[i];
                }
                break;
            }
        }
    }
}
