package utils;

import java.awt.*;

public class Constants {
    public static final int SIZE_GAME = 3;
    public static final int REAL_SIZE = SIZE_GAME * SIZE_GAME;
    public static final int MIN_RANDOM = 0;
    public static final int MAX_RANDOM = 80;
    public static final int EASY=5;
    public static final int MEDIUM=6;
    public static final int DIFFICULT=7;
    public static final Font FONT_BOARD_GAME = new Font("TimesRoman", Font.PLAIN, 25);
    public static final Font FONT_OVER_GAME = new Font("TimesRoman", Font.BOLD, 50);
    public static final Font FONT_BUTTON = new Font("TimesRoman", Font.BOLD, 20);
    public static final int CONTINUE=0;
    public static final int BOTTOM_GAP=30;
    public static final String MESSAGE_WIN="WINNER";
    public static final String MESSAGE_LOSE="LOSER";
    public static final String[] MENU_OPTIONS={"EASY","MEDIUM","DIFFICULT","CONTINUE","HELP","RANKS","EXIT"};
    public static final String[] OVER_OPTIONS={"CONTINUE","SAVE","MENU"};
    public static final int[] time ={15,240,300};
    public static final String MENU="MENU";
    public static final String OVER_GAME="OVER_GAME";
    public static final String CHOOSE_LEVEL="CHOOSE_LEVEL";
    public static final String SODOKU="SODOKU";
    public static final String HELP = "HELP";
    public static final String SAVE_GAME = "SAVE_GAME";
    public static final String RANK = "RANK";
    public static final String AC_SAVE = "SAVE";
    public static final int STATUS_WIN = 1;
    public static final int STATUS_LOSE = 0;
    public static final Color COLOR_DEFAULT = Color.RED;
    public static final Dimension DIMENSION_DEFAULT=new Dimension(500,500);
}
