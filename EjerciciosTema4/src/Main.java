public class Main {
    public static void main(String[] args) {

        //Condición IF()
        int numeroif=0;
        if (numeroif>0){
            System.out.println("El número es positivo");
        }
        else if (numeroif<0) {
            System.out.println("El número es negativo");
        }
        else{
            System.out.println("El número es cero");
        }

        //Ciclo WHILE
        int numeroWhile=0;
        while (numeroWhile<3) {
            System.out.println(numeroWhile);
            numeroWhile++;
        }

        //Ciclo DO WILE
        do {
            System.out.println(numeroWhile);
            numeroWhile++;
        }while (numeroWhile<3);

        //Ciclo FOR
        int numeroFor=0;
        for (; numeroFor<=3; numeroFor++) {
            System.out.println(numeroFor);
        }
        //SWITCH
        String estacion = "VERANO";
        switch (estacion) {
            case "VERANO":
                System.out.println("Es verano");
                break;
            case "OTOÑO":
                System.out.println("Es otoño");
                break;
            case "INVIERNO":
                System.out.println("Es invierno");
            case "PRIMAVERA":
                System.out.println("Es primavera");
        }

    }
}