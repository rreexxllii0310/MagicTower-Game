package fp.s105502009;

public class Map2 extends Map{
	
	public Map2(int[][] map) {
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
			map[11][1]=2;
			map[1][1]=3;  
			map[i][2]=1;  
			map[7][2]=8;  
			map[i][3]=0;  
			map[2][3]=54; 
			map[3][3]=9; 
			map[4][3]=10;  
			map[6][3]=31;   
			map[8][3]=30;
			map[9][3]=11;
			map[10][3]=12;
			map[11][3]=50;
			map[i][4]=1; 
			map[1][4]=60;  
			map[7][4]=0;   
			map[i][5]=0;   
			map[2][5]=43;  
			map[3][5]=13;   
			map[4][5]=14;    
			map[6][5]=1;      
			map[8][5]=1;   
			map[9][5]=44;   
			map[10][5]=45;  
			map[11][5]=46;      
			map[i][6]=0;  
			map[1][6]=1;  
			map[2][6]=1;   
			map[3][6]=1;   
			map[4][6]=1;   
			map[6][6]=32;  
			map[8][6]=36;  
			map[9][6]=40;
			map[10][6]=41;
			map[11][6]=42;
			map[i][7]=1;   
			map[1][7]=51; 
			map[2][7]=52; 
			map[3][7]=53; 
			map[5][7]=0;   
			map[i][8]=0;   
			map[1][8]=55;  
			map[2][8]=56;   
			map[3][8]=57;
			map[4][8]=1;
			map[5][8]=34;
			map[6][8]=1;
			map[8][8]=6;
			map[11][8]=-2;
			map[i][9]=1;   
			map[1][9]=15; 
			map[2][9]=16;  
			map[3][9]=17; 
			map[5][9]=0;   
			map[6][9]=33; 
			map[7][9]=62;  
			map[i][10]=0;  
			map[1][10]=19;
			map[2][10]=18;
			map[3][10]=61;
		    map[4][10]=35; 
			map[6][10]=1;  
			map[8][10]=7; 
			map[11][10]=-3;
			map[i][11]=1;
		}
		map = setWill(map);
		return map;
	}
	
}
