package fp.s105502009;

public abstract class Map {
	private int[][] map;
	
	public Map(int[][] map) {
		this.map = map;
	}
	
	public abstract int[][] initMap(int[][] map);
	//9~19�O���_��  20~21�O���_��  22�O���_��    //9~17�O���_��  18�O���_��  19�O���_��       //9~16�O���_��                    //9~10�O���_��       //9~11�O���_�� 12�O���_�� 13�O�S���_��
	//30~34�O����   35�O����                //30~35�O����  36�O�Ū�                      //30~32�O����                     //30~33�O���� 34�O�Ū� 35�O���� //30~33�O����  34�O�Ū� 35�O����
	//40~46�O���Ĥ� 47�O���Ĥ�                                  //40~42�O���Ĥ�   43~46�O���Ĥ�       //40�O���Ĥ�                   //40~43�O���Ĥ�                //40�O���Ĥ� 41~42�O���Ĥ�
	//50�O���_��    51�O���_��                                                 //50~53�O���_��   54~57�O���_��  //50�O���_�� 51�O���_��   //50~51�O���_�� 52~53�O���_��   //50~51�O���_�� 52~53�O���_��
	//-2�O���~��Ų                                               //-2,-3�ONPC   6.7�O�ʺ���  8�O�S���     //5�ONPC    6�O�C            //5�ONPC  6�O�ʺ���           //5.6�ONPC    7�O�Q�r�Z  8�O��
	//60~71�O���~                                                                       //60~62�O���~          //60~76�O���~               //60~79�O���~                             //60~80�O���~
	
	public int[][] setWill(int[][] map){
		for(int i=0; i<13; i++) {
			//���
			map[0][i]=1;
			map[i][0]=1;
			map[12][i]=1;
			map[i][12]=1;
		}
		return map;
	}

	public int[][] getMap() {
		return map;
	}

	public void setMap(int[][] map) {
		this.map = map;
	}
	
	
	
//	//���o�����e�a��
//	public boolean getPlayerMap(int mapid) {
//		
//		return true;
//	}
}
