package entidade;

public non-sealed class Cliente extends Pessoa{
    protected int id;
    private static int contador = 0;
    
    // Construtor vazio
    public Cliente() {
    	this.id = contador++;
    }
    
    // Getters e Setters
    public int getId() {
    	return id; }
    

    
  
}

