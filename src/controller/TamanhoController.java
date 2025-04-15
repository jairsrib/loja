/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.Tamanho;
import model.Usuario;

/**
 *
 * @author Jair
 */
public class TamanhoController {

    public boolean inserirTamanho(Tamanho tam) {
        //Montar o comando a ser executado
        //os ? são variáveis que são preenchidas mais adiante
        String sql = "INSERT INTO tamanho(sigla, descricao) "
                + " VALUES (?, ?)";

        //Cria uma instância do gerenciador de conexão(conexão com o banco de dados),
        GerenciadorConexao gerenciador = new GerenciadorConexao();
        //Declara as variáveis como nulas antes do try para poder usar no finally
        PreparedStatement comando = null;
        try {
            //prepara o sql, analisando o formato e as váriaveis
            comando = gerenciador.prepararComando(sql);

            //define o valor de cada variável(?) pela posição em que aparece no sql
            comando.setString(1, tam.getSigla());
            comando.setString(2, tam.getDescricao());

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

    public Tamanho buscarPorPk(int id_tamanho) {
        //Guarda o sql
        String sql = "SELECT * FROM tamanho "
                + " WHERE id_tamanho = ? ";

        //Cria um gerenciador de conexão
        GerenciadorConexao gerenciador = new GerenciadorConexao();
        //Cria as variáveis vazias antes do try pois vão ser usadas no finally
        PreparedStatement comando = null;
        ResultSet resultado = null;

        //Crio um usuário vazio
        Tamanho tam = new Tamanho();

        try {
            //Preparo do comando sql
            comando = gerenciador.prepararComando(sql);

            comando.setInt(1, id_tamanho);

            //Executo o comando e guardo o resultado
            resultado = comando.executeQuery();

            //Irá percorrer os registros do resultado do sql
            //A cada next() a variavel resultado aponta para o próximo registro 
            //enquanto next() == true quer dizer que tem registros
            if (resultado.next()) {

                //Leio as informações da variável resultado e guardo no usuário
                tam.setIdTamanho(resultado.getInt("ID"));
                tam.setSigla(resultado.getString("Sigla"));
                tam.setDescricao(resultado.getString("Descrição"));
                
            }

        } catch (SQLException ex) {
            Logger.getLogger(UsuarioController.class.getName()).log(
                    Level.SEVERE, null, ex);
        } finally {
            gerenciador.fecharConexao(comando, resultado);
        }
        //retorno o usuário
        return tam;
    }
    
    public List<Tamanho> consultar() {
        //Guarda o sql
        String sql = "SELECT * FROM tamanho";

        //Cria um gerenciador de conexão
        GerenciadorConexao gerenciador = new GerenciadorConexao();
        //Cria as variáveis vazias antes do try pois vão ser usadas no finally
        PreparedStatement comando = null;
        ResultSet resultado = null;

        //Crio a lista de usuários vazia
        List<Tamanho> listaTamanhos = new ArrayList<>();

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
                Tamanho tamanho = new Tamanho();

                //Leio as informações da variável resultado e guardo no usuário
                tamanho.setIdTamanho(resultado.getInt("id_tamanho"));
                tamanho.setSigla(resultado.getString("sigla"));
                tamanho.setDescricao(resultado.getString("descricao"));

                //adiciono o usuário na lista
                listaTamanhos.add(tamanho);
            }

        } catch (SQLException ex) {
            Logger.getLogger(UsuarioController.class.getName()).log(
                    Level.SEVERE, null, ex);
        } finally {
            gerenciador.fecharConexao(comando, resultado);
        }

        //retorno a lista de usuários
        return listaTamanhos;
    }

    public boolean deletar(int id_tamanho) {
        String sql = "DELETE FROM tamanho"
                + "WHERE id_tamanho = ?";

        GerenciadorConexao gerenciador = new GerenciadorConexao();
        PreparedStatement comando = null;

        try {
            comando = gerenciador.prepararComando(sql);
            comando.setInt(1, id_tamanho);

            comando.executeUpdate();

            return true;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao excluir: "
                    + ex);
        } finally {
            gerenciador.fecharConexao(comando);
        }
        return false;
    }
}
