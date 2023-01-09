public class Play {
    int score;

    public boolean GameFinish(boolean temp, Table m) {
        for (int i = 0; i < 18; i++) {
            for (int j = 0; j < 28; j++) {
                if (m.bound[i][j] != ' ' || m.bound[i][j] != '#') {
                    return temp;
                }

            }
        }
        temp = false;
        return temp;
    }

    public void play() {

        Enemy g1 = new Enemy(26, 1);
        Enemy g2 = new Enemy(26, 2);
        Pakman p = new Pakman();
        char place = '.';
        char place2 = '.';

        Table m = new Table();
        m.setTable();
        m.bound[p.PP.y][p.PP.x] = 'P';
        m.bound[g1.PE.y][g1.PE.x] = 'G';
        m.bound[g2.PE.y][g2.PE.x] = 'G';
        m.draw();
        boolean temp = true;
        while (temp) {

            this.GameFinish(temp, m);
//                if (m.bound[18][28]=='.'){
//
//                    score++;
//                }
            m.bound[p.PP.y][p.PP.x] = 'P';
            m.bound[g1.PE.y][g1.PE.x] = 'G';
            m.bound[g2.PE.y][g2.PE.x] = 'G';
            m.draw();
            if (p.PP.distP(g1.PE) == 0 || p.PP.distP(g2.PE) == 0) {
                System.out.println("Enemy ate PacMan. You lose.");
                System.exit(0);

            }

            m.bound[p.PP.y][p.PP.x] = ' ';
            m.bound[g1.PE.y][g1.PE.x] = place;
            m.bound[g2.PE.y][g2.PE.x] = place2;
            p.move();


            if (m.bound[p.PP.y][p.PP.x] == '#') {
                System.out.println("can't move there it's a wall");
                p.reverse();
            } else {
                m.bound[p.PP.y][p.PP.x] = 'P';
            }
            g1.move();
            if (m.bound[g1.PE.y][g1.PE.x] == '#') {
                g1.reverse();
            } else if ((m.bound[g1.PE.y][g1.PE.x] == ' ')) {
                place = ' ';
                m.bound[g1.PE.y][g1.PE.x] = 'G';
            } else if (m.bound[g1.PE.y][g1.PE.x] == '.') {
                place = '.';
                m.bound[g1.PE.y][g1.PE.x] = 'G';
            }

            g2.move();
            if (m.bound[g2.PE.y][g2.PE.x] == '#') {
                g2.reverse();
            } else if ((m.bound[g2.PE.y][g2.PE.x] == ' ')) {
                place2 = ' ';
                m.bound[g2.PE.y][g2.PE.x] = 'G';
            } else if (m.bound[g2.PE.y][g2.PE.x] == '.') {
                place2 = '.';
                m.bound[g2.PE.y][g2.PE.x] = 'G';
            }


        }
    }


}