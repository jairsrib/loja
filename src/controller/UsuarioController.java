package controller;

import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import model.Usuario;
import utils.Utils;

/**
 *
 * @author iband
 */
public class UsuarioController {

    public boolean autenticar(String email, String senha) {
        //Montar o comando a ser executado
        //os ? são variáveis que são preenchidas mais adiante
        String sql = "SELECT * from cliente "
                + " WHERE email = ? and senha = ? "
                + " and ativo = true";

        //Cria uma instância do gerenciador de conexão(conexão com o banco de dados),
        GerenciadorConexao gerenciador = new GerenciadorConexao();
        //Declara as variáveis como nulas antes do try para poder usar no finally
        PreparedStatement comando = null;
        ResultSet resultado = null;

        try {
            //prepara o sql, analisando o formato e as váriaveis
            comando = gerenciador.prepararComando(sql);

            //define o valor de cada variável(?) pela posição em que aparece no sql
            comando.setString(1, email);
            comando.setString(2, senha);

            //executa o comando e guarda o resultado da consulta, o resultado é semelhante a uma grade
            resultado = comando.executeQuery();

            //resultado.next() - tenta avançar para a próxima linha, caso consiga retorna true
            if (resultado.next()) {
                //Se conseguiu avançar para a próxima linha é porque achou um usuário com aquele nome e senha
                return true;
            }
        } catch (SQLException e) {//caso ocorra um erro relacionado ao banco de dados
            JOptionPane.showMessageDialog(null, e.getMessage());//exibe popup com o erro
        } finally {//depois de executar o try, dando erro ou não executa o finally
            gerenciador.fecharConexao(comando, resultado);
        }
        return false;
    }

    public boolean inserirUsuario(Usuario usu) {
        //Montar o comando a ser executado
        //os ? são variáveis que são preenchidas mais adiante
        String sql = "INSERT INTO cliente(nome, cpf, telefone, email, datanasc, senha, ativo) "
                + " VALUES (?,?,?,?,?,?,?)";

        //Cria uma instância do gerenciador de conexão(conexão com o banco de dados),
        GerenciadorConexao gerenciador = new GerenciadorConexao();
        //Declara as variáveis como nulas antes do try para poder usar no finally
        PreparedStatement comando = null;
        try {
            //prepara o sql, analisando o formato e as váriaveis
            comando = gerenciador.prepararComando(sql);

            //define o valor de cada variável(?) pela posição em que aparece no sql
            comando.setString(1, usu.getNome());
            comando.setString(2, usu.getCpf());
            comando.setString(3, usu.getTelefone());
            comando.setString(4, usu.getEmail());
            comando.setDate(5, new java.sql.Date(usu.getDataNasc().getTime()));
            comando.setString(6, usu.getSenha());
            comando.setBoolean(7, usu.isAtivo());

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

    public boolean alterarUsuario(Usuario u) {
        String sql = "UPDATE cliente SET nome = ?, "
                + " email = ?";

        if (u.getSenha() != null) {
            sql = sql + " , senha = ? ";
        }

        sql = sql + " , datanasc = ?, ativo = ? WHERE id_cliente = ?";

        GerenciadorConexao gerenciador = new GerenciadorConexao();
        PreparedStatement comando = null;

        try {
            comando = gerenciador.prepararComando(sql);

            comando.setString(1, u.getNome());
            comando.setString(2, u.getEmail());

            int numCampo = 3;

            if (u.getSenha() != null) {
                comando.setString(numCampo, u.getSenha()); //numCampo = 3
                numCampo++;
            }

            //numCampo = 3 ou 4
            comando.setDate(numCampo, new java.sql.Date(u.getDataNasc().getTime()));
            numCampo++;
            //numCampo = 4 ou 5
            comando.setBoolean(numCampo, u.isAtivo());
            numCampo++;
            //numCampo = 5 ou 6
            comando.setInt(numCampo, u.getId_cliente());

            comando.executeUpdate();

            return true;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao atualizar: " + ex);
        } finally {
            gerenciador.fecharConexao(comando);
        }
        return false;
    }

    public Usuario buscarPorPk(int id_cliente) {
        //Guarda o sql
        String sql = "SELECT * FROM cliente "
                + " WHERE id_cliente = ? ";

        //Cria um gerenciador de conexão
        GerenciadorConexao gerenciador = new GerenciadorConexao();
        //Cria as variáveis vazias antes do try pois vão ser usadas no finally
        PreparedStatement comando = null;
        ResultSet resultado = null;

        //Crio um usuário vazio
        Usuario usu = new Usuario();

        try {
            //Preparo do comando sql
            comando = gerenciador.prepararComando(sql);

            comando.setInt(1, id_cliente);

            //Executo o comando e guardo o resultado
            resultado = comando.executeQuery();

            //Irá percorrer os registros do resultado do sql
            //A cada next() a variavel resultado aponta para o próximo registro 
            //enquanto next() == true quer dizer que tem registros
            if (resultado.next()) {

                //Leio as informações da variável resultado e guardo no usuário
                usu.setId_cliente(resultado.getInt("id_cliente"));
                usu.setNome(resultado.getString("nome"));
                usu.setCpf(resultado.getString("cpf"));
                usu.setTelefone(resultado.getString("telefone"));
                usu.setEmail(resultado.getString("email"));
                usu.setDataNasc(resultado.getDate("datanasc"));
                usu.setSenha(resultado.getString("senha"));
                usu.setAtivo(resultado.getBoolean("ativo"));
            }

        } catch (SQLException ex) {
            Logger.getLogger(UsuarioController.class.getName()).log(
                    Level.SEVERE, null, ex);
        } finally {
            gerenciador.fecharConexao(comando, resultado);
        }
        //retorno o usuário
        return usu;
    }

    public List<Usuario> consultar() {
        //Guarda o sql
        String sql = "SELECT * FROM cliente";

        //Cria um gerenciador de conexão
        GerenciadorConexao gerenciador = new GerenciadorConexao();
        //Cria as variáveis vazias antes do try pois vão ser usadas no finally
        PreparedStatement comando = null;
        ResultSet resultado = null;

        //Crio a lista de usuários vazia
        List<Usuario> listaUsuarios = new ArrayList<>();

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
                Usuario usuario = new Usuario();

                //Leio as informações da variável resultado e guardo no usuário
                usuario.setId_cliente(resultado.getInt("id_cliente"));
                usuario.setNome(resultado.getString("nome"));
                usuario.setCpf(resultado.getString("cpf"));
                usuario.setTelefone(resultado.getString("telefone"));
                usuario.setEmail(resultado.getString("email"));
                usuario.setDataNasc(resultado.getDate("datanasc"));
                usuario.setSenha(resultado.getString("senha"));
                usuario.setAtivo(resultado.getBoolean("ativo"));

                //adiciono o usuário na lista
                listaUsuarios.add(usuario);
            }

        } catch (SQLException ex) {
            Logger.getLogger(UsuarioController.class.getName()).log(
                    Level.SEVERE, null, ex);
        } finally {
            gerenciador.fecharConexao(comando, resultado);
        }

        //retorno a lista de usuários
        return listaUsuarios;
    }

    public boolean deletar(int id_cliente) {
        String sql = "DELETE FROM cliente "
                + "WHERE id_cliente = ?";

        GerenciadorConexao gerenciador = new GerenciadorConexao();
        PreparedStatement comando = null;

        try {
            comando = gerenciador.prepararComando(sql);
            comando.setInt(1, id_cliente);

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
