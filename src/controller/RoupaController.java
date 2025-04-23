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
import model.Roupa;
import model.Roupa_Tamanho;
import model.Tamanho;

/**
 *
 * @author Jair
 */
public class RoupaController {

    public boolean inserirRoupa(Roupa rou) {
        //Montar o comando a ser executado
        //os ? são variáveis que são preenchidas mais adiante
        String sql = "INSERT INTO roupa(nome, preco, cor, descricao) "
                + " VALUES (?, ?, ?, ?)";

        //Cria uma instância do gerenciador de conexão(conexão com o banco de dados),
        GerenciadorConexao gerenciador = new GerenciadorConexao();
        //Declara as variáveis como nulas antes do try para poder usar no finally
        PreparedStatement comando = null;
        try {
            //prepara o sql, analisando o formato e as váriaveis
            comando = gerenciador.prepararComando(sql);

            //define o valor de cada variável(?) pela posição em que aparece no sql
            comando.setString(1, rou.getNome());
            comando.setDouble(2, rou.getPreco());
            comando.setString(3, rou.getCor());
            comando.setString(4, rou.getDescricao());

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

    public Roupa buscarPorPk(int id_roupa) {
        //Guarda o sql
        String sql = "SELECT * FROM roupa "
                + " WHERE id_roupa = ? ";

        //Cria um gerenciador de conexão
        GerenciadorConexao gerenciador = new GerenciadorConexao();
        //Cria as variáveis vazias antes do try pois vão ser usadas no finally
        PreparedStatement comando = null;
        ResultSet resultado = null;

        //Crio um usuário vazio
        Roupa rou = new Roupa();

        try {
            //Preparo do comando sql
            comando = gerenciador.prepararComando(sql);

            comando.setInt(1, id_roupa);

            //Executo o comando e guardo o resultado
            resultado = comando.executeQuery();

            //Irá percorrer os registros do resultado do sql
            //A cada next() a variavel resultado aponta para o próximo registro 
            //enquanto next() == true quer dizer que tem registros
            if (resultado.next()) {

                //Leio as informações da variável resultado e guardo no usuário
                rou.setIdRoupa(resultado.getInt("ID"));
                rou.setNome(resultado.getString("Nome"));
                rou.setPreco(resultado.getDouble("Preço"));
                rou.setCor(resultado.getString("Cor"));
                rou.setDescricao(resultado.getString("Descrição"));

            }

        } catch (SQLException ex) {
            Logger.getLogger(UsuarioController.class.getName()).log(
                    Level.SEVERE, null, ex);
        } finally {
            gerenciador.fecharConexao(comando, resultado);
        }
        //retorno o usuário
        return rou;
    }

    public List<Roupa> consultar() {
        //Guarda o sql
        String sql = "SELECT * FROM roupa";

        //Cria um gerenciador de conexão
        GerenciadorConexao gerenciador = new GerenciadorConexao();
        //Cria as variáveis vazias antes do try pois vão ser usadas no finally
        PreparedStatement comando = null;
        ResultSet resultado = null;

        //Crio a lista de usuários vazia
        List<Roupa> listaRoupas = new ArrayList<>();

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
                Roupa rou = new Roupa();

                //Leio as informações da variável resultado e guardo no usuário
                rou.setIdRoupa(resultado.getInt("id_roupa"));
                rou.setNome(resultado.getString("nome"));
                rou.setPreco(resultado.getDouble("preco"));
                rou.setCor(resultado.getString("cor"));
                rou.setDescricao(resultado.getString("descricao"));

                //adiciono o usuário na lista
                listaRoupas.add(rou);
            }

        } catch (SQLException ex) {
            Logger.getLogger(UsuarioController.class.getName()).log(
                    Level.SEVERE, null, ex);
        } finally {
            gerenciador.fecharConexao(comando, resultado);
        }

        //retorno a lista de usuários
        return listaRoupas;
    }

    public boolean deletar(int id_roupa) {
        String sql = "DELETE FROM roupa"
                + "WHERE id_roupa = ?";

        GerenciadorConexao gerenciador = new GerenciadorConexao();
        PreparedStatement comando = null;

        try {
            comando = gerenciador.prepararComando(sql);
            comando.setInt(1, id_roupa);

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
    
    public boolean inserirTamanho(Roupa_Tamanho rt) {
        //Montar o comando a ser executado
        //os ? são variáveis que são preenchidas mais adiante
        String sql = "INSERT INTO Roupa_Tamanho(id_roupa, id_tamanho) "
                + " VALUES (?, ?)";

        //Cria uma instância do gerenciador de conexão(conexão com o banco de dados),
        GerenciadorConexao gerenciador = new GerenciadorConexao();
        //Declara as variáveis como nulas antes do try para poder usar no finally
        PreparedStatement comando = null;
        try {
            //prepara o sql, analisando o formato e as váriaveis
            comando = gerenciador.prepararComando(sql);

            //define o valor de cada variável(?) pela posição em que aparece no sql
            comando.setInt(1, rt.getId_roupa());
            comando.setInt(2, rt.getId_tamanho());
           

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

    public Integer consultarUltimoId() {
    // Guarda o SQL para obter apenas o id_roupa
    String sql = "SELECT id_roupa FROM roupa";
    
    // Cria um gerenciador de conexão
    GerenciadorConexao gerenciador = new GerenciadorConexao();
    
    // Cria as variáveis vazias antes do try, pois vão ser usadas no finally
    PreparedStatement comando = null;
    ResultSet resultado = null;
    
    // Variável para armazenar o último ID
    Integer ultimoId = null;
    
    try {
        comando = gerenciador.prepararComando(sql);
        
        resultado = comando.executeQuery();
        
        while (resultado.next()) {
            ultimoId = resultado.getInt("id_roupa");
        }
    } catch (SQLException ex) {
        Logger.getLogger(UsuarioController.class.getName()).log(Level.SEVERE, null, ex);
    } finally {
        // Fecha a conexão
        gerenciador.fecharConexao(comando, resultado);
    }
    
    // Retorna o último ID (ou null se não houver nenhum registro)
    return ultimoId;
}


}
