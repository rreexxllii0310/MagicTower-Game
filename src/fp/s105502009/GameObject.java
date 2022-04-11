package fp.s105502009;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class GameObject {
	@FXML
	private ImageView map1mon1, map1mon2, map1mon3, map1mon4, map1mon5, map1mon6, map1mon7, map1mon8, map1mon9,
			map1mon10, map1mon11, map1mon12;
	@FXML
	private ImageView map1Ydoor1, map1Ydoor2, map1Ydoor3, map1Ydoor4, map1Ydoor5;
	@FXML
	private ImageView map1Rdoor;
	@FXML
	private ImageView map1Bkey1, map1Bkey2;
	@FXML
	private ImageView map1Ykey1, map1Ykey2, map1Ykey3, map1Ykey4, map1Ykey5, map1Ykey6, map1Ykey7, map1Ykey8, map1Ykey9,
			map1Ykey10, map1Ykey11;
	@FXML
	private ImageView map1RHP1, map1RHP2, map1RHP3, map1RHP4, map1RHP5, map1RHP6, map1RHP7;
	@FXML
	private ImageView map1Rkey, Map1Rdoor, map1BHP, map1RD, map1BD, map1reader; // �U1

	@FXML
	private ImageView map2Rknight, map2Yknight1, map2Yknight2, map2prison1, map2prison2, map2Pdoor, map2Ydoor1,
			map2Ydoor2, map2Ydoor3, map2Ydoor4, map2Ydoor5, map2Ydoor6, map2Bdoor, map2oldman, map2goldman, map2talk;
	@FXML
	private ImageView map2Rkey, map2Bkey, map2Ykey1, map2Ykey2, map2Ykey3, map2Ykey4, map2Ykey5, map2Ykey6, map2Ykey7,
			map2Ykey8, map2Ykey9, map2BHP1, map2BHP2, map2BHP3, map2BHP4, map2RHP1, map2RHP2, map2RHP3, map2RD1,
			map2RD2, map2RD3, map2RD4, map2BD1, map2BD2, map2BD3, map2BD4;
	@FXML
	private ImageView map3mon1, map3mon2, map3mon3, map3mon4, map3mon5, map3mon6, map3mon7, map3mon8, map3mon9,
			map3mon10, map3mon11, map3mon12, map3mon13, map3mon14, map3mon15, map3mon16, map3mon17, map3Ydoor1,
			map3Ydoor2, map3Ydoor3;
	@FXML
	private ImageView map3Ykey1, map3Ykey2, map3Ykey3, map3Ykey4, map3Ykey5, map3Ykey6, map3Ykey7, map3Ykey8, map3BHP,
			map3RD, map3BD, map3sword;
	@FXML
	private ImageView map4mon1, map4mon2, map4mon3, map4mon4, map4mon5, map4mon6, map4mon7, map4mon8, map4mon9,
			map4mon10, map4mon11, map4mon12, map4mon13, map4mon14, map4mon15, map4mon16, map4mon17, map4mon18,
			map4mon19, map4mon20, map4Ydoor1, map4Ydoor2, map4Ydoor3, map4Ydoor4, map4Bdoor, map4Rdoor, map4prisondoor;
	@FXML
	private ImageView map4Ykey1, map4Ykey2, map4RHP1, map4RHP2, map4RHP3, map4RHP4, map4RD1, map4RD2, map4BD1, map4BD2,
			map4theif, map4talk;
	@FXML
	private ImageView map5mon1, map5mon2, map5mon3, map5mon4, map5mon5, map5mon6, map5mon7, map5mon8, map5mon9,
			map5mon10, map5mon11, map5mon12, map5mon13, map5mon14, map5mon15, map5mon16, map5mon17, map5mon18,
			map5mon19, map5mon20, map5mon21, map5Ydoor1, map5Ydoor2, map5Ydoor3, map5Ydoor4, map5Bdoor, map5Rdoor;
	@FXML
	private ImageView map5Ykey1, map5Ykey2, map5Ykey3, map5Bkey, map5Pkey, map5RHP, map5BHP1, map5BHP2, map5RD1,
			map5RD2, map5BD1, map5BD2, map5shield, map5cross;
	@FXML
	private ImageView map6Boss, map6bosstalk, map6Rdoor, map6princesstalk;
	@FXML
	private ImageView buttonImage;
	@FXML
	private ImageView stage1;
	@FXML
	private ImageView gameover, map1talk;
	@FXML
	private Label HP;
	@FXML
	private Label attack;
	@FXML
	private Label defend;
	@FXML
	private Label money;
	@FXML
	private Label exp;
	@FXML
	private Label level;
	@FXML
	private Label ykey;
	@FXML
	private Label bkey;
	@FXML
	private Label rkey;
	@FXML
	private Label l1, l2, l3;
	@FXML
	private ImageView shop;
	@FXML
	private Button shophp;
	@FXML
	private Button shopat;
	@FXML
	private Button shopdef;
	@FXML
	private Button exitshop;
	@FXML
	private ImageView oshop;
	@FXML
	private Button oshoplevel;
	@FXML
	private Button oshopat;
	@FXML
	private Button oshopdef;
	@FXML
	private Button exitoshop;
	@FXML
	private ImageView gshop;
	@FXML
	private Button gshopYkey;
	@FXML
	private Button gshopBkey;
	@FXML
	private Button gshopRkey;
	@FXML
	private Button exitgshop;
	@FXML
	private ImageView readerUI;

	// //�Ȧs�Ǫ���T
	static boolean close = false; // �P�_�O�_�����C��
	static boolean getreader = false;
	static boolean talking = false;
	static boolean talk = false;
	static boolean up = false;
	static boolean down = false;
	static boolean left = false;
	static boolean right = false;

	static boolean next8 = false; // ��ܥ�
	static boolean next7 = false;
	static boolean next6 = false;
	static boolean next5 = false;
	static boolean next4 = false;
	static boolean next3 = false;
	static boolean next2 = false;
	static boolean next1 = false;
	static boolean next = false;
	boolean turn = true;
	Main main = new Main();
	Glim glim = new Glim();
	Rlim rlim = new Rlim();
	Blim blim = new Blim();
	Nwerewolf nwerewolf = new Nwerewolf();
	Nsk nsk = new Nsk();
	Psk psk = new Psk();
	Bwizard bwizard = new Bwizard();
	Bbat bbat = new Bbat();
	Rbat rbat = new Rbat();
	Bigbat bigbat = new Bigbat();
	Jguard jguard = new Jguard();
	Yknight yknight = new Yknight();
	Rknight rknight = new Rknight();
	Boss boss = new Boss();
	List<GameMonster> MonsterList = new ArrayList<>();
	Player player;
	Random ran = new Random();
	Battle battle = new Battle();
	Map[] Map = new Map[6];

	int x = 0, y = 0;
	// ���o���e�a��
	int[][] CurrentMap = new int[13][13];

	// List<GameMonster> CurrentMonsterList = new ArrayList<>(); //���o���e�a�ϩǪ�
	// List<GameMonster> RemoveDuplicateMonsterList = new ArrayList<>
	// ();//���o���e�a�Ϥ����ƩǪ�
	void initial() {
		// ��I���B�H���Ϥ�
		gameover.setImage(new Image("file:image/Gameover.png"));
		buttonImage.setLayoutX(557); // �]�w�H���_�l�y��
		buttonImage.setLayoutY(553);
		player = new Player(11, 6, 1, 1000, 100, 100, 0, 0, 0, 1, 1, 1);// ��l��

		HP.setText(String.valueOf(player.getHp()));
		attack.setText(String.valueOf(player.getAt()));
		defend.setText(String.valueOf(player.getDef()));
		money.setText(String.valueOf(player.getMoney()));
		exp.setText(String.valueOf(player.getExp()));
		level.setText(String.valueOf(player.getLevel()));
		ykey.setText(String.valueOf(player.getYkey()));
		bkey.setText(String.valueOf(player.getBkey()));
		rkey.setText(String.valueOf(player.getRkey()));

		// �K�[�Ǫ���list
		MonsterList.add(glim); // glim�O0
		MonsterList.add(rlim); // rlim�O1
		MonsterList.add(blim); // blim�O2
		MonsterList.add(nwerewolf);// nwerewolf�O3
		MonsterList.add(nsk); // nsk�O4
		MonsterList.add(psk); // psk�O5
		MonsterList.add(bwizard); // bwizard�O6
		MonsterList.add(bbat); // bbat�O7
		MonsterList.add(jguard); // jguard�O8
		MonsterList.add(bigbat); // bigbat�O9
		MonsterList.add(rbat); // rbat�O10
		MonsterList.add(yknight); // yknight�O11
		MonsterList.add(rknight); // rknight�O12
		MonsterList.add(boss); // boss�O13

		Map[0] = new Map1(new int[13][13]);
		Map[1] = new Map2(new int[13][13]);
		Map[2] = new Map3(new int[13][13]);
		Map[3] = new Map4(new int[13][13]);
		Map[4] = new Map5(new int[13][13]);
		Map[5] = new Map6(new int[13][13]);
		// ��l�Ʀa�ϰ}�C
		for (int i = 0; i < Map.length; i++) {
			// System.out.print("\n��" + (i + 1) + "�i�a��:");
			for (int j = 0; j < 13; j++) {
				System.out.print("\n");
				for (int k = 0; k < 13; k++) {
					Map[i].initMap(Map[i].getMap());
					// System.out.print("[" + j + ", " + k + "]= ");
					// System.out.print(Map[i].getMap()[j][k] + " ");
				}
			}
		}

		CurrentMap = Map[0].getMap();// �@�}�l�a�Ϭ�Map1

		stage1.setImage(new Image("file:image/map1.png")); // ��I����
		gameover.setImage(new Image("file:image/Gameover.png"));
		buttonImage.setImage(new Image("file:image/down1.png")); // �H����
		buttonImage.setLayoutX(557); // �]�w�H���_�l�y��
		buttonImage.setLayoutY(553);
		map1mon1.setImage(new Image("file:image/Glim.png"));
		map1mon2.setImage(new Image("file:image/Rlim.png"));
		map1Rdoor.setImage(new Image("file:image/Rdoor.png"));
		map1Ydoor1.setImage(new Image("file:image/Ydoor.png"));
		map1Ydoor2.setImage(new Image("file:image/Ydoor.png"));
		map1Ydoor3.setImage(new Image("file:image/Ydoor.png"));
		map1Ydoor4.setImage(new Image("file:image/Ydoor.png"));
		map1Ydoor5.setImage(new Image("file:image/Ydoor.png"));
		map1Rkey.setImage(new Image("file:image/Rkey.png"));
		map1Bkey1.setImage(new Image("file:image/Bkey.png"));
		map1Bkey2.setImage(new Image("file:image/Bkey.png"));
		map1Ykey1.setImage(new Image("file:image/Ykey.png"));
		map1Ykey2.setImage(new Image("file:image/Ykey.png"));
		map1Ykey3.setImage(new Image("file:image/Ykey.png"));
		map1Ykey4.setImage(new Image("file:image/Ykey.png"));
		map1Ykey5.setImage(new Image("file:image/Ykey.png"));
		map1Ykey6.setImage(new Image("file:image/Ykey.png"));
		map1Ykey7.setImage(new Image("file:image/Ykey.png"));
		map1Ykey8.setImage(new Image("file:image/Ykey.png"));
		map1Ykey9.setImage(new Image("file:image/Ykey.png"));
		map1Ykey10.setImage(new Image("file:image/Ykey.png"));
		map1Ykey11.setImage(new Image("file:image/Ykey.png"));
		map1RHP1.setImage(new Image("file:image/RHP.png"));
		map1RHP2.setImage(new Image("file:image/RHP.png"));
		map1RHP3.setImage(new Image("file:image/RHP.png"));
		map1RHP4.setImage(new Image("file:image/RHP.png"));
		map1RHP5.setImage(new Image("file:image/RHP.png"));
		map1RHP6.setImage(new Image("file:image/RHP.png"));
		map1RHP7.setImage(new Image("file:image/RHP.png"));
		map1BHP.setImage(new Image("file:image/BHP.png"));
		map1BD.setImage(new Image("file:image/BD.png"));
		map1RD.setImage(new Image("file:image/RD.png"));
		map1reader.setImage(new Image("file:image/MonsterInformation.png"));

		map2Rknight.setImage(new Image("file:image/Rknight.png"));
		map2Yknight1.setImage(new Image("file:image/Yknight.png"));
		map2Yknight2.setImage(new Image("file:image/Yknight.png"));
		map2Pdoor.setImage(new Image("file:image/Pdoor.png"));
		map2prison1.setImage(new Image("file:image/prisondoor.png"));
		map2prison2.setImage(new Image("file:image/prisondoor.png"));
		map2Ydoor1.setImage(new Image("file:image/Ydoor.png"));
		map2Ydoor2.setImage(new Image("file:image/Ydoor.png"));
		map2Ydoor3.setImage(new Image("file:image/Ydoor.png"));
		map2Ydoor4.setImage(new Image("file:image/Ydoor.png"));
		map2Ydoor5.setImage(new Image("file:image/Ydoor.png"));
		map2Ydoor6.setImage(new Image("file:image/Ydoor.png"));
		map2Bdoor.setImage(new Image("file:image/Bdoor.png"));
		map2Ykey1.setImage(new Image("file:image/Ykey.png"));
		map2Ykey2.setImage(new Image("file:image/Ykey.png"));
		map2Ykey3.setImage(new Image("file:image/Ykey.png"));
		map2Ykey4.setImage(new Image("file:image/Ykey.png"));
		map2Ykey5.setImage(new Image("file:image/Ykey.png"));
		map2Ykey6.setImage(new Image("file:image/Ykey.png"));
		map2Ykey7.setImage(new Image("file:image/Ykey.png"));
		map2Ykey8.setImage(new Image("file:image/Ykey.png"));
		map2Ykey9.setImage(new Image("file:image/Ykey.png"));
		map2Bkey.setImage(new Image("file:image/Bkey.png"));
		map2Rkey.setImage(new Image("file:image/Rkey.png"));
		map2BHP1.setImage(new Image("file:image/BHP.png"));
		map2BHP2.setImage(new Image("file:image/BHP.png"));
		map2BHP3.setImage(new Image("file:image/BHP.png"));
		map2BHP4.setImage(new Image("file:image/BHP.png"));
		map2RHP1.setImage(new Image("file:image/RHP.png"));
		map2RHP2.setImage(new Image("file:image/RHP.png"));
		map2RHP3.setImage(new Image("file:image/RHP.png"));
		map2RD1.setImage(new Image("file:image/RD.png"));
		map2RD2.setImage(new Image("file:image/RD.png"));
		map2RD3.setImage(new Image("file:image/RD.png"));
		map2RD4.setImage(new Image("file:image/RD.png"));
		map2BD1.setImage(new Image("file:image/BD.png"));
		map2BD2.setImage(new Image("file:image/BD.png"));
		map2BD3.setImage(new Image("file:image/BD.png"));
		map2BD4.setImage(new Image("file:image/BD.png"));
		map2oldman.setImage(new Image("file:image/oldman.png"));
		map2goldman.setImage(new Image("file:image/goldman.png"));

		map3mon1.setImage(new Image("file:image/Rlim.png"));
		map3mon2.setImage(new Image("file:image/Glim.png"));
		map3mon3.setImage(new Image("file:image/Glim.png"));
		map3mon4.setImage(new Image("file:image/Rlim.png"));
		map3mon5.setImage(new Image("file:image/Nsk.png"));
		map3mon6.setImage(new Image("file:image/Bbat.png"));
		map3mon7.setImage(new Image("file:image/Rlim.png"));
		map3mon8.setImage(new Image("file:image/Bbat.png"));
		map3mon9.setImage(new Image("file:image/Nsk.png"));
		map3mon10.setImage(new Image("file:image/Bbat.png"));
		map3mon11.setImage(new Image("file:image/Rlim.png"));
		map3mon12.setImage(new Image("file:image/Bbat.png"));
		map3mon13.setImage(new Image("file:image/Rlim.png"));
		map3mon14.setImage(new Image("file:image/Bbat.png"));
		map3mon15.setImage(new Image("file:image/Rlim.png"));
		map3mon16.setImage(new Image("file:image/Bbat.png"));
		map3mon17.setImage(new Image("file:image/Rlim.png"));
		map3Ydoor1.setImage(new Image("file:image/Ydoor.png"));
		map3Ydoor2.setImage(new Image("file:image/Ydoor.png"));
		map3Ydoor3.setImage(new Image("file:image/Ydoor.png"));
		map3Ykey1.setImage(new Image("file:image/Ykey.png"));
		map3Ykey2.setImage(new Image("file:image/Ykey.png"));
		map3Ykey3.setImage(new Image("file:image/Ykey.png"));
		map3Ykey4.setImage(new Image("file:image/Ykey.png"));
		map3Ykey5.setImage(new Image("file:image/Ykey.png"));
		map3Ykey6.setImage(new Image("file:image/Ykey.png"));
		map3Ykey7.setImage(new Image("file:image/Ykey.png"));
		map3Ykey8.setImage(new Image("file:image/Ykey.png"));
		map3BHP.setImage(new Image("file:image/BHP.png"));
		map3RD.setImage(new Image("file:image/RD.png"));
		map3BD.setImage(new Image("file:image/BD.png"));
		map3sword.setImage(new Image("file:image/sword.png"));

		map4mon1.setImage(new Image("file:image/Bbat.png"));
		map4mon2.setImage(new Image("file:image/Bbat.png"));
		map4mon3.setImage(new Image("file:image/Rlim.png"));
		map4mon4.setImage(new Image("file:image/Blim.png"));
		map4mon5.setImage(new Image("file:image/Nsk.png"));
		map4mon6.setImage(new Image("file:image/Blim.png"));
		map4mon7.setImage(new Image("file:image/Bigbat.png"));
		map4mon8.setImage(new Image("file:image/Nwerewolf.png"));
		map4mon9.setImage(new Image("file:image/Rbat.png"));
		map4mon10.setImage(new Image("file:image/Bigbat.png"));
		map4mon11.setImage(new Image("file:image/Jguard.png"));
		map4mon12.setImage(new Image("file:image/Nwerewolf.png"));
		map4mon13.setImage(new Image("file:image/Bigbat.png"));
		map4mon14.setImage(new Image("file:image/Nwerewolf.png"));
		map4mon15.setImage(new Image("file:image/Blim.png"));
		map4mon16.setImage(new Image("file:image/Nsk.png"));
		map4mon17.setImage(new Image("file:image/Blim.png"));
		map4mon18.setImage(new Image("file:image/Bbat.png"));
		map4mon19.setImage(new Image("file:image/Bbat.png"));
		map4mon20.setImage(new Image("file:image/Rlim.png"));
		map4Ydoor1.setImage(new Image("file:image/Ydoor.png"));
		map4Ydoor2.setImage(new Image("file:image/Ydoor.png"));
		map4Ydoor3.setImage(new Image("file:image/Ydoor.png"));
		map4Ydoor4.setImage(new Image("file:image/Ydoor.png"));
		map4Bdoor.setImage(new Image("file:image/Bdoor.png"));
		map4Rdoor.setImage(new Image("file:image/Rdoor.png"));
		map4prisondoor.setImage(new Image("file:image/prisondoor.png"));
		map4Ykey1.setImage(new Image("file:image/Ykey.png"));
		map4Ykey2.setImage(new Image("file:image/Ykey.png"));
		map4RHP1.setImage(new Image("file:image/RHP.png"));
		map4RHP2.setImage(new Image("file:image/RHP.png"));
		map4RHP3.setImage(new Image("file:image/RHP.png"));
		map4RHP4.setImage(new Image("file:image/RHP.png"));
		map4RD1.setImage(new Image("file:image/RD.png"));
		map4RD2.setImage(new Image("file:image/RD.png"));
		map4BD1.setImage(new Image("file:image/BD.png"));
		map4BD2.setImage(new Image("file:image/BD.png"));
		map4theif.setImage(new Image("file:image/theif.png"));

		map5mon1.setImage(new Image("file:image/Bigbat.png"));
		map5mon2.setImage(new Image("file:image/Bigbat.png"));
		map5mon3.setImage(new Image("file:image/Bwizard.png"));
		map5mon4.setImage(new Image("file:image/bbat.png"));
		map5mon5.setImage(new Image("file:image/Blim.png"));
		map5mon6.setImage(new Image("file:image/Blim.png"));
		map5mon7.setImage(new Image("file:image/Bbat.png"));
		map5mon8.setImage(new Image("file:image/Bwizard.png"));
		map5mon9.setImage(new Image("file:image/Psk.png"));
		map5mon10.setImage(new Image("file:image/Bwizard.png"));
		map5mon11.setImage(new Image("file:image/Psk.png"));
		map5mon12.setImage(new Image("file:image/Bbat.png"));
		map5mon13.setImage(new Image("file:image/Bbat.png"));
		map5mon14.setImage(new Image("file:image/Nsk.png"));
		map5mon15.setImage(new Image("file:image/Bwizard.png"));
		map5mon16.setImage(new Image("file:image/Nwerewolf.png"));
		map5mon17.setImage(new Image("file:image/Nwerewolf.png"));
		map5mon18.setImage(new Image("file:image/Bwizard.png"));
		map5mon19.setImage(new Image("file:image/Psk.png"));
		map5mon20.setImage(new Image("file:image/Jguard.png"));
		map5mon21.setImage(new Image("file:image/Psk.png"));
		map5Ydoor1.setImage(new Image("file:image/Ydoor.png"));
		map5Ydoor2.setImage(new Image("file:image/Ydoor.png"));
		map5Ydoor3.setImage(new Image("file:image/Ydoor.png"));
		map5Ydoor4.setImage(new Image("file:image/Ydoor.png"));
		map5Bdoor.setImage(new Image("file:image/Bdoor.png"));
		map5Rdoor.setImage(new Image("file:image/Rdoor.png"));
		map5Ykey1.setImage(new Image("file:image/Ykey.png"));
		map5Ykey2.setImage(new Image("file:image/Ykey.png"));
		map5Ykey3.setImage(new Image("file:image/Ykey.png"));
		map5Bkey.setImage(new Image("file:image/Bkey.png"));
		map5Pkey.setImage(new Image("file:image/Pkey.png"));
		map5RHP.setImage(new Image("file:image/RHP.png"));
		map5BHP1.setImage(new Image("file:image/BHP.png"));
		map5BHP2.setImage(new Image("file:image/BHP.png"));
		map5RD1.setImage(new Image("file:image/RD.png"));
		map5RD2.setImage(new Image("file:image/RD.png"));
		map5BD1.setImage(new Image("file:image/BD.png"));
		map5BD2.setImage(new Image("file:image/BD.png"));
		map5shield.setImage(new Image("file:image/shield.png"));
		map5cross.setImage(new Image("file:image/cross.png"));

		map6Boss.setImage(new Image("file:image/Boss.png"));
		map6Rdoor.setImage(new Image("file:image/Rdoor.png"));

		// System.out.print("\n��" + 1 + "�i�a��:");
		// for (int j = 0; j < 13; j++) {
		// System.out.print("\n");
		// for (int k = 0; k < 13; k++) {
		// System.out.print("[" + j + ", " + k + "]= ");
		// System.out.print(CurrentMap[j][k] + " ");
		// }
		// }

	}

	//
	// public void changeMap(Scene scene,FXMLLoader fxmlLoader) {
	// Parent root = null;
	// try {
	// root = fxmlLoader.load();
	// //buttonImage.getScene().setRoot(root);
	// scene.setRoot(root);
	// } catch (IOException e) {
	// // TODO Auto-generated catch block
	// e.printStackTrace();
	// }
	// }
	public boolean isTalking() {
		return talking;
	}

	public boolean isTalk() {
		return talk;
	}

	public boolean hasReader() {
		return getreader;
	}

	public void getYKey() {
		player.setYkey(player.getYkey() + 1);
		ykey.setText(String.valueOf(player.getYkey()));
	}

	public void getBKey() {
		player.setBkey(player.getBkey() + 1);
		bkey.setText(String.valueOf(player.getBkey()));
	}

	public void getRKey() {
		player.setRkey(player.getRkey() + 1);
		rkey.setText(String.valueOf(player.getRkey()));
	}

	public void openYdoor() {
		player.setYkey(player.getYkey() - 1);
		ykey.setText(String.valueOf(player.getYkey()));
	}

	public void openBdoor() {
		player.setBkey(player.getBkey() - 1);
		bkey.setText(String.valueOf(player.getBkey()));
	}

	public void openRdoor() {
		player.setRkey(player.getRkey() - 1);
		rkey.setText(String.valueOf(player.getRkey()));
	}

	public void getSmallHp() {
		player.setHp(player.getHp() + 200);
		HP.setText(String.valueOf(player.getHp()));
	}

	public void getBigHp() {
		player.setHp(player.getHp() + 500);
		HP.setText(String.valueOf(player.getHp()));
	}

	public void getRedGem() {
		player.setAt(player.getAt() + 3);
		attack.setText(String.valueOf(player.getAt()));
	}

	public void getBlueGem() {
		player.setDef(player.getDef() + 3);
		defend.setText(String.valueOf(player.getDef()));
	}

	public void getReward(GameMonster enemy) {
		player.setExp(player.getExp() + enemy.getExp());
		player.setMoney(player.getMoney() + enemy.getMoney());
		exp.setText(String.valueOf(player.getExp()));
		money.setText(String.valueOf(player.getMoney()));
	}

	// �V�W���ާ@������ϼu
	boolean obstacleup() {
		x = player.getX();
		y = player.getY();
		if (player.getFloor() == 1) { // map 1
			if (CurrentMap[x - 1][y] == 0) {
				player.setX(player.getX() - 1);
				CurrentMap[x][y] = 0;
				CurrentMap[x - 1][y] = -1;
			} else if (CurrentMap[x - 1][y] == 1) {
				return false;
			} else if (CurrentMap[x - 1][y] == 9) {
				player.setX(player.getX() - 1);
				CurrentMap[x][y] = 0;
				CurrentMap[x - 1][y] = -1;
				getYKey();
				map1Ykey1.setImage(new Image("file:image/floor.png"));
			} else if (CurrentMap[x - 1][y] == 10) {
				player.setX(player.getX() - 1);
				CurrentMap[x][y] = 0;
				CurrentMap[x - 1][y] = -1;
				getYKey();
				map1Ykey2.setImage(new Image("file:image/floor.png"));
			} else if (CurrentMap[x - 1][y] == 11) { // map 1 �����_��
				player.setX(player.getX() - 1);
				CurrentMap[x][y] = 0;
				CurrentMap[x - 1][y] = -1;
				getYKey();
				map1Ykey3.setImage(new Image("file:image/floor.png"));
			} else if (CurrentMap[x - 1][y] == 12) {
				player.setX(player.getX() - 1);
				CurrentMap[x][y] = 0;
				CurrentMap[x - 1][y] = -1;
				getYKey();
				map1Ykey4.setImage(new Image("file:image/floor.png"));
			} else if (CurrentMap[x - 1][y] == 13) {
				player.setX(player.getX() - 1);
				CurrentMap[x][y] = 0;
				CurrentMap[x - 1][y] = -1;
				getYKey();
				map1Ykey5.setImage(new Image("file:image/floor.png"));
			} else if (CurrentMap[x - 1][y] == 14) {
				player.setX(player.getX() - 1);
				CurrentMap[x][y] = 0;
				CurrentMap[x - 1][y] = -1;
				getYKey();
				map1Ykey6.setImage(new Image("file:image/floor.png"));
			} else if (CurrentMap[x - 1][y] == 15) {
				player.setX(player.getX() - 1);
				CurrentMap[x][y] = 0;
				CurrentMap[x - 1][y] = -1;
				getYKey();
				map1Ykey7.setImage(new Image("file:image/floor.png"));
			} else if (CurrentMap[x - 1][y] == 16) {
				player.setX(player.getX() - 1);
				CurrentMap[x][y] = 0;
				CurrentMap[x - 1][y] = -1;
				getYKey();
				map1Ykey8.setImage(new Image("file:image/floor.png"));
			} else if (CurrentMap[x - 1][y] == 17) {
				player.setX(player.getX() - 1);
				CurrentMap[x][y] = 0;
				CurrentMap[x - 1][y] = -1;
				getYKey();
				map1Ykey9.setImage(new Image("file:image/floor.png"));
			} else if (CurrentMap[x - 1][y] == 18) {
				player.setX(player.getX() - 1);
				CurrentMap[x][y] = 0;
				CurrentMap[x - 1][y] = -1;
				getYKey();
				map1Ykey10.setImage(new Image("file:image/floor.png"));
			} else if (CurrentMap[x - 1][y] == 19) {
				player.setX(player.getX() - 1);
				CurrentMap[x][y] = 0;
				CurrentMap[x - 1][y] = -1;
				getYKey();
				map1Ykey11.setImage(new Image("file:image/floor.png"));
			} else if (CurrentMap[x - 1][y] == 20) {
				player.setX(player.getX() - 1);
				CurrentMap[x][y] = 0;
				CurrentMap[x - 1][y] = -1;
				getBKey();
				map1Bkey1.setImage(new Image("file:image/floor.png"));
			} else if (CurrentMap[x - 1][y] == 21) {
				player.setX(player.getX() - 1);
				CurrentMap[x][y] = 0;
				CurrentMap[x - 1][y] = -1;
				getBKey();
				map1Bkey2.setImage(new Image("file:image/floor.png"));
			} else if (CurrentMap[x - 1][y] == 22) {
				// System.out.print();
				player.setX(player.getX() - 1);
				CurrentMap[x][y] = 0;
				CurrentMap[x - 1][y] = -1;
				getRKey();
				map1Rkey.setImage(new Image("file:image/floor.png"));
			} else if (CurrentMap[x - 1][y] == 30) {
				if (player.getYkey() <= 0)
					return false;
				openYdoor();
				CurrentMap[x - 1][y] = 0;
				map1Ydoor1.setImage(new Image("file:image/floor.png"));
				return false;
			} else if (CurrentMap[x - 1][y] == 31) {
				if (player.getYkey() <= 0)
					return false;
				openYdoor();
				CurrentMap[x - 1][y] = 0;
				map1Ydoor2.setImage(new Image("file:image/floor.png"));
				return false;
			} else if (CurrentMap[x - 1][y] == 32) {
				if (player.getYkey() <= 0)
					return false;
				openYdoor();
				CurrentMap[x - 1][y] = 0;
				map1Ydoor3.setImage(new Image("file:image/floor.png"));
				return false;
			} else if (CurrentMap[x - 1][y] == 33) {
				if (player.getYkey() <= 0)
					return false;
				openYdoor();
				CurrentMap[x - 1][y] = 0;
				map1Ydoor4.setImage(new Image("file:image/floor.png"));
				return false;
			} else if (CurrentMap[x - 1][y] == 34) {
				if (player.getYkey() <= 0)
					return false;
				openYdoor();
				CurrentMap[x - 1][y] = 0;
				map1Ydoor5.setImage(new Image("file:image/floor.png"));
				return false;
			} else if (CurrentMap[x - 1][y] == 35) {
				if (player.getRkey() <= 0)
					return false;
				openRdoor();
				CurrentMap[x - 1][y] = 0;
				map1Rdoor.setImage(new Image("file:image/floor.png"));
				return false;
			} else if (CurrentMap[x - 1][y] == 40) {
				player.setX(player.getX() - 1);
				CurrentMap[x][y] = 0;
				CurrentMap[x - 1][y] = -1;
				getSmallHp();
				map1RHP1.setImage(new Image("file:image/floor.png"));
			} else if (CurrentMap[x - 1][y] == 41) {
				player.setX(player.getX() - 1);
				CurrentMap[x][y] = 0;
				CurrentMap[x - 1][y] = -1;
				getSmallHp();
				map1RHP2.setImage(new Image("file:image/floor.png"));
			} else if (CurrentMap[x - 1][y] == 42) {
				player.setX(player.getX() - 1);
				CurrentMap[x][y] = 0;
				CurrentMap[x - 1][y] = -1;
				getSmallHp();
				map1RHP3.setImage(new Image("file:image/floor.png"));
			} else if (CurrentMap[x - 1][y] == 43) {
				player.setX(player.getX() - 1);
				CurrentMap[x][y] = 0;
				CurrentMap[x - 1][y] = -1;
				getSmallHp();
				map1RHP4.setImage(new Image("file:image/floor.png"));
			} else if (CurrentMap[x - 1][y] == 44) {
				player.setX(player.getX() - 1);
				CurrentMap[x][y] = 0;
				CurrentMap[x - 1][y] = -1;
				getSmallHp();
				map1RHP5.setImage(new Image("file:image/floor.png"));
			} else if (CurrentMap[x - 1][y] == 45) {
				player.setX(player.getX() - 1);
				CurrentMap[x][y] = 0;
				CurrentMap[x - 1][y] = -1;
				getSmallHp();
				map1RHP6.setImage(new Image("file:image/floor.png"));
			} else if (CurrentMap[x - 1][y] == 46) {
				player.setX(player.getX() - 1);
				CurrentMap[x][y] = 0;
				CurrentMap[x - 1][y] = -1;
				getSmallHp();
				map1RHP7.setImage(new Image("file:image/floor.png"));
			} else if (CurrentMap[x - 1][y] == 47) {
				player.setX(player.getX() - 1);
				CurrentMap[x][y] = 0;
				CurrentMap[x - 1][y] = -1;
				getBigHp();
				map1BHP.setImage(new Image("file:image/floor.png"));
			} else if (CurrentMap[x - 1][y] == 50) {
				player.setX(player.getX() - 1);
				CurrentMap[x][y] = 0;
				CurrentMap[x - 1][y] = -1;
				getRedGem();
				map1RD.setImage(new Image("file:image/floor.png"));
			} else if (CurrentMap[x - 1][y] == 51) {
				player.setX(player.getX() - 1);
				CurrentMap[x][y] = 0;
				CurrentMap[x - 1][y] = -1;
				getBlueGem();
				map1BD.setImage(new Image("file:image/floor.png"));
			} else if (CurrentMap[x - 1][y] == 69) { // �]�w
				GameMonster enemy = MonsterList.get(2); // glim�O0//rlim�O1//blim�O2//nwerewolf�O3//nsk�O4//psk�O5//bwizard�O6//bbat�O7//jguard�O8//bigbat�O9//rbat�O10//yknight�O11//rknight�O12
				if (player.getAt() <= enemy.getDefend())
					return false;
				battle.startBattle(player, enemy, HP);
				if (player.getHp() <= 0) {// ���a���`
					gameover.setVisible(true);
					close = true;
				}
				getReward(enemy);
				CurrentMap[x - 1][y] = 0;
				map1mon10.setImage(new Image("file:image/floor.png")); // FXML�W�ĴX�ө�
				return false;

			}
		} else if (player.getFloor() == 2) { // map2
			if (CurrentMap[x - 1][y] == 0) {
				player.setX(player.getX() - 1);
				CurrentMap[x][y] = 0;
				CurrentMap[x - 1][y] = -1;
			} else if (CurrentMap[x - 1][y] == 1) {
				return false;
			} else if (CurrentMap[x - 1][y] == 3) {
				CurrentMap[x][y] = 0;
				Map[1].setMap(CurrentMap); // ��s���a��
				CurrentMap = Map[0].getMap();// �a�Ϥ�����Map1

				// FXMLLoader loader = new FXMLLoader(getClass().getResource("map1.fxml"));
				// loader.setControllerFactory(Controller -> new Controller());
				// Parent root;
				// try {
				// root = loader.load();
				// scene.setRoot(root);
				// } catch (IOException e) {
				// // TODO Auto-generated catch block
				// e.printStackTrace();
				// }
				// controller.activate("Map1", buttonImage.getScene());
				// changeMap(scene ,fxmlLoader);

				CurrentMap[x - 1][y + 1] = -1;
				// �H���վ�
				player.setX(player.getX() - 1);
				player.setY(player.getY() + 1);
				player.setFloor(1);
				stage1.setImage(new Image("file:image/map1.png"));
				buttonImage.setImage(new Image("file:image/down1.png"));
				buttonImage.setTranslateX(buttonImage.getTranslateX() + 50); // �]�w���a�ϤH����m�A���k1��

				map1mon1.setVisible(true);
				map1mon2.setVisible(true);
				map1mon3.setVisible(true);
				map1mon4.setVisible(true);
				map1mon5.setVisible(true);
				map1mon6.setVisible(true);
				map1mon7.setVisible(true);
				map1mon8.setVisible(true);
				map1mon9.setVisible(true);
				map1mon10.setVisible(true);
				map1mon11.setVisible(true);
				map1mon12.setVisible(true);
				map1Ykey1.setVisible(true);
				map1Ykey2.setVisible(true);
				map1Ykey3.setVisible(true);
				map1Ykey4.setVisible(true);
				map1Ykey5.setVisible(true);
				map1Ykey6.setVisible(true);
				map1Ykey7.setVisible(true);
				map1Ykey8.setVisible(true);
				map1Ykey9.setVisible(true);
				map1Ykey10.setVisible(true);
				map1Ykey11.setVisible(true);
				map1Bkey1.setVisible(true);
				map1Bkey2.setVisible(true);
				map1Rkey.setVisible(true);
				map1Ydoor1.setVisible(true);
				map1Ydoor2.setVisible(true);
				map1Ydoor3.setVisible(true);
				map1Ydoor4.setVisible(true);
				map1Ydoor5.setVisible(true);
				map1Rdoor.setVisible(true);
				map1RHP1.setVisible(true);
				map1RHP2.setVisible(true);
				map1RHP3.setVisible(true);
				map1RHP4.setVisible(true);
				map1RHP5.setVisible(true);
				map1RHP6.setVisible(true);
				map1RHP7.setVisible(true);
				map1BHP.setVisible(true);
				map1BD.setVisible(true);
				map1RD.setVisible(true);
				map1reader.setVisible(true);

				map2Rknight.setVisible(false);
				map2Yknight1.setVisible(false);
				map2Yknight2.setVisible(false);
				map2Pdoor.setVisible(false);
				map2prison1.setVisible(false);
				map2prison2.setVisible(false);
				map2Ydoor1.setVisible(false);
				map2Ydoor2.setVisible(false);
				map2Ydoor3.setVisible(false);
				map2Ydoor4.setVisible(false);
				map2Ydoor5.setVisible(false);
				map2Ydoor6.setVisible(false);
				map2Bdoor.setVisible(false);
				map2Ykey1.setVisible(false);
				map2Ykey2.setVisible(false);
				map2Ykey3.setVisible(false);
				map2Ykey4.setVisible(false);
				map2Ykey5.setVisible(false);
				map2Ykey6.setVisible(false);
				map2Ykey7.setVisible(false);
				map2Ykey8.setVisible(false);
				map2Ykey9.setVisible(false);
				map2Bkey.setVisible(false);
				map2Rkey.setVisible(false);
				map2BHP1.setVisible(false);
				map2BHP2.setVisible(false);
				map2BHP3.setVisible(false);
				map2BHP4.setVisible(false);
				map2RHP1.setVisible(false);
				map2RHP2.setVisible(false);
				map2RHP3.setVisible(false);
				map2RD1.setVisible(false);
				map2RD2.setVisible(false);
				map2RD3.setVisible(false);
				map2RD4.setVisible(false);
				map2BD1.setVisible(false);
				map2BD2.setVisible(false);
				map2BD3.setVisible(false);
				map2BD4.setVisible(false);
				map2oldman.setVisible(false);
				map2goldman.setVisible(false);
			} else if (CurrentMap[x - 1][y] == 9) {
				player.setX(player.getX() - 1);
				CurrentMap[x][y] = 0;
				CurrentMap[x - 1][y] = -1;
				getYKey();
				map2Ykey1.setImage(new Image("file:image/floor.png"));
			} else if (CurrentMap[x - 1][y] == 10) {
				player.setX(player.getX() - 1);
				CurrentMap[x][y] = 0;
				CurrentMap[x - 1][y] = -1;
				getYKey();
				map2Ykey2.setImage(new Image("file:image/floor.png"));
			} else if (CurrentMap[x - 1][y] == 11) {
				player.setX(player.getX() - 1);
				CurrentMap[x][y] = 0;
				CurrentMap[x - 1][y] = -1;
				getYKey();
				map2Ykey3.setImage(new Image("file:image/floor.png"));
			} else if (CurrentMap[x - 1][y] == 12) {
				player.setX(player.getX() - 1);
				CurrentMap[x][y] = 0;
				CurrentMap[x - 1][y] = -1;
				getYKey();
				map2Ykey4.setImage(new Image("file:image/floor.png"));
			} else if (CurrentMap[x - 1][y] == 13) {
				player.setX(player.getX() - 1);
				CurrentMap[x][y] = 0;
				CurrentMap[x - 1][y] = -1;
				getYKey();
				map2Ykey5.setImage(new Image("file:image/floor.png"));
			} else if (CurrentMap[x - 1][y] == 14) {
				player.setX(player.getX() - 1);
				CurrentMap[x][y] = 0;
				CurrentMap[x - 1][y] = -1;
				getYKey();
				map2Ykey6.setImage(new Image("file:image/floor.png"));
			} else if (CurrentMap[x - 1][y] == 15) {
				player.setX(player.getX() - 1);
				CurrentMap[x][y] = 0;
				CurrentMap[x - 1][y] = -1;
				getYKey();
				map2Ykey7.setImage(new Image("file:image/floor.png"));
			} else if (CurrentMap[x - 1][y] == 16) {
				player.setX(player.getX() - 1);
				CurrentMap[x][y] = 0;
				CurrentMap[x - 1][y] = -1;
				getYKey();
				map2Ykey8.setImage(new Image("file:image/floor.png"));
			} else if (CurrentMap[x - 1][y] == 17) {
				player.setX(player.getX() - 1);
				CurrentMap[x][y] = 0;
				CurrentMap[x - 1][y] = -1;
				getYKey();
				map2Ykey9.setImage(new Image("file:image/floor.png"));
			} else if (CurrentMap[x - 1][y] == 18) { // ��
				player.setX(player.getX() - 1);
				CurrentMap[x][y] = 0;
				CurrentMap[x - 1][y] = -1;
				getBKey();
				map2Bkey.setImage(new Image("file:image/floor.png"));
			} else if (CurrentMap[x - 1][y] == 19) { // ��
				player.setX(player.getX() - 1);
				CurrentMap[x][y] = 0;
				CurrentMap[x - 1][y] = -1;
				getRKey();
				map2Rkey.setImage(new Image("file:image/floor.png"));
			} else if (CurrentMap[x - 1][y] == 30) {
				if (player.getYkey() <= 0)
					return false;
				openYdoor();
				CurrentMap[x - 1][y] = 0;
				map2Ydoor1.setImage(new Image("file:image/floor.png"));
				return false;
			} else if (CurrentMap[x - 1][y] == 31) {
				if (player.getYkey() <= 0)
					return false;
				openYdoor();
				CurrentMap[x - 1][y] = 0;
				map2Ydoor2.setImage(new Image("file:image/floor.png"));
				return false;
			} else if (CurrentMap[x - 1][y] == 32) {
				if (player.getYkey() <= 0)
					return false;
				openYdoor();
				CurrentMap[x - 1][y] = 0;
				map2Ydoor3.setImage(new Image("file:image/floor.png"));
				return false;
			} else if (CurrentMap[x - 1][y] == 33) {
				if (player.getYkey() <= 0)
					return false;
				openYdoor();
				CurrentMap[x - 1][y] = 0;
				map2Ydoor4.setImage(new Image("file:image/floor.png"));
				return false;
			} else if (CurrentMap[x - 1][y] == 34) {
				if (player.getYkey() <= 0)
					return false;
				openYdoor();
				CurrentMap[x - 1][y] = 0;
				map2Ydoor5.setImage(new Image("file:image/floor.png"));
				return false;
			} else if (CurrentMap[x - 1][y] == 35) {
				if (player.getYkey() <= 0)
					return false;
				openYdoor();
				CurrentMap[x - 1][y] = 0;
				map2Ydoor6.setImage(new Image("file:image/floor.png"));
				return false;
			} else if (CurrentMap[x - 1][y] == 36) {
				if (player.getBkey() <= 0)
					return false;
				openBdoor();
				CurrentMap[x - 1][y] = 0;
				map2Bdoor.setImage(new Image("file:image/floor.png"));
				return false;
			} else if (CurrentMap[x - 1][y] == 40) {
				player.setX(player.getX() - 1);
				CurrentMap[x][y] = 0;
				CurrentMap[x - 1][y] = -1;
				getSmallHp();
				map2RHP1.setImage(new Image("file:image/floor.png"));
			} else if (CurrentMap[x - 1][y] == 41) {
				player.setX(player.getX() - 1);
				CurrentMap[x][y] = 0;
				CurrentMap[x - 1][y] = -1;
				getSmallHp();
				map2RHP2.setImage(new Image("file:image/floor.png"));
			} else if (CurrentMap[x - 1][y] == 42) {
				player.setX(player.getX() - 1);
				CurrentMap[x][y] = 0;
				CurrentMap[x - 1][y] = -1;
				getSmallHp();
				map2RHP3.setImage(new Image("file:image/floor.png"));
			} else if (CurrentMap[x - 1][y] == 43) {
				player.setX(player.getX() - 1);
				CurrentMap[x][y] = 0;
				CurrentMap[x - 1][y] = -1;
				getBigHp();
				map2BHP1.setImage(new Image("file:image/floor.png"));
			} else if (CurrentMap[x - 1][y] == 44) {
				player.setX(player.getX() - 1);
				CurrentMap[x][y] = 0;
				CurrentMap[x - 1][y] = -1;
				getBigHp();
				map2BHP2.setImage(new Image("file:image/floor.png"));
			} else if (CurrentMap[x - 1][y] == 45) {
				player.setX(player.getX() - 1);
				CurrentMap[x][y] = 0;
				CurrentMap[x - 1][y] = -1;
				getBigHp();
				map2BHP3.setImage(new Image("file:image/floor.png"));
			} else if (CurrentMap[x - 1][y] == 46) {
				player.setX(player.getX() - 1);
				CurrentMap[x][y] = 0;
				CurrentMap[x - 1][y] = -1;
				getBigHp();
				map2BHP4.setImage(new Image("file:image/floor.png"));
			} else if (CurrentMap[x - 1][y] == 50) {
				player.setX(player.getX() - 1);
				CurrentMap[x][y] = 0;
				CurrentMap[x - 1][y] = -1;
				getRedGem();
				map2RD1.setImage(new Image("file:image/floor.png"));
			} else if (CurrentMap[x - 1][y] == 51) {
				player.setX(player.getX() - 1);
				CurrentMap[x][y] = 0;
				CurrentMap[x - 1][y] = -1;
				getRedGem();
				map2RD2.setImage(new Image("file:image/floor.png"));
			} else if (CurrentMap[x - 1][y] == 52) {
				player.setX(player.getX() - 1);
				CurrentMap[x][y] = 0;
				CurrentMap[x - 1][y] = -1;
				getRedGem();
				map2RD3.setImage(new Image("file:image/floor.png"));
			} else if (CurrentMap[x - 1][y] == 53) {
				player.setX(player.getX() - 1);
				CurrentMap[x][y] = 0;
				CurrentMap[x - 1][y] = -1;
				getRedGem();
				map2RD4.setImage(new Image("file:image/floor.png"));
			} else if (CurrentMap[x - 1][y] == 54) {
				player.setX(player.getX() - 1);
				CurrentMap[x][y] = 0;
				CurrentMap[x - 1][y] = -1;
				getBlueGem();
				map2BD1.setImage(new Image("file:image/floor.png"));
			} else if (CurrentMap[x - 1][y] == 55) {
				player.setX(player.getX() - 1);
				CurrentMap[x][y] = 0;
				CurrentMap[x - 1][y] = -1;
				getBlueGem();
				map2BD2.setImage(new Image("file:image/floor.png"));
			} else if (CurrentMap[x - 1][y] == 56) {
				player.setX(player.getX() - 1);
				CurrentMap[x][y] = 0;
				CurrentMap[x - 1][y] = -1;
				getBlueGem();
				map2BD3.setImage(new Image("file:image/floor.png"));
			} else if (CurrentMap[x - 1][y] == 57) {
				player.setX(player.getX() - 1);
				CurrentMap[x][y] = 0;
				CurrentMap[x - 1][y] = -1;
				getBlueGem();
				map2BD4.setImage(new Image("file:image/floor.png"));
			} else if (CurrentMap[x - 1][y] == 61) { // �]�w
				GameMonster enemy = MonsterList.get(11); // glim�O0//rlim�O1//blim�O2//nwerewolf�O3//nsk�O4//psk�O5//bwizard�O6//bbat�O7//jguard�O8//bigbat�O9//rbat�O10//yknight�O11//rknight�O12
				if (player.getAt() <= enemy.getDefend())
					return false;
				battle.startBattle(player, enemy, HP);
				if (player.getHp() <= 0) {// ���a���`
					gameover.setVisible(true);
					close = true;
				}
				getReward(enemy);
				CurrentMap[x - 1][y] = 0;
				map2Yknight1.setImage(new Image("file:image/floor.png")); // �]�w
				return false;
			}
		} else if (player.getFloor() == 3) {// map 3
			if (CurrentMap[x - 1][y] == 0) {
				player.setX(player.getX() - 1);
				CurrentMap[x][y] = 0;
				CurrentMap[x - 1][y] = -1;
			} else if (CurrentMap[x - 1][y] == 1) {
				return false;
			} else if (CurrentMap[x - 1][y] == 5) {
				Shop Shop = new Shop();
				talking = true;
				talk = true;
				shop.setVisible(true);
				shophp.setVisible(true);
				shopdef.setVisible(true);
				shopat.setVisible(true);
				exitshop.setVisible(true);
				Shop.abilityShop(player, shop.getScene());
				return false;
			} else if (CurrentMap[x - 1][y] == 6) {
				player.setX(player.getX() - 1);
				CurrentMap[x][y] = 0;
				CurrentMap[x - 1][y] = -1;
				player.setAt(player.getAt() + 10);
				attack.setText(String.valueOf(player.getAt()));
				map3sword.setImage(new Image("file:image/floor.png"));
			} else if (CurrentMap[x - 1][y] == 9) {
				player.setX(player.getX() - 1);
				CurrentMap[x][y] = 0;
				CurrentMap[x - 1][y] = -1;
				getYKey();
				map3Ykey1.setImage(new Image("file:image/floor.png"));
			} else if (CurrentMap[x - 1][y] == 10) {
				player.setX(player.getX() - 1);
				CurrentMap[x][y] = 0;
				CurrentMap[x - 1][y] = -1;
				getYKey();
				map3Ykey2.setImage(new Image("file:image/floor.png"));

			} else if (CurrentMap[x - 1][y] == 11) {
				player.setX(player.getX() - 1);
				CurrentMap[x][y] = 0;
				CurrentMap[x - 1][y] = -1;
				getYKey();
				map3Ykey3.setImage(new Image("file:image/floor.png"));
			} else if (CurrentMap[x - 1][y] == 12) {
				player.setX(player.getX() - 1);
				CurrentMap[x][y] = 0;
				CurrentMap[x - 1][y] = -1;
				getYKey();
				map3Ykey4.setImage(new Image("file:image/floor.png"));
			} else if (CurrentMap[x - 1][y] == 13) {
				player.setX(player.getX() - 1);
				CurrentMap[x][y] = 0;
				CurrentMap[x - 1][y] = -1;
				getYKey();
				map3Ykey5.setImage(new Image("file:image/floor.png"));
			} else if (CurrentMap[x - 1][y] == 14) {
				player.setX(player.getX() - 1);
				CurrentMap[x][y] = 0;
				CurrentMap[x - 1][y] = -1;
				getYKey();
				map3Ykey6.setImage(new Image("file:image/floor.png"));
			} else if (CurrentMap[x - 1][y] == 15) {
				player.setX(player.getX() - 1);
				CurrentMap[x][y] = 0;
				CurrentMap[x - 1][y] = -1;
				getYKey();
				map3Ykey7.setImage(new Image("file:image/floor.png"));
			} else if (CurrentMap[x - 1][y] == 16) {
				player.setX(player.getX() - 1);
				CurrentMap[x][y] = 0;
				CurrentMap[x - 1][y] = -1;
				getYKey();
				map3Ykey8.setImage(new Image("file:image/floor.png"));
			} else if (CurrentMap[x - 1][y] == 30) {
				if (player.getYkey() <= 0)
					return false;
				openYdoor();
				CurrentMap[x - 1][y] = 0;
				map3Ydoor1.setImage(new Image("file:image/floor.png"));
				return false;
			} else if (CurrentMap[x - 1][y] == 31) {
				if (player.getYkey() <= 0)
					return false;
				openYdoor();
				CurrentMap[x - 1][y] = 0;
				map3Ydoor2.setImage(new Image("file:image/floor.png"));
				return false;
			} else if (CurrentMap[x - 1][y] == 32) {
				if (player.getYkey() <= 0)
					return false;
				openYdoor();
				CurrentMap[x - 1][y] = 0;
				map3Ydoor3.setImage(new Image("file:image/floor.png"));
				return false;
			} else if (CurrentMap[x - 1][y] == 40) {
				player.setX(player.getX() - 1);
				CurrentMap[x][y] = 0;
				CurrentMap[x - 1][y] = -1;
				getBigHp();
				map3BHP.setImage(new Image("file:image/floor.png"));
			} else if (CurrentMap[x - 1][y] == 50) {
				player.setX(player.getX() - 1);
				CurrentMap[x][y] = 0;
				CurrentMap[x - 1][y] = -1;
				getRedGem();
				map3RD.setImage(new Image("file:image/floor.png"));
			} else if (CurrentMap[x - 1][y] == 51) {
				player.setX(player.getX() - 1);
				CurrentMap[x][y] = 0;
				CurrentMap[x - 1][y] = -1;
				getBlueGem();
				map3BD.setImage(new Image("file:image/floor.png"));
			} else if (CurrentMap[x - 1][y] == 60) { // �]�w
				GameMonster enemy = MonsterList.get(1); // glim�O0//rlim�O1//blim�O2//nwerewolf�O3//nsk�O4//psk�O5//bwizard�O6//bbat�O7//jguard�O8//bigbat�O9//rbat�O10//yknight�O11//rknight�O12
				if (player.getAt() <= enemy.getDefend())
					return false;
				battle.startBattle(player, enemy, HP);
				if (player.getHp() <= 0) {// ���a���`
					gameover.setVisible(true);
					close = true;
				}
				getReward(enemy);
				CurrentMap[x - 1][y] = 0;
				map3mon1.setImage(new Image("file:image/floor.png")); // �]�w
				return false;
			} else if (CurrentMap[x - 1][y] == 61) { // �]�w
				GameMonster enemy = MonsterList.get(0); // glim�O0//rlim�O1//blim�O2//nwerewolf�O3//nsk�O4//psk�O5//bwizard�O6//bbat�O7//jguard�O8//bigbat�O9//rbat�O10//yknight�O11//rknight�O12
				if (player.getAt() <= enemy.getDefend())
					return false;
				battle.startBattle(player, enemy, HP);
				if (player.getHp() <= 0) {// ���a���`
					gameover.setVisible(true);
					close = true;
				}
				getReward(enemy);
				CurrentMap[x - 1][y] = 0;
				map3mon2.setImage(new Image("file:image/floor.png")); // �]�w
				return false;
			} else if (CurrentMap[x - 1][y] == 62) { // �]�w
				GameMonster enemy = MonsterList.get(0); // glim�O0//rlim�O1//blim�O2//nwerewolf�O3//nsk�O4//psk�O5//bwizard�O6//bbat�O7//jguard�O8//bigbat�O9//rbat�O10//yknight�O11//rknight�O12
				if (player.getAt() <= enemy.getDefend())
					return false;
				battle.startBattle(player, enemy, HP);
				if (player.getHp() <= 0) {// ���a���`
					gameover.setVisible(true);
					close = true;
				}
				getReward(enemy);
				CurrentMap[x - 1][y] = 0;
				map3mon3.setImage(new Image("file:image/floor.png")); // �]�w
				return false;
			} else if (CurrentMap[x - 1][y] == 63) { // �]�w
				GameMonster enemy = MonsterList.get(1); // glim�O0//rlim�O1//blim�O2//nwerewolf�O3//nsk�O4//psk�O5//bwizard�O6//bbat�O7//jguard�O8//bigbat�O9//rbat�O10//yknight�O11//rknight�O12
				if (player.getAt() <= enemy.getDefend())
					return false;
				battle.startBattle(player, enemy, HP);
				if (player.getHp() <= 0) {// ���a���`
					gameover.setVisible(true);
					close = true;
				}
				getReward(enemy);
				CurrentMap[x - 1][y] = 0;
				map3mon4.setImage(new Image("file:image/floor.png")); // �]�w
				return false;
			} else if (CurrentMap[x - 1][y] == 64) { // �]�w
				GameMonster enemy = MonsterList.get(4); // glim�O0//rlim�O1//blim�O2//nwerewolf�O3//nsk�O4//psk�O5//bwizard�O6//bbat�O7//jguard�O8//bigbat�O9//rbat�O10//yknight�O11//rknight�O12
				if (player.getAt() <= enemy.getDefend())
					return false;
				battle.startBattle(player, enemy, HP);
				if (player.getHp() <= 0) {// ���a���`
					gameover.setVisible(true);
					close = true;
				}
				getReward(enemy);
				CurrentMap[x - 1][y] = 0;
				map3mon5.setImage(new Image("file:image/floor.png")); // �]�w
				return false;
			} else if (CurrentMap[x - 1][y] == 67) { // �]�w
				GameMonster enemy = MonsterList.get(7); // glim�O0//rlim�O1//blim�O2//nwerewolf�O3//nsk�O4//psk�O5//bwizard�O6//bbat�O7//jguard�O8//bigbat�O9//rbat�O10//yknight�O11//rknight�O12
				if (player.getAt() <= enemy.getDefend())
					return false;
				battle.startBattle(player, enemy, HP);
				if (player.getHp() <= 0) {// ���a���`
					gameover.setVisible(true);
					close = true;
				}
				getReward(enemy);
				CurrentMap[x - 1][y] = 0;
				map3mon8.setImage(new Image("file:image/floor.png")); // �]�w
				return false;
			} else if (CurrentMap[x - 1][y] == 70) { // �]�w
				GameMonster enemy = MonsterList.get(1); // glim�O0//rlim�O1//blim�O2//nwerewolf�O3//nsk�O4//psk�O5//bwizard�O6//bbat�O7//jguard�O8//bigbat�O9//rbat�O10//yknight�O11//rknight�O12
				if (player.getAt() <= enemy.getDefend())
					return false;
				battle.startBattle(player, enemy, HP);
				if (player.getHp() <= 0) {// ���a���`
					gameover.setVisible(true);
					close = true;
				}
				getReward(enemy);
				CurrentMap[x - 1][y] = 0;
				map3mon11.setImage(new Image("file:image/floor.png")); // �]�w
				return false;
			} else if (CurrentMap[x - 1][y] == 71) { // �]�w
				GameMonster enemy = MonsterList.get(7); // glim�O0//rlim�O1//blim�O2//nwerewolf�O3//nsk�O4//psk�O5//bwizard�O6//bbat�O7//jguard�O8//bigbat�O9//rbat�O10//yknight�O11//rknight�O12
				if (player.getAt() <= enemy.getDefend())
					return false;
				battle.startBattle(player, enemy, HP);
				if (player.getHp() <= 0) {// ���a���`
					gameover.setVisible(true);
					close = true;
				}
				getReward(enemy);
				CurrentMap[x - 1][y] = 0;
				map3mon12.setImage(new Image("file:image/floor.png")); // �]�w
				return false;
			} else if (CurrentMap[x - 1][y] == 72) { // �]�w
				GameMonster enemy = MonsterList.get(1); // glim�O0//rlim�O1//blim�O2//nwerewolf�O3//nsk�O4//psk�O5//bwizard�O6//bbat�O7//jguard�O8//bigbat�O9//rbat�O10//yknight�O11//rknight�O12
				if (player.getAt() <= enemy.getDefend())
					return false;
				battle.startBattle(player, enemy, HP);
				if (player.getHp() <= 0) {// ���a���`
					gameover.setVisible(true);
					close = true;
				}
				getReward(enemy);
				CurrentMap[x - 1][y] = 0;
				map3mon13.setImage(new Image("file:image/floor.png")); // �]�w
				return false;
			}
		} else if (player.getFloor() == 4) {// map4
			if (CurrentMap[x - 1][y] == 0) {
				player.setX(player.getX() - 1);
				CurrentMap[x][y] = 0;
				CurrentMap[x - 1][y] = -1;
			} else if (CurrentMap[x - 1][y] == 1) {
				return false;
			} else if (CurrentMap[x - 1][y] == 5) {
				talking = true;
				talk = true;
				up = true;
				if (map4talk.isVisible() == false) {
					map4talk.setImage(new Image("file:image/Theiftalk1.png"));
					map4talk.setVisible(true);
					next = true;
				} else if (next == true && map4talk.isVisible() == true) {
					map4talk.setImage(new Image("file:image/Theiftalk2.png"));
					next = false;
					next2 = true;
				} else if (next2 == true && map4talk.isVisible() == true) {
					map4talk.setImage(new Image("file:image/Theiftalk3.png"));
					next2 = false;
					next3 = true;
				} else if (next3 == true && map4talk.isVisible() == true) {
					map4talk.setImage(new Image("file:image/Theiftalk4.png"));
					next3 = false;
					next4 = true;
				} else if (next4 == true && map4talk.isVisible() == true) {
					map4talk.setImage(new Image("file:image/Theiftalk5.png"));
					next4 = false;
					next5 = true;
				} else if (next5 == true && map4talk.isVisible() == true) {
					map4talk.setImage(new Image("file:image/Theiftalk6.png"));
					next5 = false;
					next6 = true;
				} else if (next6 == true && map4talk.isVisible() == true) {
					map4talk.setImage(new Image("file:image/Theiftalk7.png"));
					next6 = false;
					next7 = true;
				} else if (next7 == true && map4talk.isVisible() == true) {
					map4talk.setImage(new Image("file:image/Theiftalk8.png"));
					next7 = false;
					next8 = true;
				} else if (next8 == true && map4talk.isVisible() == true) {
					map2Pdoor.setImage(new Image("file:image/floor.png"));
					map4theif.setImage(new Image("file:image/floor.png"));
					map4talk.setVisible(false);
					CurrentMap[x - 1][y] = 0;
					Map[1].getMap()[7][2] = 0;
					next8 = false;
					talk = false;
					up = false;
					talking = false;
				}
				return false;
			} else if (CurrentMap[x - 1][y] == 6) {
				CurrentMap[x - 1][y] = 0;
				map4prisondoor.setImage(new Image("file:image/floor.png"));
				return false;
			} else if (CurrentMap[x - 1][y] == 9) {
				player.setX(player.getX() - 1);
				CurrentMap[x][y] = 0;
				CurrentMap[x - 1][y] = -1;
				getYKey();
				map4Ykey1.setImage(new Image("file:image/floor.png"));
			} else if (CurrentMap[x - 1][y] == 10) {
				player.setX(player.getX() - 1);
				CurrentMap[x][y] = 0;
				CurrentMap[x - 1][y] = -1;
				getYKey();
				map4Ykey2.setImage(new Image("file:image/floor.png"));
			} else if (CurrentMap[x - 1][y] == 31) {
				if (player.getYkey() <= 0)
					return false;
				openYdoor();
				CurrentMap[x - 1][y] = 0;
				map4Ydoor2.setImage(new Image("file:image/floor.png"));
				return false;
			} else if (CurrentMap[x - 1][y] == 33) {
				if (player.getYkey() <= 0)
					return false;
				openYdoor();
				CurrentMap[x - 1][y] = 0;
				map4Ydoor4.setImage(new Image("file:image/floor.png"));
				return false;
			} else if (CurrentMap[x - 1][y] == 34) {
				if (player.getBkey() <= 0)
					return false;
				openBdoor();
				CurrentMap[x - 1][y] = 0;
				map4Bdoor.setImage(new Image("file:image/floor.png"));
				return false;
			} else if (CurrentMap[x - 1][y] == 35) {
				if (player.getRkey() <= 0)
					return false;
				openRdoor();
				CurrentMap[x - 1][y] = 0;
				map4Rdoor.setImage(new Image("file:image/floor.png"));
				return false;
			} else if (CurrentMap[x - 1][y] == 40) {
				player.setX(player.getX() - 1);
				CurrentMap[x][y] = 0;
				CurrentMap[x - 1][y] = -1;
				getSmallHp();
				map4RHP1.setImage(new Image("file:image/floor.png"));
			} else if (CurrentMap[x - 1][y] == 41) {
				player.setX(player.getX() - 1);
				CurrentMap[x][y] = 0;
				CurrentMap[x - 1][y] = -1;
				getSmallHp();
				map4RHP2.setImage(new Image("file:image/floor.png"));
			} else if (CurrentMap[x - 1][y] == 64) { // �]�w
				GameMonster enemy = MonsterList.get(4); // glim�O0//rlim�O1//blim�O2//nwerewolf�O3//nsk�O4//psk�O5//bwizard�O6//bbat�O7//jguard�O8//bigbat�O9//rbat�O10//yknight�O11//rknight�O12
				if (player.getAt() <= enemy.getDefend())
					return false;
				battle.startBattle(player, enemy, HP);
				if (player.getHp() <= 0) {// ���a���`
					gameover.setVisible(true);
					close = true;
				}
				getReward(enemy);
				CurrentMap[x - 1][y] = 0;
				map4mon5.setImage(new Image("file:image/floor.png")); // �]�w
				return false;
			} else if (CurrentMap[x - 1][y] == 66) { // �]�w
				GameMonster enemy = MonsterList.get(9); // glim�O0//rlim�O1//blim�O2//nwerewolf�O3//nsk�O4//psk�O5//bwizard�O6//bbat�O7//jguard�O8//bigbat�O9//rbat�O10//yknight�O11//rknight�O12
				if (player.getAt() <= enemy.getDefend())
					return false;
				battle.startBattle(player, enemy, HP);
				if (player.getHp() <= 0) {// ���a���`
					gameover.setVisible(true);
					close = true;
				}
				getReward(enemy);
				CurrentMap[x - 1][y] = 0;
				map4mon7.setImage(new Image("file:image/floor.png")); // �]�w
				return false;
			} else if (CurrentMap[x - 1][y] == 67) { // �]�w
				GameMonster enemy = MonsterList.get(3); // glim�O0//rlim�O1//blim�O2//nwerewolf�O3//nsk�O4//psk�O5//bwizard�O6//bbat�O7//jguard�O8//bigbat�O9//rbat�O10//yknight�O11//rknight�O12
				if (player.getAt() <= enemy.getDefend())
					return false;
				battle.startBattle(player, enemy, HP);
				if (player.getHp() <= 0) {// ���a���`
					gameover.setVisible(true);
					close = true;
				}
				getReward(enemy);
				CurrentMap[x - 1][y] = 0;
				map4mon8.setImage(new Image("file:image/floor.png")); // �]�w
				return false;
			} else if (CurrentMap[x - 1][y] == 68) { // �]�w
				GameMonster enemy = MonsterList.get(10); // glim�O0//rlim�O1//blim�O2//nwerewolf�O3//nsk�O4//psk�O5//bwizard�O6//bbat�O7//jguard�O8//bigbat�O9//rbat�O10//yknight�O11//rknight�O12
				if (player.getAt() <= enemy.getDefend())
					return false;
				battle.startBattle(player, enemy, HP);
				if (player.getHp() <= 0) {// ���a���`
					gameover.setVisible(true);
					close = true;
				}
				getReward(enemy);
				CurrentMap[x - 1][y] = 0;
				map4mon9.setImage(new Image("file:image/floor.png")); // �]�w
				return false;
			} else if (CurrentMap[x - 1][y] == 69) { // �]�w
				GameMonster enemy = MonsterList.get(9); // glim�O0//rlim�O1//blim�O2//nwerewolf�O3//nsk�O4//psk�O5//bwizard�O6//bbat�O7//jguard�O8//bigbat�O9//rbat�O10//yknight�O11//rknight�O12
				if (player.getAt() <= enemy.getDefend())
					return false;
				battle.startBattle(player, enemy, HP);
				if (player.getHp() <= 0) {// ���a���`
					gameover.setVisible(true);
					close = true;
				}
				getReward(enemy);
				CurrentMap[x - 1][y] = 0;
				map4mon10.setImage(new Image("file:image/floor.png")); // �]�w
				return false;
			} else if (CurrentMap[x - 1][y] == 70) { // �]�w
				GameMonster enemy = MonsterList.get(8); // glim�O0//rlim�O1//blim�O2//nwerewolf�O3//nsk�O4//psk�O5//bwizard�O6//bbat�O7//jguard�O8//bigbat�O9//rbat�O10//yknight�O11//rknight�O12
				if (player.getAt() <= enemy.getDefend())
					return false;
				battle.startBattle(player, enemy, HP);
				if (player.getHp() <= 0) {// ���a���`
					gameover.setVisible(true);
					close = true;
				}
				getReward(enemy);
				CurrentMap[x - 1][y] = 0;
				map4mon11.setImage(new Image("file:image/floor.png")); // �]�w
				return false;
			} else if (CurrentMap[x - 1][y] == 71) { // �]�w
				GameMonster enemy = MonsterList.get(3); // glim�O0//rlim�O1//blim�O2//nwerewolf�O3//nsk�O4//psk�O5//bwizard�O6//bbat�O7//jguard�O8//bigbat�O9//rbat�O10//yknight�O11//rknight�O12
				if (player.getAt() <= enemy.getDefend())
					return false;
				battle.startBattle(player, enemy, HP);
				if (player.getHp() <= 0) {// ���a���`
					gameover.setVisible(true);
					close = true;
				}
				getReward(enemy);
				CurrentMap[x - 1][y] = 0;
				map4mon12.setImage(new Image("file:image/floor.png")); // �]�w
				return false;
			} else if (CurrentMap[x - 1][y] == 72) { // �]�w
				GameMonster enemy = MonsterList.get(9); // glim�O0//rlim�O1//blim�O2//nwerewolf�O3//nsk�O4//psk�O5//bwizard�O6//bbat�O7//jguard�O8//bigbat�O9//rbat�O10//yknight�O11//rknight�O12
				if (player.getAt() <= enemy.getDefend())
					return false;
				battle.startBattle(player, enemy, HP);
				if (player.getHp() <= 0) {// ���a���`
					gameover.setVisible(true);
					close = true;
				}
				getReward(enemy);
				CurrentMap[x - 1][y] = 0;
				map4mon13.setImage(new Image("file:image/floor.png")); // �]�w
				return false;
			} else if (CurrentMap[x - 1][y] == 73) { // �]�w
				GameMonster enemy = MonsterList.get(3); // glim�O0//rlim�O1//blim�O2//nwerewolf�O3//nsk�O4//psk�O5//bwizard�O6//bbat�O7//jguard�O8//bigbat�O9//rbat�O10//yknight�O11//rknight�O12
				if (player.getAt() <= enemy.getDefend())
					return false;
				battle.startBattle(player, enemy, HP);
				if (player.getHp() <= 0) {// ���a���`
					gameover.setVisible(true);
					close = true;
				}
				getReward(enemy);
				CurrentMap[x - 1][y] = 0;
				map4mon14.setImage(new Image("file:image/floor.png")); // �]�w
				return false;
			} else if (CurrentMap[x - 1][y] == 75) { // �]�w
				GameMonster enemy = MonsterList.get(4); // glim�O0//rlim�O1//blim�O2//nwerewolf�O3//nsk�O4//psk�O5//bwizard�O6//bbat�O7//jguard�O8//bigbat�O9//rbat�O10//yknight�O11//rknight�O12
				if (player.getAt() <= enemy.getDefend())
					return false;
				battle.startBattle(player, enemy, HP);
				if (player.getHp() <= 0) {// ���a���`
					gameover.setVisible(true);
					close = true;
				}
				getReward(enemy);
				CurrentMap[x - 1][y] = 0;
				map4mon16.setImage(new Image("file:image/floor.png")); // �]�w
				return false;
			} else if (CurrentMap[x - 1][y] == 77) { // �]�w
				GameMonster enemy = MonsterList.get(7); // glim�O0//rlim�O1//blim�O2//nwerewolf�O3//nsk�O4//psk�O5//bwizard�O6//bbat�O7//jguard�O8//bigbat�O9//rbat�O10//yknight�O11//rknight�O12
				if (player.getAt() <= enemy.getDefend())
					return false;
				battle.startBattle(player, enemy, HP);
				if (player.getHp() <= 0) {// ���a���`
					gameover.setVisible(true);
					close = true;
				}
				getReward(enemy);
				CurrentMap[x - 1][y] = 0;
				map4mon18.setImage(new Image("file:image/floor.png")); // �]�w
				return false;
			} else if (CurrentMap[x - 1][y] == 78) { // �]�w
				GameMonster enemy = MonsterList.get(7); // glim�O0//rlim�O1//blim�O2//nwerewolf�O3//nsk�O4//psk�O5//bwizard�O6//bbat�O7//jguard�O8//bigbat�O9//rbat�O10//yknight�O11//rknight�O12
				if (player.getAt() <= enemy.getDefend())
					return false;
				battle.startBattle(player, enemy, HP);
				if (player.getHp() <= 0) {// ���a���`
					gameover.setVisible(true);
					close = true;
				}
				getReward(enemy);
				CurrentMap[x - 1][y] = 0;
				map4mon19.setImage(new Image("file:image/floor.png")); // �]�w
				return false;
			} else if (CurrentMap[x - 1][y] == 79) { // �]�w
				GameMonster enemy = MonsterList.get(1); // glim�O0//rlim�O1//blim�O2//nwerewolf�O3//nsk�O4//psk�O5//bwizard�O6//bbat�O7//jguard�O8//bigbat�O9//rbat�O10//yknight�O11//rknight�O12
				if (player.getAt() <= enemy.getDefend())
					return false;
				battle.startBattle(player, enemy, HP);
				if (player.getHp() <= 0) {// ���a���`
					gameover.setVisible(true);
					close = true;
				}
				getReward(enemy);
				CurrentMap[x - 1][y] = 0;
				map4mon20.setImage(new Image("file:image/floor.png")); // �]�w
				return false;
			}
		} else if (player.getFloor() == 5) {// map5
			if (CurrentMap[x - 1][y] == 0) {
				player.setX(player.getX() - 1);
				CurrentMap[x][y] = 0;
				CurrentMap[x - 1][y] = -1;
			} else if (CurrentMap[x - 1][y] == 1) {
				return false;
			} else if (CurrentMap[x - 1][y] == 2) {
				CurrentMap[x][y] = 0;
				Map[4].setMap(CurrentMap);
				CurrentMap = Map[5].getMap();
				// FXMLLoader loader = new FXMLLoader(getClass().getResource("map6.fxml"));
				// loader.setControllerFactory(Controller -> new Controller());
				// Parent root;
				// try {
				// root = loader.load();
				// scene.setRoot(root);
				// } catch (IOException e) {
				// // TODO Auto-generated catch block
				// e.printStackTrace();
				// }
				// changeMap(scene ,fxmlLoader);

				stage1.setImage(new Image("file:image/mapfinal.png"));
				CurrentMap[x - 1][y - 1] = -1;

				player.setFloor(6);
				player.setX(player.getX() - 1);
				player.setY(player.getY() - 1);
				buttonImage.setImage(new Image("file:image/down1.png"));
				buttonImage.setTranslateX(buttonImage.getTranslateX() - 44);

				map5mon1.setVisible(false);
				map5mon2.setVisible(false);
				map5mon3.setVisible(false);
				map5mon4.setVisible(false);
				map5mon5.setVisible(false);
				map5mon6.setVisible(false);
				map5mon7.setVisible(false);
				map5mon8.setVisible(false);
				map5mon9.setVisible(false);
				map5mon10.setVisible(false);
				map5mon11.setVisible(false);
				map5mon12.setVisible(false);
				map5mon13.setVisible(false);
				map5mon14.setVisible(false);
				map5mon15.setVisible(false);
				map5mon16.setVisible(false);
				map5mon17.setVisible(false);
				map5mon18.setVisible(false);
				map5mon19.setVisible(false);
				map5mon20.setVisible(false);
				map5mon21.setVisible(false);
				map5Ydoor1.setVisible(false);
				map5Ydoor2.setVisible(false);
				map5Ydoor3.setVisible(false);
				map5Ydoor4.setVisible(false);
				map5Bdoor.setVisible(false);
				map5Rdoor.setVisible(false);
				map5Ykey1.setVisible(false);
				map5Ykey2.setVisible(false);
				map5Ykey3.setVisible(false);
				map5Bkey.setVisible(false);
				map5Pkey.setVisible(false);
				map5RHP.setVisible(false);
				map5BHP1.setVisible(false);
				map5BHP2.setVisible(false);
				map5RD1.setVisible(false);
				map5RD2.setVisible(false);
				map5BD1.setVisible(false);
				map5BD2.setVisible(false);
				map5shield.setVisible(false);
				map5cross.setVisible(false);

				map6Boss.setVisible(true);
				map6Rdoor.setVisible(true);
			} else if (CurrentMap[x - 1][y] == 6) {
				Shop Shop = new Shop();
				talking = true;
				talk = true;
				gshop.setImage(new Image("file:image/gshop.png"));
				gshop.setVisible(true);
				gshopYkey.setVisible(true);
				gshopBkey.setVisible(true);
				gshopRkey.setVisible(true);
				exitgshop.setVisible(true);
				Shop.keyShop(player, gshop.getScene());
				return false;
			} else if (CurrentMap[x - 1][y] == 9) {
				player.setX(player.getX() - 1);
				CurrentMap[x][y] = 0;
				CurrentMap[x - 1][y] = -1;
				getYKey();
				map5Ykey1.setImage(new Image("file:image/floor.png"));
			} else if (CurrentMap[x - 1][y] == 12) {
				player.setX(player.getX() - 1);
				CurrentMap[x][y] = 0;
				CurrentMap[x - 1][y] = -1;
				getBKey();
				map5Bkey.setImage(new Image("file:image/floor.png"));
			} else if (CurrentMap[x - 1][y] == 13) {
				player.setX(player.getX() - 1);
				CurrentMap[x][y] = 0;
				CurrentMap[x - 1][y] = -1;
				getYKey();
				getBKey();
				getRKey();
				map5Pkey.setImage(new Image("file:image/floor.png"));
			} else if (CurrentMap[x - 1][y] == 31) {
				if (player.getYkey() <= 0)
					return false;
				openYdoor();
				CurrentMap[x - 1][y] = 0;
				map5Ydoor2.setImage(new Image("file:image/floor.png"));
				return false;
			} else if (CurrentMap[x - 1][y] == 32) {
				if (player.getYkey() <= 0)
					return false;
				openYdoor();
				CurrentMap[x - 1][y] = 0;
				map5Ydoor3.setImage(new Image("file:image/floor.png"));
				return false;
			} else if (CurrentMap[x - 1][y] == 33) {
				if (player.getYkey() <= 0)
					return false;
				openYdoor();
				CurrentMap[x - 1][y] = 0;
				map5Ydoor4.setImage(new Image("file:image/floor.png"));
				return false;
			} else if (CurrentMap[x - 1][y] == 34) {
				if (player.getBkey() <= 0)
					return false;
				openBdoor();
				CurrentMap[x - 1][y] = 0;
				map5Bdoor.setImage(new Image("file:image/floor.png"));
				return false;
			} else if (CurrentMap[x - 1][y] == 40) {
				player.setX(player.getX() - 1);
				CurrentMap[x][y] = 0;
				CurrentMap[x - 1][y] = -1;
				getSmallHp();
				map5RHP.setImage(new Image("file:image/floor.png"));
			} else if (CurrentMap[x - 1][y] == 41) {
				player.setX(player.getX() - 1);
				CurrentMap[x][y] = 0;
				CurrentMap[x - 1][y] = -1;
				getBigHp();
				map5BHP1.setImage(new Image("file:image/floor.png"));
			} else if (CurrentMap[x - 1][y] == 42) {
				player.setX(player.getX() - 1);
				CurrentMap[x][y] = 0;
				CurrentMap[x - 1][y] = -1;
				getBigHp();
				map5BHP2.setImage(new Image("file:image/floor.png"));
			} else if (CurrentMap[x - 1][y] == 51) {
				player.setX(player.getX() - 1);
				CurrentMap[x][y] = 0;
				CurrentMap[x - 1][y] = -1;
				getRedGem();
				map5RD2.setImage(new Image("file:image/floor.png"));
			} else if (CurrentMap[x - 1][y] == 60) { // �]�w
				GameMonster enemy = MonsterList.get(9); // glim�O0//rlim�O1//blim�O2//nwerewolf�O3//nsk�O4//psk�O5//bwizard�O6//bbat�O7//jguard�O8//bigbat�O9//rbat�O10//yknight�O11//rknight�O12
				if (player.getAt() <= enemy.getDefend())
					return false;
				battle.startBattle(player, enemy, HP);
				if (player.getHp() <= 0) {// ���a���`
					gameover.setVisible(true);
					close = true;
				}
				getReward(enemy);
				CurrentMap[x - 1][y] = 0;
				map5mon1.setImage(new Image("file:image/floor.png")); // �]�w
				return false;
			} else if (CurrentMap[x - 1][y] == 62) { // �]�w
				GameMonster enemy = MonsterList.get(6); // glim�O0//rlim�O1//blim�O2//nwerewolf�O3//nsk�O4//psk�O5//bwizard�O6//bbat�O7//jguard�O8//bigbat�O9//rbat�O10//yknight�O11//rknight�O12
				if (player.getAt() <= enemy.getDefend())
					return false;
				battle.startBattle(player, enemy, HP);
				if (player.getHp() <= 0) {// ���a���`
					gameover.setVisible(true);
					close = true;
				}
				getReward(enemy);
				CurrentMap[x - 1][y] = 0; // �]�w
				map5mon3.setImage(new Image("file:image/floor.png")); // �]�w
				return false;
			} else if (CurrentMap[x - 1][y] == 64) { // �]�w
				GameMonster enemy = MonsterList.get(2); // glim�O0//rlim�O1//blim�O2//nwerewolf�O3//nsk�O4//psk�O5//bwizard�O6//bbat�O7//jguard�O8//bigbat�O9//rbat�O10//yknight�O11//rknight�O12
				if (player.getAt() <= enemy.getDefend())
					return false;
				battle.startBattle(player, enemy, HP);
				if (player.getHp() <= 0) {// ���a���`
					gameover.setVisible(true);
					close = true;
				}
				getReward(enemy);
				CurrentMap[x - 1][y] = 0;
				map5mon5.setImage(new Image("file:image/floor.png")); // �]�w
				return false;
			} else if (CurrentMap[x - 1][y] == 65) { // �]�w
				GameMonster enemy = MonsterList.get(2); // glim�O0//rlim�O1//blim�O2//nwerewolf�O3//nsk�O4//psk�O5//bwizard�O6//bbat�O7//jguard�O8//bigbat�O9//rbat�O10//yknight�O11//rknight�O12
				if (player.getAt() <= enemy.getDefend())
					return false;
				battle.startBattle(player, enemy, HP);
				if (player.getHp() <= 0) {// ���a���`
					gameover.setVisible(true);
					close = true;
				}
				getReward(enemy);
				CurrentMap[x - 1][y] = 0;
				map5mon6.setImage(new Image("file:image/floor.png")); // �]�w
				return false;
			} else if (CurrentMap[x - 1][y] == 66) { // �]�w
				GameMonster enemy = MonsterList.get(7); // glim�O0//rlim�O1//blim�O2//nwerewolf�O3//nsk�O4//psk�O5//bwizard�O6//bbat�O7//jguard�O8//bigbat�O9//rbat�O10//yknight�O11//rknight�O12
				if (player.getAt() <= enemy.getDefend())
					return false;
				battle.startBattle(player, enemy, HP);
				if (player.getHp() <= 0) {// ���a���`
					gameover.setVisible(true);
					close = true;
				}
				getReward(enemy);
				CurrentMap[x - 1][y] = 0;
				map5mon7.setImage(new Image("file:image/floor.png")); // �]�w
				return false;
			} else if (CurrentMap[x - 1][y] == 67) { // �]�w
				GameMonster enemy = MonsterList.get(6); // glim�O0//rlim�O1//blim�O2//nwerewolf�O3//nsk�O4//psk�O5//bwizard�O6//bbat�O7//jguard�O8//bigbat�O9//rbat�O10//yknight�O11//rknight�O12
				if (player.getAt() <= enemy.getDefend())
					return false;
				battle.startBattle(player, enemy, HP);
				if (player.getHp() <= 0) {// ���a���`
					gameover.setVisible(true);
					close = true;
				}
				getReward(enemy);
				CurrentMap[x - 1][y] = 0;
				map5mon8.setImage(new Image("file:image/floor.png")); // �]�w
				return false;
			} else if (CurrentMap[x - 1][y] == 68) { // �]�w
				GameMonster enemy = MonsterList.get(5); // glim�O0//rlim�O1//blim�O2//nwerewolf�O3//nsk�O4//psk�O5//bwizard�O6//bbat�O7//jguard�O8//bigbat�O9//rbat�O10//yknight�O11//rknight�O12
				if (player.getAt() <= enemy.getDefend())
					return false;
				battle.startBattle(player, enemy, HP);
				if (player.getHp() <= 0) {// ���a���`
					gameover.setVisible(true);
					close = true;
				}
				getReward(enemy);
				CurrentMap[x - 1][y] = 0;
				map5mon9.setImage(new Image("file:image/floor.png")); // �]�w
				return false;
			} else if (CurrentMap[x - 1][y] == 69) { // �]�w
				GameMonster enemy = MonsterList.get(6); // glim�O0//rlim�O1//blim�O2//nwerewolf�O3//nsk�O4//psk�O5//bwizard�O6//bbat�O7//jguard�O8//bigbat�O9//rbat�O10//yknight�O11//rknight�O12
				if (player.getAt() <= enemy.getDefend())
					return false;
				battle.startBattle(player, enemy, HP);
				if (player.getHp() <= 0) {// ���a���`
					gameover.setVisible(true);
					close = true;
				}
				getReward(enemy);
				CurrentMap[x - 1][y] = 0;
				map5mon10.setImage(new Image("file:image/floor.png")); // �]�w
				return false;
			} else if (CurrentMap[x - 1][y] == 72) { // �]�w
				GameMonster enemy = MonsterList.get(7); // glim�O0//rlim�O1//blim�O2//nwerewolf�O3//nsk�O4//psk�O5//bwizard�O6//bbat�O7//jguard�O8//bigbat�O9//rbat�O10//yknight�O11//rknight�O12
				if (player.getAt() <= enemy.getDefend())
					return false;
				battle.startBattle(player, enemy, HP);
				if (player.getHp() <= 0) {// ���a���`
					gameover.setVisible(true);
					close = true;
				}
				getReward(enemy);
				CurrentMap[x - 1][y] = 0;
				map5mon13.setImage(new Image("file:image/floor.png")); // �]�w
				return false;
			} else if (CurrentMap[x - 1][y] == 74) { // �]�w
				GameMonster enemy = MonsterList.get(6); // glim�O0//rlim�O1//blim�O2//nwerewolf�O3//nsk�O4//psk�O5//bwizard�O6//bbat�O7//jguard�O8//bigbat�O9//rbat�O10//yknight�O11//rknight�O12
				if (player.getAt() <= enemy.getDefend())
					return false;
				battle.startBattle(player, enemy, HP);
				if (player.getHp() <= 0) {// ���a���`
					gameover.setVisible(true);
					close = true;
				}
				getReward(enemy);
				CurrentMap[x - 1][y] = 0;
				map5mon15.setImage(new Image("file:image/floor.png")); // �]�w
				return false;
			} else if (CurrentMap[x - 1][y] == 75) { // �]�w
				GameMonster enemy = MonsterList.get(3); // glim�O0//rlim�O1//blim�O2//nwerewolf�O3//nsk�O4//psk�O5//bwizard�O6//bbat�O7//jguard�O8//bigbat�O9//rbat�O10//yknight�O11//rknight�O12
				if (player.getAt() <= enemy.getDefend())
					return false;
				battle.startBattle(player, enemy, HP);
				if (player.getHp() <= 0) {// ���a���`
					gameover.setVisible(true);
					close = true;
				}
				getReward(enemy);
				CurrentMap[x - 1][y] = 0;
				map5mon16.setImage(new Image("file:image/floor.png")); // �]�w
				return false;
			} else if (CurrentMap[x - 1][y] == 78) { // �]�w
				GameMonster enemy = MonsterList.get(5); // glim�O0//rlim�O1//blim�O2//nwerewolf�O3//nsk�O4//psk�O5//bwizard�O6//bbat�O7//jguard�O8//bigbat�O9//rbat�O10//yknight�O11//rknight�O12
				if (player.getAt() <= enemy.getDefend())
					return false;
				battle.startBattle(player, enemy, HP);
				if (player.getHp() <= 0) {// ���a���`
					gameover.setVisible(true);
					close = true;
				}
				getReward(enemy);
				CurrentMap[x - 1][y] = 0;
				map5mon19.setImage(new Image("file:image/floor.png")); // �]�w
				return false;
			} else if (CurrentMap[x - 1][y] == 79) { // �]�w
				GameMonster enemy = MonsterList.get(8); // glim�O0//rlim�O1//blim�O2//nwerewolf�O3//nsk�O4//psk�O5//bwizard�O6//bbat�O7//jguard�O8//bigbat�O9//rbat�O10//yknight�O11//rknight�O12
				if (player.getAt() <= enemy.getDefend())
					return false;
				battle.startBattle(player, enemy, HP);
				if (player.getHp() <= 0) {// ���a���`
					gameover.setVisible(true);
					close = true;
				}
				getReward(enemy);
				CurrentMap[x - 1][y] = 0;
				map5mon20.setImage(new Image("file:image/floor.png")); // �]�w
				return false;
			} else if (CurrentMap[x - 1][y] == 80) { // �]�w
				GameMonster enemy = MonsterList.get(5); // glim�O0//rlim�O1//blim�O2//nwerewolf�O3//nsk�O4//psk�O5//bwizard�O6//bbat�O7//jguard�O8//bigbat�O9//rbat�O10//yknight�O11//rknight�O12
				if (player.getAt() <= enemy.getDefend())
					return false;
				battle.startBattle(player, enemy, HP);
				if (player.getHp() <= 0) {// ���a���`
					gameover.setVisible(true);
					close = true;
				}
				getReward(enemy);
				CurrentMap[x - 1][y] = 0;
				map5mon21.setImage(new Image("file:image/floor.png")); // �]�w
				return false;
			}

		} else if (player.getFloor() == 6) {// map6
			if (CurrentMap[x - 1][y] == 0) {
				player.setX(player.getX() - 1);
				CurrentMap[x][y] = 0;
				CurrentMap[x - 1][y] = -1;
			} else if (CurrentMap[x - 1][y] == 1) {
				return false;
			}
		}
		System.out.println(player.getX() + " " + player.getY() + "\n");
		return true;
	}

	boolean obstacledown() {
		x = player.getX();
		y = player.getY();
		if (player.getFloor() == 1) {// map1
			if (CurrentMap[x + 1][y] == 0) {
				player.setX(player.getX() + 1);
				CurrentMap[x][y] = 0;
				CurrentMap[x + 1][y] = -1;
			} else if (CurrentMap[x + 1][y] == 1) {
				return false;
			} else if (CurrentMap[x + 1][y] == -2) {
				down = true;
				talk = true;
				if (map1talk.isVisible() == false) {
					map1talk.setImage(new Image("file:image/readertalk.png"));
					map1talk.setVisible(true);
					map1reader.setImage(new Image("file:image/floor.png"));
					next = true;
					getreader = true;
				} else if (next == true && map1talk.isVisible() == true) {
					map1talk.setVisible(false);
					player.setX(player.getX() + 1);
					CurrentMap[x][y] = 0;
					CurrentMap[x + 1][y] = -1;
					buttonImage.setImage(new Image("file:image/down1.png"));
					down = false;
					talk = false;
					next = false;
				}
			} else if (CurrentMap[x + 1][y] == 9) {
				player.setX(player.getX() + 1);
				CurrentMap[x][y] = 0;
				CurrentMap[x + 1][y] = -1;
				getYKey();
				map1Ykey1.setImage(new Image("file:image/floor.png"));
			} else if (CurrentMap[x + 1][y] == 10) {
				player.setX(player.getX() + 1);
				CurrentMap[x][y] = 0;
				CurrentMap[x + 1][y] = -1;
				getYKey();
				map1Ykey2.setImage(new Image("file:image/floor.png"));
			} else if (CurrentMap[x + 1][y] == 11) {
				player.setX(player.getX() + 1);
				CurrentMap[x][y] = 0;
				CurrentMap[x + 1][y] = -1;
				getYKey();
				map1Ykey3.setImage(new Image("file:image/floor.png"));
			} else if (CurrentMap[x + 1][y] == 12) {
				player.setX(player.getX() + 1);
				CurrentMap[x][y] = 0;
				CurrentMap[x + 1][y] = -1;
				getYKey();
				map1Ykey4.setImage(new Image("file:image/floor.png"));
			} else if (CurrentMap[x + 1][y] == 13) {
				player.setX(player.getX() + 1);
				CurrentMap[x][y] = 0;
				CurrentMap[x + 1][y] = -1;
				getYKey();
				map1Ykey5.setImage(new Image("file:image/floor.png"));
			} else if (CurrentMap[x + 1][y] == 14) {
				player.setX(player.getX() + 1);
				CurrentMap[x][y] = 0;
				CurrentMap[x + 1][y] = -1;
				getYKey();
				map1Ykey6.setImage(new Image("file:image/floor.png"));
			} else if (CurrentMap[x + 1][y] == 15) {
				player.setX(player.getX() + 1);
				CurrentMap[x][y] = 0;
				CurrentMap[x + 1][y] = -1;
				getYKey();
				map1Ykey7.setImage(new Image("file:image/floor.png"));
			} else if (CurrentMap[x + 1][y] == 16) {
				player.setX(player.getX() + 1);
				CurrentMap[x][y] = 0;
				CurrentMap[x + 1][y] = -1;
				getYKey();
				map1Ykey8.setImage(new Image("file:image/floor.png"));
			} else if (CurrentMap[x + 1][y] == 17) {
				player.setX(player.getX() + 1);
				CurrentMap[x][y] = 0;
				CurrentMap[x + 1][y] = -1;
				getYKey();
				map1Ykey9.setImage(new Image("file:image/floor.png"));
			} else if (CurrentMap[x + 1][y] == 18) {
				player.setX(player.getX() + 1);
				CurrentMap[x][y] = 0;
				CurrentMap[x + 1][y] = -1;
				getYKey();
				map1Ykey10.setImage(new Image("file:image/floor.png"));
			} else if (CurrentMap[x + 1][y] == 19) {
				player.setX(player.getX() + 1);
				CurrentMap[x][y] = 0;
				CurrentMap[x + 1][y] = -1;
				getYKey();
				map1Ykey11.setImage(new Image("file:image/floor.png"));
			} else if (CurrentMap[x + 1][y] == 20) {
				player.setX(player.getX() + 1);
				CurrentMap[x][y] = 0;
				CurrentMap[x + 1][y] = -1;
				getBKey();
				map1Bkey1.setImage(new Image("file:image/floor.png"));
			} else if (CurrentMap[x + 1][y] == 21) {
				player.setX(player.getX() + 1);
				CurrentMap[x][y] = 0;
				CurrentMap[x + 1][y] = -1;
				getBKey();
				map1Bkey2.setImage(new Image("file:image/floor.png"));
			} else if (CurrentMap[x + 1][y] == 22) {
				player.setX(player.getX() + 1);
				CurrentMap[x][y] = 0;
				CurrentMap[x + 1][y] = -1;
				getRKey();
				map1Rkey.setImage(new Image("file:image/floor.png"));
			} else if (CurrentMap[x + 1][y] == 30) {
				if (player.getYkey() <= 0)
					return false;
				openYdoor();
				CurrentMap[x + 1][y] = 0;
				map1Ydoor1.setImage(new Image("file:image/floor.png"));
				return false;
			} else if (CurrentMap[x + 1][y] == 31) {
				if (player.getYkey() <= 0)
					return false;
				openYdoor();
				CurrentMap[x + 1][y] = 0;
				map1Ydoor2.setImage(new Image("file:image/floor.png"));
				return false;
			} else if (CurrentMap[x + 1][y] == 32) {
				if (player.getYkey() <= 0)
					return false;
				openYdoor();
				CurrentMap[x + 1][y] = 0;
				map1Ydoor3.setImage(new Image("file:image/floor.png"));
				return false;
			} else if (CurrentMap[x + 1][y] == 33) {
				if (player.getYkey() <= 0)
					return false;
				openYdoor();
				CurrentMap[x + 1][y] = 0;
				map1Ydoor4.setImage(new Image("file:image/floor.png"));
				return false;
			} else if (CurrentMap[x + 1][y] == 34) {
				if (player.getYkey() <= 0)
					return false;
				openYdoor();
				CurrentMap[x + 1][y] = 0;
				map1Ydoor5.setImage(new Image("file:image/floor.png"));
				return false;
			} else if (CurrentMap[x + 1][y] == 35) {
				if (player.getRkey() > 0)
					return false;
				openRdoor();
				CurrentMap[x + 1][y] = 0;
				Map1Rdoor.setImage(new Image("file:image/floor.png"));
				return false;
			} else if (CurrentMap[x + 1][y] == 40) {
				player.setX(player.getX() + 1);
				CurrentMap[x][y] = 0;
				CurrentMap[x + 1][y] = -1;
				getSmallHp();
				map1RHP1.setImage(new Image("file:image/floor.png"));
			} else if (CurrentMap[x + 1][y] == 41) {
				player.setX(player.getX() + 1);
				CurrentMap[x][y] = 0;
				CurrentMap[x + 1][y] = -1;
				getSmallHp();
				map1RHP2.setImage(new Image("file:image/floor.png"));
			} else if (CurrentMap[x + 1][y] == 42) {
				player.setX(player.getX() + 1);
				CurrentMap[x][y] = 0;
				CurrentMap[x + 1][y] = -1;
				getSmallHp();
				map1RHP3.setImage(new Image("file:image/floor.png"));
			} else if (CurrentMap[x + 1][y] == 43) {
				player.setX(player.getX() + 1);
				CurrentMap[x][y] = 0;
				CurrentMap[x + 1][y] = -1;
				getSmallHp();
				map1RHP4.setImage(new Image("file:image/floor.png"));
			} else if (CurrentMap[x + 1][y] == 44) {
				player.setX(player.getX() + 1);
				CurrentMap[x][y] = 0;
				CurrentMap[x + 1][y] = -1;
				getSmallHp();
				map1RHP5.setImage(new Image("file:image/floor.png"));
			} else if (CurrentMap[x + 1][y] == 45) {
				player.setX(player.getX() + 1);
				CurrentMap[x][y] = 0;
				CurrentMap[x + 1][y] = -1;
				getSmallHp();
				map1RHP6.setImage(new Image("file:image/floor.png"));
			} else if (CurrentMap[x + 1][y] == 46) {
				player.setX(player.getX() + 1);
				CurrentMap[x][y] = 0;
				CurrentMap[x + 1][y] = -1;
				getSmallHp();
				map1RHP7.setImage(new Image("file:image/floor.png"));
			} else if (CurrentMap[x + 1][y] == 47) {
				player.setX(player.getX() + 1);
				CurrentMap[x][y] = 0;
				CurrentMap[x + 1][y] = -1;
				getBigHp();
				map1BHP.setImage(new Image("file:image/floor.png"));
			} else if (CurrentMap[x + 1][y] == 50) {
				player.setX(player.getX() + 1);
				CurrentMap[x][y] = 0;
				CurrentMap[x + 1][y] = -1;
				getRedGem();
				map1RD.setImage(new Image("file:image/floor.png"));
			} else if (CurrentMap[x + 1][y] == 51) {
				player.setX(player.getX() + 1);
				CurrentMap[x][y] = 0;
				CurrentMap[x + 1][y] = -1;
				getBlueGem();
				map1BD.setImage(new Image("file:image/floor.png"));
			} else if (CurrentMap[x + 1][y] == 63) { // �]�w
				GameMonster enemy = MonsterList.get(3); // glim�O0//rlim�O1//blim�O2//nwerewolf�O3//nsk�O4//psk�O5//bwizard�O6//bbat�O7//jguard�O8//bigbat�O9//rbat�O10//yknight�O11//rknight�O12
				if (player.getAt() <= enemy.getDefend())
					return false;
				battle.startBattle(player, enemy, HP);
				if (player.getHp() <= 0) {// ���a���`
					gameover.setVisible(true);
					close = true;
				}
				getReward(enemy);
				CurrentMap[x + 1][y] = 0; // �]�w
				map1mon4.setImage(new Image("file:image/floor.png")); // �]�w
				return false;
			} else if (CurrentMap[x + 1][y] == 64) { // �]�w
				GameMonster enemy = MonsterList.get(5); // glim�O0//rlim�O1//blim�O2//nwerewolf�O3//nsk�O4//psk�O5//bwizard�O6//bbat�O7//jguard�O8//bigbat�O9//rbat�O10//yknight�O11//rknight�O12
				if (player.getAt() <= enemy.getDefend())
					return false;
				battle.startBattle(player, enemy, HP);
				if (player.getHp() <= 0) {// ���a���`
					gameover.setVisible(true);
					close = true;
				}
				getReward(enemy);
				CurrentMap[x + 1][y] = 0; // �]�w
				map1mon5.setImage(new Image("file:image/floor.png")); // �]�w
				return false;
			} else if (CurrentMap[x + 1][y] == 65) { // �]�w
				GameMonster enemy = MonsterList.get(5); // glim�O0//rlim�O1//blim�O2//nwerewolf�O3//nsk�O4//psk�O5//bwizard�O6//bbat�O7//jguard�O8//bigbat�O9//rbat�O10//yknight�O11//rknight�O12
				if (player.getAt() <= enemy.getDefend())
					return false;
				battle.startBattle(player, enemy, HP);
				if (player.getHp() <= 0) {// ���a���`
					gameover.setVisible(true);
					close = true;
				}
				getReward(enemy);
				CurrentMap[x + 1][y] = 0; // �]�w
				map1mon6.setImage(new Image("file:image/floor.png")); // �]�w
				return false;
			} else if (CurrentMap[x + 1][y] == 71) { // �]�w
				GameMonster enemy = MonsterList.get(4); // glim�O0//rlim�O1//blim�O2//nwerewolf�O3//nsk�O4//psk�O5//bwizard�O6//bbat�O7//jguard�O8//bigbat�O9//rbat�O10//yknight�O11//rknight�O12
				if (player.getAt() <= enemy.getDefend())
					return false;
				battle.startBattle(player, enemy, HP);
				if (player.getHp() <= 0) {// ���a���`
					gameover.setVisible(true);
					close = true;
				}
				getReward(enemy);
				CurrentMap[x + 1][y] = 0; // �]�w
				map1mon12.setImage(new Image("file:image/floor.png")); // �]�w
				return false;
			}
		} else if (player.getFloor() == 2) { // map2
			if (CurrentMap[x + 1][y] == 0) {
				player.setX(player.getX() + 1);
				CurrentMap[x][y] = 0;
				CurrentMap[x + 1][y] = -1;
			} else if (CurrentMap[x + 1][y] == 1) {
				return false;
			} else if (CurrentMap[x + 1][y] == 2) {// ������map3
				CurrentMap[x][y] = 0;
				Map[1].setMap(CurrentMap);
				CurrentMap = Map[2].getMap();

				// FXMLLoader loader = new FXMLLoader(getClass().getResource("map3.fxml"));
				// loader.setControllerFactory(Controller -> new Controller());
				// Parent root;
				// try {
				// root = loader.load();
				// scene.setRoot(root);
				// } catch (IOException e) {
				// // TODO Auto-generated catch block
				// e.printStackTrace();
				// }

				// changeMap(scene ,fxmlLoader);

				CurrentMap[x + 1][y + 1] = -1;

				player.setFloor(3);
				player.setX(player.getX() + 1);
				player.setY(player.getY() + 1);
				buttonImage.setImage(new Image("file:image/down1.png"));
				buttonImage.setTranslateX(buttonImage.getTranslateX() + 50);
				stage1.setImage(new Image("file:image/map3-2.png"));

				map2Rknight.setVisible(false);
				map2Yknight1.setVisible(false);
				map2Yknight2.setVisible(false);
				map2Pdoor.setVisible(false);
				map2prison1.setVisible(false);
				map2prison2.setVisible(false);
				map2Ydoor1.setVisible(false);
				map2Ydoor2.setVisible(false);
				map2Ydoor3.setVisible(false);
				map2Ydoor4.setVisible(false);
				map2Ydoor5.setVisible(false);
				map2Ydoor6.setVisible(false);
				map2Bdoor.setVisible(false);
				map2Ykey1.setVisible(false);
				map2Ykey2.setVisible(false);
				map2Ykey3.setVisible(false);
				map2Ykey4.setVisible(false);
				map2Ykey5.setVisible(false);
				map2Ykey6.setVisible(false);
				map2Ykey7.setVisible(false);
				map2Ykey8.setVisible(false);
				map2Ykey9.setVisible(false);
				map2Bkey.setVisible(false);
				map2Rkey.setVisible(false);
				map2BHP1.setVisible(false);
				map2BHP2.setVisible(false);
				map2BHP3.setVisible(false);
				map2BHP4.setVisible(false);
				map2RHP1.setVisible(false);
				map2RHP2.setVisible(false);
				map2RHP3.setVisible(false);
				map2RD1.setVisible(false);
				map2RD2.setVisible(false);
				map2RD3.setVisible(false);
				map2RD4.setVisible(false);
				map2BD1.setVisible(false);
				map2BD2.setVisible(false);
				map2BD3.setVisible(false);
				map2BD4.setVisible(false);
				map2oldman.setVisible(false);
				map2goldman.setVisible(false);

				map3mon1.setVisible(true);
				map3mon2.setVisible(true);
				map3mon3.setVisible(true);
				map3mon4.setVisible(true);
				map3mon5.setVisible(true);
				map3mon6.setVisible(true);
				map3mon7.setVisible(true);
				map3mon8.setVisible(true);
				map3mon9.setVisible(true);
				map3mon10.setVisible(true);
				map3mon11.setVisible(true);
				map3mon12.setVisible(true);
				map3mon13.setVisible(true);
				map3mon14.setVisible(true);
				map3mon15.setVisible(true);
				map3mon16.setVisible(true);
				map3mon17.setVisible(true);
				map3Ydoor1.setVisible(true);
				map3Ydoor2.setVisible(true);
				map3Ydoor3.setVisible(true);
				map3Ykey1.setVisible(true);
				map3Ykey2.setVisible(true);
				map3Ykey3.setVisible(true);
				map3Ykey4.setVisible(true);
				map3Ykey5.setVisible(true);
				map3Ykey6.setVisible(true);
				map3Ykey7.setVisible(true);
				map3Ykey8.setVisible(true);
				map3BHP.setVisible(true);
				map3RD.setVisible(true);
				map3BD.setVisible(true);
				map3sword.setVisible(true);
			} else if (CurrentMap[x + 1][y] == -2) { // NPC���
				talking = true;
				down = true;
				talk = true;
				if (map2talk.isVisible() == false) {
					map2talk.setImage(new Image("file:image/map2oldmantalk1.png"));
					map2talk.setVisible(true);
					next = true;
				} else if (next == true && map2talk.isVisible() == true) {
					map2talk.setImage(new Image("file:image/map2oldmantalk2.png"));
					next = false;
					next1 = true;
				} else if (next1 == true && map2talk.isVisible() == true) {
					map2talk.setImage(new Image("file:image/map2oldmantalk3.png"));
					next1 = false;
					next2 = true;
				} else if (next2 == true && map2talk.isVisible() == true) {
					map2talk.setImage(new Image("file:image/map2oldmantalk4.png"));
					next2 = false;
					next3 = true;
				} else if (next3 == true && map2talk.isVisible() == true) {
					map2talk.setImage(new Image("file:image/map2oldmantalk5.png"));
					next3 = false;
					next4 = true;
				} else if (next4 == true && map2talk.isVisible() == true) {
					map2talk.setVisible(false);
					player.setAt(player.getAt() + 30);
					attack.setText(String.valueOf(player.getAt()));
					next4 = false;
					map2oldman.setImage(new Image("file:image/floor.png"));
					CurrentMap[x + 1][y] = 0;
					talk = false;
					down = false;
					talking = false;
				}
				return false;
			} else if (CurrentMap[x + 1][y] == -3) {
				talking = true;
				down = true;
				talk = true;
				if (map2talk.isVisible() == false) {
					map2talk.setImage(new Image("file:image/map2goldmantalk1.png"));
					map2talk.setVisible(true);
					next = true;
				} else if (next == true && map2talk.isVisible() == true) {
					map2talk.setImage(new Image("file:image/map2goldmantalk2.png"));
					next = false;
					next1 = true;
				} else if (next1 == true && map2talk.isVisible() == true) {
					map2talk.setImage(new Image("file:image/map2goldmantalk3.png"));
					next1 = false;
					next2 = true;
				} else if (next2 == true && map2talk.isVisible() == true) {
					map2talk.setImage(new Image("file:image/map2oldmantalk4.png"));
					next2 = false;
					next3 = true;
				} else if (next3 == true && map2talk.isVisible() == true) {
					map2talk.setVisible(false);
					player.setDef(player.getDef() + 30);
					defend.setText(String.valueOf(player.getDef()));
					next3 = false;
					map2goldman.setImage(new Image("file:image/floor.png"));
					CurrentMap[x + 1][y] = 0;
					talk = false;
					down = false;
					talking = false;
				}
				return false;
			} else if (CurrentMap[x + 1][y] == 6) {
				CurrentMap[x + 1][y] = 0;
				map2prison1.setImage(new Image("file:image/floor.png"));
				return false;
			} else if (CurrentMap[x + 1][y] == 7) {
				CurrentMap[x + 1][y] = 0;
				map2prison2.setImage(new Image("file:image/floor.png"));
				return false;
			} else if (CurrentMap[x + 1][y] == 9) {
				player.setX(player.getX() + 1);
				CurrentMap[x][y] = 0;
				CurrentMap[x + 1][y] = -1;
				getYKey();
				map2Ykey1.setImage(new Image("file:image/floor.png"));
			} else if (CurrentMap[x + 1][y] == 10) {
				player.setX(player.getX() + 1);
				CurrentMap[x][y] = 0;
				CurrentMap[x + 1][y] = -1;
				getYKey();
				map2Ykey2.setImage(new Image("file:image/floor.png"));
			} else if (CurrentMap[x + 1][y] == 11) {
				player.setX(player.getX() + 1);
				CurrentMap[x][y] = 0;
				CurrentMap[x + 1][y] = -1;
				getYKey();
				map2Ykey3.setImage(new Image("file:image/floor.png"));
			} else if (CurrentMap[x + 1][y] == 12) {
				player.setX(player.getX() + 1);
				CurrentMap[x][y] = 0;
				CurrentMap[x + 1][y] = -1;
				getYKey();
				map2Ykey4.setImage(new Image("file:image/floor.png"));
			} else if (CurrentMap[x + 1][y] == 13) {
				player.setX(player.getX() + 1);
				CurrentMap[x][y] = 0;
				CurrentMap[x + 1][y] = -1;
				getYKey();
				map2Ykey5.setImage(new Image("file:image/floor.png"));
			} else if (CurrentMap[x + 1][y] == 14) {
				player.setX(player.getX() + 1);
				CurrentMap[x][y] = 0;
				CurrentMap[x + 1][y] = -1;
				getYKey();
				map2Ykey6.setImage(new Image("file:image/floor.png"));
			} else if (CurrentMap[x + 1][y] == 15) {
				player.setX(player.getX() + 1);
				CurrentMap[x][y] = 0;
				CurrentMap[x + 1][y] = -1;
				getYKey();
				map2Ykey7.setImage(new Image("file:image/floor.png"));
			} else if (CurrentMap[x + 1][y] == 16) {
				player.setX(player.getX() + 1);
				CurrentMap[x][y] = 0;
				CurrentMap[x + 1][y] = -1;
				getYKey();
				map2Ykey8.setImage(new Image("file:image/floor.png"));
			} else if (CurrentMap[x + 1][y] == 17) {
				player.setX(player.getX() + 1);
				CurrentMap[x][y] = 0;
				CurrentMap[x + 1][y] = -1;
				getYKey();
				map2Ykey9.setImage(new Image("file:image/floor.png"));
			} else if (CurrentMap[x + 1][y] == 18) { // ��
				player.setX(player.getX() + 1);
				CurrentMap[x][y] = 0;
				CurrentMap[x + 1][y] = -1;
				getBKey();
				map2Bkey.setImage(new Image("file:image/floor.png"));
			} else if (CurrentMap[x + 1][y] == 19) {
				player.setX(player.getX() + 1);
				CurrentMap[x][y] = 0;
				CurrentMap[x + 1][y] = -1;
				getYKey();
				map2Rkey.setImage(new Image("file:image/floor.png"));
			} else if (CurrentMap[x + 1][y] == 30) {
				if (player.getYkey() <= 0)
					return false;
				openYdoor();
				CurrentMap[x + 1][y] = 0;
				map2Ydoor1.setImage(new Image("file:image/floor.png"));
				return false;
			} else if (CurrentMap[x + 1][y] == 31) {
				if (player.getYkey() <= 0)
					return false;
				openYdoor();
				CurrentMap[x + 1][y] = 0;
				map2Ydoor2.setImage(new Image("file:image/floor.png"));
				return false;
			} else if (CurrentMap[x + 1][y] == 32) {
				if (player.getYkey() <= 0)
					return false;
				openYdoor();
				CurrentMap[x + 1][y] = 0;
				map2Ydoor3.setImage(new Image("file:image/floor.png"));
				return false;
			} else if (CurrentMap[x + 1][y] == 33) {
				if (player.getYkey() <= 0)
					return false;
				openYdoor();
				CurrentMap[x + 1][y] = 0;
				map2Ydoor4.setImage(new Image("file:image/floor.png"));
				return false;
			} else if (CurrentMap[x + 1][y] == 34) {
				if (player.getYkey() <= 0)
					return false;
				openYdoor();
				CurrentMap[x + 1][y] = 0;
				map2Ydoor5.setImage(new Image("file:image/floor.png"));
				return false;
			} else if (CurrentMap[x + 1][y] == 35) {
				if (player.getYkey() <= 0)
					return false;
				openYdoor();
				CurrentMap[x + 1][y] = 0;
				map2Ydoor6.setImage(new Image("file:image/floor.png"));
				return false;
			} else if (CurrentMap[x + 1][y] == 36) {
				if (player.getBkey() <= 0)
					return false;
				openBdoor();
				CurrentMap[x + 1][y] = 0;
				map2Bdoor.setImage(new Image("file:image/floor.png"));
				return false;
			} else if (CurrentMap[x + 1][y] == 40) {
				player.setX(player.getX() + 1);
				CurrentMap[x][y] = 0;
				CurrentMap[x + 1][y] = -1;
				getSmallHp();
				map2RHP1.setImage(new Image("file:image/floor.png"));
			} else if (CurrentMap[x + 1][y] == 41) {
				player.setX(player.getX() + 1);
				CurrentMap[x][y] = 0;
				CurrentMap[x + 1][y] = -1;
				getSmallHp();
				map2RHP2.setImage(new Image("file:image/floor.png"));
			} else if (CurrentMap[x + 1][y] == 42) {
				player.setX(player.getX() + 1);
				CurrentMap[x][y] = 0;
				CurrentMap[x + 1][y] = -1;
				getSmallHp();
				map2RHP3.setImage(new Image("file:image/floor.png"));
			} else if (CurrentMap[x + 1][y] == 43) {
				player.setX(player.getX() + 1);
				CurrentMap[x][y] = 0;
				CurrentMap[x + 1][y] = -1;
				getBigHp();
				map2BHP1.setImage(new Image("file:image/floor.png"));
			} else if (CurrentMap[x + 1][y] == 44) {
				player.setX(player.getX() + 1);
				CurrentMap[x][y] = 0;
				CurrentMap[x + 1][y] = -1;
				getBigHp();
				map2BHP2.setImage(new Image("file:image/floor.png"));
			} else if (CurrentMap[x + 1][y] == 45) {
				player.setX(player.getX() + 1);
				CurrentMap[x][y] = 0;
				CurrentMap[x + 1][y] = -1;
				getBigHp();
				map2BHP3.setImage(new Image("file:image/floor.png"));
			} else if (CurrentMap[x + 1][y] == 46) {
				player.setX(player.getX() + 1);
				CurrentMap[x][y] = 0;
				CurrentMap[x + 1][y] = -1;
				getBigHp();
				map2BHP4.setImage(new Image("file:image/floor.png"));
			} else if (CurrentMap[x + 1][y] == 50) {
				player.setX(player.getX() + 1);
				CurrentMap[x][y] = 0;
				CurrentMap[x + 1][y] = -1;
				getRedGem();
				map2RD1.setImage(new Image("file:image/floor.png"));
			} else if (CurrentMap[x + 1][y] == 51) {
				player.setX(player.getX() + 1);
				CurrentMap[x][y] = 0;
				CurrentMap[x + 1][y] = -1;
				getRedGem();
				map2RD2.setImage(new Image("file:image/floor.png"));
			} else if (CurrentMap[x + 1][y] == 52) {
				player.setX(player.getX() + 1);
				CurrentMap[x][y] = 0;
				CurrentMap[x + 1][y] = -1;
				getRedGem();
				map2RD3.setImage(new Image("file:image/floor.png"));
			} else if (CurrentMap[x + 1][y] == 53) {
				player.setX(player.getX() + 1);
				CurrentMap[x][y] = 0;
				CurrentMap[x + 1][y] = -1;
				getRedGem();
				map2RD4.setImage(new Image("file:image/floor.png"));
			} else if (CurrentMap[x + 1][y] == 54) {
				player.setX(player.getX() + 1);
				CurrentMap[x][y] = 0;
				CurrentMap[x + 1][y] = -1;
				getBlueGem();
				map2BD1.setImage(new Image("file:image/floor.png"));
			} else if (CurrentMap[x + 1][y] == 55) {
				player.setX(player.getX() + 1);
				CurrentMap[x][y] = 0;
				CurrentMap[x + 1][y] = -1;
				getBlueGem();
				map2BD2.setImage(new Image("file:image/floor.png"));
			} else if (CurrentMap[x + 1][y] == 56) {
				player.setX(player.getX() + 1);
				CurrentMap[x][y] = 0;
				CurrentMap[x + 1][y] = -1;
				getBlueGem();
				map2BD3.setImage(new Image("file:image/floor.png"));
			} else if (CurrentMap[x + 1][y] == 57) {
				player.setX(player.getX() + 1);
				CurrentMap[x][y] = 0;
				CurrentMap[x + 1][y] = -1;
				getBlueGem();
				map2BD4.setImage(new Image("file:image/floor.png"));
			} else if (CurrentMap[x + 1][y] == 62) { // �]�w
				GameMonster enemy = MonsterList.get(11); // glim�O0//rlim�O1//blim�O2//nwerewolf�O3//nsk�O4//psk�O5//bwizard�O6//bbat�O7//jguard�O8//bigbat�O9//rbat�O10//yknight�O11//rknight�O12
				if (player.getAt() <= enemy.getDefend())
					return false;
				battle.startBattle(player, enemy, HP);
				if (player.getHp() <= 0) {// ���a���`
					gameover.setVisible(true);
					close = true;
				}
				getReward(enemy);
				CurrentMap[x + 1][y] = 0; // �]�w
				map2Yknight2.setImage(new Image("file:image/floor.png")); // �]�w
				return false;
			}
		} else if (player.getFloor() == 3) {// map3
			if (CurrentMap[x + 1][y] == 0) {
				player.setX(player.getX() + 1);
				CurrentMap[x][y] = 0;
				CurrentMap[x + 1][y] = -1;
			} else if (CurrentMap[x + 1][y] == 1) {
				return false;
			} else if (CurrentMap[x + 1][y] == 2) {
				CurrentMap = Map[3].getMap(); // ������map4

				// FXMLLoader loader = new FXMLLoader(getClass().getResource("map4.fxml"));
				// loader.setControllerFactory(Controller -> new Controller());
				// Parent root;
				// try {
				// root = loader.load();
				// scene.setRoot(root);
				// } catch (IOException e) {
				// // TODO Auto-generated catch block
				// e.printStackTrace();
				// }
				// changeMap(scene ,fxmlLoader);
				player.setFloor(4);
				CurrentMap[x][y] = -1;
				buttonImage.setImage(new Image("file:image/down1.png"));
				buttonImage.setTranslateY(buttonImage.getTranslateY() - 50);
				stage1.setImage(new Image("file:image/map4.png"));

				map3mon1.setVisible(false);
				map3mon2.setVisible(false);
				map3mon3.setVisible(false);
				map3mon4.setVisible(false);
				map3mon5.setVisible(false);
				map3mon6.setVisible(false);
				map3mon7.setVisible(false);
				map3mon8.setVisible(false);
				map3mon9.setVisible(false);
				map3mon10.setVisible(false);
				map3mon11.setVisible(false);
				map3mon12.setVisible(false);
				map3mon13.setVisible(false);
				map3mon14.setVisible(false);
				map3mon15.setVisible(false);
				map3mon16.setVisible(false);
				map3mon17.setVisible(false);
				map3Ydoor1.setVisible(false);
				map3Ydoor2.setVisible(false);
				map3Ydoor3.setVisible(false);
				map3Ykey1.setVisible(false);
				map3Ykey2.setVisible(false);
				map3Ykey3.setVisible(false);
				map3Ykey4.setVisible(false);
				map3Ykey5.setVisible(false);
				map3Ykey6.setVisible(false);
				map3Ykey7.setVisible(false);
				map3Ykey8.setVisible(false);
				map3BHP.setVisible(false);
				map3RD.setVisible(false);
				map3BD.setVisible(false);
				map3sword.setVisible(false);

				map4mon1.setVisible(true);
				map4mon2.setVisible(true);
				map4mon3.setVisible(true);
				map4mon4.setVisible(true);
				map4mon5.setVisible(true);
				map4mon6.setVisible(true);
				map4mon7.setVisible(true);
				map4mon8.setVisible(true);
				map4mon9.setVisible(true);
				map4mon10.setVisible(true);
				map4mon11.setVisible(true);
				map4mon12.setVisible(true);
				map4mon13.setVisible(true);
				map4mon14.setVisible(true);
				map4mon15.setVisible(true);
				map4mon16.setVisible(true);
				map4mon17.setVisible(true);
				map4mon18.setVisible(true);
				map4mon19.setVisible(true);
				map4mon20.setVisible(true);
				map4Ydoor1.setVisible(true);
				map4Ydoor2.setVisible(true);
				map4Ydoor3.setVisible(true);
				map4Ydoor4.setVisible(true);
				map4Bdoor.setVisible(true);
				map4Rdoor.setVisible(true);
				map4prisondoor.setVisible(true);
				map4Ykey1.setVisible(true);
				map4Ykey2.setVisible(true);
				map4RHP1.setVisible(true);
				map4RHP2.setVisible(true);
				map4RHP3.setVisible(true);
				map4RHP4.setVisible(true);
				map4RD1.setVisible(true);
				map4RD2.setVisible(true);
				map4BD1.setVisible(true);
				map4BD2.setVisible(true);
				map4theif.setVisible(true);
			} else if (CurrentMap[x + 1][y] == 9) {
				player.setX(player.getX() + 1);
				CurrentMap[x][y] = 0;
				CurrentMap[x + 1][y] = -1;
				getYKey();
				map3Ykey1.setImage(new Image("file:image/floor.png"));
			} else if (CurrentMap[x + 1][y] == 10) {
				player.setX(player.getX() + 1);
				CurrentMap[x][y] = 0;
				CurrentMap[x + 1][y] = -1;
				getYKey();
				map3Ykey2.setImage(new Image("file:image/floor.png"));
			} else if (CurrentMap[x + 1][y] == 11) {
				player.setX(player.getX() + 1);
				CurrentMap[x][y] = 0;
				CurrentMap[x + 1][y] = -1;
				getYKey();
				map3Ykey3.setImage(new Image("file:image/floor.png"));
			} else if (CurrentMap[x + 1][y] == 12) {
				player.setX(player.getX() + 1);
				CurrentMap[x][y] = 0;
				CurrentMap[x + 1][y] = -1;
				getYKey();
				map3Ykey4.setImage(new Image("file:image/floor.png"));
			} else if (CurrentMap[x + 1][y] == 13) {
				player.setX(player.getX() + 1);
				CurrentMap[x][y] = 0;
				CurrentMap[x + 1][y] = -1;
				getYKey();
				map3Ykey5.setImage(new Image("file:image/floor.png"));
			} else if (CurrentMap[x + 1][y] == 14) {
				player.setX(player.getX() + 1);
				CurrentMap[x][y] = 0;
				CurrentMap[x + 1][y] = -1;
				getYKey();
				map3Ykey6.setImage(new Image("file:image/floor.png"));
			} else if (CurrentMap[x + 1][y] == 15) {
				player.setX(player.getX() + 1);
				CurrentMap[x][y] = 0;
				CurrentMap[x + 1][y] = -1;
				getYKey();
				map3Ykey7.setImage(new Image("file:image/floor.png"));
			} else if (CurrentMap[x + 1][y] == 16) {
				player.setX(player.getX() + 1);
				CurrentMap[x][y] = 0;
				CurrentMap[x + 1][y] = -1;
				getYKey();
				map3Ykey8.setImage(new Image("file:image/floor.png"));
			} else if (CurrentMap[x + 1][y] == 30) {
				if (player.getYkey() <= 0)
					return false;
				openYdoor();
				CurrentMap[x + 1][y] = 0;
				map3Ydoor1.setImage(new Image("file:image/floor.png"));
				return false;
			} else if (CurrentMap[x + 1][y] == 31) {
				if (player.getYkey() <= 0)
					return false;
				openYdoor();
				CurrentMap[x + 1][y] = 0;
				map3Ydoor2.setImage(new Image("file:image/floor.png"));
				return false;
			} else if (CurrentMap[x + 1][y] == 32) {
				if (player.getYkey() <= 0)
					return false;
				openYdoor();
				CurrentMap[x + 1][y] = 0;
				map3Ydoor3.setImage(new Image("file:image/floor.png"));
				return false;
			} else if (CurrentMap[x + 1][y] == 40) {
				player.setX(player.getX() + 1);
				CurrentMap[x][y] = 0;
				CurrentMap[x + 1][y] = -1;
				getBigHp();
				map3BHP.setImage(new Image("file:image/floor.png"));
			} else if (CurrentMap[x + 1][y] == 50) {
				player.setX(player.getX() + 1);
				CurrentMap[x][y] = 0;
				CurrentMap[x + 1][y] = -1;
				getRedGem();
				map3RD.setImage(new Image("file:image/floor.png"));
			} else if (CurrentMap[x + 1][y] == 51) {
				player.setX(player.getX() + 1);
				CurrentMap[x][y] = 0;
				CurrentMap[x + 1][y] = -1;
				getBlueGem();
				map3BD.setImage(new Image("file:image/floor.png"));
			} else if (CurrentMap[x + 1][y] == 60) { // �]�w
				GameMonster enemy = MonsterList.get(1); // glim�O0//rlim�O1//blim�O2//nwerewolf�O3//nsk�O4//psk�O5//bwizard�O6//bbat�O7//jguard�O8//bigbat�O9//rbat�O10//yknight�O11//rknight�O12
				if (player.getAt() <= enemy.getDefend())
					return false;
				battle.startBattle(player, enemy, HP);
				if (player.getHp() <= 0) {// ���a���`
					gameover.setVisible(true);
					close = true;
				}
				getReward(enemy);
				CurrentMap[x + 1][y] = 0; // �]�w
				map3mon1.setImage(new Image("file:image/floor.png")); // �]�w
				return false;
			} else if (CurrentMap[x + 1][y] == 71) { // �]�w
				GameMonster enemy = MonsterList.get(7); // glim�O0//rlim�O1//blim�O2//nwerewolf�O3//nsk�O4//psk�O5//bwizard�O6//bbat�O7//jguard�O8//bigbat�O9//rbat�O10//yknight�O11//rknight�O12
				if (player.getAt() <= enemy.getDefend())
					return false;
				battle.startBattle(player, enemy, HP);
				if (player.getHp() <= 0) {// ���a���`
					gameover.setVisible(true);
					close = true;
				}
				getReward(enemy);
				CurrentMap[x + 1][y] = 0; // �]�w
				map3mon12.setImage(new Image("file:image/floor.png")); // �]�w
				return false;
			} else if (CurrentMap[x + 1][y] == 74) { // �]�w
				GameMonster enemy = MonsterList.get(1); // glim�O0//rlim�O1//blim�O2//nwerewolf�O3//nsk�O4//psk�O5//bwizard�O6//bbat�O7//jguard�O8//bigbat�O9//rbat�O10//yknight�O11//rknight�O12
				if (player.getAt() <= enemy.getDefend())
					return false;
				battle.startBattle(player, enemy, HP);
				if (player.getHp() <= 0) {// ���a���`
					gameover.setVisible(true);
					close = true;
				}
				getReward(enemy);
				CurrentMap[x + 1][y] = 0; // �]�w
				map3mon15.setImage(new Image("file:image/floor.png")); // �]�w
				return false;
			} else if (CurrentMap[x + 1][y] == 75) { // �]�w
				GameMonster enemy = MonsterList.get(7); // glim�O0//rlim�O1//blim�O2//nwerewolf�O3//nsk�O4//psk�O5//bwizard�O6//bbat�O7//jguard�O8//bigbat�O9//rbat�O10//yknight�O11//rknight�O12
				if (player.getAt() <= enemy.getDefend())
					return false;
				battle.startBattle(player, enemy, HP);
				if (player.getHp() <= 0) {// ���a���`
					gameover.setVisible(true);
					close = true;
				}
				getReward(enemy);
				CurrentMap[x + 1][y] = 0; // �]�w
				map3mon16.setImage(new Image("file:image/floor.png")); // �]�w
				return false;
			} else if (CurrentMap[x + 1][y] == 76) { // �]�w
				GameMonster enemy = MonsterList.get(1); // glim�O0//rlim�O1//blim�O2//nwerewolf�O3//nsk�O4//psk�O5//bwizard�O6//bbat�O7//jguard�O8//bigbat�O9//rbat�O10//yknight�O11//rknight�O12
				if (player.getAt() <= enemy.getDefend())
					return false;
				battle.startBattle(player, enemy, HP);
				if (player.getHp() <= 0) {// ���a���`
					gameover.setVisible(true);
					close = true;
				}
				getReward(enemy);
				CurrentMap[x + 1][y] = 0; // �]�w
				map3mon17.setImage(new Image("file:image/floor.png")); // �]�w
				return false;
			}
		} else if (player.getFloor() == 4) {// map4
			if (CurrentMap[x + 1][y] == 0) {
				player.setX(player.getX() + 1);
				CurrentMap[x][y] = 0;
				CurrentMap[x + 1][y] = -1;
			} else if (CurrentMap[x + 1][y] == 1) {
				return false;
			} else if (CurrentMap[x + 1][y] == 2) {
				CurrentMap[x][y] = 0;
				Map[3].setMap(CurrentMap);
				CurrentMap = Map[4].getMap();

				// FXMLLoader loader = new FXMLLoader(getClass().getResource("map5.fxml"));
				// loader.setControllerFactory(Controller -> new Controller());
				// Parent root;
				// try {
				// root = loader.load();
				// scene.setRoot(root);
				// } catch (IOException e) {
				// // TODO Auto-generated catch block
				// e.printStackTrace();
				// }
				// changeMap(scene ,fxmlLoader);

				player.setFloor(5);
				CurrentMap[x][y] = -1;
				buttonImage.setImage(new Image("file:image/down1.png"));
				stage1.setImage(new Image("file:image/map5.png"));

				map4mon1.setVisible(false);
				map4mon2.setVisible(false);
				map4mon3.setVisible(false);
				map4mon4.setVisible(false);
				map4mon5.setVisible(false);
				map4mon6.setVisible(false);
				map4mon7.setVisible(false);
				map4mon8.setVisible(false);
				map4mon9.setVisible(false);
				map4mon10.setVisible(false);
				map4mon11.setVisible(false);
				map4mon12.setVisible(false);
				map4mon13.setVisible(false);
				map4mon14.setVisible(false);
				map4mon15.setVisible(false);
				map4mon16.setVisible(false);
				map4mon17.setVisible(false);
				map4mon18.setVisible(false);
				map4mon19.setVisible(false);
				map4mon20.setVisible(false);
				map4Ydoor1.setVisible(false);
				map4Ydoor2.setVisible(false);
				map4Ydoor3.setVisible(false);
				map4Ydoor4.setVisible(false);
				map4Bdoor.setVisible(false);
				map4Rdoor.setVisible(false);
				map4prisondoor.setVisible(false);
				map4Ykey1.setVisible(false);
				map4Ykey2.setVisible(false);
				map4RHP1.setVisible(false);
				map4RHP2.setVisible(false);
				map4RHP3.setVisible(false);
				map4RHP4.setVisible(false);
				map4RD1.setVisible(false);
				map4RD2.setVisible(false);
				map4BD1.setVisible(false);
				map4BD2.setVisible(false);
				map4theif.setVisible(false);

				map5mon1.setVisible(true);
				map5mon2.setVisible(true);
				map5mon3.setVisible(true);
				map5mon4.setVisible(true);
				map5mon5.setVisible(true);
				map5mon6.setVisible(true);
				map5mon7.setVisible(true);
				map5mon8.setVisible(true);
				map5mon9.setVisible(true);
				map5mon10.setVisible(true);
				map5mon11.setVisible(true);
				map5mon12.setVisible(true);
				map5mon13.setVisible(true);
				map5mon14.setVisible(true);
				map5mon15.setVisible(true);
				map5mon16.setVisible(true);
				map5mon17.setVisible(true);
				map5mon18.setVisible(true);
				map5mon19.setVisible(true);
				map5mon20.setVisible(true);
				map5mon21.setVisible(true);
				map5Ydoor1.setVisible(true);
				map5Ydoor2.setVisible(true);
				map5Ydoor3.setVisible(true);
				map5Ydoor4.setVisible(true);
				map5Bdoor.setVisible(true);
				map5Rdoor.setVisible(true);
				map5Ykey1.setVisible(true);
				map5Ykey2.setVisible(true);
				map5Ykey3.setVisible(true);
				map5Bkey.setVisible(true);
				map5Pkey.setVisible(true);
				map5RHP.setVisible(true);
				map5BHP1.setVisible(true);
				map5BHP2.setVisible(true);
				map5RD1.setVisible(true);
				map5RD2.setVisible(true);
				map5BD1.setVisible(true);
				map5BD2.setVisible(true);
				map5shield.setVisible(true);
				map5cross.setVisible(true);
				return false;
			} else if (CurrentMap[x + 1][y] == 3) {
				CurrentMap[x][y] = 0;
				Map[3].setMap(CurrentMap);
				CurrentMap = Map[2].getMap(); // ������map3

				// FXMLLoader loader = new FXMLLoader(getClass().getResource("map3.fxml"));
				// loader.setControllerFactory(Controller -> new Controller());
				// Parent root;
				// try {
				// root = loader.load();
				// scene.setRoot(root);
				// } catch (IOException e) {
				// // TODO Auto-generated catch block
				// e.printStackTrace();
				// }
				// changeMap(scene ,fxmlLoader);

				player.setFloor(3);
				CurrentMap[x][y] = -1;
				buttonImage.setImage(new Image("file:image/down1.png"));
				stage1.setImage(new Image("file:image/map3-2.png"));

				map3mon1.setVisible(true);
				map3mon2.setVisible(true);
				map3mon3.setVisible(true);
				map3mon4.setVisible(true);
				map3mon5.setVisible(true);
				map3mon6.setVisible(true);
				map3mon7.setVisible(true);
				map3mon8.setVisible(true);
				map3mon9.setVisible(true);
				map3mon10.setVisible(true);
				map3mon11.setVisible(true);
				map3mon12.setVisible(true);
				map3mon13.setVisible(true);
				map3mon14.setVisible(true);
				map3mon15.setVisible(true);
				map3mon16.setVisible(true);
				map3mon17.setVisible(true);
				map3Ydoor1.setVisible(true);
				map3Ydoor2.setVisible(true);
				map3Ydoor3.setVisible(true);
				map3Ykey1.setVisible(true);
				map3Ykey2.setVisible(true);
				map3Ykey3.setVisible(true);
				map3Ykey4.setVisible(true);
				map3Ykey5.setVisible(true);
				map3Ykey6.setVisible(true);
				map3Ykey7.setVisible(true);
				map3Ykey8.setVisible(true);
				map3BHP.setVisible(true);
				map3RD.setVisible(true);
				map3BD.setVisible(true);
				map3sword.setVisible(true);

				map4mon1.setVisible(false);
				map4mon2.setVisible(false);
				map4mon3.setVisible(false);
				map4mon4.setVisible(false);
				map4mon5.setVisible(false);
				map4mon6.setVisible(false);
				map4mon7.setVisible(false);
				map4mon8.setVisible(false);
				map4mon9.setVisible(false);
				map4mon10.setVisible(false);
				map4mon11.setVisible(false);
				map4mon12.setVisible(false);
				map4mon13.setVisible(false);
				map4mon14.setVisible(false);
				map4mon15.setVisible(false);
				map4mon16.setVisible(false);
				map4mon17.setVisible(false);
				map4mon18.setVisible(false);
				map4mon19.setVisible(false);
				map4mon20.setVisible(false);
				map4Ydoor1.setVisible(false);
				map4Ydoor2.setVisible(false);
				map4Ydoor3.setVisible(false);
				map4Ydoor4.setVisible(false);
				map4Bdoor.setVisible(false);
				map4Rdoor.setVisible(false);
				map4prisondoor.setVisible(false);
				map4Ykey1.setVisible(false);
				map4Ykey2.setVisible(false);
				map4RHP1.setVisible(false);
				map4RHP2.setVisible(false);
				map4RHP3.setVisible(false);
				map4RHP4.setVisible(false);
				map4RD1.setVisible(false);
				map4RD2.setVisible(false);
				map4BD1.setVisible(false);
				map4BD2.setVisible(false);
				map4theif.setVisible(false);
				return false;
			} else if (CurrentMap[x + 1][y] == 30) {
				if (player.getYkey() <= 0)
					return false;
				openYdoor();
				CurrentMap[x + 1][y] = 0;
				map4Ydoor1.setImage(new Image("file:image/floor.png"));
				return false;
			} else if (CurrentMap[x + 1][y] == 32) {
				if (player.getYkey() <= 0)
					return false;
				openYdoor();
				CurrentMap[x + 1][y] = 0;
				map4Ydoor3.setImage(new Image("file:image/floor.png"));
				return false;
			} else if (CurrentMap[x + 1][y] == 42) {
				player.setX(player.getX() + 1);
				CurrentMap[x][y] = 0;
				CurrentMap[x + 1][y] = -1;
				getSmallHp();
				map4RHP3.setImage(new Image("file:image/floor.png"));
			} else if (CurrentMap[x + 1][y] == 43) {
				player.setX(player.getX() + 1);
				CurrentMap[x][y] = 0;
				CurrentMap[x + 1][y] = -1;
				getSmallHp();
				map4RHP4.setImage(new Image("file:image/floor.png"));
			} else if (CurrentMap[x + 1][y] == 50) {
				player.setX(player.getX() + 1);
				CurrentMap[x][y] = 0;
				CurrentMap[x + 1][y] = -1;
				getRedGem();
				map4RD1.setImage(new Image("file:image/floor.png"));
			} else if (CurrentMap[x + 1][y] == 51) {
				player.setX(player.getX() + 1);
				CurrentMap[x][y] = 0;
				CurrentMap[x + 1][y] = -1;
				getRedGem();
				map4RD2.setImage(new Image("file:image/floor.png"));
			} else if (CurrentMap[x + 1][y] == 52) {
				player.setX(player.getX() + 1);
				CurrentMap[x][y] = 0;
				CurrentMap[x + 1][y] = -1;
				getBlueGem();
				map4BD1.setImage(new Image("file:image/floor.png"));
			} else if (CurrentMap[x + 1][y] == 53) {
				player.setX(player.getX() + 1);
				CurrentMap[x][y] = 0;
				CurrentMap[x + 1][y] = -1;
				getBlueGem();
				map4BD2.setImage(new Image("file:image/floor.png"));
			} else if (CurrentMap[x + 1][y] == 60) { // �]�w
				GameMonster enemy = MonsterList.get(7); // glim�O0//rlim�O1//blim�O2//nwerewolf�O3//nsk�O4//psk�O5//bwizard�O6//bbat�O7//jguard�O8//bigbat�O9//rbat�O10//yknight�O11//rknight�O12
				if (player.getAt() <= enemy.getDefend())
					return false;
				battle.startBattle(player, enemy, HP);
				if (player.getHp() <= 0) {// ���a���`
					gameover.setVisible(true);
					close = true;
				}
				getReward(enemy);
				CurrentMap[x + 1][y] = 0; // �]�w
				map4mon1.setImage(new Image("file:image/floor.png")); // �]�w
				return false;
			} else if (CurrentMap[x + 1][y] == 61) { // �]�w
				GameMonster enemy = MonsterList.get(7); // glim�O0//rlim�O1//blim�O2//nwerewolf�O3//nsk�O4//psk�O5//bwizard�O6//bbat�O7//jguard�O8//bigbat�O9//rbat�O10//yknight�O11//rknight�O12
				if (player.getAt() <= enemy.getDefend())
					return false;
				battle.startBattle(player, enemy, HP);
				if (player.getHp() <= 0) {// ���a���`
					gameover.setVisible(true);
					close = true;
				}
				getReward(enemy);
				CurrentMap[x + 1][y] = 0; // �]�w
				map4mon2.setImage(new Image("file:image/floor.png")); // �]�w
				return false;
			} else if (CurrentMap[x + 1][y] == 62) { // �]�w
				GameMonster enemy = MonsterList.get(1); // glim�O0//rlim�O1//blim�O2//nwerewolf�O3//nsk�O4//psk�O5//bwizard�O6//bbat�O7//jguard�O8//bigbat�O9//rbat�O10//yknight�O11//rknight�O12
				if (player.getAt() <= enemy.getDefend())
					return false;
				battle.startBattle(player, enemy, HP);
				if (player.getHp() <= 0) {// ���a���`
					gameover.setVisible(true);
					close = true;
				}
				getReward(enemy);
				CurrentMap[x + 1][y] = 0; // �]�w
				map4mon3.setImage(new Image("file:image/floor.png")); // �]�w
				return false;
			} else if (CurrentMap[x + 1][y] == 75) { // �]�w
				GameMonster enemy = MonsterList.get(4); // glim�O0//rlim�O1//blim�O2//nwerewolf�O3//nsk�O4//psk�O5//bwizard�O6//bbat�O7//jguard�O8//bigbat�O9//rbat�O10//yknight�O11//rknight�O12
				if (player.getAt() <= enemy.getDefend())
					return false;
				battle.startBattle(player, enemy, HP);
				if (player.getHp() <= 0) {// ���a���`
					gameover.setVisible(true);
					close = true;
				}
				getReward(enemy);
				CurrentMap[x + 1][y] = 0; // �]�w
				map4mon16.setImage(new Image("file:image/floor.png")); // �]�w
				return false;
			}
		} else if (player.getFloor() == 5) {// map5
			if (CurrentMap[x + 1][y] == 0) {
				player.setX(player.getX() + 1);
				CurrentMap[x][y] = 0;
				CurrentMap[x + 1][y] = -1;
			} else if (CurrentMap[x + 1][y] == 1) {
				return false;
			} else if (CurrentMap[x + 1][y] == 3) {
				CurrentMap[x][y] = 0;
				Map[4].setMap(CurrentMap);
				CurrentMap = Map[3].getMap();

				// FXMLLoader loader = new FXMLLoader(getClass().getResource("map4.fxml"));
				// loader.setControllerFactory(Controller -> new Controller());
				// Parent root;
				// try {
				// root = loader.load();
				// scene.setRoot(root);
				// } catch (IOException e) {
				// // TODO Auto-generated catch block
				// e.printStackTrace();
				// }
				// changeMap(scene ,fxmlLoader);

				player.setFloor(4);
				CurrentMap[x][y] = -1;
				buttonImage.setImage(new Image("file:image/down1.png"));
				stage1.setImage(new Image("file:image/map4.png"));

				map4mon1.setVisible(true);
				map4mon2.setVisible(true);
				map4mon3.setVisible(true);
				map4mon4.setVisible(true);
				map4mon5.setVisible(true);
				map4mon6.setVisible(true);
				map4mon7.setVisible(true);
				map4mon8.setVisible(true);
				map4mon9.setVisible(true);
				map4mon10.setVisible(true);
				map4mon11.setVisible(true);
				map4mon12.setVisible(true);
				map4mon13.setVisible(true);
				map4mon14.setVisible(true);
				map4mon15.setVisible(true);
				map4mon16.setVisible(true);
				map4mon17.setVisible(true);
				map4mon18.setVisible(true);
				map4mon19.setVisible(true);
				map4mon20.setVisible(true);
				map4Ydoor1.setVisible(true);
				map4Ydoor2.setVisible(true);
				map4Ydoor3.setVisible(true);
				map4Ydoor4.setVisible(true);
				map4Bdoor.setVisible(true);
				map4Rdoor.setVisible(true);
				map4prisondoor.setVisible(true);
				map4Ykey1.setVisible(true);
				map4Ykey2.setVisible(true);
				map4RHP1.setVisible(true);
				map4RHP2.setVisible(true);
				map4RHP3.setVisible(true);
				map4RHP4.setVisible(true);
				map4RD1.setVisible(true);
				map4RD2.setVisible(true);
				map4BD1.setVisible(true);
				map4BD2.setVisible(true);
				map4theif.setVisible(true);

				map5mon1.setVisible(false);
				map5mon2.setVisible(false);
				map5mon3.setVisible(false);
				map5mon4.setVisible(false);
				map5mon5.setVisible(false);
				map5mon6.setVisible(false);
				map5mon7.setVisible(false);
				map5mon8.setVisible(false);
				map5mon9.setVisible(false);
				map5mon10.setVisible(false);
				map5mon11.setVisible(false);
				map5mon12.setVisible(false);
				map5mon13.setVisible(false);
				map5mon14.setVisible(false);
				map5mon15.setVisible(false);
				map5mon16.setVisible(false);
				map5mon17.setVisible(false);
				map5mon18.setVisible(false);
				map5mon19.setVisible(false);
				map5mon20.setVisible(false);
				map5mon21.setVisible(false);
				map5Ydoor1.setVisible(false);
				map5Ydoor2.setVisible(false);
				map5Ydoor3.setVisible(false);
				map5Ydoor4.setVisible(false);
				map5Bdoor.setVisible(false);
				map5Rdoor.setVisible(false);
				map5Ykey1.setVisible(false);
				map5Ykey2.setVisible(false);
				map5Ykey3.setVisible(false);
				map5Bkey.setVisible(false);
				map5Pkey.setVisible(false);
				map5RHP.setVisible(false);
				map5BHP1.setVisible(false);
				map5BHP2.setVisible(false);
				map5RD1.setVisible(false);
				map5RD2.setVisible(false);
				map5BD1.setVisible(false);
				map5BD2.setVisible(false);
				map5shield.setVisible(false);
				map5cross.setVisible(false);
				return false;
			} else if (CurrentMap[x + 1][y] == 7) {
				player.setX(player.getX() + 1);
				CurrentMap[x][y] = 0;
				CurrentMap[x + 1][y] = -1;
				player.setHp(player.getHp() + 1000);
				player.setAt(player.getAt() + 30);
				player.setDef(player.getDef() + 30);

				HP.setText(String.valueOf(player.getHp()));
				attack.setText(String.valueOf(player.getAt()));
				defend.setText(String.valueOf(player.getDef()));
				map5cross.setImage(new Image("file:image/floor.png"));
			} else if (CurrentMap[x + 1][y] == 8) {
				player.setX(player.getX() + 1);
				CurrentMap[x][y] = 0;
				CurrentMap[x + 1][y] = -1;
				player.setDef(player.getDef() + 10);
				defend.setText(String.valueOf(player.getDef()));
				map5shield.setImage(new Image("file:image/floor.png"));
			} else if (CurrentMap[x + 1][y] == 10) {
				player.setX(player.getX() + 1);
				CurrentMap[x][y] = 0;
				CurrentMap[x + 1][y] = -1;
				getYKey();
				map5Ykey2.setImage(new Image("file:image/floor.png"));
			} else if (CurrentMap[x + 1][y] == 11) {
				player.setX(player.getX() + 1);
				CurrentMap[x][y] = 0;
				CurrentMap[x + 1][y] = -1;
				getYKey();
				map5Ykey3.setImage(new Image("file:image/floor.png"));
			} else if (CurrentMap[x + 1][y] == 31) {
				if (player.getYkey() <= 0)
					return false;
				openYdoor();
				CurrentMap[x + 1][y] = 0;
				map5Ydoor2.setImage(new Image("file:image/floor.png"));
				return false;
			} else if (CurrentMap[x + 1][y] == 32) {
				if (player.getYkey() <= 0)
					return false;
				openYdoor();
				CurrentMap[x + 1][y] = 0;
				map5Ydoor3.setImage(new Image("file:image/floor.png"));
				return false;
			} else if (CurrentMap[x + 1][y] == 33) {
				if (player.getYkey() <= 0)
					return false;
				openYdoor();
				CurrentMap[x + 1][y] = 0;
				map5Ydoor4.setImage(new Image("file:image/floor.png"));
				return false;
			} else if (CurrentMap[x + 1][y] == 34) {
				if (player.getBkey() <= 0)
					return false;
				openBdoor();
				CurrentMap[x + 1][y] = 0;
				map5Bdoor.setImage(new Image("file:image/floor.png"));
				return false;
			} else if (CurrentMap[x + 1][y] == 42) {
				player.setX(player.getX() + 1);
				CurrentMap[x][y] = 0;
				CurrentMap[x + 1][y] = -1;
				getBigHp();
				map5BHP2.setImage(new Image("file:image/floor.png"));
			} else if (CurrentMap[x + 1][y] == 50) {
				player.setX(player.getX() + 1);
				CurrentMap[x][y] = 0;
				CurrentMap[x + 1][y] = -1;
				getRedGem();
				map5RD1.setImage(new Image("file:image/floor.png"));
			} else if (CurrentMap[x + 1][y] == 52) {
				player.setX(player.getX() + 1);
				CurrentMap[x][y] = 0;
				CurrentMap[x + 1][y] = -1;
				getBlueGem();
				map5BD1.setImage(new Image("file:image/floor.png"));
			} else if (CurrentMap[x + 1][y] == 53) {
				player.setX(player.getX() + 1);
				CurrentMap[x][y] = 0;
				CurrentMap[x + 1][y] = -1;
				getBlueGem();
				map5BD2.setImage(new Image("file:image/floor.png"));
			} else if (CurrentMap[x + 1][y] == 61) { // �]�w
				GameMonster enemy = MonsterList.get(9); // glim�O0//rlim�O1//blim�O2//nwerewolf�O3//nsk�O4//psk�O5//bwizard�O6//bbat�O7//jguard�O8//bigbat�O9//rbat�O10//yknight�O11//rknight�O12
				if (player.getAt() <= enemy.getDefend())
					return false;
				battle.startBattle(player, enemy, HP);
				if (player.getHp() <= 0) {// ���a���`
					gameover.setVisible(true);
					close = true;
				}
				getReward(enemy);
				CurrentMap[x + 1][y] = 0; // �]�w
				map5mon2.setImage(new Image("file:image/floor.png")); // �]�w
				return false;
			} else if (CurrentMap[x + 1][y] == 64) { // �]�w
				GameMonster enemy = MonsterList.get(2); // glim�O0//rlim�O1//blim�O2//nwerewolf�O3//nsk�O4//psk�O5//bwizard�O6//bbat�O7//jguard�O8//bigbat�O9//rbat�O10//yknight�O11//rknight�O12
				if (player.getAt() <= enemy.getDefend())
					return false;
				battle.startBattle(player, enemy, HP);
				if (player.getHp() <= 0) {// ���a���`
					gameover.setVisible(true);
					close = true;
				}
				getReward(enemy);
				CurrentMap[x + 1][y] = 0; // �]�w
				map5mon5.setImage(new Image("file:image/floor.png")); // �]�w
				return false;
			} else if (CurrentMap[x + 1][y] == 65) { // �]�w
				GameMonster enemy = MonsterList.get(2); // glim�O0//rlim�O1//blim�O2//nwerewolf�O3//nsk�O4//psk�O5//bwizard�O6//bbat�O7//jguard�O8//bigbat�O9//rbat�O10//yknight�O11//rknight�O12
				if (player.getAt() <= enemy.getDefend())
					return false;
				battle.startBattle(player, enemy, HP);
				if (player.getHp() <= 0) {// ���a���`
					gameover.setVisible(true);
					close = true;
				}
				getReward(enemy);
				CurrentMap[x + 1][y] = 0; // �]�w
				map5mon6.setImage(new Image("file:image/floor.png")); // �]�w
				return false;
			} else if (CurrentMap[x + 1][y] == 66) { // �]�w
				GameMonster enemy = MonsterList.get(7); // glim�O0//rlim�O1//blim�O2//nwerewolf�O3//nsk�O4//psk�O5//bwizard�O6//bbat�O7//jguard�O8//bigbat�O9//rbat�O10//yknight�O11//rknight�O12
				if (player.getAt() <= enemy.getDefend())
					return false;
				battle.startBattle(player, enemy, HP);
				if (player.getHp() <= 0) {// ���a���`
					gameover.setVisible(true);
					close = true;
				}
				getReward(enemy);
				CurrentMap[x + 1][y] = 0; // �]�w
				map5mon7.setImage(new Image("file:image/floor.png")); // �]�w
				return false;
			} else if (CurrentMap[x + 1][y] == 67) { // �]�w
				GameMonster enemy = MonsterList.get(6); // glim�O0//rlim�O1//blim�O2//nwerewolf�O3//nsk�O4//psk�O5//bwizard�O6//bbat�O7//jguard�O8//bigbat�O9//rbat�O10//yknight�O11//rknight�O12
				if (player.getAt() <= enemy.getDefend())
					return false;
				battle.startBattle(player, enemy, HP);
				if (player.getHp() <= 0) {// ���a���`
					gameover.setVisible(true);
					close = true;
				}
				getReward(enemy);
				CurrentMap[x + 1][y] = 0; // �]�w
				map5mon8.setImage(new Image("file:image/floor.png")); // �]�w
				return false;
			} else if (CurrentMap[x + 1][y] == 68) { // �]�w
				GameMonster enemy = MonsterList.get(5); // glim�O0//rlim�O1//blim�O2//nwerewolf�O3//nsk�O4//psk�O5//bwizard�O6//bbat�O7//jguard�O8//bigbat�O9//rbat�O10//yknight�O11//rknight�O12
				if (player.getAt() <= enemy.getDefend())
					return false;
				battle.startBattle(player, enemy, HP);
				if (player.getHp() <= 0) {// ���a���`
					gameover.setVisible(true);
					close = true;
				}
				getReward(enemy);
				CurrentMap[x + 1][y] = 0; // �]�w
				map5mon9.setImage(new Image("file:image/floor.png")); // �]�w
				return false;
			} else if (CurrentMap[x + 1][y] == 70) { // �]�w
				GameMonster enemy = MonsterList.get(5); // glim�O0//rlim�O1//blim�O2//nwerewolf�O3//nsk�O4//psk�O5//bwizard�O6//bbat�O7//jguard�O8//bigbat�O9//rbat�O10//yknight�O11//rknight�O12
				if (player.getAt() <= enemy.getDefend())
					return false;
				battle.startBattle(player, enemy, HP);
				if (player.getHp() <= 0) {// ���a���`
					gameover.setVisible(true);
					close = true;
				}
				getReward(enemy);
				CurrentMap[x + 1][y] = 0; // �]�w
				map5mon11.setImage(new Image("file:image/floor.png")); // �]�w
				return false;
			} else if (CurrentMap[x + 1][y] == 72) { // �]�w
				GameMonster enemy = MonsterList.get(7); // glim�O0//rlim�O1//blim�O2//nwerewolf�O3//nsk�O4//psk�O5//bwizard�O6//bbat�O7//jguard�O8//bigbat�O9//rbat�O10//yknight�O11//rknight�O12
				if (player.getAt() <= enemy.getDefend())
					return false;
				battle.startBattle(player, enemy, HP);
				if (player.getHp() <= 0) {// ���a���`
					gameover.setVisible(true);
					close = true;
				}
				getReward(enemy);
				CurrentMap[x + 1][y] = 0; // �]�w
				map5mon13.setImage(new Image("file:image/floor.png")); // �]�w
				return false;
			} else if (CurrentMap[x + 1][y] == 76) { // �]�w
				GameMonster enemy = MonsterList.get(3); // glim�O0//rlim�O1//blim�O2//nwerewolf�O3//nsk�O4//psk�O5//bwizard�O6//bbat�O7//jguard�O8//bigbat�O9//rbat�O10//yknight�O11//rknight�O12
				if (player.getAt() <= enemy.getDefend())
					return false;
				battle.startBattle(player, enemy, HP);
				if (player.getHp() <= 0) {// ���a���`
					gameover.setVisible(true);
					close = true;
				}
				getReward(enemy);
				CurrentMap[x + 1][y] = 0; // �]�w
				map5mon17.setImage(new Image("file:image/floor.png")); // �]�w
				return false;
			} else if (CurrentMap[x + 1][y] == 77) { // �]�w
				GameMonster enemy = MonsterList.get(6); // glim�O0//rlim�O1//blim�O2//nwerewolf�O3//nsk�O4//psk�O5//bwizard�O6//bbat�O7//jguard�O8//bigbat�O9//rbat�O10//yknight�O11//rknight�O12
				if (player.getAt() <= enemy.getDefend())
					return false;
				battle.startBattle(player, enemy, HP);
				if (player.getHp() <= 0) {// ���a���`
					gameover.setVisible(true);
					close = true;
				}
				getReward(enemy);
				CurrentMap[x + 1][y] = 0; // �]�w
				map5mon18.setImage(new Image("file:image/floor.png")); // �]�w
				return false;
			} else if (CurrentMap[x + 1][y] == 79) { // �]�w
				GameMonster enemy = MonsterList.get(8); // glim�O0//rlim�O1//blim�O2//nwerewolf�O3//nsk�O4//psk�O5//bwizard�O6//bbat�O7//jguard�O8//bigbat�O9//rbat�O10//yknight�O11//rknight�O12
				if (player.getAt() <= enemy.getDefend())
					return false;
				battle.startBattle(player, enemy, HP);
				if (player.getHp() <= 0) {// ���a���`
					gameover.setVisible(true);
					close = true;
				}
				getReward(enemy);
				CurrentMap[x + 1][y] = 0; // �]�w
				map5mon20.setImage(new Image("file:image/floor.png")); // �]�w
				return false;
			}
		} else if (player.getFloor() == 6) {// map6
			if (CurrentMap[x + 1][y] == 0 && CurrentMap[x + 1][y] != 7) {
				player.setX(player.getX() + 1);
				CurrentMap[x][y] = 0;
				CurrentMap[x + 1][y] = -1;
			} else if (CurrentMap[x + 1][y] == 1) {
				return false;
			} else if (CurrentMap[x + 1][y] == 5) { // �]�w
				GameMonster enemy = MonsterList.get(13); // glim�O0//rlim�O1//blim�O2//nwerewolf�O3//nsk�O4//psk�O5//bwizard�O6//bbat�O7//jguard�O8//bigbat�O9//rbat�O10//yknight�O11//rknight�O12//boss�O13
				if (player.getAt() <= enemy.getDefend())
					return false;
				battle.startBattle(player, enemy, HP);
				if (player.getHp() <= 0) {// ���a���`
					gameover.setVisible(true);
					close = true;
				}
				getReward(enemy);
				CurrentMap[x + 1][y] = 0; // �]�w
				map6Boss.setImage(new Image("file:image/floor.png")); // �]�w
				return false;
			} else if (CurrentMap[x + 1][y] == 6) {
				talking = true;
				talk = true;
				down = true;
				if (map6bosstalk.isVisible() == false) {
					map6bosstalk.setImage(new Image("file:image/princess-talk1.png"));
					map6bosstalk.setVisible(true);
					next = true;
				} else if (next == true && map6bosstalk.isVisible() == true) {
					map6bosstalk.setImage(new Image("file:image/princess-talk2.png"));
					next = false;
					next1 = true;
				} else if (next1 == true && map6bosstalk.isVisible() == true) {
					map6bosstalk.setImage(new Image("file:image/princess-talk3.png"));
					next1 = false;
					next2 = true;
				} else if (next2 == true && map6bosstalk.isVisible() == true) {
					map6bosstalk.setImage(new Image("file:image/princess-talk4.png"));
					next2 = false;
					next3 = true;
				} else if (next3 == true && map6bosstalk.isVisible() == true) {
					map6bosstalk.setImage(new Image("file:image/princess-talk5.png"));
					next3 = false;
					next4 = true;
				} else if (next4 == true && map6bosstalk.isVisible() == true) {
					map6bosstalk.setVisible(false);
					next4 = false;
					talk = false;
					down = false;
					close = true;
					gameover.setImage(new Image("file:image/youwin.jpg"));
					gameover.setVisible(true);
				}
				return false;
			} else if (CurrentMap[x + 1][y] == 7) {
				talking = true;
				talk = true;
				down = true;
				if (map6bosstalk.isVisible() == false) {
					map6bosstalk.setImage(new Image("file:image/bosstalk1.png"));
					map6bosstalk.setVisible(true);
					next = true;
				} else if (next == true && map6bosstalk.isVisible() == true) {
					map6bosstalk.setImage(new Image("file:image/bosstalk2.png"));
					next = false;
					next1 = true;
				} else if (next1 == true && map6bosstalk.isVisible() == true) {
					map6bosstalk.setImage(new Image("file:image/bosstalk3.png"));
					next1 = false;
					next2 = true;
				} else if (next2 == true && map6bosstalk.isVisible() == true) {
					map6bosstalk.setImage(new Image("file:image/bosstalk4.png"));
					next2 = false;
					next3 = true;
				} else if (next3 == true && map6bosstalk.isVisible() == true) {
					map6bosstalk.setVisible(false);
					player.setX(player.getX() + 1);
					CurrentMap[x][y] = 0;
					CurrentMap[x + 1][y] = -1;
					buttonImage.setImage(new Image("file:image/down1.png"));
					talk = false;
					down = false;
					talking = false;
				}
			} else if (CurrentMap[x + 1][y] == 35) {
				if (player.getRkey() <= 0)
					return false;
				openRdoor();
				CurrentMap[x + 1][y] = 0;
				CurrentMap[x + 2][y] = 7;
				map6Rdoor.setImage(new Image("file:image/floor.png"));
				return false;
			}
		}
		System.out.println(player.getX() + " " + player.getY() + "\n");
		return true;
	}

	boolean obstacleleft() {
		x = player.getX();
		y = player.getY();
		if (player.getFloor() == 1) {// map1
			if (CurrentMap[x][y - 1] == 0) {
				player.setY(player.getY() - 1);
				CurrentMap[x][y] = 0;
				CurrentMap[x][y - 1] = -1;
			} else if (CurrentMap[x][y - 1] == 1) {
				return false;
			} else if (CurrentMap[x][y - 1] == -2) {
				left = true;
				talk = true;
				if (map1talk.isVisible() == false) {
					map1talk.setImage(new Image("file:image/readertalk.png"));
					map1talk.setVisible(true);
					map1reader.setImage(new Image("file:image/floor.png"));
					next = true;
					getreader = true;
				} else if (next == true && map1talk.isVisible() == true) {
					player.setY(player.getY() - 1);
					CurrentMap[x][y] = 0;
					CurrentMap[x][y - 1] = -1;
					map1talk.setVisible(false);
					left = false;
					talk = false;
					next = false;
				}
			} else if (CurrentMap[x][y - 1] == 2) { // ���ĤG�i�a��
				// road1[x-1][y+1]=-1;
				// road2[x][y]=0;
				// x-=1; y+=1;
				// buttonImage.setImage ( new Image ("file:image/down1.png") );
				// buttonImage.setTranslateX ( buttonImage.getTranslateX () + 50 );
				// stage1.setImage ( new Image ("file:image/map1.png") );
				CurrentMap[x][y] = 0; // ���e��m�令��
				Map[0].setMap(CurrentMap);
				CurrentMap = Map[1].getMap();
				// System.out.println(player.getX()+", "+player.getY());
				// FXMLLoader loader = new FXMLLoader(getClass().getResource("map2.fxml"));
				// loader.setControllerFactory(Controller -> new Controller());
				// Parent root;
				// try {
				// root = loader.load();
				// scene.setRoot(root);
				// } catch (IOException e) {
				// // TODO Auto-generated catch block
				// e.printStackTrace();
				// }
				// changeMap(scene ,fxmlLoader);

				CurrentMap[x + 1][y - 1] = -1;
				// System.out.println("�������2�i�a��");
				player.setX(player.getX() + 1);
				player.setY(player.getY() - 1);
				player.setFloor(2);
				buttonImage.setImage(new Image("file:image/down1.png"));
				buttonImage.setTranslateY(buttonImage.getTranslateY() + 50);
				stage1.setImage(new Image("file:image/map2.png"));

				map1mon1.setVisible(false);
				map1mon2.setVisible(false);
				map1mon3.setVisible(false);
				map1mon4.setVisible(false);
				map1mon5.setVisible(false);
				map1mon6.setVisible(false);
				map1mon7.setVisible(false);
				map1mon8.setVisible(false);
				map1mon9.setVisible(false);
				map1mon10.setVisible(false);
				map1mon11.setVisible(false);
				map1mon12.setVisible(false);
				map1Ykey1.setVisible(false);
				map1Ykey2.setVisible(false);
				map1Ykey3.setVisible(false);
				map1Ykey4.setVisible(false);
				map1Ykey5.setVisible(false);
				map1Ykey6.setVisible(false);
				map1Ykey7.setVisible(false);
				map1Ykey8.setVisible(false);
				map1Ykey9.setVisible(false);
				map1Ykey10.setVisible(false);
				map1Ykey11.setVisible(false);
				map1Bkey1.setVisible(false);
				map1Bkey2.setVisible(false);
				map1Rkey.setVisible(false);
				map1Ydoor1.setVisible(false);
				map1Ydoor2.setVisible(false);
				map1Ydoor3.setVisible(false);
				map1Ydoor4.setVisible(false);
				map1Ydoor5.setVisible(false);
				map1Rdoor.setVisible(false);
				map1RHP1.setVisible(false);
				map1RHP2.setVisible(false);
				map1RHP3.setVisible(false);
				map1RHP4.setVisible(false);
				map1RHP5.setVisible(false);
				map1RHP6.setVisible(false);
				map1RHP7.setVisible(false);
				map1BHP.setVisible(false);
				map1BD.setVisible(false);
				map1RD.setVisible(false);
				map1reader.setVisible(false);

				map2Rknight.setVisible(true);
				map2Yknight1.setVisible(true);
				map2Yknight2.setVisible(true);
				map2Pdoor.setVisible(true);
				map2prison1.setVisible(true);
				map2prison2.setVisible(true);
				map2Ydoor1.setVisible(true);
				map2Ydoor2.setVisible(true);
				map2Ydoor3.setVisible(true);
				map2Ydoor4.setVisible(true);
				map2Ydoor5.setVisible(true);
				map2Ydoor6.setVisible(true);
				map2Bdoor.setVisible(true);
				map2Ykey1.setVisible(true);
				map2Ykey2.setVisible(true);
				map2Ykey3.setVisible(true);
				map2Ykey4.setVisible(true);
				map2Ykey5.setVisible(true);
				map2Ykey6.setVisible(true);
				map2Ykey7.setVisible(true);
				map2Ykey8.setVisible(true);
				map2Ykey9.setVisible(true);
				map2Bkey.setVisible(true);
				map2Rkey.setVisible(true);
				map2BHP1.setVisible(true);
				map2BHP2.setVisible(true);
				map2BHP3.setVisible(true);
				map2BHP4.setVisible(true);
				map2RHP1.setVisible(true);
				map2RHP2.setVisible(true);
				map2RHP3.setVisible(true);
				map2RD1.setVisible(true);
				map2RD2.setVisible(true);
				map2RD3.setVisible(true);
				map2RD4.setVisible(true);
				map2BD1.setVisible(true);
				map2BD2.setVisible(true);
				map2BD3.setVisible(true);
				map2BD4.setVisible(true);
				map2oldman.setVisible(true);
				map2goldman.setVisible(true);
			} else if (CurrentMap[x][y - 1] == 9) {
				player.setY(player.getY() - 1);
				CurrentMap[x][y] = 0;
				CurrentMap[x][y - 1] = -1;
				getYKey();
				map1Ykey1.setImage(new Image("file:image/floor.png"));
			} else if (CurrentMap[x][y - 1] == 10) {
				player.setY(player.getY() - 1);
				CurrentMap[x][y] = 0;
				CurrentMap[x][y - 1] = -1;
				getYKey();
				map1Ykey2.setImage(new Image("file:image/floor.png"));
			} else if (CurrentMap[x][y - 1] == 11) {
				player.setY(player.getY() - 1);
				CurrentMap[x][y] = 0;
				CurrentMap[x][y - 1] = -1;
				getYKey();
				map1Ykey3.setImage(new Image("file:image/floor.png"));
			} else if (CurrentMap[x][y - 1] == 12) {
				player.setY(player.getY() - 1);
				CurrentMap[x][y] = 0;
				CurrentMap[x][y - 1] = -1;
				getYKey();
				map1Ykey4.setImage(new Image("file:image/floor.png"));
			} else if (CurrentMap[x][y - 1] == 13) {
				player.setY(player.getY() - 1);
				CurrentMap[x][y] = 0;
				CurrentMap[x][y - 1] = -1;
				getYKey();
				map1Ykey5.setImage(new Image("file:image/floor.png"));
			} else if (CurrentMap[x][y - 1] == 14) {
				player.setY(player.getY() - 1);
				CurrentMap[x][y] = 0;
				CurrentMap[x][y - 1] = -1;
				getYKey();
				map1Ykey6.setImage(new Image("file:image/floor.png"));
			} else if (CurrentMap[x][y - 1] == 15) {
				player.setY(player.getY() - 1);
				CurrentMap[x][y] = 0;
				CurrentMap[x][y - 1] = -1;
				getYKey();
				map1Ykey7.setImage(new Image("file:image/floor.png"));
			} else if (CurrentMap[x][y - 1] == 16) {
				player.setY(player.getY() - 1);
				CurrentMap[x][y] = 0;
				CurrentMap[x][y - 1] = -1;
				getYKey();
				map1Ykey8.setImage(new Image("file:image/floor.png"));
			} else if (CurrentMap[x][y - 1] == 17) {
				player.setY(player.getY() - 1);
				CurrentMap[x][y] = 0;
				CurrentMap[x][y - 1] = -1;
				getYKey();
				map1Ykey9.setImage(new Image("file:image/floor.png"));
			} else if (CurrentMap[x][y - 1] == 18) {
				player.setY(player.getY() - 1);
				CurrentMap[x][y] = 0;
				CurrentMap[x][y - 1] = -1;
				getYKey();
				map1Ykey10.setImage(new Image("file:image/floor.png"));
			} else if (CurrentMap[x][y - 1] == 19) {
				player.setY(player.getY() - 1);
				CurrentMap[x][y] = 0;
				CurrentMap[x][y - 1] = -1;
				getYKey();
				map1Ykey11.setImage(new Image("file:image/floor.png"));
			} else if (CurrentMap[x][y - 1] == 20) {
				player.setY(player.getY() - 1);
				CurrentMap[x][y] = 0;
				CurrentMap[x][y - 1] = -1;
				getBKey();
				map1Bkey1.setImage(new Image("file:image/floor.png"));
			} else if (CurrentMap[x][y - 1] == 21) {
				player.setY(player.getY() - 1);
				CurrentMap[x][y] = 0;
				CurrentMap[x][y - 1] = -1;
				getBKey();
				map1Bkey2.setImage(new Image("file:image/floor.png"));
			} else if (CurrentMap[x][y - 1] == 22) {
				player.setY(player.getY() - 1);
				CurrentMap[x][y] = 0;
				CurrentMap[x][y - 1] = -1;
				getRKey();
				map1Rkey.setImage(new Image("file:image/floor.png"));
			} else if (CurrentMap[x][y - 1] == 30) {
				if (player.getYkey() <= 0)
					return false;
				openYdoor();
				CurrentMap[x][y - 1] = 0;
				map1Ydoor1.setImage(new Image("file:image/floor.png"));
				return false;
			} else if (CurrentMap[x][y - 1] == 31) {
				if (player.getYkey() <= 0)
					return false;
				openYdoor();
				CurrentMap[x][y - 1] = 0;
				map1Ydoor2.setImage(new Image("file:image/floor.png"));
				return false;
			} else if (CurrentMap[x][y - 1] == 32) {
				if (player.getYkey() <= 0)
					return false;
				openYdoor();
				CurrentMap[x][y - 1] = 0;
				map1Ydoor3.setImage(new Image("file:image/floor.png"));
				return false;
			} else if (CurrentMap[x][y - 1] == 33) {
				if (player.getYkey() <= 0)
					return false;
				openYdoor();
				CurrentMap[x][y - 1] = 0;
				map1Ydoor4.setImage(new Image("file:image/floor.png"));
				return false;
			} else if (CurrentMap[x][y - 1] == 34) {
				if (player.getYkey() <= 0)
					return false;
				openYdoor();
				CurrentMap[x][y - 1] = 0;
				map1Ydoor5.setImage(new Image("file:image/floor.png"));
				return false;
			} else if (CurrentMap[x][y - 1] == 40) {
				player.setY(player.getY() - 1);
				CurrentMap[x][y] = 0;
				CurrentMap[x][y - 1] = -1;
				getSmallHp();
				map1RHP1.setImage(new Image("file:image/floor.png"));
			} else if (CurrentMap[x][y - 1] == 41) {
				player.setY(player.getY() - 1);
				CurrentMap[x][y] = 0;
				CurrentMap[x][y - 1] = -1;
				getSmallHp();
				map1RHP2.setImage(new Image("file:image/floor.png"));
			} else if (CurrentMap[x][y - 1] == 42) {
				player.setY(player.getY() - 1);
				CurrentMap[x][y] = 0;
				CurrentMap[x][y - 1] = -1;
				getSmallHp();
				map1RHP3.setImage(new Image("file:image/floor.png"));
			} else if (CurrentMap[x][y - 1] == 43) {
				player.setY(player.getY() - 1);
				CurrentMap[x][y] = 0;
				CurrentMap[x][y - 1] = -1;
				getSmallHp();
				map1RHP4.setImage(new Image("file:image/floor.png"));
			} else if (CurrentMap[x][y - 1] == 44) {
				player.setY(player.getY() - 1);
				CurrentMap[x][y] = 0;
				CurrentMap[x][y - 1] = -1;
				getSmallHp();
				map1RHP5.setImage(new Image("file:image/floor.png"));
			} else if (CurrentMap[x][y - 1] == 45) {
				player.setY(player.getY() - 1);
				CurrentMap[x][y] = 0;
				CurrentMap[x][y - 1] = -1;
				getSmallHp();
				map1RHP6.setImage(new Image("file:image/floor.png"));
			} else if (CurrentMap[x][y - 1] == 46) {
				player.setY(player.getY() - 1);
				CurrentMap[x][y] = 0;
				CurrentMap[x][y - 1] = -1;
				getSmallHp();
				map1RHP7.setImage(new Image("file:image/floor.png"));
			} else if (CurrentMap[x][y - 1] == 47) {
				player.setY(player.getY() - 1);
				CurrentMap[x][y] = 0;
				CurrentMap[x][y - 1] = -1;
				getBigHp();
				map1BHP.setImage(new Image("file:image/floor.png"));
			} else if (CurrentMap[x][y + 1] == 50) {
				player.setY(player.getY() - 1);
				CurrentMap[x][y] = 0;
				CurrentMap[x][y - 1] = -1;
				getRedGem();
				map1RD.setImage(new Image("file:image/floor.png"));
			} else if (CurrentMap[x][y + 1] == 51) {
				player.setY(player.getY() - 1);
				CurrentMap[x][y] = 0;
				CurrentMap[x][y - 1] = -1;
				getBlueGem();
				map1BD.setImage(new Image("file:image/floor.png"));
			} else if (CurrentMap[x][y - 1] == 60) { // �]�w
				GameMonster enemy = MonsterList.get(0); // 0�Oglim
				if (player.getAt() <= enemy.getDefend())
					return false;
				battle.startBattle(player, enemy, HP);
				if (player.getHp() <= 0) {// ���a���`
					gameover.setVisible(true);
					close = true;
				}
				getReward(enemy);
				CurrentMap[x][y - 1] = 0; // �]�w
				map1mon1.setImage(new Image("file:image/floor.png")); // �]�w
				return false;
			} else if (CurrentMap[x][y - 1] == 61) {
				GameMonster enemy = MonsterList.get(1); // 1�ORlim
				if (player.getAt() <= enemy.getDefend())
					return false;
				battle.startBattle(player, enemy, HP);
				if (player.getHp() <= 0) {// ���a���`
					gameover.setVisible(true);
					close = true;
				}
				getReward(enemy);
				CurrentMap[x][y - 1] = 0; // �]�w
				map1mon2.setImage(new Image("file:image/floor.png")); // �]�w
				return false;
			} else if (CurrentMap[x][y - 1] == 62) {
				GameMonster enemy = MonsterList.get(0); // 0�Oglim
				if (player.getAt() <= enemy.getDefend())
					return false;
				battle.startBattle(player, enemy, HP);
				if (player.getHp() <= 0) {// ���a���`

					gameover.setVisible(true);
					close = true;
				}
				getReward(enemy);
				CurrentMap[x][y - 1] = 0; // �]�w
				map1mon3.setImage(new Image("file:image/floor.png")); // �]�w
				return false;
			} else if (CurrentMap[x][y - 1] == 70) { // �]�w
				GameMonster enemy = MonsterList.get(4); // glim�O0//rlim�O1//blim�O2//nwerewolf�O3//nsk�O4//psk�O5//bwizard�O6//bbat�O7//jguard�O8//bigbat�O9//rbat�O10//yknight�O11//rknight�O12
				if (player.getAt() <= enemy.getDefend())
					return false;
				battle.startBattle(player, enemy, HP);
				if (player.getHp() <= 0) {// ���a���`
					gameover.setVisible(true);
					close = true;
				}
				getReward(enemy);
				CurrentMap[x][y - 1] = 0; // �]�w
				map1mon11.setImage(new Image("file:image/floor.png")); // �]�w
				return false;
			} else if (CurrentMap[x][y - 1] == 71) { // �]�w
				GameMonster enemy = MonsterList.get(4); // glim�O0//rlim�O1//blim�O2//nwerewolf�O3//nsk�O4//psk�O5//bwizard�O6//bbat�O7//jguard�O8//bigbat�O9//rbat�O10//yknight�O11//rknight�O12
				if (player.getAt() <= enemy.getDefend())
					return false;
				battle.startBattle(player, enemy, HP);
				if (player.getHp() <= 0) {// ���a���`
					gameover.setVisible(true);
					close = true;
				}
				getReward(enemy);
				CurrentMap[x][y - 1] = 0; // �]�w
				map1mon12.setImage(new Image("file:image/floor.png")); // �]�w
				return false;
			}
		} else if (player.getFloor() == 2) { // map2
			if (CurrentMap[x][y - 1] == 0) {
				player.setY(player.getY() - 1);
				CurrentMap[x][y] = 0;
				CurrentMap[x][y - 1] = -1;
			} else if (CurrentMap[x][y - 1] == 1) {
				return false;
			} else if (CurrentMap[x][y - 1] == 9) {
				player.setY(player.getY() - 1);
				CurrentMap[x][y] = 0;
				CurrentMap[x][y - 1] = -1;
				getYKey();
				map2Ykey1.setImage(new Image("file:image/floor.png"));
			} else if (CurrentMap[x][y - 1] == 10) {
				player.setY(player.getY() - 1);
				CurrentMap[x][y] = 0;
				CurrentMap[x][y - 1] = -1;
				getYKey();
				map2Ykey2.setImage(new Image("file:image/floor.png"));
			} else if (CurrentMap[x][y - 1] == 11) {
				player.setY(player.getY() - 1);
				CurrentMap[x][y] = 0;
				CurrentMap[x][y - 1] = -1;
				getYKey();
				map2Ykey3.setImage(new Image("file:image/floor.png"));
			} else if (CurrentMap[x][y - 1] == 12) {
				CurrentMap[x][y] = 0;
				CurrentMap[x][y - 1] = -1;
				getYKey();
				map2Ykey4.setImage(new Image("file:image/floor.png"));
			} else if (CurrentMap[x][y - 1] == 13) {
				player.setY(player.getY() - 1);
				CurrentMap[x][y] = 0;
				CurrentMap[x][y - 1] = -1;
				getYKey();
				map2Ykey5.setImage(new Image("file:image/floor.png"));
			} else if (CurrentMap[x][y - 1] == 14) {
				player.setY(player.getY() - 1);
				CurrentMap[x][y] = 0;
				CurrentMap[x][y - 1] = -1;
				getYKey();
				map2Ykey6.setImage(new Image("file:image/floor.png"));
			} else if (CurrentMap[x][y - 1] == 15) {
				player.setY(player.getY() - 1);
				CurrentMap[x][y] = 0;
				CurrentMap[x][y - 1] = -1;
				getYKey();
				map2Ykey7.setImage(new Image("file:image/floor.png"));
			} else if (CurrentMap[x][y - 1] == 16) {
				player.setY(player.getY() - 1);
				CurrentMap[x][y] = 0;
				CurrentMap[x][y - 1] = -1;
				getYKey();
				map2Ykey8.setImage(new Image("file:image/floor.png"));
			} else if (CurrentMap[x][y - 1] == 17) {
				player.setY(player.getY() - 1);
				CurrentMap[x][y] = 0;
				CurrentMap[x][y - 1] = -1;
				getYKey();
				map2Ykey9.setImage(new Image("file:image/floor.png"));
			} else if (CurrentMap[x][y - 1] == 18) {
				player.setY(player.getY() - 1);
				CurrentMap[x][y] = 0;
				CurrentMap[x][y - 1] = -1;
				getBKey();
				map2Bkey.setImage(new Image("file:image/floor.png"));
			} else if (CurrentMap[x][y - 1] == 19) {
				player.setY(player.getY() - 1);
				CurrentMap[x][y] = 0;
				CurrentMap[x][y - 1] = -1;
				getRKey();
				map2Rkey.setImage(new Image("file:image/floor.png"));
			} else if (CurrentMap[x][y - 1] == 30) {
				if (player.getYkey() <= 0)
					return false;
				openYdoor();
				CurrentMap[x][y - 1] = 0;
				map2Ydoor1.setImage(new Image("file:image/floor.png"));
				return false;
			} else if (CurrentMap[x][y - 1] == 31) {
				if (player.getYkey() <= 0)
					return false;
				openYdoor();
				CurrentMap[x][y - 1] = 0;
				map2Ydoor2.setImage(new Image("file:image/floor.png"));
				return false;
			} else if (CurrentMap[x][y - 1] == 32) {
				if (player.getYkey() <= 0)
					return false;
				openYdoor();
				CurrentMap[x][y - 1] = 0;
				map2Ydoor3.setImage(new Image("file:image/floor.png"));
				return false;
			} else if (CurrentMap[x][y - 1] == 33) {
				if (player.getYkey() <= 0)
					return false;
				openYdoor();
				CurrentMap[x][y - 1] = 0;
				map2Ydoor4.setImage(new Image("file:image/floor.png"));
				return false;
			} else if (CurrentMap[x][y - 1] == 34) {
				if (player.getYkey() <= 0)
					return false;
				openYdoor();
				CurrentMap[x][y - 1] = 0;
				map2Ydoor5.setImage(new Image("file:image/floor.png"));
				return false;
			} else if (CurrentMap[x][y - 1] == 35) {
				if (player.getYkey() <= 0)
					return false;
				openYdoor();
				CurrentMap[x][y - 1] = 0;
				map2Ydoor6.setImage(new Image("file:image/floor.png"));
				return false;
			} else if (CurrentMap[x][y - 1] == 36) {
				if (player.getBkey() <= 0)
					return false;
				openBdoor();
				CurrentMap[x][y - 1] = 0;
				map2Bdoor.setImage(new Image("file:image/floor.png"));
				return false;
			} else if (CurrentMap[x][y - 1] == 40) {
				player.setY(player.getY() - 1);
				CurrentMap[x][y] = 0;
				CurrentMap[x][y - 1] = -1;
				getSmallHp();
				map2RHP1.setImage(new Image("file:image/floor.png"));
			} else if (CurrentMap[x][y - 1] == 41) {
				player.setY(player.getY() - 1);
				CurrentMap[x][y] = 0;
				CurrentMap[x][y - 1] = -1;
				getSmallHp();
				map2RHP2.setImage(new Image("file:image/floor.png"));
			} else if (CurrentMap[x][y - 1] == 42) {
				player.setY(player.getY() - 1);
				CurrentMap[x][y] = 0;
				CurrentMap[x][y - 1] = -1;
				getSmallHp();
				map2RHP3.setImage(new Image("file:image/floor.png"));
			} else if (CurrentMap[x][y - 1] == 43) {
				player.setY(player.getY() - 1);
				CurrentMap[x][y] = 0;
				CurrentMap[x][y - 1] = -1;
				getBigHp();
				map2BHP1.setImage(new Image("file:image/floor.png"));
			} else if (CurrentMap[x][y - 1] == 44) {
				player.setY(player.getY() - 1);
				CurrentMap[x][y] = 0;
				CurrentMap[x][y - 1] = -1;
				getBigHp();
				map2BHP2.setImage(new Image("file:image/floor.png"));
			} else if (CurrentMap[x][y - 1] == 45) {
				player.setY(player.getY() - 1);
				CurrentMap[x][y] = 0;
				CurrentMap[x][y - 1] = -1;
				getBigHp();
				map2BHP3.setImage(new Image("file:image/floor.png"));
			} else if (CurrentMap[x][y - 1] == 46) {
				player.setY(player.getY() - 1);
				CurrentMap[x][y] = 0;
				CurrentMap[x][y - 1] = -1;
				getBigHp();
				map2BHP4.setImage(new Image("file:image/floor.png"));
			} else if (CurrentMap[x][y - 1] == 50) {
				player.setY(player.getY() - 1);
				CurrentMap[x][y] = 0;
				CurrentMap[x][y - 1] = -1;
				getRedGem();
				map2RD1.setImage(new Image("file:image/floor.png"));
			} else if (CurrentMap[x][y - 1] == 51) {
				player.setY(player.getY() - 1);
				CurrentMap[x][y] = 0;
				CurrentMap[x][y - 1] = -1;
				getRedGem();
				map2RD2.setImage(new Image("file:image/floor.png"));
			} else if (CurrentMap[x][y - 1] == 52) {
				player.setY(player.getY() - 1);
				CurrentMap[x][y] = 0;
				CurrentMap[x][y - 1] = -1;
				getRedGem();
				map2RD3.setImage(new Image("file:image/floor.png"));
			} else if (CurrentMap[x][y - 1] == 53) {
				player.setY(player.getY() - 1);
				CurrentMap[x][y] = 0;
				CurrentMap[x][y - 1] = -1;
				getRedGem();
				map2RD4.setImage(new Image("file:image/floor.png"));
			} else if (CurrentMap[x][y - 1] == 54) {
				player.setY(player.getY() - 1);
				CurrentMap[x][y] = 0;
				CurrentMap[x][y - 1] = -1;
				getBlueGem();
				map2BD1.setImage(new Image("file:image/floor.png"));
			} else if (CurrentMap[x][y - 1] == 55) {
				player.setY(player.getY() - 1);
				CurrentMap[x][y] = 0;
				CurrentMap[x][y - 1] = -1;
				getBlueGem();
				map2BD2.setImage(new Image("file:image/floor.png"));
			} else if (CurrentMap[x][y - 1] == 56) {
				player.setY(player.getY() - 1);
				CurrentMap[x][y] = 0;
				CurrentMap[x][y - 1] = -1;
				getBlueGem();
				map2BD3.setImage(new Image("file:image/floor.png"));
			} else if (CurrentMap[x][y - 1] == 57) {
				player.setY(player.getY() - 1);
				CurrentMap[x][y] = 0;
				CurrentMap[x][y - 1] = -1;
				getBlueGem();
				map2BD4.setImage(new Image("file:image/floor.png"));
			} else if (CurrentMap[x][y - 1] == 60) { // �]�w
				GameMonster enemy = MonsterList.get(12); // glim�O0//rlim�O1//blim�O2//nwerewolf�O3//nsk�O4//psk�O5//bwizard�O6//bbat�O7//jguard�O8//bigbat�O9//rbat�O10//yknight�O11//rknight�O12
				if (player.getAt() <= enemy.getDefend())
					return false;
				battle.startBattle(player, enemy, HP);
				if (player.getHp() <= 0) {// ���a���`
					gameover.setVisible(true);
					close = true;
				}
				getReward(enemy);
				CurrentMap[x][y - 1] = 0; // �]�w
				map2Rknight.setImage(new Image("file:image/floor.png")); // �]�w
				return false;
			}
		} else if (player.getFloor() == 3) {// map3
			if (CurrentMap[x][y - 1] == 0) {
				player.setY(player.getY() - 1);
				CurrentMap[x][y] = 0;
				CurrentMap[x][y - 1] = -1;
			} else if (CurrentMap[x][y - 1] == 1) {
				return false;
			} else if (CurrentMap[x][y - 1] == 3) {
				CurrentMap[x][y] = 0;
				Map[2].setMap(CurrentMap);
				CurrentMap = Map[1].getMap(); // ������map2

				// FXMLLoader loader = new FXMLLoader(getClass().getResource("map2.fxml"));
				// loader.setControllerFactory(Controller -> new Controller());
				// Parent root;
				// try {
				// root = loader.load();
				// scene.setRoot(root);
				// } catch (IOException e) {
				// // TODO Auto-generated catch block
				// e.printStackTrace();
				// }
				// changeMap(scene ,fxmlLoader);

				CurrentMap[x - 1][y - 1] = -1;

				player.setFloor(2);
				player.setX(player.getX() - 1);
				player.setY(player.getY() - 1);
				buttonImage.setImage(new Image("file:image/down1.png"));
				buttonImage.setTranslateY(buttonImage.getTranslateY() - 50);
				stage1.setImage(new Image("file:image/map2.png"));

				map2Rknight.setVisible(true);
				map2Yknight1.setVisible(true);
				map2Yknight2.setVisible(true);
				map2Pdoor.setVisible(true);
				map2prison1.setVisible(true);
				map2prison2.setVisible(true);
				map2Ydoor1.setVisible(true);
				map2Ydoor2.setVisible(true);
				map2Ydoor3.setVisible(true);
				map2Ydoor4.setVisible(true);
				map2Ydoor5.setVisible(true);
				map2Ydoor6.setVisible(true);
				map2Bdoor.setVisible(true);
				map2Ykey1.setVisible(true);
				map2Ykey2.setVisible(true);
				map2Ykey3.setVisible(true);
				map2Ykey4.setVisible(true);
				map2Ykey5.setVisible(true);
				map2Ykey6.setVisible(true);
				map2Ykey7.setVisible(true);
				map2Ykey8.setVisible(true);
				map2Ykey9.setVisible(true);
				map2Bkey.setVisible(true);
				map2Rkey.setVisible(true);
				map2BHP1.setVisible(true);
				map2BHP2.setVisible(true);
				map2BHP3.setVisible(true);
				map2BHP4.setVisible(true);
				map2RHP1.setVisible(true);
				map2RHP2.setVisible(true);
				map2RHP3.setVisible(true);
				map2RD1.setVisible(true);
				map2RD2.setVisible(true);
				map2RD3.setVisible(true);
				map2RD4.setVisible(true);
				map2BD1.setVisible(true);
				map2BD2.setVisible(true);
				map2BD3.setVisible(true);
				map2BD4.setVisible(true);
				map2oldman.setVisible(true);
				map2goldman.setVisible(true);

				map3mon1.setVisible(false);
				map3mon2.setVisible(false);
				map3mon3.setVisible(false);
				map3mon4.setVisible(false);
				map3mon5.setVisible(false);
				map3mon6.setVisible(false);
				map3mon7.setVisible(false);
				map3mon8.setVisible(false);
				map3mon9.setVisible(false);
				map3mon10.setVisible(false);
				map3mon11.setVisible(false);
				map3mon12.setVisible(false);
				map3mon13.setVisible(false);
				map3mon14.setVisible(false);
				map3mon15.setVisible(false);
				map3mon16.setVisible(false);
				map3mon17.setVisible(false);
				map3Ydoor1.setVisible(false);
				map3Ydoor2.setVisible(false);
				map3Ydoor3.setVisible(false);
				map3Ykey1.setVisible(false);
				map3Ykey2.setVisible(false);
				map3Ykey3.setVisible(false);
				map3Ykey4.setVisible(false);
				map3Ykey5.setVisible(false);
				map3Ykey6.setVisible(false);
				map3Ykey7.setVisible(false);
				map3Ykey8.setVisible(false);
				map3BHP.setVisible(false);
				map3RD.setVisible(false);
				map3BD.setVisible(false);
				map3sword.setVisible(false);
			} else if (CurrentMap[x][y - 1] == 6) {
				player.setY(player.getY() - 1);
				CurrentMap[x][y] = 0;
				CurrentMap[x][y - 1] = -1;
				player.setAt(player.getAt() + 10);
				attack.setText(String.valueOf(player.getAt()));
				map3sword.setImage(new Image("file:image/floor.png"));
			} else if (CurrentMap[x][y - 1] == 9) {
				player.setY(player.getY() - 1);
				CurrentMap[x][y] = 0;
				CurrentMap[x][y - 1] = -1;
				getYKey();
				map3Ykey1.setImage(new Image("file:image/floor.png"));
			} else if (CurrentMap[x][y - 1] == 10) {
				player.setY(player.getY() - 1);
				CurrentMap[x][y] = 0;
				CurrentMap[x][y - 1] = -1;
				getYKey();
				map3Ykey2.setImage(new Image("file:image/floor.png"));
			} else if (CurrentMap[x][y - 1] == 11) {
				player.setY(player.getY() - 1);
				CurrentMap[x][y] = 0;
				CurrentMap[x][y - 1] = -1;
				getYKey();
				map3Ykey3.setImage(new Image("file:image/floor.png"));
			} else if (CurrentMap[x][y - 1] == 12) {
				player.setY(player.getY() - 1);
				CurrentMap[x][y] = 0;
				CurrentMap[x][y - 1] = -1;
				getYKey();
				map3Ykey4.setImage(new Image("file:image/floor.png"));
			} else if (CurrentMap[x][y - 1] == 13) {
				player.setY(player.getY() - 1);
				CurrentMap[x][y] = 0;
				CurrentMap[x][y - 1] = -1;
				getYKey();
				map3Ykey5.setImage(new Image("file:image/floor.png"));
			} else if (CurrentMap[x][y - 1] == 14) {
				player.setY(player.getY() - 1);
				CurrentMap[x][y] = 0;
				CurrentMap[x][y - 1] = -1;
				getYKey();
				map3Ykey6.setImage(new Image("file:image/floor.png"));
			} else if (CurrentMap[x][y - 1] == 15) {
				player.setY(player.getY() - 1);
				CurrentMap[x][y] = 0;
				CurrentMap[x][y - 1] = -1;
				getYKey();
				map3Ykey7.setImage(new Image("file:image/floor.png"));
			} else if (CurrentMap[x][y - 1] == 16) {
				player.setY(player.getY() - 1);
				CurrentMap[x][y] = 0;
				CurrentMap[x][y - 1] = -1;
				getYKey();
				map3Ykey8.setImage(new Image("file:image/floor.png"));
			} else if (CurrentMap[x][y - 1] == 30) {
				if (player.getYkey() <= 0)
					return false;
				openYdoor();
				CurrentMap[x][y - 1] = 0;
				map3Ydoor1.setImage(new Image("file:image/floor.png"));
				return false;
			} else if (CurrentMap[x][y - 1] == 31) {
				if (player.getYkey() <= 0)
					return false;
				openYdoor();
				CurrentMap[x][y - 1] = 0;
				map3Ydoor2.setImage(new Image("file:image/floor.png"));
				return false;
			} else if (CurrentMap[x][y - 1] == 32) {
				if (player.getYkey() <= 0)
					return false;
				openYdoor();
				CurrentMap[x][y - 1] = 0;
				map3Ydoor3.setImage(new Image("file:image/floor.png"));
				return false;
			} else if (CurrentMap[x][y - 1] == 40) {
				player.setY(player.getY() - 1);
				CurrentMap[x][y] = 0;
				CurrentMap[x][y - 1] = -1;
				getBigHp();
				map3BHP.setImage(new Image("file:image/floor.png"));
			} else if (CurrentMap[x][y - 1] == 50) {
				player.setY(player.getY() - 1);
				CurrentMap[x][y] = 0;
				CurrentMap[x][y - 1] = -1;
				getRedGem();
				map3RD.setImage(new Image("file:image/floor.png"));
			} else if (CurrentMap[x][y - 1] == 51) {
				player.setY(player.getY() - 1);
				CurrentMap[x][y] = 0;
				CurrentMap[x][y - 1] = -1;
				getBlueGem();
				map3BD.setImage(new Image("file:image/floor.png"));
			} else if (CurrentMap[x][y - 1] == 60) { // �]�w
				GameMonster enemy = MonsterList.get(1); // glim�O0//rlim�O1//blim�O2//nwerewolf�O3//nsk�O4//psk�O5//bwizard�O6//bbat�O7//jguard�O8//bigbat�O9//rbat�O10//yknight�O11//rknight�O12
				if (player.getAt() <= enemy.getDefend())
					return false;
				battle.startBattle(player, enemy, HP);
				if (player.getHp() <= 0) {// ���a���`
					gameover.setVisible(true);
					close = true;
				}
				getReward(enemy);
				CurrentMap[x][y - 1] = 0; // �]�w
				map3mon1.setImage(new Image("file:image/floor.png")); // �]�w
				return false;
			} else if (CurrentMap[x][y - 1] == 63) { // �]�w
				GameMonster enemy = MonsterList.get(1); // glim�O0//rlim�O1//blim�O2//nwerewolf�O3//nsk�O4//psk�O5//bwizard�O6//bbat�O7//jguard�O8//bigbat�O9//rbat�O10//yknight�O11//rknight�O12
				if (player.getAt() <= enemy.getDefend())
					return false;
				battle.startBattle(player, enemy, HP);
				if (player.getHp() <= 0) {// ���a���`
					gameover.setVisible(true);
					close = true;
				}
				getReward(enemy);
				CurrentMap[x][y - 1] = 0; // �]�w
				map3mon4.setImage(new Image("file:image/floor.png")); // �]�w
				return false;
			} else if (CurrentMap[x][y - 1] == 68) { // �]�w
				GameMonster enemy = MonsterList.get(4); // glim�O0//rlim�O1//blim�O2//nwerewolf�O3//nsk�O4//psk�O5//bwizard�O6//bbat�O7//jguard�O8//bigbat�O9//rbat�O10//yknight�O11//rknight�O12
				if (player.getAt() <= enemy.getDefend())
					return false;
				battle.startBattle(player, enemy, HP);
				if (player.getHp() <= 0) {// ���a���`
					gameover.setVisible(true);
					close = true;
				}
				getReward(enemy);
				CurrentMap[x][y - 1] = 0; // �]�w
				map3mon9.setImage(new Image("file:image/floor.png")); // �]�w
				return false;
			} else if (CurrentMap[x][y - 1] == 70) { // �]�w
				GameMonster enemy = MonsterList.get(1); // glim�O0//rlim�O1//blim�O2//nwerewolf�O3//nsk�O4//psk�O5//bwizard�O6//bbat�O7//jguard�O8//bigbat�O9//rbat�O10//yknight�O11//rknight�O12
				if (player.getAt() <= enemy.getDefend())
					return false;
				battle.startBattle(player, enemy, HP);
				if (player.getHp() <= 0) {// ���a���`
					gameover.setVisible(true);
					close = true;
				}
				getReward(enemy);
				CurrentMap[x][y - 1] = 0; // �]�w
				map3mon11.setImage(new Image("file:image/floor.png")); // �]�w
				return false;
			} else if (CurrentMap[x][y - 1] == 71) { // �]�w
				GameMonster enemy = MonsterList.get(7); // glim�O0//rlim�O1//blim�O2//nwerewolf�O3//nsk�O4//psk�O5//bwizard�O6//bbat�O7//jguard�O8//bigbat�O9//rbat�O10//yknight�O11//rknight�O12
				if (player.getAt() <= enemy.getDefend())
					return false;
				battle.startBattle(player, enemy, HP);
				if (player.getHp() <= 0) {// ���a���`
					gameover.setVisible(true);
					close = true;
				}
				getReward(enemy);
				CurrentMap[x][y - 1] = 0; // �]�w
				map3mon12.setImage(new Image("file:image/floor.png")); // �]�w
				return false;
			}
		} else if (player.getFloor() == 4) {// map4
			if (CurrentMap[x][y - 1] == 0) {
				player.setY(player.getY() - 1);
				CurrentMap[x][y] = 0;
				CurrentMap[x][y - 1] = -1;
			} else if (CurrentMap[x][y - 1] == 1) {
				return false;
			} else if (CurrentMap[x][y - 1] == 5) {
				talk = true;
				left = true;
				if (map4talk.isVisible() == false) {
					map4talk.setImage(new Image("file:image/Theiftalk1.png"));
					map4talk.setVisible(true);
					next = true;
				} else if (next == true && map4talk.isVisible() == true) {
					map4talk.setImage(new Image("file:image/Theiftalk2.png"));
					next = false;
					next2 = true;
				} else if (next2 == true && map4talk.isVisible() == true) {
					map4talk.setImage(new Image("file:image/Theiftalk3.png"));
					next2 = false;
					next3 = true;
				} else if (next3 == true && map4talk.isVisible() == true) {
					map4talk.setImage(new Image("file:image/Theiftalk4.png"));
					next3 = false;
					next4 = true;
				} else if (next4 == true && map4talk.isVisible() == true) {
					map4talk.setImage(new Image("file:image/Theiftalk5.png"));
					next4 = false;
					next5 = true;
				} else if (next5 == true && map4talk.isVisible() == true) {
					map4talk.setImage(new Image("file:image/Theiftalk6.png"));
					next5 = false;
					next6 = true;
				} else if (next6 == true && map4talk.isVisible() == true) {
					map4talk.setImage(new Image("file:image/Theiftalk7.png"));
					next6 = false;
					next7 = true;
				} else if (next7 == true && map4talk.isVisible() == true) {
					map4talk.setImage(new Image("file:image/Theiftalk8.png"));
					next7 = false;
					next8 = true;
				} else if (next8 == true && map4talk.isVisible() == true) {
					map2Pdoor.setImage(new Image("file:image/floor.png"));
					map4theif.setImage(new Image("file:image/floor.png"));
					CurrentMap[x][y - 1] = 0;
					Map[1].getMap()[7][2] = 0;
					next8 = false;
					talk = false;
					left = false;
				}
				return false;
			} else if (CurrentMap[x][y - 1] == 9) {
				player.setY(player.getY() - 1);
				CurrentMap[x][y] = 0;
				CurrentMap[x][y - 1] = -1;
				getYKey();
				map4Ykey1.setImage(new Image("file:image/floor.png"));
			} else if (CurrentMap[x][y - 1] == 10) {
				player.setY(player.getY() - 1);
				CurrentMap[x][y] = 0;
				CurrentMap[x][y - 1] = -1;
				getYKey();
				map4Ykey2.setImage(new Image("file:image/floor.png"));
			} else if (CurrentMap[x][y - 1] == 50) {
				player.setY(player.getY() - 1);
				CurrentMap[x][y] = 0;
				CurrentMap[x][y - 1] = -1;
				getRedGem();
				map4RD1.setImage(new Image("file:image/floor.png"));
			} else if (CurrentMap[x][y - 1] == 51) {
				player.setY(player.getY() - 1);
				CurrentMap[x][y] = 0;
				CurrentMap[x][y - 1] = -1;
				getRedGem();
				map4RD2.setImage(new Image("file:image/floor.png"));
			} else if (CurrentMap[x][y - 1] == 52) {
				player.setY(player.getY() - 1);
				CurrentMap[x][y] = 0;
				CurrentMap[x][y - 1] = -1;
				getBlueGem();
				map4BD1.setImage(new Image("file:image/floor.png"));
			} else if (CurrentMap[x + 1][y - 1] == 53) {
				player.setY(player.getY() - 1);
				CurrentMap[x][y] = 0;
				CurrentMap[x][y - 1] = -1;
				getBlueGem();
				map4BD2.setImage(new Image("file:image/floor.png"));
			} else if (CurrentMap[x][y - 1] == 63) { // �]�w
				GameMonster enemy = MonsterList.get(2); // glim�O0//rlim�O1//blim�O2//nwerewolf�O3//nsk�O4//psk�O5//bwizard�O6//bbat�O7//jguard�O8//bigbat�O9//rbat�O10//yknight�O11//rknight�O12
				if (player.getAt() <= enemy.getDefend())
					return false;
				battle.startBattle(player, enemy, HP);
				if (player.getHp() <= 0) {// ���a���`
					gameover.setVisible(true);
					close = true;
				}
				getReward(enemy);
				CurrentMap[x][y - 1] = 0; // �]�w
				map4mon4.setImage(new Image("file:image/floor.png")); // �]�w
				return false;
			} else if (CurrentMap[x][y - 1] == 65) { // �]�w
				GameMonster enemy = MonsterList.get(2); // glim�O0//rlim�O1//blim�O2//nwerewolf�O3//nsk�O4//psk�O5//bwizard�O6//bbat�O7//jguard�O8//bigbat�O9//rbat�O10//yknight�O11//rknight�O12
				if (player.getAt() <= enemy.getDefend())
					return false;
				battle.startBattle(player, enemy, HP);
				if (player.getHp() <= 0) {// ���a���`
					gameover.setVisible(true);
					close = true;
				}
				getReward(enemy);
				CurrentMap[x][y - 1] = 0; // �]�w
				map4mon6.setImage(new Image("file:image/floor.png")); // �]�w
				return false;
			} else if (CurrentMap[x][y - 1] == 66) { // �]�w
				GameMonster enemy = MonsterList.get(9); // glim�O0//rlim�O1//blim�O2//nwerewolf�O3//nsk�O4//psk�O5//bwizard�O6//bbat�O7//jguard�O8//bigbat�O9//rbat�O10//yknight�O11//rknight�O12
				if (player.getAt() <= enemy.getDefend())
					return false;
				battle.startBattle(player, enemy, HP);
				if (player.getHp() <= 0) {// ���a���`
					gameover.setVisible(true);
					close = true;
				}
				getReward(enemy);
				CurrentMap[x][y - 1] = 0; // �]�w
				map4mon7.setImage(new Image("file:image/floor.png")); // �]�w
				return false;
			} else if (CurrentMap[x][y - 1] == 67) { // �]�w
				GameMonster enemy = MonsterList.get(3); // glim�O0//rlim�O1//blim�O2//nwerewolf�O3//nsk�O4//psk�O5//bwizard�O6//bbat�O7//jguard�O8//bigbat�O9//rbat�O10//yknight�O11//rknight�O12
				if (player.getAt() <= enemy.getDefend())
					return false;
				battle.startBattle(player, enemy, HP);
				if (player.getHp() <= 0) {// ���a���`
					gameover.setVisible(true);
					close = true;
				}
				getReward(enemy);
				CurrentMap[x][y - 1] = 0; // �]�w
				map4mon8.setImage(new Image("file:image/floor.png")); // �]�w
				return false;
			} else if (CurrentMap[x][y - 1] == 68) { // �]�w
				GameMonster enemy = MonsterList.get(10); // glim�O0//rlim�O1//blim�O2//nwerewolf�O3//nsk�O4//psk�O5//bwizard�O6//bbat�O7//jguard�O8//bigbat�O9//rbat�O10//yknight�O11//rknight�O12
				if (player.getAt() <= enemy.getDefend())
					return false;
				battle.startBattle(player, enemy, HP);
				if (player.getHp() <= 0) {// ���a���`
					gameover.setVisible(true);
					close = true;
				}
				getReward(enemy);
				CurrentMap[x][y - 1] = 0; // �]�w
				map4mon9.setImage(new Image("file:image/floor.png")); // �]�w
				return false;
			} else if (CurrentMap[x][y - 1] == 69) { // �]�w
				GameMonster enemy = MonsterList.get(9); // glim�O0//rlim�O1//blim�O2//nwerewolf�O3//nsk�O4//psk�O5//bwizard�O6//bbat�O7//jguard�O8//bigbat�O9//rbat�O10//yknight�O11//rknight�O12
				if (player.getAt() <= enemy.getDefend())
					return false;
				battle.startBattle(player, enemy, HP);
				if (player.getHp() <= 0) {// ���a���`
					gameover.setVisible(true);
					close = true;
				}
				getReward(enemy);
				CurrentMap[x][y - 1] = 0; // �]�w
				map4mon10.setImage(new Image("file:image/floor.png")); // �]�w
				return false;
			} else if (CurrentMap[x][y - 1] == 70) { // �]�w
				GameMonster enemy = MonsterList.get(8); // glim�O0//rlim�O1//blim�O2//nwerewolf�O3//nsk�O4//psk�O5//bwizard�O6//bbat�O7//jguard�O8//bigbat�O9//rbat�O10//yknight�O11//rknight�O12
				if (player.getAt() <= enemy.getDefend())
					return false;
				battle.startBattle(player, enemy, HP);
				if (player.getHp() <= 0) {// ���a���`
					gameover.setVisible(true);
					close = true;
				}
				getReward(enemy);
				CurrentMap[x][y - 1] = 0; // �]�w
				map4mon11.setImage(new Image("file:image/floor.png")); // �]�w
				return false;
			} else if (CurrentMap[x][y - 1] == 71) { // �]�w
				GameMonster enemy = MonsterList.get(3); // glim�O0//rlim�O1//blim�O2//nwerewolf�O3//nsk�O4//psk�O5//bwizard�O6//bbat�O7//jguard�O8//bigbat�O9//rbat�O10//yknight�O11//rknight�O12
				if (player.getAt() <= enemy.getDefend())
					return false;
				battle.startBattle(player, enemy, HP);
				if (player.getHp() <= 0) {// ���a���`
					gameover.setVisible(true);
					close = true;
				}
				getReward(enemy);
				CurrentMap[x][y - 1] = 0; // �]�w
				map4mon12.setImage(new Image("file:image/floor.png")); // �]�w
				return false;
			} else if (CurrentMap[x][y - 1] == 74) { // �]�w
				GameMonster enemy = MonsterList.get(2); // glim�O0//rlim�O1//blim�O2//nwerewolf�O3//nsk�O4//psk�O5//bwizard�O6//bbat�O7//jguard�O8//bigbat�O9//rbat�O10//yknight�O11//rknight�O12
				if (player.getAt() <= enemy.getDefend())
					return false;
				battle.startBattle(player, enemy, HP);
				if (player.getHp() <= 0) {// ���a���`
					gameover.setVisible(true);
					close = true;
				}
				getReward(enemy);
				CurrentMap[x][y - 1] = 0; // �]�w
				map4mon15.setImage(new Image("file:image/floor.png")); // �]�w
				return false;
			} else if (CurrentMap[x][y - 1] == 76) { // �]�w
				GameMonster enemy = MonsterList.get(2); // glim�O0//rlim�O1//blim�O2//nwerewolf�O3//nsk�O4//psk�O5//bwizard�O6//bbat�O7//jguard�O8//bigbat�O9//rbat�O10//yknight�O11//rknight�O12
				if (player.getAt() <= enemy.getDefend())
					return false;
				battle.startBattle(player, enemy, HP);
				if (player.getHp() <= 0) {// ���a���`
					gameover.setVisible(true);
					close = true;
				}
				getReward(enemy);
				CurrentMap[x][y - 1] = 0; // �]�w
				map4mon17.setImage(new Image("file:image/floor.png")); // �]�w
				return false;
			}
		} else if (player.getFloor() == 5) {// map5
			if (CurrentMap[x][y - 1] == 0) {
				player.setY(player.getY() - 1);
				CurrentMap[x][y] = 0;
				CurrentMap[x][y - 1] = -1;
			} else if (CurrentMap[x][y - 1] == 1) {
				return false;
			} else if (CurrentMap[x][y - 1] == 2) {
				CurrentMap[x][y] = 0;
				Map[4].setMap(CurrentMap);
				CurrentMap = Map[5].getMap();

				// FXMLLoader loader = new FXMLLoader(getClass().getResource("map6.fxml"));
				// loader.setControllerFactory(Controller -> new Controller());
				// Parent root;
				// try {
				// root = loader.load();
				// scene.setRoot(root);
				// } catch (IOException e) {
				// // TODO Auto-generated catch block
				// e.printStackTrace();
				// }
				// changeMap(scene ,fxmlLoader);

				stage1.setImage(new Image("file:image/mapfinal.png"));
				CurrentMap[x][y - 2] = -1;

				player.setFloor(6);
				player.setY(player.getY() - 2);
				buttonImage.setImage(new Image("file:image/down1.png"));
				buttonImage.setTranslateX(buttonImage.getTranslateX() - 44);

				map5mon1.setVisible(false);
				map5mon2.setVisible(false);
				map5mon3.setVisible(false);
				map5mon4.setVisible(false);
				map5mon5.setVisible(false);
				map5mon6.setVisible(false);
				map5mon7.setVisible(false);
				map5mon8.setVisible(false);
				map5mon9.setVisible(false);
				map5mon10.setVisible(false);
				map5mon11.setVisible(false);
				map5mon12.setVisible(false);
				map5mon13.setVisible(false);
				map5mon14.setVisible(false);
				map5mon15.setVisible(false);
				map5mon16.setVisible(false);
				map5mon17.setVisible(false);
				map5mon18.setVisible(false);
				map5mon19.setVisible(false);
				map5mon20.setVisible(false);
				map5mon21.setVisible(false);
				map5Ydoor1.setVisible(false);
				map5Ydoor2.setVisible(false);
				map5Ydoor3.setVisible(false);
				map5Ydoor4.setVisible(false);
				map5Bdoor.setVisible(false);
				map5Rdoor.setVisible(false);
				map5Ykey1.setVisible(false);
				map5Ykey2.setVisible(false);
				map5Ykey3.setVisible(false);
				map5Bkey.setVisible(false);
				map5Pkey.setVisible(false);
				map5RHP.setVisible(false);
				map5BHP1.setVisible(false);
				map5BHP2.setVisible(false);
				map5RD1.setVisible(false);
				map5RD2.setVisible(false);
				map5BD1.setVisible(false);
				map5BD2.setVisible(false);
				map5shield.setVisible(false);
				map5cross.setVisible(false);

				map6Boss.setVisible(true);
				map6Rdoor.setVisible(true);
			} else if (CurrentMap[x][y - 1] == 3) {
				CurrentMap[x][y] = 0;
				Map[4].setMap(CurrentMap);
				CurrentMap = Map[3].getMap(); // ������Map4

				// FXMLLoader loader = new FXMLLoader(getClass().getResource("map4.fxml"));
				// loader.setControllerFactory(Controller -> new Controller());
				// Parent root;
				// try {
				// root = loader.load();
				// scene.setRoot(root);
				// } catch (IOException e) {
				// // TODO Auto-generated catch block
				// e.printStackTrace();
				// }
				// changeMap(scene ,fxmlLoader);

				CurrentMap[x - 1][y - 1] = -1;

				player.setFloor(4);
				player.setX(player.getX() - 1);
				player.setY(player.getY() - 1);
				buttonImage.setImage(new Image("file:image/down1.png"));
				buttonImage.setTranslateY(buttonImage.getTranslateY() - 50);
				stage1.setImage(new Image("file:image/map4.png"));

				map4mon1.setVisible(true);
				map4mon2.setVisible(true);
				map4mon3.setVisible(true);
				map4mon4.setVisible(true);
				map4mon5.setVisible(true);
				map4mon6.setVisible(true);
				map4mon7.setVisible(true);
				map4mon8.setVisible(true);
				map4mon9.setVisible(true);
				map4mon10.setVisible(true);
				map4mon11.setVisible(true);
				map4mon12.setVisible(true);
				map4mon13.setVisible(true);
				map4mon14.setVisible(true);
				map4mon15.setVisible(true);
				map4mon16.setVisible(true);
				map4mon17.setVisible(true);
				map4mon18.setVisible(true);
				map4mon19.setVisible(true);
				map4mon20.setVisible(true);
				map4Ydoor1.setVisible(true);
				map4Ydoor2.setVisible(true);
				map4Ydoor3.setVisible(true);
				map4Ydoor4.setVisible(true);
				map4Bdoor.setVisible(true);
				map4Rdoor.setVisible(true);
				map4prisondoor.setVisible(true);
				map4Ykey1.setVisible(true);
				map4Ykey2.setVisible(true);
				map4RHP1.setVisible(true);
				map4RHP2.setVisible(true);
				map4RHP3.setVisible(true);
				map4RHP4.setVisible(true);
				map4RD1.setVisible(true);
				map4RD2.setVisible(true);
				map4BD1.setVisible(true);
				map4BD2.setVisible(true);
				map4theif.setVisible(true);

				map5mon1.setVisible(false);
				map5mon2.setVisible(false);
				map5mon3.setVisible(false);
				map5mon4.setVisible(false);
				map5mon5.setVisible(false);
				map5mon6.setVisible(false);
				map5mon7.setVisible(false);
				map5mon8.setVisible(false);
				map5mon9.setVisible(false);
				map5mon10.setVisible(false);
				map5mon11.setVisible(false);
				map5mon12.setVisible(false);
				map5mon13.setVisible(false);
				map5mon14.setVisible(false);
				map5mon15.setVisible(false);
				map5mon16.setVisible(false);
				map5mon17.setVisible(false);
				map5mon18.setVisible(false);
				map5mon19.setVisible(false);
				map5mon20.setVisible(false);
				map5mon21.setVisible(false);
				map5Ydoor1.setVisible(false);
				map5Ydoor2.setVisible(false);
				map5Ydoor3.setVisible(false);
				map5Ydoor4.setVisible(false);
				map5Bdoor.setVisible(false);
				map5Rdoor.setVisible(false);
				map5Ykey1.setVisible(false);
				map5Ykey2.setVisible(false);
				map5Ykey3.setVisible(false);
				map5Bkey.setVisible(false);
				map5Pkey.setVisible(false);
				map5RHP.setVisible(false);
				map5BHP1.setVisible(false);
				map5BHP2.setVisible(false);
				map5RD1.setVisible(false);
				map5RD2.setVisible(false);
				map5BD1.setVisible(false);
				map5BD2.setVisible(false);
				map5shield.setVisible(false);
				map5cross.setVisible(false);
			} else if (CurrentMap[x][y - 1] == 8) {
				player.setY(player.getY() - 1);
				CurrentMap[x][y] = 0;
				CurrentMap[x][y - 1] = -1;
				player.setDef(player.getDef() + 10);
				defend.setText(String.valueOf(player.getDef()));
				map5shield.setImage(new Image("file:image/floor.png"));
			} else if (CurrentMap[x][y - 1] == 9) {
				player.setY(player.getY() - 1);
				CurrentMap[x][y] = 0;
				CurrentMap[x][y - 1] = -1;
				getYKey();
				map5Ykey1.setImage(new Image("file:image/floor.png"));
			} else if (CurrentMap[x][y - 1] == 30) {
				if (player.getYkey() <= 0)
					return false;
				openYdoor();
				CurrentMap[x][y - 1] = 0;
				map5Ydoor1.setImage(new Image("file:image/floor.png"));
				return false;
			} else if (CurrentMap[x][y - 1] == 35) {
				if (player.getRkey() <= 0)
					return false;
				openRdoor();
				CurrentMap[x][y - 1] = 0;
				map5Rdoor.setImage(new Image("file:image/floor.png"));
				return false;
			} else if (CurrentMap[x][y - 1] == 41) {
				player.setY(player.getY() - 1);
				CurrentMap[x][y] = 0;
				CurrentMap[x][y - 1] = -1;
				getBigHp();
				map5BHP1.setImage(new Image("file:image/floor.png"));
			} else if (CurrentMap[x][y - 1] == 42) {
				player.setY(player.getY() - 1);
				CurrentMap[x][y] = 0;
				CurrentMap[x][y - 1] = -1;
				getBigHp();
				map5BHP2.setImage(new Image("file:image/floor.png"));
			} else if (CurrentMap[x][y - 1] == 53) {
				player.setY(player.getY() - 1);
				CurrentMap[x][y] = 0;
				CurrentMap[x][y - 1] = -1;
				getBlueGem();
				map5BD2.setImage(new Image("file:image/floor.png"));
			} else if (CurrentMap[x][y - 1] == 67) { // �]�w
				GameMonster enemy = MonsterList.get(6); // glim�O0//rlim�O1//blim�O2//nwerewolf�O3//nsk�O4//psk�O5//bwizard�O6//bbat�O7//jguard�O8//bigbat�O9//rbat�O10//yknight�O11//rknight�O12
				if (player.getAt() <= enemy.getDefend())
					return false;
				battle.startBattle(player, enemy, HP);
				if (player.getHp() <= 0) {// ���a���`
					gameover.setVisible(true);
					close = true;
				}
				getReward(enemy);
				CurrentMap[x][y - 1] = 0; // �]�w
				map5mon8.setImage(new Image("file:image/floor.png")); // �]�w
				return false;
			} else if (CurrentMap[x][y - 1] == 68) { // �]�w
				GameMonster enemy = MonsterList.get(5); // glim�O0//rlim�O1//blim�O2//nwerewolf�O3//nsk�O4//psk�O5//bwizard�O6//bbat�O7//jguard�O8//bigbat�O9//rbat�O10//yknight�O11//rknight�O12
				if (player.getAt() <= enemy.getDefend())
					return false;
				battle.startBattle(player, enemy, HP);
				if (player.getHp() <= 0) {// ���a���`
					gameover.setVisible(true);
					close = true;
				}
				getReward(enemy);
				CurrentMap[x][y - 1] = 0; // �]�w
				map5mon9.setImage(new Image("file:image/floor.png")); // �]�w
				return false;
			} else if (CurrentMap[x][y - 1] == 69) { // �]�w
				GameMonster enemy = MonsterList.get(6); // glim�O0//rlim�O1//blim�O2//nwerewolf�O3//nsk�O4//psk�O5//bwizard�O6//bbat�O7//jguard�O8//bigbat�O9//rbat�O10//yknight�O11//rknight�O12
				if (player.getAt() <= enemy.getDefend())
					return false;
				battle.startBattle(player, enemy, HP);
				if (player.getHp() <= 0) {// ���a���`
					gameover.setVisible(true);
					close = true;
				}
				getReward(enemy);
				CurrentMap[x][y - 1] = 0; // �]�w
				map5mon10.setImage(new Image("file:image/floor.png")); // �]�w
				return false;
			} else if (CurrentMap[x][y - 1] == 71) { // �]�w
				GameMonster enemy = MonsterList.get(7); // glim�O0//rlim�O1//blim�O2//nwerewolf�O3//nsk�O4//psk�O5//bwizard�O6//bbat�O7//jguard�O8//bigbat�O9//rbat�O10//yknight�O11//rknight�O12
				if (player.getAt() <= enemy.getDefend())
					return false;
				battle.startBattle(player, enemy, HP);
				if (player.getHp() <= 0) {// ���a���`
					gameover.setVisible(true);
					close = true;
				}
				getReward(enemy);
				CurrentMap[x][y - 1] = 0; // �]�w
				map5mon12.setImage(new Image("file:image/floor.png")); // �]�w
				return false;
			} else if (CurrentMap[x][y - 1] == 73) { // �]�w
				GameMonster enemy = MonsterList.get(4); // glim�O0//rlim�O1//blim�O2//nwerewolf�O3//nsk�O4//psk�O5//bwizard�O6//bbat�O7//jguard�O8//bigbat�O9//rbat�O10//yknight�O11//rknight�O12
				if (player.getAt() <= enemy.getDefend())
					return false;
				battle.startBattle(player, enemy, HP);
				if (player.getHp() <= 0) {// ���a���`
					gameover.setVisible(true);
					close = true;
				}
				getReward(enemy);
				CurrentMap[x][y - 1] = 0; // �]�w
				map5mon14.setImage(new Image("file:image/floor.png")); // �]�w
				return false;
			} else if (CurrentMap[x][y - 1] == 74) { // �]�w
				GameMonster enemy = MonsterList.get(6); // glim�O0//rlim�O1//blim�O2//nwerewolf�O3//nsk�O4//psk�O5//bwizard�O6//bbat�O7//jguard�O8//bigbat�O9//rbat�O10//yknight�O11//rknight�O12
				if (player.getAt() <= enemy.getDefend())
					return false;
				battle.startBattle(player, enemy, HP);
				if (player.getHp() <= 0) {// ���a���`
					gameover.setVisible(true);
					close = true;
				}
				getReward(enemy);
				CurrentMap[x][y - 1] = 0; // �]�w
				map5mon15.setImage(new Image("file:image/floor.png")); // �]�w
				return false;
			} else if (CurrentMap[x][y - 1] == 75) { // �]�w
				GameMonster enemy = MonsterList.get(3); // glim�O0//rlim�O1//blim�O2//nwerewolf�O3//nsk�O4//psk�O5//bwizard�O6//bbat�O7//jguard�O8//bigbat�O9//rbat�O10//yknight�O11//rknight�O12
				if (player.getAt() <= enemy.getDefend())
					return false;
				battle.startBattle(player, enemy, HP);
				if (player.getHp() <= 0) {// ���a���`
					gameover.setVisible(true);
					close = true;
				}
				getReward(enemy);
				CurrentMap[x][y - 1] = 0; // �]�w
				map5mon16.setImage(new Image("file:image/floor.png")); // �]�w
				return false;
			} else if (CurrentMap[x][y - 1] == 76) { // �]�w
				GameMonster enemy = MonsterList.get(3); // glim�O0//rlim�O1//blim�O2//nwerewolf�O3//nsk�O4//psk�O5//bwizard�O6//bbat�O7//jguard�O8//bigbat�O9//rbat�O10//yknight�O11//rknight�O12
				if (player.getAt() <= enemy.getDefend())
					return false;
				battle.startBattle(player, enemy, HP);
				if (player.getHp() <= 0) {// ���a���`
					gameover.setVisible(true);
					close = true;
				}
				getReward(enemy);
				CurrentMap[x][y - 1] = 0; // �]�w
				map5mon17.setImage(new Image("file:image/floor.png")); // �]�w
				return false;
			} else if (CurrentMap[x][y - 1] == 77) { // �]�w
				GameMonster enemy = MonsterList.get(6); // glim�O0//rlim�O1//blim�O2//nwerewolf�O3//nsk�O4//psk�O5//bwizard�O6//bbat�O7//jguard�O8//bigbat�O9//rbat�O10//yknight�O11//rknight�O12
				if (player.getAt() <= enemy.getDefend())
					return false;
				battle.startBattle(player, enemy, HP);
				if (player.getHp() <= 0) {// ���a���`
					gameover.setVisible(true);
					close = true;
				}
				getReward(enemy);
				CurrentMap[x][y - 1] = 0; // �]�w
				map5mon18.setImage(new Image("file:image/floor.png")); // �]�w
				return false;
			} else if (CurrentMap[x][y - 1] == 79) { // �]�w
				GameMonster enemy = MonsterList.get(8); // glim�O0//rlim�O1//blim�O2//nwerewolf�O3//nsk�O4//psk�O5//bwizard�O6//bbat�O7//jguard�O8//bigbat�O9//rbat�O10//yknight�O11//rknight�O12
				if (player.getAt() <= enemy.getDefend())
					return false;
				battle.startBattle(player, enemy, HP);
				if (player.getHp() <= 0) {// ���a���`
					gameover.setVisible(true);
					close = true;
				}
				getReward(enemy);
				CurrentMap[x][y - 1] = 0; // �]�w
				map5mon20.setImage(new Image("file:image/floor.png")); // �]�w
				return false;
			}
		} else if (player.getFloor() == 6) {// map6
			if (CurrentMap[x][y - 1] == 0) {
				player.setY(player.getY() - 1);
				CurrentMap[x][y] = 0;
				CurrentMap[x][y - 1] = -1;
			}
			if (CurrentMap[x][y - 1] == 1) {
				return false;
			}
		}
		System.out.println(player.getX() + " " + player.getY() + "\n");
		return true;
	}

	boolean obstacleright() {
		x = player.getX();
		y = player.getY();
		if (player.getFloor() == 1) { // map1
			if (CurrentMap[x][y + 1] == 0) {
				player.setY(player.getY() + 1);
				CurrentMap[x][y] = 0;
				CurrentMap[x][y + 1] = -1;
			} else if (CurrentMap[x][y + 1] == 1) {
				return false;
			} else if (CurrentMap[x][y + 1] == -2) {
				right = true;
				talk = true;
				if (map1talk.isVisible() == false) {
					map1talk.setImage(new Image("file:image/readertalk.png"));
					map1talk.setVisible(true);
					map1reader.setImage(new Image("file:image/floor.png"));
					next = true;
					getreader = true;
				} else if (next == true && map1talk.isVisible() == true) {
					player.setY(player.getY() + 1);
					CurrentMap[x][y] = 0;
					CurrentMap[x][y + 1] = -1;
					map1talk.setVisible(false);
					right = false;
					talk = false;
					next = false;
				}
			} else if (CurrentMap[x][y + 1] == 9) {
				player.setY(player.getY() + 1);
				CurrentMap[x][y] = 0;
				CurrentMap[x][y + 1] = -1;
				getYKey();
				map1Ykey1.setImage(new Image("file:image/floor.png"));
			} else if (CurrentMap[x][y + 1] == 10) {
				player.setY(player.getY() + 1);
				CurrentMap[x][y] = 0;
				CurrentMap[x][y + 1] = -1;
				getYKey();
				map1Ykey2.setImage(new Image("file:image/floor.png"));
			} else if (CurrentMap[x][y + 1] == 11) {
				player.setY(player.getY() + 1);
				CurrentMap[x][y] = 0;
				CurrentMap[x][y + 1] = -1;
				getYKey();
				map1Ykey3.setImage(new Image("file:image/floor.png"));
			} else if (CurrentMap[x][y + 1] == 12) {
				player.setY(player.getY() + 1);
				CurrentMap[x][y] = 0;
				CurrentMap[x][y + 1] = -1;
				getYKey();
				map1Ykey4.setImage(new Image("file:image/floor.png"));
			} else if (CurrentMap[x][y + 1] == 13) {
				player.setY(player.getY() + 1);
				CurrentMap[x][y] = 0;
				CurrentMap[x][y + 1] = -1;
				getYKey();
				map1Ykey5.setImage(new Image("file:image/floor.png"));
			} else if (CurrentMap[x][y + 1] == 14) {
				player.setY(player.getY() + 1);
				CurrentMap[x][y] = 0;
				CurrentMap[x][y + 1] = -1;
				getYKey();
				map1Ykey6.setImage(new Image("file:image/floor.png"));
			} else if (CurrentMap[x][y + 1] == 15) {
				player.setY(player.getY() + 1);
				CurrentMap[x][y] = 0;
				CurrentMap[x][y + 1] = -1;
				getYKey();
				map1Ykey7.setImage(new Image("file:image/floor.png"));
			} else if (CurrentMap[x][y + 1] == 16) {
				player.setY(player.getY() + 1);
				CurrentMap[x][y] = 0;
				CurrentMap[x][y + 1] = -1;
				getYKey();
				map1Ykey8.setImage(new Image("file:image/floor.png"));
			} else if (CurrentMap[x][y + 1] == 17) {
				player.setY(player.getY() + 1);
				CurrentMap[x][y] = 0;
				CurrentMap[x][y + 1] = -1;
				getYKey();
				map1Ykey9.setImage(new Image("file:image/floor.png"));
			} else if (CurrentMap[x][y + 1] == 18) {
				player.setY(player.getY() + 1);
				CurrentMap[x][y] = 0;
				CurrentMap[x][y + 1] = -1;
				getYKey();
				map1Ykey10.setImage(new Image("file:image/floor.png"));
			} else if (CurrentMap[x][y + 1] == 19) {
				player.setY(player.getY() + 1);
				CurrentMap[x][y] = 0;
				CurrentMap[x][y + 1] = -1;
				getYKey();
				map1Ykey11.setImage(new Image("file:image/floor.png"));
			} else if (CurrentMap[x][y + 1] == 20) {
				player.setY(player.getY() + 1);
				CurrentMap[x][y] = 0;
				CurrentMap[x][y + 1] = -1;
				getBKey();
				map1Bkey1.setImage(new Image("file:image/floor.png"));
			} else if (CurrentMap[x][y + 1] == 21) {
				player.setY(player.getY() + 1);
				CurrentMap[x][y] = 0;
				CurrentMap[x][y + 1] = -1;
				getBKey();
				map1Bkey2.setImage(new Image("file:image/floor.png"));
			} else if (CurrentMap[x][y + 1] == 22) {
				player.setY(player.getY() + 1);
				CurrentMap[x][y] = 0;
				CurrentMap[x][y + 1] = -1;
				getRKey();
				map1Rkey.setImage(new Image("file:image/floor.png"));
			} else if (CurrentMap[x][y + 1] == 30) {
				if (player.getYkey() <= 0)
					return false;
				openYdoor();
				CurrentMap[x][y + 1] = 0;
				map1Ydoor1.setImage(new Image("file:image/floor.png"));
				return false;
			} else if (CurrentMap[x][y + 1] == 31) {
				if (player.getYkey() <= 0)
					return false;
				openYdoor();
				CurrentMap[x][y + 1] = 0;
				map1Ydoor2.setImage(new Image("file:image/floor.png"));
				return false;
			} else if (CurrentMap[x][y + 1] == 32) {
				if (player.getYkey() <= 0)
					return false;
				openYdoor();
				CurrentMap[x][y + 1] = 0;
				map1Ydoor3.setImage(new Image("file:image/floor.png"));
				return false;
			} else if (CurrentMap[x][y + 1] == 33) {
				if (player.getYkey() <= 0)
					return false;
				openYdoor();
				CurrentMap[x][y + 1] = 0;
				map1Ydoor4.setImage(new Image("file:image/floor.png"));
				return false;
			} else if (CurrentMap[x][y + 1] == 34) {
				if (player.getYkey() <= 0)
					return false;
				openYdoor();
				CurrentMap[x][y + 1] = 0;
				map1Ydoor5.setImage(new Image("file:image/floor.png"));
				return false;
			} else if (CurrentMap[x][y + 1] == 40) {
				player.setY(player.getY() + 1);
				CurrentMap[x][y] = 0;
				CurrentMap[x][y + 1] = -1;
				getSmallHp();
				map1RHP1.setImage(new Image("file:image/floor.png"));
			} else if (CurrentMap[x][y + 1] == 41) {
				player.setY(player.getY() + 1);
				CurrentMap[x][y] = 0;
				CurrentMap[x][y + 1] = -1;
				getSmallHp();
				map1RHP2.setImage(new Image("file:image/floor.png"));
			} else if (CurrentMap[x][y + 1] == 42) {
				player.setY(player.getY() + 1);
				CurrentMap[x][y] = 0;
				CurrentMap[x][y + 1] = -1;
				getSmallHp();
				map1RHP3.setImage(new Image("file:image/floor.png"));
			} else if (CurrentMap[x][y + 1] == 43) {
				player.setY(player.getY() + 1);
				CurrentMap[x][y] = 0;
				CurrentMap[x][y + 1] = -1;
				getSmallHp();
				map1RHP4.setImage(new Image("file:image/floor.png"));
			} else if (CurrentMap[x][y + 1] == 44) {
				player.setY(player.getY() + 1);
				CurrentMap[x][y] = 0;
				CurrentMap[x][y + 1] = -1;
				getSmallHp();
				map1RHP5.setImage(new Image("file:image/floor.png"));
			} else if (CurrentMap[x][y + 1] == 45) {
				player.setY(player.getY() + 1);
				CurrentMap[x][y] = 0;
				CurrentMap[x][y + 1] = -1;
				getSmallHp();
				map1RHP6.setImage(new Image("file:image/floor.png"));
			} else if (CurrentMap[x][y + 1] == 46) {
				player.setY(player.getY() + 1);
				CurrentMap[x][y] = 0;
				CurrentMap[x][y + 1] = -1;
				getSmallHp();
				map1RHP7.setImage(new Image("file:image/floor.png"));
			} else if (CurrentMap[x][y + 1] == 47) {
				player.setY(player.getY() + 1);
				CurrentMap[x][y] = 0;
				CurrentMap[x][y + 1] = -1;
				getBigHp();
				map1BHP.setImage(new Image("file:image/floor.png"));
			} else if (CurrentMap[x][y + 1] == 50) {
				player.setY(player.getY() + 1);
				CurrentMap[x][y] = 0;
				CurrentMap[x][y + 1] = -1;
				getRedGem();
				map1RD.setImage(new Image("file:image/floor.png"));
			} else if (CurrentMap[x][y + 1] == 51) {
				player.setY(player.getY() + 1);
				CurrentMap[x][y] = 0;
				CurrentMap[x][y + 1] = -1;
				getBlueGem();
				map1BD.setImage(new Image("file:image/floor.png"));
			} else if (CurrentMap[x][y + 1] == 66) { // �]�w
				GameMonster enemy = MonsterList.get(6); // glim�O0//rlim�O1//blim�O2//nwerewolf�O3//nsk�O4//psk�O5//bwizard�O6//bbat�O7//jguard�O8//bigbat�O9//rbat�O10//yknight�O11//rknight�O12
				if (player.getAt() <= enemy.getDefend())
					return false;
				battle.startBattle(player, enemy, HP);
				if (player.getHp() <= 0) {// ���a���`
					gameover.setVisible(true);
					close = true;
				}
				getReward(enemy);
				CurrentMap[x][y + 1] = 0; // �]�w
				map1mon7.setImage(new Image("file:image/floor.png")); // �]�w
				return false;
			} else if (CurrentMap[x][y + 1] == 67) { // �]�w
				GameMonster enemy = MonsterList.get(0); // glim�O0//rlim�O1//blim�O2//nwerewolf�O3//nsk�O4//psk�O5//bwizard�O6//bbat�O7//jguard�O8//bigbat�O9//rbat�O10//yknight�O11//rknight�O12
				if (player.getAt() <= enemy.getDefend())
					return false;
				battle.startBattle(player, enemy, HP);
				if (player.getHp() <= 0) {// ���a���`
					gameover.setVisible(true);
					close = true;
				}
				getReward(enemy);
				CurrentMap[x][y + 1] = 0; // �]�w
				map1mon8.setImage(new Image("file:image/floor.png")); // �]�w
				return false;
			} else if (CurrentMap[x][y + 1] == 68) { // �]�w
				GameMonster enemy = MonsterList.get(7); // glim�O0//rlim�O1//blim�O2//nwerewolf�O3//nsk�O4//psk�O5//bwizard�O6//bbat�O7//jguard�O8//bigbat�O9//rbat�O10//yknight�O11//rknight�O12
				if (player.getAt() <= enemy.getDefend())
					return false;
				battle.startBattle(player, enemy, HP);
				if (player.getHp() <= 0) {// ���a���`
					gameover.setVisible(true);
					close = true;
				}
				getReward(enemy);
				CurrentMap[x][y + 1] = 0; // �]�w
				map1mon9.setImage(new Image("file:image/floor.png")); // �]�w
				return false;
			} else if (CurrentMap[x][y + 1] == 71) { // �]�w
				GameMonster enemy = MonsterList.get(4); // glim�O0//rlim�O1//blim�O2//nwerewolf�O3//nsk�O4//psk�O5//bwizard�O6//bbat�O7//jguard�O8//bigbat�O9//rbat�O10//yknight�O11//rknight�O12
				if (player.getAt() <= enemy.getDefend())
					return false;
				battle.startBattle(player, enemy, HP);
				if (player.getHp() <= 0) {// ���a���`
					gameover.setVisible(true);
					close = true;
				}
				getReward(enemy);
				CurrentMap[x][y + 1] = 0; // �]�w
				map1mon12.setImage(new Image("file:image/floor.png")); // �]�w
				return false;
			}
		} else if (player.getFloor() == 2) {// map2
			if (CurrentMap[x][y + 1] == 0) {
				player.setY(player.getY() + 1);
				CurrentMap[x][y] = 0;
				CurrentMap[x][y + 1] = -1;
			} else if (CurrentMap[x][y + 1] == 1 || CurrentMap[x][y + 1] == 8) {
				return false;
			} else if (CurrentMap[x][y + 1] == 9) {
				player.setY(player.getY() + 1);
				CurrentMap[x][y] = 0;
				CurrentMap[x][y + 1] = -1;
				getYKey();
				map2Ykey1.setImage(new Image("file:image/floor.png"));
			} else if (CurrentMap[x][y + 1] == 10) {
				player.setY(player.getY() + 1);
				CurrentMap[x][y] = 0;
				CurrentMap[x][y + 1] = -1;
				getYKey();
				map2Ykey2.setImage(new Image("file:image/floor.png"));
			} else if (CurrentMap[x][y + 1] == 11) {
				player.setY(player.getY() + 1);
				CurrentMap[x][y] = 0;
				CurrentMap[x][y + 1] = -1;
				getYKey();
				map2Ykey3.setImage(new Image("file:image/floor.png"));
			} else if (CurrentMap[x][y + 1] == 12) {
				player.setY(player.getY() + 1);
				CurrentMap[x][y] = 0;
				CurrentMap[x][y + 1] = -1;
				getYKey();
				map2Ykey4.setImage(new Image("file:image/floor.png"));
			} else if (CurrentMap[x][y + 1] == 13) {
				player.setY(player.getY() + 1);
				CurrentMap[x][y] = 0;
				CurrentMap[x][y + 1] = -1;
				getYKey();
				map2Ykey5.setImage(new Image("file:image/floor.png"));
			} else if (CurrentMap[x][y + 1] == 14) {
				player.setY(player.getY() + 1);
				CurrentMap[x][y] = 0;
				CurrentMap[x][y + 1] = -1;
				getYKey();
				map2Ykey6.setImage(new Image("file:image/floor.png"));
			} else if (CurrentMap[x][y + 1] == 15) {
				player.setY(player.getY() + 1);
				CurrentMap[x][y] = 0;
				CurrentMap[x][y + 1] = -1;
				getYKey();
				map2Ykey7.setImage(new Image("file:image/floor.png"));
			} else if (CurrentMap[x][y + 1] == 16) {
				player.setY(player.getY() + 1);
				CurrentMap[x][y] = 0;
				CurrentMap[x][y + 1] = -1;
				getYKey();
				map2Ykey8.setImage(new Image("file:image/floor.png"));
			} else if (CurrentMap[x][y + 1] == 17) {
				player.setY(player.getY() + 1);
				CurrentMap[x][y] = 0;
				CurrentMap[x][y + 1] = -1;
				getYKey();
				map2Ykey9.setImage(new Image("file:image/floor.png"));
			} else if (CurrentMap[x][y + 1] == 18) {
				player.setY(player.getY() + 1);
				CurrentMap[x][y] = 0;
				CurrentMap[x][y + 1] = -1;
				getBKey();
				map2Bkey.setImage(new Image("file:image/floor.png"));
			} else if (CurrentMap[x][y + 1] == 19) {
				player.setY(player.getY() + 1);
				CurrentMap[x][y] = 0;
				CurrentMap[x][y + 1] = -1;
				getRKey();
				map2Rkey.setImage(new Image("file:image/floor.png"));
			} else if (CurrentMap[x][y + 1] == 30) {
				if (player.getYkey() <= 0)
					return false;
				openYdoor();
				CurrentMap[x][y + 1] = 0;
				map2Ydoor1.setImage(new Image("file:image/floor.png"));
				return false;
			} else if (CurrentMap[x][y + 1] == 31) {
				if (player.getYkey() <= 0)
					return false;
				openYdoor();
				CurrentMap[x][y + 1] = 0;
				map2Ydoor2.setImage(new Image("file:image/floor.png"));
				return false;
			} else if (CurrentMap[x][y + 1] == 32) {
				if (player.getYkey() <= 0)
					return false;
				openYdoor();
				CurrentMap[x][y + 1] = 0;
				map2Ydoor3.setImage(new Image("file:image/floor.png"));
				return false;
			} else if (CurrentMap[x][y + 1] == 33) {
				if (player.getYkey() <= 0)
					return false;
				openYdoor();
				CurrentMap[x][y + 1] = 0;
				map2Ydoor4.setImage(new Image("file:image/floor.png"));
				return false;
			} else if (CurrentMap[x][y + 1] == 34) {
				if (player.getYkey() <= 0)
					return false;
				openYdoor();
				CurrentMap[x][y + 1] = 0;
				map2Ydoor5.setImage(new Image("file:image/floor.png"));
				return false;
			} else if (CurrentMap[x][y + 1] == 35) {
				if (player.getYkey() <= 0)
					return false;
				openYdoor();
				CurrentMap[x][y + 1] = 0;
				map2Ydoor6.setImage(new Image("file:image/floor.png"));
				return false;
			} else if (CurrentMap[x][y + 1] == 36) {
				if (player.getBkey() <= 0)
					return false;
				openBdoor();
				CurrentMap[x][y + 1] = 0;
				map2Bdoor.setImage(new Image("file:image/floor.png"));
				return false;
			} else if (CurrentMap[x][y - 1] == 40) {
				player.setY(player.getY() + 1);
				CurrentMap[x][y] = 0;
				CurrentMap[x][y + 1] = -1;
				getSmallHp();
				map2RHP1.setImage(new Image("file:image/floor.png"));
			} else if (CurrentMap[x][y + 1] == 41) {
				player.setY(player.getY() + 1);
				CurrentMap[x][y] = 0;
				CurrentMap[x][y + 1] = -1;
				getSmallHp();
				map2RHP2.setImage(new Image("file:image/floor.png"));
			} else if (CurrentMap[x][y + 1] == 42) {
				player.setY(player.getY() + 1);
				CurrentMap[x][y] = 0;
				CurrentMap[x][y + 1] = -1;
				getSmallHp();
				map2RHP3.setImage(new Image("file:image/floor.png"));
			} else if (CurrentMap[x][y + 1] == 43) {
				player.setY(player.getY() + 1);
				CurrentMap[x][y] = 0;
				CurrentMap[x][y + 1] = -1;
				getBigHp();
				map2BHP1.setImage(new Image("file:image/floor.png"));
			} else if (CurrentMap[x][y + 1] == 44) {
				player.setY(player.getY() + 1);
				CurrentMap[x][y] = 0;
				CurrentMap[x][y + 1] = -1;
				getBigHp();
				map2BHP2.setImage(new Image("file:image/floor.png"));
			} else if (CurrentMap[x][y + 1] == 45) {
				player.setY(player.getY() + 1);
				CurrentMap[x][y] = 0;
				CurrentMap[x][y + 1] = -1;
				getBigHp();
				map2BHP3.setImage(new Image("file:image/floor.png"));
			} else if (CurrentMap[x][y + 1] == 46) {
				player.setY(player.getY() + 1);
				CurrentMap[x][y] = 0;
				CurrentMap[x][y + 1] = -1;
				getBigHp();
				map2BHP4.setImage(new Image("file:image/floor.png"));
			} else if (CurrentMap[x][y + 1] == 50) {
				player.setY(player.getY() + 1);
				CurrentMap[x][y] = 0;
				CurrentMap[x][y + 1] = -1;
				getRedGem();
				map2RD1.setImage(new Image("file:image/floor.png"));
			} else if (CurrentMap[x][y + 1] == 51) {
				player.setY(player.getY() + 1);
				CurrentMap[x][y] = 0;
				CurrentMap[x][y + 1] = -1;
				getRedGem();
				map2RD2.setImage(new Image("file:image/floor.png"));
			} else if (CurrentMap[x][y + 1] == 52) {
				player.setY(player.getY() + 1);
				CurrentMap[x][y] = 0;
				CurrentMap[x][y + 1] = -1;
				getRedGem();
				map2RD3.setImage(new Image("file:image/floor.png"));
			} else if (CurrentMap[x][y + 1] == 53) {
				player.setY(player.getY() + 1);
				CurrentMap[x][y] = 0;
				CurrentMap[x][y + 1] = -1;
				getRedGem();
				map2RD4.setImage(new Image("file:image/floor.png"));
			} else if (CurrentMap[x][y + 1] == 54) {
				player.setY(player.getY() + 1);
				CurrentMap[x][y] = 0;
				CurrentMap[x][y + 1] = -1;
				getBlueGem();
				map2BD1.setImage(new Image("file:image/floor.png"));
			} else if (CurrentMap[x][y + 1] == 55) {
				player.setY(player.getY() + 1);
				CurrentMap[x][y] = 0;
				CurrentMap[x][y + 1] = -1;
				getBlueGem();
				map2BD2.setImage(new Image("file:image/floor.png"));
			} else if (CurrentMap[x][y + 1] == 56) {
				player.setY(player.getY() + 1);
				CurrentMap[x][y] = 0;
				CurrentMap[x][y + 1] = -1;
				getBlueGem();
				map2BD3.setImage(new Image("file:image/floor.png"));
			} else if (CurrentMap[x][y + 1] == 57) {
				player.setY(player.getY() + 1);
				CurrentMap[x][y] = 0;
				CurrentMap[x][y + 1] = -1;
				getBlueGem();
				map2BD4.setImage(new Image("file:image/floor.png"));
			} else if (CurrentMap[x][y + 1] == 60) { // �]�w
				GameMonster enemy = MonsterList.get(12); // glim�O0//rlim�O1//blim�O2//nwerewolf�O3//nsk�O4//psk�O5//bwizard�O6//bbat�O7//jguard�O8//bigbat�O9//rbat�O10//yknight�O11//rknight�O12
				if (player.getAt() <= enemy.getDefend())
					return false;
				battle.startBattle(player, enemy, HP);
				if (player.getHp() <= 0) {// ���a���`
					gameover.setVisible(true);
					close = true;
				}
				getReward(enemy);
				CurrentMap[x][y + 1] = 0; // �]�w
				map2Rknight.setImage(new Image("file:image/floor.png")); // �]�w
				return false;
			}
		} else if (player.getFloor() == 3) {// map3
			if (CurrentMap[x][y + 1] == 0) {
				player.setY(player.getY() + 1);
				CurrentMap[x][y] = 0;
				CurrentMap[x][y + 1] = -1;
			} else if (CurrentMap[x][y + 1] == 1) {
				return false;
			} else if (CurrentMap[x][y + 1] == 9) {
				player.setY(player.getY() + 1);
				CurrentMap[x][y] = 0;
				CurrentMap[x][y + 1] = -1;
				getYKey();
				map3Ykey1.setImage(new Image("file:image/floor.png"));
			} else if (CurrentMap[x][y + 1] == 10) {
				player.setY(player.getY() + 1);
				CurrentMap[x][y] = 0;
				CurrentMap[x][y + 1] = -1;
				getYKey();
				map3Ykey2.setImage(new Image("file:image/floor.png"));
			} else if (CurrentMap[x][y + 1] == 11) {
				player.setY(player.getY() + 1);
				CurrentMap[x][y] = 0;
				CurrentMap[x][y + 1] = -1;
				getYKey();
				map3Ykey3.setImage(new Image("file:image/floor.png"));
			} else if (CurrentMap[x][y + 1] == 12) {
				player.setY(player.getY() + 1);
				CurrentMap[x][y] = 0;
				CurrentMap[x][y + 1] = -1;
				getYKey();
				map3Ykey4.setImage(new Image("file:image/floor.png"));
			} else if (CurrentMap[x][y + 1] == 13) {
				player.setY(player.getY() + 1);
				CurrentMap[x][y] = 0;
				CurrentMap[x][y + 1] = -1;
				getYKey();
				map3Ykey5.setImage(new Image("file:image/floor.png"));
			} else if (CurrentMap[x][y + 1] == 14) {
				player.setY(player.getY() + 1);
				CurrentMap[x][y] = 0;
				CurrentMap[x][y + 1] = -1;
				getYKey();
				map3Ykey6.setImage(new Image("file:image/floor.png"));
			} else if (CurrentMap[x][y + 1] == 15) {
				player.setY(player.getY() + 1);
				CurrentMap[x][y] = 0;
				CurrentMap[x][y + 1] = -1;
				getYKey();
				map3Ykey7.setImage(new Image("file:image/floor.png"));
			} else if (CurrentMap[x][y + 1] == 16) {
				player.setY(player.getY() + 1);
				CurrentMap[x][y] = 0;
				CurrentMap[x][y + 1] = -1;
				getYKey();
				map3Ykey8.setImage(new Image("file:image/floor.png"));
			} else if (CurrentMap[x][y + 1] == 30) {
				if (player.getYkey() <= 0)
					return false;
				openYdoor();
				CurrentMap[x][y + 1] = 0;
				map3Ydoor1.setImage(new Image("file:image/floor.png"));
				return false;
			} else if (CurrentMap[x][y + 1] == 31) {
				if (player.getYkey() <= 0)
					return false;
				openYdoor();
				CurrentMap[x][y + 1] = 0;
				map3Ydoor2.setImage(new Image("file:image/floor.png"));
				return false;
			} else if (CurrentMap[x][y + 1] == 32) {
				if (player.getYkey() <= 0)
					return false;
				openYdoor();
				CurrentMap[x][y + 1] = 0;
				map3Ydoor3.setImage(new Image("file:image/floor.png"));
				return false;
			} else if (CurrentMap[x][y + 1] == 40) {
				player.setY(player.getY() + 1);
				CurrentMap[x][y] = 0;
				CurrentMap[x][y + 1] = -1;
				getBigHp();
				map3BHP.setImage(new Image("file:image/floor.png"));
			} else if (CurrentMap[x][y + 1] == 50) {
				player.setY(player.getY() + 1);
				CurrentMap[x][y] = 0;
				CurrentMap[x][y + 1] = -1;
				getRedGem();
				map3RD.setImage(new Image("file:image/floor.png"));
			} else if (CurrentMap[x][y + 1] == 51) {
				player.setY(player.getY() + 1);
				CurrentMap[x][y] = 0;
				CurrentMap[x][y + 1] = -1;
				getBlueGem();
				map3BD.setImage(new Image("file:image/floor.png"));
			} else if (CurrentMap[x][y + 1] == 63) { // �]�w
				GameMonster enemy = MonsterList.get(1); // glim�O0//rlim�O1//blim�O2//nwerewolf�O3//nsk�O4//psk�O5//bwizard�O6//bbat�O7//jguard�O8//bigbat�O9//rbat�O10//yknight�O11//rknight�O12
				if (player.getAt() <= enemy.getDefend())
					return false;
				battle.startBattle(player, enemy, HP);
				if (player.getHp() <= 0) {// ���a���`
					gameover.setVisible(true);
					close = true;
				}
				getReward(enemy);
				CurrentMap[x][y + 1] = 0; // �]�w
				map3mon4.setImage(new Image("file:image/floor.png")); // �]�w
				return false;
			} else if (CurrentMap[x][y + 1] == 65) { // �]�w
				GameMonster enemy = MonsterList.get(7); // glim�O0//rlim�O1//blim�O2//nwerewolf�O3//nsk�O4//psk�O5//bwizard�O6//bbat�O7//jguard�O8//bigbat�O9//rbat�O10//yknight�O11//rknight�O12
				if (player.getAt() <= enemy.getDefend())
					return false;
				battle.startBattle(player, enemy, HP);
				if (player.getHp() <= 0) {// ���a���`
					gameover.setVisible(true);
					close = true;
				}
				getReward(enemy);
				CurrentMap[x][y + 1] = 0; // �]�w
				map3mon6.setImage(new Image("file:image/floor.png")); // �]�w
				return false;
			} else if (CurrentMap[x][y + 1] == 66) { // �]�w
				GameMonster enemy = MonsterList.get(1); // glim�O0//rlim�O1//blim�O2//nwerewolf�O3//nsk�O4//psk�O5//bwizard�O6//bbat�O7//jguard�O8//bigbat�O9//rbat�O10//yknight�O11//rknight�O12
				if (player.getAt() <= enemy.getDefend())
					return false;
				battle.startBattle(player, enemy, HP);
				if (player.getHp() <= 0) {// ���a���`
					gameover.setVisible(true);
					close = true;
				}
				getReward(enemy);
				CurrentMap[x][y + 1] = 0; // �]�w
				map3mon7.setImage(new Image("file:image/floor.png")); // �]�w
				return false;
			} else if (CurrentMap[x][y + 1] == 69) { // �]�w
				GameMonster enemy = MonsterList.get(7); // glim�O0//rlim�O1//blim�O2//nwerewolf�O3//nsk�O4//psk�O5//bwizard�O6//bbat�O7//jguard�O8//bigbat�O9//rbat�O10//yknight�O11//rknight�O12
				if (player.getAt() <= enemy.getDefend())
					return false;
				battle.startBattle(player, enemy, HP);
				if (player.getHp() <= 0) {// ���a���`
					gameover.setVisible(true);
					close = true;
				}
				getReward(enemy);
				CurrentMap[x][y + 1] = 0; // �]�w
				map3mon10.setImage(new Image("file:image/floor.png")); // �]�w
				return false;
			} else if (CurrentMap[x][y + 1] == 71) { // �]�w
				GameMonster enemy = MonsterList.get(7); // glim�O0//rlim�O1//blim�O2//nwerewolf�O3//nsk�O4//psk�O5//bwizard�O6//bbat�O7//jguard�O8//bigbat�O9//rbat�O10//yknight�O11//rknight�O12
				if (player.getAt() <= enemy.getDefend())
					return false;
				battle.startBattle(player, enemy, HP);
				if (player.getHp() <= 0) {// ���a���`
					gameover.setVisible(true);
					close = true;
				}
				getReward(enemy);
				CurrentMap[x][y + 1] = 0; // �]�w
				map3mon12.setImage(new Image("file:image/floor.png")); // �]�w
				return false;
			} else if (CurrentMap[x][y + 1] == 72) { // �]�w
				GameMonster enemy = MonsterList.get(1); // glim�O0//rlim�O1//blim�O2//nwerewolf�O3//nsk�O4//psk�O5//bwizard�O6//bbat�O7//jguard�O8//bigbat�O9//rbat�O10//yknight�O11//rknight�O12
				if (player.getAt() <= enemy.getDefend())
					return false;
				battle.startBattle(player, enemy, HP);
				if (player.getHp() <= 0) {// ���a���`
					gameover.setVisible(true);
					close = true;
				}
				getReward(enemy);
				CurrentMap[x][y + 1] = 0; // �]�w
				map3mon13.setImage(new Image("file:image/floor.png")); // �]�w
				return false;
			} else if (CurrentMap[x][y + 1] == 73) { // �]�w
				GameMonster enemy = MonsterList.get(7); // glim�O0//rlim�O1//blim�O2//nwerewolf�O3//nsk�O4//psk�O5//bwizard�O6//bbat�O7//jguard�O8//bigbat�O9//rbat�O10//yknight�O11//rknight�O12
				if (player.getAt() <= enemy.getDefend())
					return false;
				battle.startBattle(player, enemy, HP);
				if (player.getHp() <= 0) {// ���a���`
					gameover.setVisible(true);
					close = true;
				}
				getReward(enemy);
				CurrentMap[x][y + 1] = 0; // �]�w
				map3mon14.setImage(new Image("file:image/floor.png")); // �]�w
				return false;
			}
		} else if (player.getFloor() == 4) {// map4
			if (CurrentMap[x][y + 1] == 0) {
				player.setY(player.getY() + 1);
				CurrentMap[x][y] = 0;
				CurrentMap[x][y + 1] = -1;
			} else if (CurrentMap[x][y + 1] == 1) {
				return false;
			} else if (CurrentMap[x][y + 1] == 5) {
				talk = true;
				right = true;
				if (map4talk.isVisible() == false) {
					map4talk.setImage(new Image("file:image/Theiftalk1.png"));
					map4talk.setVisible(true);
					next = true;
				} else if (next == true && map4talk.isVisible() == true) {
					map4talk.setImage(new Image("file:image/Theiftalk2.png"));
					next = false;
					next2 = true;
				} else if (next2 == true && map4talk.isVisible() == true) {
					map4talk.setImage(new Image("file:image/Theiftalk3.png"));
					next2 = false;
					next3 = true;
				} else if (next3 == true && map4talk.isVisible() == true) {
					map4talk.setImage(new Image("file:image/Theiftalk4.png"));
					next3 = false;
					next4 = true;
				} else if (next4 == true && map4talk.isVisible() == true) {
					map4talk.setImage(new Image("file:image/Theiftalk5.png"));
					next4 = false;
					next5 = true;
				} else if (next5 == true && map4talk.isVisible() == true) {
					map4talk.setImage(new Image("file:image/Theiftalk6.png"));
					next5 = false;
					next6 = true;
				} else if (next6 == true && map4talk.isVisible() == true) {
					map4talk.setImage(new Image("file:image/Theiftalk7.png"));
					next6 = false;
					next7 = true;
				} else if (next7 == true && map4talk.isVisible() == true) {
					map4talk.setImage(new Image("file:image/Theiftalk8.png"));
					next7 = false;
					next8 = true;
				} else if (next8 == true && map4talk.isVisible() == true) {
					map2Pdoor.setImage(new Image("file:image/floor.png"));
					Map[1].getMap()[7][2] = 0;
					// ����fxml
					map4theif.setImage(new Image("file:image/floor.png"));
					CurrentMap[x][y + 1] = 0;
					next8 = false;
					talk = false;
					right = false;
				}
				return false;
			} else if (CurrentMap[x][y + 1] == 9) {
				player.setY(player.getY() + 1);
				CurrentMap[x][y] = 0;
				CurrentMap[x][y + 1] = -1;
				getYKey();
				map4Ykey1.setImage(new Image("file:image/floor.png"));
			} else if (CurrentMap[x][y + 1] == 10) {
				player.setY(player.getY() + 1);
				CurrentMap[x][y] = 0;
				CurrentMap[x][y + 1] = -1;
				getYKey();
				map4Ykey2.setImage(new Image("file:image/floor.png"));
			} else if (CurrentMap[x][y + 1] == 50) {
				player.setY(player.getY() + 1);
				CurrentMap[x][y] = 0;
				CurrentMap[x][y + 1] = -1;
				getRedGem();
				map4RD1.setImage(new Image("file:image/floor.png"));
			} else if (CurrentMap[x][y + 1] == 51) {
				player.setY(player.getY() + 1);
				CurrentMap[x][y] = 0;
				CurrentMap[x][y + 1] = -1;
				getRedGem();
				map4RD2.setImage(new Image("file:image/floor.png"));
			} else if (CurrentMap[x][y + 1] == 52) {
				player.setY(player.getY() + 1);
				CurrentMap[x][y] = 0;
				CurrentMap[x][y + 1] = -1;
				getBlueGem();
				map4BD1.setImage(new Image("file:image/floor.png"));
			} else if (CurrentMap[x][y + 1] == 53) {
				player.setY(player.getY() + 1);
				CurrentMap[x][y] = 0;
				CurrentMap[x][y + 1] = -1;
				getBlueGem();
				map4BD2.setImage(new Image("file:image/floor.png"));
			} else if (CurrentMap[x][y + 1] == 68) { // �]�w
				GameMonster enemy = MonsterList.get(10); // glim�O0//rlim�O1//blim�O2//nwerewolf�O3//nsk�O4//psk�O5//bwizard�O6//bbat�O7//jguard�O8//bigbat�O9//rbat�O10//yknight�O11//rknight�O12
				if (player.getAt() <= enemy.getDefend())
					return false;
				battle.startBattle(player, enemy, HP);
				if (player.getHp() <= 0) {// ���a���`
					gameover.setVisible(true);
					close = true;
				}
				getReward(enemy);
				CurrentMap[x][y + 1] = 0; // �]�w
				map4mon9.setImage(new Image("file:image/floor.png")); // �]�w
				return false;
			} else if (CurrentMap[x][y + 1] == 69) { // �]�w
				GameMonster enemy = MonsterList.get(9); // glim�O0//rlim�O1//blim�O2//nwerewolf�O3//nsk�O4//psk�O5//bwizard�O6//bbat�O7//jguard�O8//bigbat�O9//rbat�O10//yknight�O11//rknight�O12
				if (player.getAt() <= enemy.getDefend())
					return false;
				battle.startBattle(player, enemy, HP);
				if (player.getHp() <= 0) {// ���a���`
					gameover.setVisible(true);
					close = true;
				}
				getReward(enemy);
				CurrentMap[x][y - 1] = -1; // �]�w
				map4mon10.setImage(new Image("file:image/floor.png")); // �]�w
				return false;
			} else if (CurrentMap[x][y + 1] == 70) { // �]�w
				GameMonster enemy = MonsterList.get(8); // glim�O0//rlim�O1//blim�O2//nwerewolf�O3//nsk�O4//psk�O5//bwizard�O6//bbat�O7//jguard�O8//bigbat�O9//rbat�O10//yknight�O11//rknight�O12
				if (player.getAt() <= enemy.getDefend())
					return false;
				battle.startBattle(player, enemy, HP);
				if (player.getHp() <= 0) {// ���a���`
					gameover.setVisible(true);
					close = true;
				}
				getReward(enemy);
				CurrentMap[x][y + 1] = 0; // �]�w
				map4mon11.setImage(new Image("file:image/floor.png")); // �]�w
				return false;
			} else if (CurrentMap[x][y + 1] == 71) { // �]�w
				GameMonster enemy = MonsterList.get(3); // glim�O0//rlim�O1//blim�O2//nwerewolf�O3//nsk�O4//psk�O5//bwizard�O6//bbat�O7//jguard�O8//bigbat�O9//rbat�O10//yknight�O11//rknight�O12
				if (player.getAt() <= enemy.getDefend())
					return false;
				battle.startBattle(player, enemy, HP);
				if (player.getHp() <= 0) {// ���a���`
					gameover.setVisible(true);
					close = true;
				}
				getReward(enemy);
				CurrentMap[x][y + 1] = 0; // �]�w
				map4mon12.setImage(new Image("file:image/floor.png")); // �]�w
				return false;
			} else if (CurrentMap[x][y + 1] == 72) { // �]�w
				GameMonster enemy = MonsterList.get(9); // glim�O0//rlim�O1//blim�O2//nwerewolf�O3//nsk�O4//psk�O5//bwizard�O6//bbat�O7//jguard�O8//bigbat�O9//rbat�O10//yknight�O11//rknight�O12
				if (player.getAt() <= enemy.getDefend())
					return false;
				battle.startBattle(player, enemy, HP);
				if (player.getHp() <= 0) {// ���a���`
					gameover.setVisible(true);
					close = true;
				}
				getReward(enemy);
				CurrentMap[x][y + 1] = 0; // �]�w
				map4mon13.setImage(new Image("file:image/floor.png")); // �]�w
				return false;
			} else if (CurrentMap[x][y + 1] == 73) { // �]�w
				GameMonster enemy = MonsterList.get(3); // glim�O0//rlim�O1//blim�O2//nwerewolf�O3//nsk�O4//psk�O5//bwizard�O6//bbat�O7//jguard�O8//bigbat�O9//rbat�O10//yknight�O11//rknight�O12
				if (player.getAt() <= enemy.getDefend())
					return false;
				battle.startBattle(player, enemy, HP);
				if (player.getHp() <= 0) {// ���a���`
					gameover.setVisible(true);
					close = true;
				}
				getReward(enemy);
				CurrentMap[x][y + 1] = 0; // �]�w
				map4mon14.setImage(new Image("file:image/floor.png")); // �]�w
				return false;
			}
		} else if (player.getFloor() == 5) {// map5
			if (CurrentMap[x][y + 1] == 0) {
				player.setY(player.getY() + 1);
				CurrentMap[x][y] = 0;
				CurrentMap[x][y + 1] = -1;
			} else if (CurrentMap[x][y + 1] == 1) {
				return false;
			} else if (CurrentMap[x][y + 1] == 2) {
				CurrentMap[x][y] = 0;
				Map[4].setMap(CurrentMap);
				CurrentMap = Map[5].getMap();

				// FXMLLoader loader = new FXMLLoader(getClass().getResource("map6.fxml"));
				// loader.setControllerFactory(Controller -> new Controller());
				// Parent root;
				// try {
				// root = loader.load();
				// scene.setRoot(root);
				// } catch (IOException e) {
				// // TODO Auto-generated catch block
				// e.printStackTrace();
				// }
				// changeMap(scene ,fxmlLoader);
				System.out.println(player.getX() + ", " + player.getY());
				stage1.setImage(new Image("file:image/mapfinal.png"));
				CurrentMap[x][y] = -1;

				player.setFloor(6);
				buttonImage.setImage(new Image("file:image/down1.png"));
				buttonImage.setTranslateX(buttonImage.getTranslateX() + 4);

				map5mon1.setVisible(false);
				map5mon2.setVisible(false);
				map5mon3.setVisible(false);
				map5mon4.setVisible(false);
				map5mon5.setVisible(false);
				map5mon6.setVisible(false);
				map5mon7.setVisible(false);
				map5mon8.setVisible(false);
				map5mon9.setVisible(false);
				map5mon10.setVisible(false);
				map5mon11.setVisible(false);
				map5mon12.setVisible(false);
				map5mon13.setVisible(false);
				map5mon14.setVisible(false);
				map5mon15.setVisible(false);
				map5mon16.setVisible(false);
				map5mon17.setVisible(false);
				map5mon18.setVisible(false);
				map5mon19.setVisible(false);
				map5mon20.setVisible(false);
				map5mon21.setVisible(false);
				map5Ydoor1.setVisible(false);
				map5Ydoor2.setVisible(false);
				map5Ydoor3.setVisible(false);
				map5Ydoor4.setVisible(false);
				map5Bdoor.setVisible(false);
				map5Rdoor.setVisible(false);
				map5Ykey1.setVisible(false);
				map5Ykey2.setVisible(false);
				map5Ykey3.setVisible(false);
				map5Bkey.setVisible(false);
				map5Pkey.setVisible(false);
				map5RHP.setVisible(false);
				map5BHP1.setVisible(false);
				map5BHP2.setVisible(false);
				map5RD1.setVisible(false);
				map5RD2.setVisible(false);
				map5BD1.setVisible(false);
				map5BD2.setVisible(false);
				map5shield.setVisible(false);
				map5cross.setVisible(false);

				map6Boss.setVisible(true);
				map6Rdoor.setVisible(true);
				return false;
			} else if (CurrentMap[x][y + 1] == 5) {
				Shop Shop = new Shop();
				talking = true;
				talk = true;
				oshop.setImage(new Image("file:image/oshop.png"));
				oshop.setVisible(true);
				oshoplevel.setVisible(true);
				oshopdef.setVisible(true);
				oshopat.setVisible(true);
				exitoshop.setVisible(true);
				Shop.levelShop(player, oshop.getScene());
				return false;
			} else if (CurrentMap[x][y + 1] == 6) {
				Shop Shop = new Shop();
				talking = true;
				talk = true;
				gshop.setImage(new Image("file:image/gshop.png"));
				gshop.setVisible(true);
				gshopYkey.setVisible(true);
				gshopBkey.setVisible(true);
				gshopRkey.setVisible(true);
				exitgshop.setVisible(true);
				Shop.keyShop(player, gshop.getScene());
				return false;
			} else if (CurrentMap[x][y + 1] == 9) {
				player.setY(player.getY() + 1);
				CurrentMap[x][y] = 0;
				CurrentMap[x][y + 1] = -1;
				getYKey();
				map5Ykey1.setImage(new Image("file:image/floor.png"));
			} else if (CurrentMap[x][y + 1] == 10) {
				player.setY(player.getY() + 1);
				CurrentMap[x][y] = 0;
				CurrentMap[x][y + 1] = -1;
				getYKey();
				map5Ykey2.setImage(new Image("file:image/floor.png"));
			} else if (CurrentMap[x][y + 1] == 12) {
				player.setY(player.getY() + 1);
				CurrentMap[x][y] = 0;
				CurrentMap[x][y + 1] = -1;
				getBKey();
				map5Bkey.setImage(new Image("file:image/floor.png"));
			} else if (CurrentMap[x][y + 1] == 30) {
				if (player.getYkey() <= 0)
					return false;
				openYdoor();
				CurrentMap[x][y + 1] = 0;
				map5Ydoor1.setImage(new Image("file:image/floor.png"));
				return false;
			} else if (CurrentMap[x][y + 1] == 35) {
				if (player.getRkey() <= 0)
					return false;
				openRdoor();
				CurrentMap[x][y + 1] = 0;
				map5Rdoor.setImage(new Image("file:image/floor.png"));
				return false;
			} else if (CurrentMap[x][y + 1] == 42) {
				player.setY(player.getY() + 1);
				CurrentMap[x][y] = 0;
				CurrentMap[x][y + 1] = -1;
				getBigHp();
				map5BHP2.setImage(new Image("file:image/floor.png"));
			} else if (CurrentMap[x][y + 1] == 63) { // �]�w
				GameMonster enemy = MonsterList.get(7); // glim�O0//rlim�O1//blim�O2//nwerewolf�O3//nsk�O4//psk�O5//bwizard�O6//bbat�O7//jguard�O8//bigbat�O9//rbat�O10//yknight�O11//rknight�O12
				if (player.getAt() <= enemy.getDefend())
					return false;
				battle.startBattle(player, enemy, HP);
				if (player.getHp() <= 0) {// ���a���`
					gameover.setVisible(true);
					close = true;
				}
				getReward(enemy);
				CurrentMap[x][y + 1] = 0; // �]�w
				map5mon4.setImage(new Image("file:image/floor.png")); // �]�w
				return false;
			} else if (CurrentMap[x][y + 1] == 63) { // �]�w
				GameMonster enemy = MonsterList.get(7); // glim�O0//rlim�O1//blim�O2//nwerewolf�O3//nsk�O4//psk�O5//bwizard�O6//bbat�O7//jguard�O8//bigbat�O9//rbat�O10//yknight�O11//rknight�O12
				if (player.getAt() <= enemy.getDefend())
					return false;
				battle.startBattle(player, enemy, HP);
				if (player.getHp() <= 0) {// ���a���`
					gameover.setVisible(true);
					close = true;
				}
				getReward(enemy);
				CurrentMap[x][y + 1] = 0; // �]�w
				map5mon4.setImage(new Image("file:image/floor.png")); // �]�w
				return false;
			} else if (CurrentMap[x][y + 1] == 69) { // �]�w
				GameMonster enemy = MonsterList.get(6); // glim�O0//rlim�O1//blim�O2//nwerewolf�O3//nsk�O4//psk�O5//bwizard�O6//bbat�O7//jguard�O8//bigbat�O9//rbat�O10//yknight�O11//rknight�O12
				if (player.getAt() <= enemy.getDefend())
					return false;
				battle.startBattle(player, enemy, HP);
				if (player.getHp() <= 0) {// ���a���`
					gameover.setVisible(true);
					close = true;
				}
				getReward(enemy);
				CurrentMap[x][y + 1] = 0; // �]�w
				map5mon10.setImage(new Image("file:image/floor.png")); // �]�w
				return false;
			} else if (CurrentMap[x][y + 1] == 70) { // �]�w
				GameMonster enemy = MonsterList.get(5); // glim�O0//rlim�O1//blim�O2//nwerewolf�O3//nsk�O4//psk�O5//bwizard�O6//bbat�O7//jguard�O8//bigbat�O9//rbat�O10//yknight�O11//rknight�O12
				if (player.getAt() <= enemy.getDefend())
					return false;
				battle.startBattle(player, enemy, HP);
				if (player.getHp() <= 0) {// ���a���`
					gameover.setVisible(true);
					close = true;
				}
				getReward(enemy);
				CurrentMap[x][y + 1] = 0; // �]�w
				map5mon11.setImage(new Image("file:image/floor.png")); // �]�w
				return false;
			} else if (CurrentMap[x][y + 1] == 71) { // �]�w
				GameMonster enemy = MonsterList.get(7); // glim�O0//rlim�O1//blim�O2//nwerewolf�O3//nsk�O4//psk�O5//bwizard�O6//bbat�O7//jguard�O8//bigbat�O9//rbat�O10//yknight�O11//rknight�O12
				if (player.getAt() <= enemy.getDefend())
					return false;
				battle.startBattle(player, enemy, HP);
				if (player.getHp() <= 0) {// ���a���`
					gameover.setVisible(true);
					close = true;
				}
				getReward(enemy);
				CurrentMap[x][y + 1] = 0; // �]�w
				map5mon12.setImage(new Image("file:image/floor.png")); // �]�w
				return false;
			} else if (CurrentMap[x][y + 1] == 73) { // �]�w
				GameMonster enemy = MonsterList.get(4); // glim�O0//rlim�O1//blim�O2//nwerewolf�O3//nsk�O4//psk�O5//bwizard�O6//bbat�O7//jguard�O8//bigbat�O9//rbat�O10//yknight�O11//rknight�O12
				if (player.getAt() <= enemy.getDefend())
					return false;
				battle.startBattle(player, enemy, HP);
				if (player.getHp() <= 0) {// ���a���`
					gameover.setVisible(true);
					close = true;
				}
				getReward(enemy);
				CurrentMap[x][y + 1] = 0; // �]�w
				map5mon14.setImage(new Image("file:image/floor.png")); // �]�w
				return false;
			} else if (CurrentMap[x][y + 1] == 74) { // �]�w
				GameMonster enemy = MonsterList.get(6); // glim�O0//rlim�O1//blim�O2//nwerewolf�O3//nsk�O4//psk�O5//bwizard�O6//bbat�O7//jguard�O8//bigbat�O9//rbat�O10//yknight�O11//rknight�O12
				if (player.getAt() <= enemy.getDefend())
					return false;
				battle.startBattle(player, enemy, HP);
				if (player.getHp() <= 0) {// ���a���`
					gameover.setVisible(true);
					close = true;
				}
				getReward(enemy);
				CurrentMap[x][y + 1] = 0; // �]�w
				map5mon15.setImage(new Image("file:image/floor.png")); // �]�w
				return false;
			} else if (CurrentMap[x][y + 1] == 75) { // �]�w
				GameMonster enemy = MonsterList.get(3); // glim�O0//rlim�O1//blim�O2//nwerewolf�O3//nsk�O4//psk�O5//bwizard�O6//bbat�O7//jguard�O8//bigbat�O9//rbat�O10//yknight�O11//rknight�O12
				if (player.getAt() <= enemy.getDefend())
					return false;
				battle.startBattle(player, enemy, HP);
				if (player.getHp() <= 0) {// ���a���`
					gameover.setVisible(true);
					close = true;
				}
				getReward(enemy);
				CurrentMap[x][y + 1] = 0; // �]�w
				map5mon16.setImage(new Image("file:image/floor.png")); // �]�w
				return false;
			} else if (CurrentMap[x][y + 1] == 76) { // �]�w
				GameMonster enemy = MonsterList.get(3); // glim�O0//rlim�O1//blim�O2//nwerewolf�O3//nsk�O4//psk�O5//bwizard�O6//bbat�O7//jguard�O8//bigbat�O9//rbat�O10//yknight�O11//rknight�O12
				if (player.getAt() <= enemy.getDefend())
					return false;
				battle.startBattle(player, enemy, HP);
				if (player.getHp() <= 0) {// ���a���`
					gameover.setVisible(true);
					close = true;
				}
				getReward(enemy);
				CurrentMap[x][y + 1] = 0; // �]�w
				map5mon17.setImage(new Image("file:image/floor.png")); // �]�w
				return false;
			} else if (CurrentMap[x][y + 1] == 77) { // �]�w
				GameMonster enemy = MonsterList.get(6); // glim�O0//rlim�O1//blim�O2//nwerewolf�O3//nsk�O4//psk�O5//bwizard�O6//bbat�O7//jguard�O8//bigbat�O9//rbat�O10//yknight�O11//rknight�O12
				if (player.getAt() <= enemy.getDefend())
					return false;
				battle.startBattle(player, enemy, HP);
				if (player.getHp() <= 0) {// ���a���`
					gameover.setVisible(true);
					close = true;
				}
				getReward(enemy);
				CurrentMap[x][y + 1] = 0; // �]�w
				map5mon18.setImage(new Image("file:image/floor.png")); // �]�w
				return false;
			} else if (CurrentMap[x][y + 1] == 78) { // �]�w
				GameMonster enemy = MonsterList.get(5); // glim�O0//rlim�O1//blim�O2//nwerewolf�O3//nsk�O4//psk�O5//bwizard�O6//bbat�O7//jguard�O8//bigbat�O9//rbat�O10//yknight�O11//rknight�O12
				if (player.getAt() <= enemy.getDefend())
					return false;
				battle.startBattle(player, enemy, HP);
				if (player.getHp() <= 0) {// ���a���`
					gameover.setVisible(true);
					close = true;
				}
				getReward(enemy);
				CurrentMap[x][y + 1] = 0; // �]�w
				map5mon19.setImage(new Image("file:image/floor.png")); // �]�w
				return false;
			} else if (CurrentMap[x][y + 1] == 79) { // �]�w
				GameMonster enemy = MonsterList.get(8); // glim�O0//rlim�O1//blim�O2//nwerewolf�O3//nsk�O4//psk�O5//bwizard�O6//bbat�O7//jguard�O8//bigbat�O9//rbat�O10//yknight�O11//rknight�O12
				if (player.getAt() <= enemy.getDefend())
					return false;
				battle.startBattle(player, enemy, HP);
				if (player.getHp() <= 0) {// ���a���`
					gameover.setVisible(true);
					close = true;
				}
				getReward(enemy);
				CurrentMap[x][y + 1] = 0; // �]�w
				map5mon20.setImage(new Image("file:image/floor.png")); // �]�w
				return false;
			} else if (CurrentMap[x][y + 1] == 80) { // �]�w
				GameMonster enemy = MonsterList.get(5); // glim�O0//rlim�O1//blim�O2//nwerewolf�O3//nsk�O4//psk�O5//bwizard�O6//bbat�O7//jguard�O8//bigbat�O9//rbat�O10//yknight�O11//rknight�O12
				if (player.getAt() <= enemy.getDefend())
					return false;
				battle.startBattle(player, enemy, HP);
				if (player.getHp() <= 0) {// ���a���`
					gameover.setVisible(true);
					close = true;
				}
				getReward(enemy);
				CurrentMap[x][y + 1] = 0; // �]�w
				map5mon21.setImage(new Image("file:image/floor.png")); // �]�w
				return false;
			}
		} else if (player.getFloor() == 6) {// map6
			if (CurrentMap[x][y + 1] == 0) {
				player.setY(player.getY() + 1);
				CurrentMap[x][y] = 0;
				CurrentMap[x][y + 1] = -1;
			} else if (CurrentMap[x][y + 1] == 1) {
				return false;
			} else if (CurrentMap[x][y + 1] == 3) {
				CurrentMap[x][y] = 0;
				Map[5].setMap(CurrentMap);
				CurrentMap = Map[4].getMap();

				// FXMLLoader loader = new FXMLLoader(getClass().getResource("map5.fxml"));
				// loader.setControllerFactory(Controller -> new Controller());
				// Parent root;
				// try {
				// root = loader.load();
				// scene.setRoot(root);
				// } catch (IOException e) {
				// // TODO Auto-generated catch block
				// e.printStackTrace();
				// }
				// changeMap(scene ,fxmlLoader);
				System.out.println(player.getX() + ", " + player.getY());
				CurrentMap[x][y + 2] = -1;

				player.setFloor(5);
				player.setY(player.getY() + 2);
				buttonImage.setImage(new Image("file:image/down1.png"));
				buttonImage.setTranslateX(buttonImage.getTranslateX() + 44);
				stage1.setImage(new Image("file:image/map5.png"));

				map6Boss.setVisible(false);
				map6Rdoor.setVisible(false);

				map5mon1.setVisible(true);
				map5mon2.setVisible(true);
				map5mon3.setVisible(true);
				map5mon4.setVisible(true);
				map5mon5.setVisible(true);
				map5mon6.setVisible(true);
				map5mon7.setVisible(true);
				map5mon8.setVisible(true);
				map5mon9.setVisible(true);
				map5mon10.setVisible(true);
				map5mon11.setVisible(true);
				map5mon12.setVisible(true);
				map5mon13.setVisible(true);
				map5mon14.setVisible(true);
				map5mon15.setVisible(true);
				map5mon16.setVisible(true);
				map5mon17.setVisible(true);
				map5mon18.setVisible(true);
				map5mon19.setVisible(true);
				map5mon20.setVisible(true);
				map5mon21.setVisible(true);
				map5Ydoor1.setVisible(true);
				map5Ydoor2.setVisible(true);
				map5Ydoor3.setVisible(true);
				map5Ydoor4.setVisible(true);
				map5Bdoor.setVisible(true);
				map5Rdoor.setVisible(true);
				map5Ykey1.setVisible(true);
				map5Ykey2.setVisible(true);
				map5Ykey3.setVisible(true);
				map5Bkey.setVisible(true);
				map5Pkey.setVisible(true);
				map5RHP.setVisible(true);
				map5BHP1.setVisible(true);
				map5BHP2.setVisible(true);
				map5RD1.setVisible(true);
				map5RD2.setVisible(true);
				map5BD1.setVisible(true);
				map5BD2.setVisible(true);
				map5shield.setVisible(true);
				map5cross.setVisible(true);
			}
		}
		System.out.println(player.getX() + " " + player.getY() + "\n");
		return true;
	}
}
