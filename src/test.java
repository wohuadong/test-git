import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

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

    public static void getCap(List list){
        try {
            Class<?> clazz = Class.forName("java.util.ArrayList");
            Field elementData = clazz.getDeclaredField("elementData");
            elementData.setAccessible(true);
            Object[] array = (Object[])elementData.get(list);
            System.out.println(array.length);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<Integer>();

        getCap(arrayList);
        System.out.printf("Before add:arrayList.size() = %d\n",arrayList.size());

        arrayList.add(1);
        arrayList.add(3);
        arrayList.add(5);
        arrayList.add(7);
        arrayList.add(9);
        arrayList.add(1);
        arrayList.add(1);
        arrayList.add(3);
        arrayList.add(5);
        getCap(arrayList);
        System.out.printf("After add:arrayList.size() = %d\n",arrayList.size());
    }

}

