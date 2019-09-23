
package Jogo;


import jplay.GameImage;
import jplay.Keyboard;
import jplay.URL;
import jplay.Window;


public class main {
    
    public static void main(String[] args) {
        
        Window janela = new Window(800, 600);
        GameImage plano = new GameImage(URL.sprite("menu.png"));
        Keyboard teclado = janela.getKeyboard();  
        
        
       while(true){//Loop infinito para rodar o jogo
           plano.draw();
           janela.update();
           
           if(teclado.keyDown(Keyboard.ENTER_KEY)){ //Condicional para chamar o a tela do jogo
                new Cenario1(janela);
                
           }
       }
        
    }
    
}
