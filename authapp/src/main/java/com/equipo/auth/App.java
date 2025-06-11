package com.equipo.auth;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        AuthService authService = new AuthService();
        Scanner sc = new Scanner(System.in);

        System.out.print("Usuario: ");
        String usuario = sc.nextLine();
        System.out.print("Contraseña: ");
        String clave = sc.nextLine();

        if (authService.autenticar(usuario, clave)) {
            System.out.println("¡Acceso concedido!");
        } else {
            System.out.println("Credenciales incorrectas.");
        }

        sc.close();
    }
}
