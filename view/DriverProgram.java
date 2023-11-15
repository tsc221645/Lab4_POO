package view;
import java.util.ArrayList;
import java.util.Scanner;
import bean.User;
import controller.RegisterController;

public class DriverProgram {
    Scanner scan; 
    RegisterController register;
    ArrayList<User> userDB;

    /*
     * @method DriverProgram
     */
    public DriverProgram(){
        scan = new Scanner(System.in);
        register = new RegisterController();
        userDB = new ArrayList<User>();
    }
    
    /*
     * @method run
     */
    public void run(){
        System.out.println("Bienvenido a la biblioteca");
        mainMenu();
    }

    /*
     * @method mainMenu
     */
    private void mainMenu(){
        String op1 = "";
        do{
            System.out.println("Seleccione una opcion del menu: ");
            System.out.println("1. Crear usuario nuevo\n2. Ingresar (Usuario Existente)\n3. Salir\nOpcion: ");
            op1 = scan.nextLine();

            switch (op1) {
                //Crear usuario nuevo
                case "1":
                    register.registerNewUser();
                    break;
                //Ingresar usuario existente
                case "2":
                    register.loginNewUser();
                    break;
                //Salir del programa
                case "3":
                System.out.println("Saliendo....");
                    break;

                default:
                    System.out.println("Seleccione una opcion valida del menu");
            }
        }while(!op1.equals("3"));

    }
}
