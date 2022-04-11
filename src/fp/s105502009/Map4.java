package fp.s105502009;

public class Map4 extends Map{
	
	public Map4(int[][] map) {
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
			map[i][1]=0;
			map[11][1]=2;
			map[5][1]=60;
			map[6][1]=61;
			map[7][1]=62;
			map[2][1]=30;
			map[i][2]=1;
			map[1][2]=63;
			map[i][3]=0;
			map[2][3]=31;
			map[4][3]=64;
			map[5][3]=40;
			map[6][3]=41;
			map[i][4]=1;
			map[11][4]=65;
			map[i][5]=0;
			map[4][5]=66;
			map[7][5]=67;
			map[5][5]=52;
			map[3][5]=1;
			map[6][5]=1;
			map[8][5]=50;
			map[9][5]=1;
			map[10][5]=9;
			map[i][6]=0;
			map[1][6]=5;
			map[4][6]=68;
			map[5][6]=69;
			map[6][6]=35;
			map[7][6]=70;
			map[8][6]=71;
			map[9][6]=34;
			map[1][6]=5;
			map[3][6]=6;
			map[i][7]=0;
			map[3][7]=1;
			map[4][7]=72;
			map[6][7]=1;
			map[7][7]=73;
			map[8][7]=51;
			map[5][7]=53;
			map[9][7]=1;
			map[10][7]=10;
			map[i][8]=1;
			map[11][8]=74;
			map[i][9]=0;
			map[2][9]=32;
			map[4][9]=75;
			map[5][9]=42;
			map[6][9]=43;
			map[i][10]=1;
			map[1][10]=76;
			map[i][11]=0;
			map[2][11]=33;
			map[5][11]=77;
			map[6][11]=78;
			map[7][11]=79;
			map[11][11]=3;
		}
		map = setWill(map);
		return map;
	}
}
