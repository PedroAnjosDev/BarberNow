package entidade;

public non-sealed class Barbeiro extends Pessoa {
    protected int id;
    private String nome;
    private String telefone;
    private String email;
    private String endereco;
    private static int contador = 1;
    
    
    public Barbeiro() {
    	this.id = contador++;
    }
    
    // Getters e Setters
    public int getId() {
    	return id; }
    
}

