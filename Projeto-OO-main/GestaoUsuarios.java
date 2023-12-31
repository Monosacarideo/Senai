import java.util.ArrayList;
import java.util.Scanner;

public class GestaoUsuarios {
    Scanner scan = new Scanner(System.in);
    public ArrayList<Usuario> listaDeUsuarios = new ArrayList<Usuario>();

    public void adicionarUsuario(Usuario Usuario) {
        int id = 1;
        for (Usuario u : this.listaDeUsuarios) {
            if (u.idUsuario >= id) {
                id = u.idUsuario + 1;
            }
        }
        Usuario.idUsuario = id;
        this.listaDeUsuarios.add(Usuario);
    }


    

    // Mostrar usuários cadastrados
    public String mostrarUsuariosCadastrados() {
        String mensagem = "";
        mensagem += "\nAs informações dos usuários cadastrados são: \n ";
        for (Usuario u : this.listaDeUsuarios) {

            mensagem += "\n ID do cadastro: " + u.idUsuario + "\n Login: " +
                    u.getLogin() +
                    "\n Senha: " + u.getSenha() + "\n";
        }
        return mensagem;
    }

    // Editar senha usuario
  public String alterarSenhaUsuario(int id) {
    boolean encontrado = false;

    for (Usuario u : this.listaDeUsuarios) {
      encontrado = true;
      if (u.idUsuario == id) {
        System.out.println("Informe o nova senha: ");
        u.setSenha(null) = scan.next();
      }
    }
    if (encontrado == true) {
      return ("Senha alterada com sucesso! ");
    } else {
      return ("Cadastro não encontrado! ");
    }

  }
}