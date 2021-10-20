import java.util.Scanner;

public class test3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
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
        String quitt = " ";
        do {
            System.out.println("Сделайте ход, ваша сторона - X");
            int x, y;
            boolean flag = false;
            String line;
            do {
                line = scanner.nextLine();
                if (line.substring(0, 1).matches("[-+]?\\d+") == false ||
                        line.substring(2, 3).matches("[-+]?\\d+") == false) {
                    System.out.println("Ты должен вводить только числа!");
                    flag = true;
                    continue;
                }
                x = Integer.parseInt(line.substring(0, 1));
                y = Integer.parseInt(line.substring(2, 3));
                if ((x > 0 && x < 4) && (y > 0 && y < 4)) {
                    if (toArray[x - 1][y - 1] != emptyCell) {
                        System.out.println("Эта клетка занята! Выберите другую!");
                        flag = true;
                        continue;
                    } else {
                        toArray[x - 1][y - 1] = 'X';
                    }
                } else {
                    System.out.println("Координаты должны быть от одного до трёх!");
                    flag = true;
                    continue;
                }
            } while (flag);
            boolean free_cells = false;
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    if (toArray[i][j] == emptyCell) {
                        free_cells = true;
                    }
                }
            }
            String win = "";
            if (toArray[0][0] == toArray[1][1] && toArray[0][0] == toArray[2][2] && toArray[0][0] != emptyCell) {
                win = win + toArray[0][0];
                System.out.println("1");
            }
            if (toArray[0][2] == toArray[1][1] && toArray[1][1] == toArray[2][0] && toArray[0][2] != emptyCell) {
                win = win + toArray[0][0];
                System.out.println("4");
            }
            for (int i = 0; i < 3; i++) {
                if (toArray[0][i] == toArray[1][i] && toArray[2][i] == toArray[0][i] && toArray[0][i] != emptyCell) {
                    win = win + toArray[0][i];
                    System.out.println("5");
                }
                if (toArray[i][0] == toArray[i][1] && toArray[i][2] == toArray[i][0] && toArray[i][0] != emptyCell) {
                    win = win + toArray[i][0];
                    System.out.println("6");
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
            int e_x, e_y;
            e_x = 1 + (int) (Math.random() * 3);
            e_y = 1 + (int) (Math.random() * 3);
            while (toArray[e_x-1][e_y-1] != emptyCell) {
                e_x = 1 + (int) (Math.random() * 3);
                e_y = 1 + (int) (Math.random() * 3);
            }
            toArray[e_x - 1][e_y - 1] = 'O';
            System.out.println("---------");
            for (int i = 0; i < 3; i++) {
                System.out.print("| " + toArray[i][0]);
                System.out.print(" " + toArray[i][1]);
                System.out.println(" " + toArray[i][2] + " |");
            }
            System.out.println("---------");
            free_cells = false;
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    if (toArray[i][j] == emptyCell) {
                        free_cells = true;
                    }
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
        } while (quitt == " ");
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



