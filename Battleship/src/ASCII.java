public class ASCII {
    public static void main(String[] args) {

    }

    public static void defaultChoice() {
        System.out.print("""
                    ⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡿⠿⠿⠿⠿⢿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿ ████████╗██╗  ██╗ █████╗ ████████╗███████╗    ███╗   ██╗ ██████╗ ████████╗
                    ⣿⣿⣿⣿⣿⣿⣿⣿⠟⠋⠁⠀⠀⠀⠀⠀⠀⠀⠀⠉⠻⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿ ╚══██╔══╝██║  ██║██╔══██╗╚══██╔══╝██╔════╝    ████╗  ██║██╔═══██╗╚══██╔══╝
                    ⣿⣿⣿⣿⣿⣿⣿⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢺⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿    ██║   ███████║███████║   ██║   ███████╗    ██╔██╗ ██║██║   ██║   ██║
                    ⣿⣿⣿⣿⣿⣿⣿⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠆⠜⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿    ██║   ██╔══██║██╔══██║   ██║   ╚════██║    ██║╚██╗██║██║   ██║   ██║
                    ⣿⣿⣿⣿⠿⠿⠛⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠉⠻⣿⣿⣿⣿⣿    ██║   ██║  ██║██║  ██║   ██║   ███████║    ██║ ╚████║╚██████╔╝   ██║
                    ⣿⣿⡏⠁⠀⠀⠀⠀⠀⣀⣠⣤⣤⣶⣶⣶⣶⣶⣦⣤⡄⠀⠀⠀⠀⢀⣴⣿⣿⣿⣿⣿    ╚═╝   ╚═╝  ╚═╝╚═╝  ╚═╝   ╚═╝   ╚══════╝    ╚═╝  ╚═══╝ ╚═════╝    ╚═╝
                    ⣿⣿⣷⣄⠀⠀⠀⢠⣾⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⢿⡧⠇⢀⣤⣶⣿⣿⣿⣿⣿⣿⣿  █████╗ ███╗   ██╗     ██████╗ ██████╗ ████████╗██╗ ██████╗ ███╗   ██╗
                    ⣿⣿⣿⣿⣿⣿⣾⣮⣭⣿⡻⣽⣒⠀⣤⣜⣭⠐⢐⣒⠢⢰⢸⣿⣿⣿⣿⣿⣿⣿⣿⣿  ██╔══██╗████╗  ██║    ██╔═══██╗██╔══██╗╚══██╔══╝██║██╔═══██╗████╗  ██║
                    ⣿⣿⣿⣿⣿⣿⣿⣏⣿⣿⣿⣿⣿⣿⡟⣾⣿⠂⢈⢿⣷⣞⣸⣿⣿⣿⣿⣿⣿⣿⣿⣿  ███████║██╔██╗ ██║    ██║   ██║██████╔╝   ██║   ██║██║   ██║██╔██╗ ██║
                    ⣿⣿⣿⣿⣿⣿⣿⣿⣽⣿⣿⣷⣶⣾⡿⠿⣿⠗⠈⢻⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿  ██╔══██║██║╚██╗██║    ██║   ██║██╔═══╝    ██║   ██║██║   ██║██║╚██╗██║
                    ⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡿⠻⠋⠉⠑⠀⠀⢘⢻⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿  ██║  ██║██║ ╚████║    ╚██████╔╝██║        ██║   ██║╚██████╔╝██║ ╚████║
                    ⣿⣿⣿⣿⣿⣿⣿⡿⠟⢹⣿⣿⡇⢀⣶⣶⠴⠶⠀⠀⢽⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿  ╚═╝  ╚═╝╚═╝  ╚═══╝     ╚═════╝ ╚═╝        ╚═╝   ╚═╝ ╚═════╝ ╚═╝  ╚═══╝
                    ⣿⣿⣿⣿⣿⣿⡿⠀⠀⢸⣿⣿⠀⠀⠣⠀⠀⠀⠀⠀⡟⢿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿  ██╗    ██╗ █████╗ ██╗  ████████╗ █████╗
                    ⣿⣿⣿⡿⠟⠋⠀⠀⠀⠀⠹⣿⣧⣀⠀⠀⠀⠀⡀⣴⠁⢘⡙⢿⣿⣿⣿⣿⣿⣿⣿⣿  ██║    ██║██╔══██╗██║  ╚══██╔══╝██╔══██╗
                    ⠉⠉⠁⠀⠀⠀⠀⠀⠀⠀⠀⠈⠙⢿⠗⠂⠄⠀⣴⡟⠀⠀⡃⠀⠉⠉⠟⡿⣿⣿⣿⣿  ██║ █╗ ██║███████║██║     ██║   ███████║
                    ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢷⠾⠛⠂⢹⠀⠀⠀⢡⠀⠀⠀⠀⠀⠙⠛⠿⢿  ██║███╗██║██╔══██║██║     ██║   ██╔══██║
                                                                   ╚███╔███╔╝██║  ██║███████╗██║   ██║  ██║
                             𝗣𝗥𝗘𝗦𝗦 (𝗫) 𝗧𝗢 𝗥𝗘𝗧𝗨𝗥𝗡               ╚══╝╚══╝ ╚═╝  ╚═╝╚══════╝╚═╝   ╚═╝  ╚═╝
                    """);
    }
    public static void showHelpMenu(){
        System.out.print("""
                    ╟►────────────────────────────◄═══════════[[████]]══════════►─────────────────────────────◄╣
                                                   𝖂𝖊𝖑𝖈𝖔𝖒𝖊 𝖙𝖔 𝕭𝖆𝖙𝖙𝖑𝖊𝖘𝖍𝖎𝖕 🌍
                    
                                     The goal of the game is to sink your opponent's fleet of ships
                                         by guessing the coordinates of their ships on a grid.
                                           Each player has their own 10x10 grid, and ships
                                            are placed either horizontally or vertically
                                              on the grid. The opponent will also place
                                          their ships on their own grid, which you can't see.
                                      The player who sinks all of the opponent's ships first wins!
                                 [ Each player has a energy value that allows for special moves. 📢 ]
                    
                         «[𝗛𝗲𝗿𝗲 𝗮𝗿𝗲 𝘁𝗵𝗲 𝗸𝗲𝘆 𝗰𝗼𝗺𝗺𝗮𝗻𝗱𝘀 𝘆𝗼𝘂 𝗰𝗮𝗻 𝘂𝘀𝗲 𝗱𝘂𝗿𝗶𝗻𝗴 𝘁𝗵𝗲 𝗴𝗮𝗺𝗲]»
                             ■ 𝗦𝗣𝗘𝗖𝗜𝗔𝗟 𝗔𝗕𝗜𝗟𝗜𝗧𝗜𝗘𝗦 (𝗦): Use this command to activate any special abilities
                        your ship might have, such as enhanced attacks/defensive shields/mines.
                             ■ 𝗔𝗧𝗧𝗔𝗖𝗞 (𝗖): Use this command to select a coordinate (example, "A1" or "F4")
                        and launch an attack at that location on your opponent's grid. If you hit one of
                        their ships, they will take damage.
                             ■ 𝗙𝗢𝗥𝗙𝗘𝗜𝗧 (𝗫): If you wish to give up/leave , use this command to forfeit.
                        Be warned, this means you lose the game!
                             ■ 𝗟𝗔𝗡𝗚𝗨𝗔𝗚𝗘 (𝗟): Use this to change the language of the game interface.
                        You can choose between various language options to suit your preferences.
                             ■ 𝗛𝗘𝗟𝗣 (𝗛): This command will bring you to this help page, where you can
                         learn more about how to play and use the game commands.
                    
                          «[𝗔𝗱𝗱𝗶𝘁𝗶𝗼𝗻𝗮𝗹 𝗧𝗶𝗽𝘀]»
                        ■ When attacking, be sure to keep track of the coordinates you've already guessed.
                        ■ Ships come in different sizes, and each ship takes multiple hits to be destroyed.
                        ■ The game ends when one player sinks all of the opponent's ships, or if one forfeits.
                        ■ 🔋 = Energy
                    
                                                   Enjoy the game, and good luck!
                                                      𝗣𝗥𝗘𝗦𝗦 (𝗫) 𝗧𝗢 𝗥𝗘𝗧𝗨𝗥𝗡
                    ╟►────────────────────────────◄═══════════[[████]]══════════►─────────────────────────────◄╣
                    """);
    }

    public static void thanksForPlaying() {
        System.out.println("""
                ████████╗██╗  ██╗ █████╗ ███╗   ██╗██╗  ██╗    ██╗   ██╗ ██████╗ ██╗   ██╗    ███████╗ ██████╗ ██████╗     ██████╗ ██╗      █████╗ ██╗   ██╗██╗███╗   ██╗ ██████╗ ██╗
                ╚══██╔══╝██║  ██║██╔══██╗████╗  ██║██║ ██╔╝    ╚██╗ ██╔╝██╔═══██╗██║   ██║    ██╔════╝██╔═══██╗██╔══██╗    ██╔══██╗██║     ██╔══██╗╚██╗ ██╔╝██║████╗  ██║██╔════╝ ██║
                   ██║   ███████║███████║██╔██╗ ██║█████╔╝      ╚████╔╝ ██║   ██║██║   ██║    █████╗  ██║   ██║██████╔╝    ██████╔╝██║     ███████║ ╚████╔╝ ██║██╔██╗ ██║██║  ███╗██║
                   ██║   ██╔══██║██╔══██║██║╚██╗██║██╔═██╗       ╚██╔╝  ██║   ██║██║   ██║    ██╔══╝  ██║   ██║██╔══██╗    ██╔═══╝ ██║     ██╔══██║  ╚██╔╝  ██║██║╚██╗██║██║   ██║╚═╝
                   ██║   ██║  ██║██║  ██║██║ ╚████║██║  ██╗       ██║   ╚██████╔╝╚██████╔╝    ██║     ╚██████╔╝██║  ██║    ██║     ███████╗██║  ██║   ██║   ██║██║ ╚████║╚██████╔╝██╗
                   ╚═╝   ╚═╝  ╚═╝╚═╝  ╚═╝╚═╝  ╚═══╝╚═╝  ╚═╝       ╚═╝    ╚═════╝  ╚═════╝     ╚═╝      ╚═════╝ ╚═╝  ╚═╝    ╚═╝     ╚══════╝╚═╝  ╚═╝   ╚═╝   ╚═╝╚═╝  ╚═══╝ ╚═════╝ ╚═╝
                """);
    }

    public static void generateBoard() {
        int[][] board = new int[10][10];
        String letters = "ABCDEFGHIJ";

        for (int column = 0; column < board[0].length; column++) {
            System.out.print("      "+ letters.charAt(column)+"  ");
        }
        System.out.println();

        for (int row = 0; row < board.length; row++) {
            for (int column = 0; column < board[row].length; column++) {
                if (column == 0) {
                    System.out.print("   ┌─────┐");
                } else {
                    System.out.print("  ┌─────┐");
                }
            }
            System.out.println();
            for (int column = 0; column < board[row].length; column++) {
                if (row == 9 && column == 0) {
                    System.out.print((row+1)+" │     │");
                } else if (row < 9 && column == 0){
                    System.out.print((row+1)+"  │     │");
                } else {
                    System.out.print("  │     │");
                }
            }
            System.out.println();
            for (int column = 0; column < board[row].length; column++) {
                if (column == 0) {
                    System.out.print("   └─────┘");
                } else {
                    System.out.print("  └─────┘");
                }
            }
            System.out.println();
        }
    }

    public static void menus(int choice) {
        switch (choice) {
            case 1:
                System.out.print("""
                    ╟►────────────────────────◄═══════════[[██] MENU [██]]══════════►─────────────────────────◄╣
                    SPECIAL ABILITY - (S)
                    NORMAL ATTACK - (A)
                    FORFEIT - (F)
                    [Type 'h' for help]
                    ╟►────────────────────────────◄═══════════[[████]]══════════►─────────────────────────────◄╣
                    """);
                break;
            case 2:
                System.out.print("""
                    ╟►────────────────────────◄═══════════[[██] MENU [██]]══════════►─────────────────────────◄╣
                    LINE DESTROYER - (L)                                                                  [8 🔋]
                    SHIELD - (S)                                                                          [2 🔋]
                    MINE - (M)                                                                            [1 🔋]
                    STRONGER ATTACK (A)                                                                   [3 🔋]
                    [Type 'h' for help]
                                                     𝗣𝗥𝗘𝗦𝗦 (𝗫) 𝗧𝗢 𝗥𝗘𝗧𝗨𝗥𝗡
                    ╟►────────────────────────────◄═══════════[[████]]══════════►─────────────────────────────◄╣
                    """);
                break;
            case 3:
                System.out.print("""
                    ╟►────────────────────────◄═══════════[[██] MENU [██]]══════════►─────────────────────────◄╣
                    PLAY - (P)
                    EXIT - (X)
                    LANGUAGE - (L)
                    [Type 'h' for help]
                    ╟►────────────────────────────◄═══════════[[████]]══════════►─────────────────────────────◄╣
                    """);
                break;
            case 4:
                System.out.print("""
                    ╟►──────────────────◄═══════════[[██] SPECIAL ABILITIES [██]]══════════►──────────────────◄╣
                        ■ 𝗦𝗵𝗶𝗲𝗹𝗱: 2x2 on the board, if hit, breaks the square but does not hit ship.
                        Can only be placed once per square.
                        ■ 𝗟𝗶𝗻𝗲 𝗕𝗿𝗲𝗮𝗸𝗲𝗿: Player chooses a line (horizontal or vertical) to destroy.
                        Ships hit will count.
                        ■ 𝗦𝘁𝗿𝗼𝗻𝗴𝗲𝗿 𝗔𝘁𝘁𝗮𝗰𝗸: 2x2 attack on the board.
                        ■ 𝗠𝗶𝗻𝗲: Places an invisible mine in opponent's field. If hit, [-1] energy to opponent.
                    ╟►──────────────────◄═══════════[[𝗣𝗥𝗘𝗦𝗦 (𝗫) 𝗧𝗢 𝗥𝗘𝗧𝗨𝗥𝗡]]══════════►──────────────────◄╣
                    """);
                break;
        }
    }

    public static void showShips(int choice) {
        switch (choice) {
            case 1:
                System.out.println("""
                         OPTIONS:            [1]   [2]  [3]   [4]
                                                    ██
                        ┌────┬────┬────┐            ██   ██
                        │ ██ │ ██ │ ██ │  ██ ██ ██  ██   ██  ██ ██ ██
                        └────┴────┴────┘                 ██
                        """);
                break;
            case 2:
                System.out.println("""
                         ┌────┬────┐              OPTIONS:
                         │ ██ │ ██ │   [1]      [2]      [3]     [4]
                         └────┼────│  ██ ██  ██        ██ ██
                              │ ██ │     ██  ██ ██ ██     ██  ██ ██ ██
                              │────│     ██               ██        ██
                              │ ██ │
                              └────┘
                        """);
                break;
            case 3:
                System.out.println("""
                         OPTIONS:                  [1]     [2]  [3]    [4]
                                                            ██
                                                            ██
                        ┌────┬────┬────┬────┐               ██
                        │ ██ │ ██ │ ██ │ ██ │  ██ ██ ██ ██  ██  ██  ██ ██ ██ ██
                        └────┴────┴────┴────┘                   ██
                                                                ██
                                                                ██
                        """);
                break;
            case 4:
                System.out.println("""
                         OPTIONS:     [1]  [2] [3]  [4]
                        ┌────┬────┐         ██
                        │ ██ │ ██ │  ██ ██  ██  ██  ██ ██
                        └────┴────┘             ██
                        """);
                break;
            case 5:
                System.out.println("""
                        ┌────┐
                        │ ██ │
                        └────┘
                        """);
                break;
            case 6:
                System.out.println("""
                                                        OPTIONS:
                         ┌────┬────┐        [1]       [2]     [3]      [4]
                         │ ██ │ ██ │       ██ ██        ██     ██ ██  ██
                         └────┼────┼────┐     ██ ██  ██ ██  ██ ██     ██ ██
                              │ ██ │ ██ │            ██                  ██
                              └────┴────┘
                        """);
                break;
        }
    }

}
