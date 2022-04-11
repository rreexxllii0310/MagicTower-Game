package fp.s105502009;

import javafx.scene.control.Label;

public class Battle{
    
	private boolean turn = true;
	public void startBattle(Player player, GameMonster enemy, Label HP) {
        int enemyHp = enemy.getHealth ();
  	  	while( enemyHp>0 && player.getHp()>0){
  	  		if(turn || enemy.getAttack()< player.getDef()){ //���a����
  	  			enemyHp = enemyHp - player.getAt() - enemy.getDefend();
            }else if(!turn && enemy.getAttack() > player.getDef()){//�Ǫ�����
          	  	player.setHp(player.getHp() - (enemy.getAttack() - player.getDef()) );
          	  	String hp = String.valueOf(player.getHp());
          	  	System.out.println("\n"+hp);
        		HP.setText(hp);
            }
  	  		turn = !turn;
  	  	}
  	  	//Map1MonList.get(9).setImage ( new Image ("file:image/floor.png") );   //�����ǲM���Ϥ�
	}
}
