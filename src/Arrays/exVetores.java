package Arrays;

public class exVetores {

    public static void main(String[] args) {
        String vetorString[] = {"Boxer","Pastor Alemão","Pinscher","Husky Siberiano","Corgi"};
        
        for(int indice = 0; indice < 5; indice++) {
            System.out.println((indice + 1) + "º Número: " + vetorString[indice]);  
        }
        
       System.out.println("Número de casas: " + vetorString.length);
    }
}
