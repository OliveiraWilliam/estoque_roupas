/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import db.DB;
import java.net.URL;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import model.Product;
import model.dao.ProductDAO;

/**
 * FXML Controller class
 *
 * @author Will
 */
public class DashboardCrudController implements Initializable {
   
    public boolean save(String acao, int codProd, String dataEntrada, String localCompra, String tipoProduto, 
    String marcaProduto, String detalheProduto, String tamanho, String Cor, double valorEtiquetaCompraProd, double valorPagoCompraProd, double valorMargemLucro, double precoSugerido){
        Product a = new Product();
        a.setCodProduto(codProd);
        a.setDataEntrada(dataEntrada);
        a.setLocalCompra(localCompra);
        a.setTipoProduto(tipoProduto);
        a.setMarcaProduto(marcaProduto);
        a.setDetalheProduto(detalheProduto);
        a.setTamanho(tamanho);
        a.setCor(Cor);
        a.setValorEtiquetaCompraProd(valorEtiquetaCompraProd);
        a.setValorPagoCompraProd(valorPagoCompraProd);
        a.setValorMargemLucro(valorMargemLucro);
        a.setPrecoSugerido(precoSugerido);
        
        ProductDAO productDAO = new ProductDAO();
        
        if(acao.equals("salvar")){
            if(productDAO.save(a))
                return true;
            
        }
        else{
            if(productDAO.update(a))
                return true;
        }
        return false;    
    }
    
    public List<Product> read(String parameter){
        List<Product> list = new ArrayList<>();
        ProductDAO productDAO = new ProductDAO();
        list = productDAO.readProduct(parameter);   
        return list;       
    }
    
    public boolean destoy(int codProduto){
        ProductDAO productDAO = new ProductDAO();
        return productDAO.destroy(codProduto);
    }
    
    @FXML
    private TableView<Product> tblViewProd;
    @FXML
    private TableColumn<Product, String> tblColumnCod;
    @FXML
    private TableColumn<Product, String> tblColumnDesc;
    @FXML
    private Button btnInserir;
    @FXML
    private Button btnAlterar;
    @FXML
    private Button btnExcluir;
    @FXML
    private Label lblCodProd;
    @FXML
    private Label lblDataEntradaProd;
    @FXML
    private Label lblLocalCompraProd;
    @FXML
    private Label lblTipoProd;  
    @FXML
    private Label lblMarcaProd;
    @FXML
    private Label lblDetalheProd;
    @FXML
    private Label lblTamanhoProd;      
    @FXML
    private Label lblCorProd;
    @FXML
    private Label lblVlrEtiquetaProd;
    @FXML
    private Label lblVlrPagoCompraProd;
    @FXML
    private Label lblVlrMargemProd;
    @FXML
    private Label lblPrecoSugeridoProd;
    
    private List<Product> listProduct;
    private ObservableList<Product> observableListProduct;
        
    @Override
    public void initialize(URL url, ResourceBundle rb) {

    }
        
  }   
