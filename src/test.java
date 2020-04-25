/**
 * @Description:
 * @Author: DongHang
 * @Date: 2020-04-25 10:06
 * @Content:
 */
public class test {
    public enum PizzaStatus {
        /**
        order
        */
        ORDERED("order", 1),
        /**
         ready
         */
        READY("ready", 2),
        /**
         delivered
         */
        DELIVERED("delivered", 3);
        private String name;
        private int index;
        private PizzaStatus(String name, int index){
            this.index = index;
            this.name = name;
        }
        public String getName() {
            return name;
        }
        public void setName(String name) {
            this.name = name;
        }
        public int getIndex() {
            return index;
        }
        public void setIndex(int index) {
            this.index = index;
        }
        public static String getName(int index) {
            System.out.println(PizzaStatus.values());
            for (PizzaStatus c : PizzaStatus.values()) {
                if (c.getIndex() == index) {
                    return c.name;
                }
            }
            return null;
        }
    }


    public static void main(String[] args) {
        int n = 12; //1100 12
        System.out.println(n);
        n |= n>>>1;//1110 14
        System.out.println(n);
        n |= n>>>2;//1111 15
        System.out.println(n);
        n |= n>>>4;
        System.out.println(n);
        int a = 5%2;
        int b = 5&(2-1); //101 & 001
        System.out.println(a);
        System.out.println(b);
    }

}

