public class Main {
    public static void main(String[] args) {
        int r = 10;

        double circleLength = 2 * Math.PI * r;
        double circleSquare = Math.PI * Math.pow(r,2);

        System.out.printf("Длина окружности с радиусом %d равняется %.2f\n", r, circleLength);
        System.out.printf("Площадь круга с радиусом %d равняется %.2f\n", r, circleSquare);
    }
}