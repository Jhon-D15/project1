public class area {

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);

        double base;
        double altura;
        double area;

        System.out.println("////////////////////////////////");

        System.out.println("ingresar el valor de la base");
        base= lector.nextDouble();

        System.out.println("ingresar el valor de la altura");
        altura= lector.nextDouble();

        area = (base * altura)/2;

        System.out.println("////////////////////////////////");

        System.out.println("el area del triangulo es:"+" "+area);

    }
}
