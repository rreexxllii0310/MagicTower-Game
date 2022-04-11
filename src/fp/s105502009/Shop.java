package fp.s105502009;

import javafx.fxml.FXML;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;

public class Shop extends GameObject{
	//private final Controller controller();
	
	@FXML
	private ImageView shop;
	
	@FXML
	public Button shophp, shopat, shopdef, exitshop;

	@FXML
	private ImageView oshop;
	@FXML
	private Button oshoplevel, oshopat, oshopdef, exitoshop;
	
	@FXML
	private ImageView gshop;
	@FXML
	private Button gshopYkey, gshopBkey, gshopRkey, exitgshop;

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
	
	private void initFXML(Scene scene) {
		HP = (Label) scene.lookup("#HP");
		attack = (Label) scene.lookup("#attack");
		defend = (Label) scene.lookup("#defend");
		money = (Label) scene.lookup("#money");
		exp = (Label) scene.lookup("#exp");
		level = (Label) scene.lookup("#level");
		ykey = (Label) scene.lookup("#ykey");
		bkey = (Label) scene.lookup("#bkey");
		rkey = (Label) scene.lookup("#rkey");
    }

	
	//能力商店
	public void abilityShop(Player player, Scene scene) {
		shop = (ImageView) scene.lookup("#shop");
		shophp = (Button) scene.lookup("#shophp");
		shopat = (Button) scene.lookup("#shopat");
		shopdef = (Button) scene.lookup("#shopdef");
		exitshop = (Button) scene.lookup("#exitshop");
		initFXML(scene);
		shophp.setOnAction(event -> {
			if (player.getMoney() >= 25) {
				player.setHp(player.getHp() + 800);
				player.setMoney(player.getMoney() - 25);
				HP.setText(String.valueOf(player.getHp()));
				money.setText(String.valueOf(player.getMoney()));
			}
		});
		shopat.setOnAction(event -> {
			if (player.getMoney() >= 25) {
				player.setMoney(player.getMoney() - 25);
				player.setAt(player.getAt() + 4);
				attack.setText(String.valueOf(player.getAt()));
				money.setText(String.valueOf(player.getMoney()));
			}
		});
		shopdef.setOnAction(event -> {
			if (player.getMoney() >= 25) {
				player.setMoney(player.getMoney() - 25);
				player.setDef(player.getDef() + 4);
				defend.setText(String.valueOf(player.getDef()));
				money.setText(String.valueOf(player.getMoney()));
			}
		});
		exitshop.setOnAction(event -> {
			shop.setVisible(false);
			shophp.setVisible(false);
			shopdef.setVisible(false);
			shopat.setVisible(false);
			exitshop.setVisible(false);
			talk = false;
			talking = false;
		});
	}

	// 等級商店
	public void levelShop(Player player, Scene scene) {
		oshop = (ImageView) scene.lookup("#oshop");
		oshoplevel = (Button) scene.lookup("#oshoplevel");
		oshopat = (Button) scene.lookup("#oshopat");
		oshopdef = (Button) scene.lookup("#oshopdef");
		exitoshop = (Button) scene.lookup("#exitoshop");
		initFXML(scene);
		oshoplevel.setOnAction(event -> {
			if (player.getExp() >= 100) {
				player.setLevel(player.getLevel() + 1);
				player.setHp(player.getHp() + 1000);
				player.setAt(player.getAt() + 8);
				player.setDef(player.getDef() + 8);
				player.setExp(player.getExp() - 100);
				HP.setText(String.valueOf(player.getHp()));
				attack.setText(String.valueOf(player.getAt()));
				defend.setText(String.valueOf(player.getDef()));
				exp.setText(String.valueOf(player.getExp()));
				level.setText(String.valueOf(player.getLevel()));
			}
		});
		oshopat.setOnAction(event -> {
			if (player.getExp() >= 30) {
				player.setAt(player.getAt() + 5);
				player.setExp(player.getExp() - 30);
				attack.setText(String.valueOf(player.getAt()));
				exp.setText(String.valueOf(player.getExp()));
			}
		});
		oshopdef.setOnAction(event -> {
			if (player.getExp() >= 30) {
				player.setDef(player.getDef() + 5);
				player.setExp(player.getExp() - 30);
				defend.setText(String.valueOf(player.getDef()));
				exp.setText(String.valueOf(player.getExp()));
			}
		});
		exitoshop.setOnAction(event -> {
			oshop.setVisible(false);
			oshoplevel.setVisible(false);
			oshopat.setVisible(false);
			oshopdef.setVisible(false);
			exitoshop.setVisible(false);
			talk = false;
			talking = false;
		});
	}

	// 鑰匙商店
	public void keyShop(Player player, Scene scene) {
		gshop = (ImageView) scene.lookup("#gshop");
		gshopYkey = (Button) scene.lookup("#gshopYkey");
		gshopBkey = (Button) scene.lookup("#gshopBkey");
		gshopRkey = (Button) scene.lookup("#gshopRkey");
		exitgshop = (Button) scene.lookup("#exitgshop");
		initFXML(scene);
		gshopYkey.setOnAction(event -> {
			if (player.getMoney() >= 10) {
				player.setYkey(player.getYkey() + 1);
				player.setMoney(player.getMoney() - 10);
				ykey.setText(String.valueOf(player.getYkey()));
				money.setText(String.valueOf(player.getMoney()));
			}
		});
		gshopBkey.setOnAction(event -> {
			if (player.getMoney() >= 50) {
				player.setBkey(player.getBkey() + 1);
				player.setMoney(player.getMoney() - 50);
				bkey.setText(String.valueOf(player.getBkey()));
				money.setText(String.valueOf(player.getMoney()));
			}
		});
		gshopRkey.setOnAction(event -> {
			if (player.getMoney() >= 100) {
				player.setRkey(player.getRkey() + 1);
				player.setMoney(player.getMoney() - 100);
				rkey.setText(String.valueOf(player.getRkey()));
				money.setText(String.valueOf(player.getMoney()));
			}
		});
		exitgshop.setOnAction(event -> {
			gshop.setVisible(false);
			gshopYkey.setVisible(false);
			gshopBkey.setVisible(false);
			gshopRkey.setVisible(false);
			exitgshop.setVisible(false);
			talk = false;
			talking = false;
		});
	}
}
