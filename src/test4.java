import java.util.Scanner;

public class test4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String quitt = "";
        boolean free_cells = false;
        int b = 0;
        int a = 0;
        int c = 0;
        int d = 0;


        char emptyCell = ' ';
        char[][] toArray = new char[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                toArray[i][j] = emptyCell;
            }
        }



            System.out.println("---------");


            for (int i = 0; i < 3; i++) {
                System.out.print("| " + toArray[i][0]);
                System.out.print(" " + toArray[i][1]);
                System.out.println(" " + toArray[i][2] + " |");
            }

            System.out.println("---------");

            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    toArray[i][j] = emptyCell;
                }
            }

            System.out.println("введите место X от 1 до 3:");
            b = in.nextInt() - 1;
            System.out.println("введите место x от 1 до 3:");
            a = in.nextInt() - 1;
            toArray[a][b] = 'x';

            System.out.println("\n" + "\n");


            System.out.println("введите место 0 от 1 до 3:");
            c = in.nextInt() - 1;
            System.out.println("введите место 0 от 1 до 3:");
            d = in.nextInt() - 1;
            toArray[c][d] = '0';

            System.out.println("---------");


            for (int i = 0; i < 3; i++) {
                System.out.print("| " + toArray[i][0]);
                System.out.print(" " + toArray[i][1]);
                System.out.println(" " + toArray[i][2] + " |");
            }

            System.out.println("---------");


        String win = "";
            if (toArray[0][0] == toArray[1][1] && toArray[0][0] == toArray[2][2] && toArray[0][0] != emptyCell) {
                win = win + toArray[0][0];
                System.out.println("1");
            }
            if (toArray[0][2] == toArray[1][1] && toArray[1][1] == toArray[2][0] && toArray[0][2] != emptyCell) {
                win = win + toArray[0][0];
                System.out.println("4");
            }
            for (int i1 = 0; i1 < 3; i1++) {
                if (toArray[0][i1] == toArray[1][i1] && toArray[2][i1] == toArray[0][i1] && toArray[0][i1] != emptyCell) {
                    win = win + toArray[0][i1];
                    System.out.println("5");
                }
                if (toArray[i1][0] == toArray[i1][1] && toArray[i1][2] == toArray[i1][0] && toArray[i1][0] != emptyCell) {
                    win = win + toArray[i1][0];
                    System.out.println("6");
                }

                if (win.length() == 1) {
                    quitt = win;
                    continue;
                }
                if (win.length() == 0) {
                    if (free_cells == false) {
                        quitt = "!";
                        continue;
                    }


                }

                win = "";
                if (toArray[0][0] == toArray[1][1] && toArray[0][0] == toArray[2][2] && toArray[0][0] != emptyCell) {
                    win = win + toArray[0][0];
                    System.out.println("0");
                }
                if (toArray[0][2] == toArray[1][1] && toArray[1][1] == toArray[2][0] && toArray[0][2] != emptyCell) {
                    win = win + toArray[0][0];
                    System.out.println("1");
                }
                for (int i = 0; i < 3; i++) {
                    if (toArray[0][i] == toArray[1][i] && toArray[2][i] == toArray[0][i] && toArray[0][i] != emptyCell) {
                        win = win + toArray[0][i];
                        System.out.println("3");
                    }
                    if (toArray[i][0] == toArray[i][1] && toArray[i][2] == toArray[i][0] && toArray[i][0] != emptyCell) {
                        win = win + toArray[i][0];
                        System.out.println("4");
                    }
                }
                if (win.length() == 1) {
                    quitt = win;
                    continue;
                }
                if (win.length() == 0) {
                    if (free_cells == false) {
                        quitt = "!";
                        continue;
                    }
                }


            }




        System.out.println("введите место X от 1 до 3:");
        b = in.nextInt() - 1;
        System.out.println("введите место x от 1 до 3:");
        a = in.nextInt() - 1;
        toArray[a][b] = 'x';

        System.out.println("\n" + "\n");


        System.out.println("введите место 0 от 1 до 3:");
        c = in.nextInt() - 1;
        System.out.println("введите место 0 от 1 до 3:");
        d = in.nextInt() - 1;
        toArray[c][d] = '0';

        System.out.println("---------");


        for (int i = 0; i < 3; i++) {
            System.out.print("| " + toArray[i][0]);
            System.out.print(" " + toArray[i][1]);
            System.out.println(" " + toArray[i][2] + " |");
        }

        System.out.println("---------");



        System.out.println("введите место X от 1 до 3:");
        b = in.nextInt() - 1;
        System.out.println("введите место x от 1 до 3:");
        a = in.nextInt() - 1;
        toArray[a][b] = 'x';

        System.out.println("\n" + "\n");


        System.out.println("введите место 0 от 1 до 3:");
        c = in.nextInt() - 1;
        System.out.println("введите место 0 от 1 до 3:");
        d = in.nextInt() - 1;
        toArray[c][d] = '0';

        System.out.println("---------");


        for (int i = 0; i < 3; i++) {
            System.out.print("| " + toArray[i][0]);
            System.out.print(" " + toArray[i][1]);
            System.out.println(" " + toArray[i][2] + " |");
        }

        System.out.println("---------");




            while (quitt == " ") ;
            switch (quitt) {
                case "X":
                    System.out.println("Победил X!");
                    break;
                case "O":
                    System.out.println("Победил O!");
                    break;
                default:
                    System.out.println("Ничья!");

            }

    }
}






