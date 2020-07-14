/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Will
 */
public class Product {
    private int codProduto;
    private String dataEntrada;
    private String localCompra;
    private String tipoProduto;
    private String marcaProduto;
    private String detalheProduto;
    private String tamanho;
    private String cor;
    private double valorEtiquetaCompraProd;
    private double valorPagoCompraProd;
    private double valorMargemLucro;
    private double precoSugerido;

    public int getCodProduto() {
        return codProduto;
    }

    public void setCodProduto(int codProduto) {
        this.codProduto = codProduto;
    }

    public String getDataEntrada() {
        return dataEntrada;
    }

    public void setDataEntrada(String dataEntrada) {
        this.dataEntrada = dataEntrada;
    }

    public String getLocalCompra() {
        return localCompra;
    }

    public void setLocalCompra(String localCompra) {
        this.localCompra = localCompra;
    }

    public String getTipoProduto() {
        return tipoProduto;
    }

    public void setTipoProduto(String tipoProduto) {
        this.tipoProduto = tipoProduto;
    }

    public String getMarcaProduto() {
        return marcaProduto;
    }

    public void setMarcaProduto(String marcaProduto) {
        this.marcaProduto = marcaProduto;
    }

    public String getDetalheProduto() {
        return detalheProduto;
    }

    public void setDetalheProduto(String detalheProduto) {
        this.detalheProduto = detalheProduto;
    }

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public double getValorEtiquetaCompraProd() {
        return valorEtiquetaCompraProd;
    }

    public void setValorEtiquetaCompraProd(double valorEtiquetaCompraProd) {
        this.valorEtiquetaCompraProd = valorEtiquetaCompraProd;
    }

    public double getValorPagoCompraProd() {
        return valorPagoCompraProd;
    }

    public void setValorPagoCompraProd(double valorPagoCompraProd) {
        this.valorPagoCompraProd = valorPagoCompraProd;
    }

    public double getValorMargemLucro() {
        return valorMargemLucro;
    }

    public void setValorMargemLucro(double valorMargemLucro) {
        this.valorMargemLucro = valorMargemLucro;
    }

    public double getPrecoSugerido() {
        return precoSugerido;
    }

    public void setPrecoSugerido(double precoSugerido) {
        this.precoSugerido = precoSugerido;
    }
    
}
