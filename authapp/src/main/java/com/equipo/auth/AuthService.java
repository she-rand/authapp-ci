package com.equipo.auth;

import java.util.HashMap;

public class AuthService {
    private final HashMap<String, String> usuarios = new HashMap<>();

    public AuthService() {
        usuarios.put("admin", "1234"); // clave hardcodeada para prueba
        usuarios.put("user", "abcd");
    }

    public boolean autenticar(String username, String password) {
        return usuarios.containsKey(username) && usuarios.get(username).equals(password);
    }
}
