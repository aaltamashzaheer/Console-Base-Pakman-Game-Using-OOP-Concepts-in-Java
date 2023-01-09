public class Table {

    Pakman p;
    char[][] bound = new char[18][28];

    public void setTable() {


        for (int i = 0; i < 18; i++) {
            for (int j = 0; j < 28; j++) {
                if (i == 0 || i == 17 || j == 0 || j == 27) //i statements for top and bottom border
// j statements for left and right border
                {
                    bound[i][j] = '#'; //outer wall
                }
//Inner walls
                else if (i == 2 && j > 2 && j < 22) //third row
                {
                    bound[i][j] = '#'; //hurdles in the Table
                } else if (i == 3 && j == 3) {
                    bound[i][j] = '#';
                } else if (i == 4 && j == 3) {
                    bound[i][j] = '#';
                } else if (i == 5 && j == 3) {
                    bound[i][j] = '#';
                } else if (i == 6 && j == 3) {
                    bound[i][j] = '#';
                } else if (i == 7 && j == 3) {
                    bound[i][j] = '#';
                } else if (i == 8 && j == 3) {
                    bound[i][j] = '#';
                } else if (i > 3 && i < 5 && j == 21) {
                    bound[i][j] = '#';
                } else if (i == 10 && j > 7 && j < 11) {
                    bound[i][j] = '#';
                } else if (i == 11 && j == 8) {
                    bound[i][j] = '#';
                } else if (i == 12 && j == 8) {
                    bound[i][j] = '#';
                } else if (i == 12 && j > 8 && j < 13) {
                    bound[i][j] = '#';
                } else if (i == 5 && j > 7 && j < 19) {
                    bound[i][j] = '#';
                } else if (i > 5 && i < 9 && j == 18) {
                    bound[i][j] = '#';
                } else if (i == 9 && j == 14) {
                    bound[i][j] = '#';
                } else if (i > 9 && i < 12 && j == 16) {
                    bound[i][j] = '#';
                } else if (i > 3 && i < 7 && j == 6) {
                    bound[i][j] = '#';
                } else if (i > 4 && i < 12 && j == 22) {
                    bound[i][j] = '#';
                } else if (i == 11 && j > 1 && j < 4) {
                    bound[i][j] = '#';
                } else if (i == 6 && j > 4 && j < 20) //third row
                {
                    bound[i][j] = '#';
                } else if (i == 13 && j > 15 && j < 23) //third row
                {
                    bound[i][j] = '#';
                } else if (i == 8 && j > 6 && j < 10) //third row
                {
                    bound[i][j] = '#';
                } else if (i > 8 && i < 13 && j == 20) {
                    bound[i][j] = '#';
                } else if (i > 8 && i < 12 && j == 5) {
                    bound[i][j] = '#';
                } else if (i == 15 && j > 3 && j < 23) //third row
                {
                    bound[i][j] = '#';
                } else if (i > 2 && i < 16 && j == 25) {
                    bound[i][j] = '#';
                } else // Food
                {
                    bound[i][j] = '.'; //food for pacman
                }
            }

        }

    }

    public void draw() {
        for (int i = 0; i < 18; i++) {
            for (int j = 0; j < 28; j++) {
                System.out.print(bound[i][j] + " ");

            }
            System.out.println();
        }
    }
}