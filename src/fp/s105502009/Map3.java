package fp.s105502009;

public class Map3 extends Map{
	
	public Map3(int[][] map) {
		super(map);
	}
	
	public int[][] initMap(int[][] map) {//-2.-3�O�|������NPC,-1�O�D����m,0�O�i�q�L,1�O��ê,2�O�W�ӱ�,3�O�U�ӱ�,4�O�S���,5�O���|������NPC,�ѤU���Ʀr���O�D��
		for(int i=0; i<13; i++) {
			//���
			map[0][i]=1;
			map[i][0]=1;
			map[12][i]=1;
			map[i][12]=1;
			
			//�a�Ϫ���
			map[i][1]=0;
			map[1][1]=6;
			map[4][1]=1;
			map[3][1]=9;
			map[2][1]=60;
			map[6][1]=61;
			map[7][1]=62;
			map[9][1]=1;
			map[10][1]=1;
			map[11][1]=3;
			map[i][2]=0;
			map[2][2]=10;
			map[4][2]=30;
			map[1][2]=63; 
			map[3][2]=64;
			map[6][2]=1;
			map[7][2]=1;
			map[9][2]=1;
			map[i][3]=0;
			map[1][3]=11;
			map[4][3]=1;
			map[7][3]=1;
			map[9][3]=1;
			map[11][3]=1;
			map[i][4]=1;
			map[6][4]=65;
			map[8][4]=0;
			map[10][4]=0;
			map[i][5]=0;
			map[1][5]=1;
			map[3][5]=1;
			map[5][5]=1;
			map[7][5]=1;
			map[6][5]=66;
			map[9][5]=67;
			map[11][5]=1;
			map[i][6]=1;
			map[1][6]=5;
			map[2][6]=0;
			map[3][6]=31;
			map[4][6]=68;
			map[6][6]=69;
			map[i][7]=0;
			map[1][7]=1;
			map[3][7]=1;
			map[8][7]=1;
			map[9][7]=70;
			map[10][7]=51;
			map[11][7]=50;
			map[i][8]=1;
			map[7][8]=0;
			map[8][8]=32;
			map[9][8]=0;
			map[10][8]=71;
			map[11][8]=40;
			map[i][9]=0;
			map[1][9]=1;
			map[4][9]=12;
			map[5][9]=13;
			map[6][9]=14;
			map[8][9]=1;
			map[9][9]=72;
			map[10][9]=15;
			map[11][9]=16;
			map[i][10]=1;
			map[2][10]=73;
			map[i][11]=0;
			map[1][11]=1;
			map[4][11]=74;
			map[5][11]=75;
			map[6][11]=76;
			map[11][11]=2;
		}
		map = setWill(map);
		return map;
	}
}
