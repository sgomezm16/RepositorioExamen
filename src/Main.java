/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

//1. El nombre de la variable se cambia clicando sobre esta y 
//pulsando boton derecho en refactor y luego en rename, dandole el nombre que deseemos.

//2. Seleccionamos desde el primer "try" hasta el siguiente 
//corchete del ultimo Syso, pulsamos click derecho y pulsamos en refactor y en extract method.

//4. Vamos al método que creamos en el ejercicio 2 y le añadimos el parametro cantidad
// de tipo float, seguidamente sale una bombilla en "operativo_cuenta(cuenta1);", tenemos que seleccionar
//la opcion de add argument to match y ya estaría.


public class Main {

    public static void main(String[] args) {
        CCuenta cuenta1;
        double saldoActual;

        cuenta1 = new CCuenta("Antonio López","1000-2365-85-1230456789",2500,0);
        saldoActual = cuenta1.estado();
        System.out.println("El saldo actual es"+ saldoActual );

        operativo_cuenta(cuenta1, 0);
    }

	public static void operativo_cuenta(CCuenta cuenta1, float cantidad) {
		try {
            cuenta1.retirar(2300);
            //modificado
        } catch (Exception e) {
            System.out.print("Fallo al retirar");
        }
        try {
            System.out.println("Ingreso en cuenta");
            cuenta1.ingresar(695);
        } catch (Exception e) {
            System.out.print("Fallo al ingresar");
        }
	}
}
