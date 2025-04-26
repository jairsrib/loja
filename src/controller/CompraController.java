package controller;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.Compra;
import model.Tamanho;
import model.Usuario;

public class CompraController {
    public boolean inserirCompra(Compra com) {
        //Montar o comando a ser executado
        //os ? são variáveis que são preenchidas mais adiante
        String sql = "INSERT INTO compra(id_roupa, id_cliente, quantidade) "
                + " VALUES (?, ?, ?)";

        //Cria uma instância do gerenciador de conexão(conexão com o banco de dados),
        GerenciadorConexao gerenciador = new GerenciadorConexao();
        //Declara as variáveis como nulas antes do try para poder usar no finally
        PreparedStatement comando = null;
        try {
            //prepara o sql, analisando o formato e as váriaveis
            comando = gerenciador.prepararComando(sql);

            //define o valor de cada variável(?) pela posição em que aparece no sql
            comando.setInt(1, com.getId_roupa());
            comando.setInt(2, com.getId_cliente());
            comando.setInt(3, com.getQuantidade());
            

            //Executa o insert
            comando.executeUpdate();

            return true;
        } catch (SQLException e) {//caso ocorra um erro relacionado ao banco de dados
            JOptionPane.showMessageDialog(null, e.getMessage());//exibe popup com o erro
        } finally {//depois de executar o try, dando erro ou não executa o finally
            gerenciador.fecharConexao(comando);
        }
        return false;
    }
    
    public List<Compra> consultar() {
        //Guarda o sql
        String sql = "SELECT * FROM compra";

        //Cria um gerenciador de conexão
        GerenciadorConexao gerenciador = new GerenciadorConexao();
        //Cria as variáveis vazias antes do try pois vão ser usadas no finally
        PreparedStatement comando = null;
        ResultSet resultado = null;

        //Crio a lista de usuários vazia
        List<Compra> listaCompras = new ArrayList<>();

        try {
            //Preparo do comando sql
            comando = gerenciador.prepararComando(sql);

            //Como não há parâmetros já executo direto
            resultado = comando.executeQuery();

            //Irá percorrer os registros do resultado do sql
            //A cada next() a variavel resultado aponta para o próximo registro 
            //enquanto next() == true quer dizer que tem registros
            while (resultado.next()) {

                //Crio um novo usuário vazio
                Compra compra = new Compra();

                //Leio as informações da variável resultado e guardo no usuário
                compra.setId_roupa(resultado.getInt("id_roupa"));
                compra.setId_cliente(resultado.getInt("id_cliente"));
                compra.setQuantidade(resultado.getInt("quantidade"));

                //adiciono o usuário na lista
                listaCompras.add(compra);
            }

        } catch (SQLException ex) {
            Logger.getLogger(UsuarioController.class.getName()).log(
                    Level.SEVERE, null, ex);
        } finally {
            gerenciador.fecharConexao(comando, resultado);
        }

        //retorno a lista de usuários
        return listaCompras;
    }
    
}
