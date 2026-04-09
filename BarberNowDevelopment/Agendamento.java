package entidade;

import java.time.LocalDateTime;

public class Agendamento {
    private int id;
    private int clienteId;
    private int barbeiroId;
    private LocalDateTime dataHora;
    private double valor;
    
    // Construtor vazio
    public Agendamento() {}
    
    // Getters e Setters
    public int getId() { return id; }
    public void setId(int id) {
    	this.id = id; }
    
    public int getClienteId() {
    	return clienteId; }
    
    public void setClienteId(int clienteId) {
    	this.clienteId = clienteId; }
    
    public int getBarbeiroId() {
    	return barbeiroId; }
    
    public void setBarbeiroId(int barbeiroId) {
    	this.barbeiroId = barbeiroId; }
    
    public LocalDateTime getDataHora() {
    	return dataHora; }
    
    public void setDataHora(LocalDateTime dataHora) {
    	this.dataHora = dataHora; }
    
    public double getValor() {
    	return valor; }
    
    public void setValor(double valor) {
    	this.valor = valor; }
}
