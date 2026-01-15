class Ex3 {
    public static void main(String[] args) throws Check {
        Order[] o = new Order[3];
        o[0] = new Order("a1", 4, 5);// new Check()
        o[1] = new Order("d2", 7, 7);
        o[2] = new Order("f", 5, 5);

        for (Order u : o) {
            u.show();
        }
        System.out.println("===================");
        o[1].setRam(5);// new Check()

        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.println("輸入要修改的Lcd數量");
        int lcd = sc.nextInt();

        assert lcd >= 0 : "lcd>=0";
        o[1].setLcd(lcd);

        for (int i = 0; i < o.length; i++) {
            o[i].show();
        }

        System.out.println("finally");

        /*
         * Order[] o=new Order[3];
         * try
         * {
         * o[0]=new Order("a1",4,5);//new Check()
         * o[1]=new Order("d2",7,7);
         * o[2]=new Order("f",5,5);
         * 
         * 
         * 
         * 
         * for(Order u:o)
         * {
         * u.show();
         * }
         * System.out.println("===================");
         * o[1].setRam(-5);//new Check()
         * 
         * for(int i=0;i<o.length;i++)
         * {
         * o[i].show();
         * }
         * }
         * catch(Check e)
         * {
         * System.out.println("新增ram與lcd數量需>=0");
         * e.printStackTrace();
         * }
         * finally
         * {
         * System.out.println("finally");
         * }
         * 
         */

        /*
         * Order o=new Order("a",1,2);
         * o.show();
         * o.setRam(10);
         * o.setLcd(5);
         * o.show();
         */
    }
}