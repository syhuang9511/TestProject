class Order {
    private String name;
    private int ram;
    private int lcd;

    Order(String name, int ram, int lcd) throws Check {
        if (ram >= 0 && lcd >= 0) {
            this.name = name;
            this.ram = ram;
            this.lcd = lcd;
        } else {
            // throw new Exception();
            throw new Check("新增ram與lcd");

            // 執行Exception

            // Exception e=new Exception();
            // throw e;
            /*
             * try
             * {
             * throw new Exception();
             * }
             * catch(Exception e)
             * {
             * 
             * }
             */

        }

    }

    void setRam(int ram) throws Check {
        if (ram >= 0) {
            this.ram = ram;
        } else {
            // throw new Exception();
            throw new Check("修改ram需>=0");
        }

    }

    void setLcd(int lcd) {
        this.lcd = lcd;
    }

    void show() {
        System.out.println("名:" + name + "\tram:" + ram + "\tlcd:" + lcd);
    }

}