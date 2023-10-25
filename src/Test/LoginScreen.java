package Test;

import java.util.HashMap;
import java.util.Map;

/**
 * Uma classe para simular a conexao com banco de dados e validacao de login
 */
public class LoginScreen {
    /**
     * Simula um banco de dados (username, password)
     */
    private Map<String, String> userDatabase;

    /**
     *  Cria uma instacia de LoginScreen
     *  insere registros na sua criacao para simular um banco de dados
     */
    public LoginScreen(){
        userDatabase = new HashMap<>();
        userDatabase.put("john", "password123");
        userDatabase.put("alice", "securepass");
    }

    /**
     * Tentativa de verificar a atenticidade das credenciais passadas
     *
     * @param username o usuario da pessoa que esta tentando realizar login
     * @param password a senha da pesso que esta tentando realizar login
     * @return {@code true} se a verificacao for um sucesso, caso contrario {@code false}
     */
    public boolean login(String username, String password) {
        if(userDatabase.containsKey(username)){
            String storedPassword = userDatabase.get(username);
            if(storedPassword.equals(password)){
                return true; // Verificação com sucesso
            }

        }
        return false; // Verificação falhada
    }

    /**
     * Adiciona um novo usuario ao 'banco de dados'
     * este metodo nao e recomendado para uso em producao
     *
     * @param username o usuario a ser inserido no banco de dados
     * @param password a senha a ser inserida no banco de dados
     */
    public void addUser(String username, String password){
        userDatabase.put(username, password);
    }
}
