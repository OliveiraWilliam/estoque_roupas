/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dao;

import db.DB;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import model.Product;

/**
 *
 * @author Will
 */
public class ProductDAO {

    private Connection connection;
    private PreparedStatement stm;
    private ResultSet rs;

    public boolean save(Product produto) {
        try {
            String sql = "insert into tbl_Product values(?,?,?,?,?,?,?,?,?,?,?,?)";
            connection = getDB();
            stm = connection.prepareStatement(sql);
            stm.setInt(1, produto.getCodProduto());
            stm.setString(2, produto.getDataEntrada());
            stm.setString(3, produto.getLocalCompra());
            stm.setString(4, produto.getTipoProduto());
            stm.setString(5, produto.getMarcaProduto());
            stm.setString(6, produto.getDetalheProduto());
            stm.setString(7, produto.getTamanho());
            stm.setString(8, produto.getCor());
            stm.setDouble(9, produto.getValorEtiquetaCompraProd());
            stm.setDouble(10, produto.getValorPagoCompraProd());
            stm.setDouble(11, produto.getValorMargemLucro());
            stm.setDouble(12, produto.getPrecoSugerido());
            if (stm.executeUpdate() > 0) {
                return true;
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao inserir os dados" + ex.getMessage());
        }
        return false;
    }

    public boolean update(Product produto) {
        try {
            String sql = "update tbl_Product set dataEntrada = ?, localCompra = ?, tipoProduto = ?, marcaProduto = ?, detalheProduto = ?, tamanho = ?, cor = ?, valorEtiquetaCompraProd = ?, valorPagoCompraProd = ?, valorMargemLucro = ?, precoSugerido = ?"
                    + "where codProduto = ?";
            connection = getDB();
            stm = connection.prepareStatement(sql);
            stm.setString(1, produto.getDataEntrada());
            stm.setString(2, produto.getLocalCompra());
            stm.setString(3, produto.getTipoProduto());
            stm.setString(4, produto.getMarcaProduto());
            stm.setString(5, produto.getDetalheProduto());
            stm.setString(6, produto.getTamanho());
            stm.setString(7, produto.getCor());
            stm.setDouble(8, produto.getValorEtiquetaCompraProd());
            stm.setDouble(9, produto.getValorPagoCompraProd());
            stm.setDouble(10, produto.getValorMargemLucro());
            stm.setDouble(11, produto.getPrecoSugerido());
            stm.setInt(12, produto.getCodProduto());
            if (stm.executeUpdate() > 0) {
                return true;
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao alterar os dados" + ex.getMessage());
        }
        return false;
    }

    public boolean destroy(int codProduto){
        try{
            String sql = "delete from alunos where = ?";
            connection = getDB();
            stm = connection.prepareStatement(sql);
            if(stm.executeUpdate()>0)
                return true;
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null,"Erro ao excluir dados" + ex.getMessage());
        }
        return false;       
    }
    
    public List<Product> readProduct(String parameter){
        try{
            List<Product> lista = new ArrayList<>();
            String sql = "select * from tbl_Product where tipoProduto like '%"+parameter+"%'";
            connection = getDB();
            stm = connection.prepareStatement(sql);
            rs = stm.executeQuery();
            Product a;
            while(rs.next()){
                a = new Product();
                a.setCodProduto(rs.getInt("codProduto"));
                a.setDataEntrada(rs.getString("dataEntrada"));
                a.setLocalCompra(rs.getString("localCompra"));
                a.setTipoProduto(rs.getString("tipoProduto"));
                a.setMarcaProduto(rs.getString("marcaProduto"));
                a.setDetalheProduto(rs.getString("detalheProduto"));
                a.setTamanho(rs.getString("tamanho"));
                a.setCor(rs.getString("cor"));
                a.setValorEtiquetaCompraProd(rs.getDouble("valorEtiquetaCompraProd"));
                a.setValorPagoCompraProd(rs.getDouble("valorPagoCompraProd"));
                a.setValorMargemLucro(rs.getDouble("valorMargemLucro"));
                a.setPrecoSugerido(rs.getDouble("precoSugerido"));
                lista.add(a);
            }
            return lista;
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null,"Erro ao consultar dados" + ex.getMessage());
        }
        return null;       
    } 
    private Connection getDB() {
        return DB.getConnection();
    }

}
