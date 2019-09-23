package Jogo;

import jplay.Keyboard;
import jplay.Sprite;
import jplay.URL;
import jplay.Window;


public class Jogador extends Sprite{
    
    private double velocidade = 0.5;
    private int direcao=3;
    private Keyboard teclado;
    private boolean movendo= false;
    
    //Codigo Inicia a criação do personagem
    public Jogador(int x,int y) {
        super(URL.sprite("jogador.png"), 20);
        this.x = x;
        this.y = y;
        this.setTotalDuration(2000);/*Tempo em milisegundos que será alterado
                                        os frames do personagem*/
        
    }
    //Codigo de movimentaçao do personagem
    public void mover(Window janela){
        if(teclado == null){
            teclado=janela.getKeyboard();
            
        }
                
        //Aqui começa os ifs pra delimitar e mover os frames do personagem no cenario
        
        if(teclado.keyDown(Keyboard.LEFT_KEY)){//Movendo para a esquerda
            if( this.x > 0){
                this.x -=velocidade;
            }
                if(direcao != 1){   
                    setSequence(4 , 8);     /*Posiçao de frame utilizado, total 
                                            de 20 frames ele ira utilizar do 4º ao 8º*/
                    direcao = 1;
                }movendo = true;
            
        }else if(teclado.keyDown(Keyboard.RIGHT_KEY)){//Movendo para a direita
            if( this.x < janela.getWidth()- 60 ){
                this.x +=velocidade;
            }
                if(direcao != 2){   
                    setSequence(8 , 12); 
                    direcao = 2;
                }movendo = true;
                
        }else if(teclado.keyDown(Keyboard.UP_KEY)){//Movendo para cima
            
            if( this.y > 0){
                this.y -=velocidade;
            }
                if(direcao != 4){   
                    setSequence(12 , 16);     
                    direcao = 4;
                }movendo = true;
                
        }else if(teclado.keyDown(Keyboard.DOWN_KEY)){//Movendo para baixo
            
            if( this.y < janela.getHeight()- 60){
                this.y +=velocidade;
            }
                if(direcao != 5){   
                    setSequence(0 , 4);     
                    direcao = 5;
                }movendo = true;
        }
        
        if(movendo){
            update();
            movendo = false;
        
        }
        
        
    }
    
    
}
