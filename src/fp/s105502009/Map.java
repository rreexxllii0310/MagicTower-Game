package fp.s105502009;

public abstract class Map {
	private int[][] map;
	
	public Map(int[][] map) {
		this.map = map;
	}
	
	public abstract int[][] initMap(int[][] map);
	//9~19是黃鑰匙  20~21是藍鑰匙  22是紅鑰匙    //9~17是黃鑰匙  18是藍鑰匙  19是紅鑰匙       //9~16是黃鑰匙                    //9~10是黃鑰匙       //9~11是黃鑰匙 12是藍鑰匙 13是特殊鑰匙
	//30~34是黃門   35是紅門                //30~35是黃門  36是藍門                      //30~32是黃門                     //30~33是黃門 34是藍門 35是紅門 //30~33是黃門  34是藍門 35是紅門
	//40~46是紅藥水 47是藍藥水                                  //40~42是紅藥水   43~46是藍藥水       //40是藍藥水                   //40~43是紅藥水                //40是紅藥水 41~42是藍藥水
	//50是紅寶石    51是藍寶石                                                 //50~53是紅寶石   54~57是藍寶石  //50是紅寶石 51是藍寶石   //50~51是紅寶石 52~53是藍寶石   //50~51是紅寶石 52~53是藍寶石
	//-2是怪獸圖鑑                                               //-2,-3是NPC   6.7是監獄門  8是特殊門     //5是NPC    6是劍            //5是NPC  6是監獄門           //5.6是NPC    7是十字稿  8是盾
	//60~71是怪獸                                                                       //60~62是怪獸          //60~76是怪獸               //60~79是怪獸                             //60~80是怪獸
	
	public int[][] setWill(int[][] map){
		for(int i=0; i<13; i++) {
			//牆壁
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
	
	
	
//	//取得角色當前地圖
//	public boolean getPlayerMap(int mapid) {
//		
//		return true;
//	}
}
