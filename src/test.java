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
        System.out.println(123);

    }

}

