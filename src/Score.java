import java.awt.*;

public class Score extends Rectangle{

     static int GAME_WIDTH;
     static int GAME_HEIGTH;
     int player1;
     int player2;
     Score(int GAME_WIDTH,int GAME_HEIGHT) {
         Score.GAME_WIDTH = GAME_WIDTH;
         Score.GAME_HEIGTH = GAME_HEIGHT;
     }
    Score(){

    }
    public void draw(Graphics g){
         g.setColor(Color.white);
         g.setFont(new Font("C0nsolas",Font.PLAIN,60));
         g.drawLine(GAME_WIDTH/2,0,GAME_WIDTH/2,GAME_HEIGTH);
         g.drawString(String.valueOf(player1),(GAME_WIDTH/2)-85,50);
         g.drawString(String.valueOf(player2),(GAME_WIDTH/2)+20,50);

    }
}
