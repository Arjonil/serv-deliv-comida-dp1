package pe.edu.upao.servdelivcomidadp1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import pe.edu.upao.servdelivcomidadp1.controllers.OrderController;
import pe.edu.upao.servdelivcomidadp1.models.Food;
import pe.edu.upao.servdelivcomidadp1.models.Order;
import pe.edu.upao.servdelivcomidadp1.services.OrderService;

import java.io.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.*;
import java.util.stream.Stream;

@SpringBootApplication
public class ServDelivComidaDp1Application {
    static int opc = -1;

    public static void main(String[] args) throws IOException {
        SpringApplication.run(ServDelivComidaDp1Application.class, args);

        Scanner sc = new Scanner(System.in);

        ArrayList<Food> comidas = new ArrayList<Food>();
        Food cena1 = new Food("Paella", "Continuando con el arroz y los pescados, la paella es un clásico de " +
                "España que ha sabido ganarse el \naprecio internacional. Originaria de Valencia, debe su nombre a la gigante " +
                "“paellera” dónde se cocina. \nSe trata de un buen plato de arroz y mariscos, condimentado con azafrán y " +
                "hierbas verdes. Como siempre, \nhay muchas versiones y se hace también con pollo, cerdo o, simplemente, " +
                "vegetales." + "", 33f);
        Food cena2 = new Food("Fondue", "Cuando llega el invierno y las bajas temperaturas, ¿a quién no le " +
                "apetece una rica y calentita fondue? \nSuiza nos regala esta exquisita preparación de queso fundido, \n" +
                "acompañada por pedacitos de pan. Es común servirla con champiñones para sumergir en el queso y saborear. \n" +
                "Y si te quedas con hambre, también puedes servir la fondue de chocolate como postre. En ese caso, se \n" +
                "acompaña con frutas." + "", 24f);
        Food cena3 = new Food("Ratatouille", "Esta famosa especialidad proviene de la Provenza -región \n" +
                "sureste de Francia– y es un guiso de tomates, ajos, cebolla, pimientos, berenjenas y calabacín, regados en \n" +
                "aceite de oliva. Se condimenta con las llamadas hierbas provenzales, como tomillo, romero, orégano, laurel \n" +
                "y albahaca. El ratatouille se sirve frío o caliente, generalmente como acompañamiento de carnes o pescados.\n" +
                "", 50f);
        Food cena4 = new Food("Ceviche", "Este plato nacional de Perú vive un momento de mucha fama en la \n" +
                "actualidad, luego de destacarse en diferentes ferias gastronómicas realizadas en distintas partes del\n" +
                " mundo. El ceviche peruano se prepara con pescado o mariscos crudos, cebolla, chile, jugo de limón y sal. \n" +
                "Puede ir acompañado de camote, choclo, cancha serrana o chifles, otras comidas muy comunes de este país de \n" +
                "Sudamérica." + "", 18f);


        System.out.println(cena1.toString());
        System.out.println(cena2.toString());
        System.out.println(cena3.toString());
        System.out.println(cena4.toString());
        //List<OrderService> Spedido = new ArrayList<OrderService>();

        comidas.add(cena1);
        comidas.add(cena2);
        comidas.add(cena3);
        comidas.add(cena4);



/*
        Food F = new Food();
        Order O = new Order();
*/
        //INICIO DE PROGRAMA
        char respuesta;
        do {

            System.out.println("\t\t\tDesea iniciar el servicio? \n\t\t\t\t\t\t[S/N]");
            respuesta = sc.nextLine().toUpperCase().charAt(0);
            if (respuesta == 'N') {

                System.out.println("\t  Se le devolvera a la pantalla de inicio\n\n\n\n\n\n\n\n");

            } else if (respuesta != 'S' && respuesta != 'N') {
                System.out.println("\n\n\n\n\n\n\n\n\t[Solo se aceptan 'S/N' como respuestas validas]");
            }

        } while (respuesta != 'S');


        //MENU DE OPCIONES
        while (opc != 0) {
            //Try catch para evitar que el programa termine si hay un error
            try {
                menu();
                opc = Integer.parseInt(sc.nextLine());
                //Ejemplo de switch case en Java
                switch (opc) {
                    case 1:
                        listaPlatos(cena1);
                        //Menu de comida
                        break;
                    case 2:

                        System.out.println("dos");
                        break;
                    case 3:

                        System.out.println("tres");
                        break;
                    default:
                        System.out.println("No existen detalles de esta opcion");
                        break;
                }

                System.out.println("\n");

            } catch (Exception e) {
                System.out.println("Ha ocurrido un error en el sistema...\nPor favor de reportar al desarrollador.");
            }


        }


    }


/*
        ArrayList<Order> orden = new ArrayList<>();
        ArrayList<Food> comida = new ArrayList<>();
        comida.add(new Food("Parrilla", "De la selva su guambrilla", 55));
        orden.add(new Order("334", "Pedro", "comodoro@gmial.com", "Libre", "44", comida));
         */


/*
Food cena1 = new Food("Paella", "Continuando con el arroz y los pescados, la paella es un clásico de "+
            "España que ha sabido ganarse el aprecio internacional. Originaria de Valencia, debe su nombre a la gigante "+
            "“paellera” dónde se cocina. Se trata de un buen plato de arroz y mariscos, condimentado con azafrán y "+
            "hierbas verdes. Como siempre, hay muchas versiones y se hace también con pollo, cerdo o, simplemente, "+
            "vegetales."+"", 33);
    Food cena2 = new Food("Fondue", "Cuando llega el invierno y las bajas temperaturas, ¿a quién no le "+
            "apetece una rica y calentita fondue? Suiza nos regala esta exquisita preparación de queso fundido, "+
            "acompañada por pedacitos de pan. Es común servirla con champiñones para sumergir en el queso y saborear. "+
            "Y si te quedas con hambre, también puedes servir la fondue de chocolate como postre. En ese caso, se "+
            "acompaña con frutas."+"", 24);
    Food cena3 = new Food("Ratatouille", "Esta famosa especialidad proviene de la Provenza -región "+
            "sureste de Francia– y es un guiso de tomates, ajos, cebolla, pimientos, berenjenas y calabacín, regados en "+
            "aceite de oliva. Se condimenta con las llamadas hierbas provenzales, como tomillo, romero, orégano, laurel "+
            "y albahaca. El ratatouille se sirve frío o caliente, generalmente como acompañamiento de carnes o pescados."+
            "", 50);
    Food cena4 = new Food("Ceviche", "Este plato nacional de Perú vive un momento de mucha fama en la "+
            "actualidad, luego de destacarse en diferentes ferias gastronómicas realizadas en distintas partes del"+
            " mundo. El ceviche peruano se prepara con pescado o mariscos crudos, cebolla, chile, jugo de limón y sal. "+
            "Puede ir acompañado de camote, choclo, cancha serrana o chifles, otras comidas muy comunes de este país de "+
            "Sudamérica."+"", 18);
 */



    public static void menu(){
        System.out.println("\n\n\n\n\n\n\n\tMenu de opciones:");
        System.out.println(
                "\t(1) Ver menu completo\n"+
                        "\t(2) Realizar pedido\n"+
                        "\t(3) Ver estado de pedido\n");
    }
    public static void listaPlatos(Food F){

        System.out.println(F.getName()+F.getDescription()+F.getPrice());



    }


}