class Main {
  public static void main(String frase) {

     int contarVogais = 0;
        
        frase.toLowerCase();
        
        for (int i = 0; i < frase.length(); i++){
            char c = frase.charAt(i);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u')
      contarVogais++;
        }
        
        return contarVogais;
    }