package fp.s105502009;

public class Map6 extends Map{
	
	public Map6(int[][] map) {
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
			map[i][1]=1;
			map[i][2]=1;
			map[i][3]=1;
			map[i][4]=1;
			map[i][5]=1;
			map[i][6]=0;
			map[6][6]=5; //BOSS
			map[8][6]=6; //���D
			map[4][6]=35;//35����  7Ĳ�o���
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
