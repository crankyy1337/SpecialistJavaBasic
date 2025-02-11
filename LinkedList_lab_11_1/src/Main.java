public class Main {

        public static void main(String[] args) {
            ListInt list = new ListInt();

            list.add(123).add(22).add(50).add(17).add(1).add(99);

            list.print();

            System.out.println( list.contains(13));
            System.out.println( list.indexOf(1));
            System.out.println( list.get(1));

    }
}