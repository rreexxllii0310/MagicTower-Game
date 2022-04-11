package fp.s105502009;

public class Map6 extends Map{
	
	public Map6(int[][] map) {
		super(map);
	}
	
	public int[][] initMap(int[][] map) {//-2.-3是會消失的NPC,-1是主角位置,0是可通過,1是障礙,2是上樓梯,3是下樓梯,4是特殊門,5是不會消失的NPC,剩下的數字都是道具
		for(int i=0; i<13; i++) {
			//牆壁
			map[0][i]=1;
			map[i][0]=1;
			map[12][i]=1;
			map[i][12]=1;
			
			//地圖物件
			map[i][1]=1;
			map[i][2]=1;
			map[i][3]=1;
			map[i][4]=1;
			map[i][5]=1;
			map[i][6]=0;
			map[6][6]=5; //BOSS
			map[8][6]=6; //公主
			map[4][6]=35;//35紅門  7觸發對話
			map[9][6]=1;
			map[10][6]=1;
			map[11][6]=1;
			map[i][7]=1;
			map[1][7]=3;        
			map[i][8]=1;
			map[i][9]=1;
			map[i][10]=1;
			map[i][11]=1;
		}
		map = setWill(map);
		return map;
	}
}
