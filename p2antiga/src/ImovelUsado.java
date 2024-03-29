package imoveis;

public class ImovelUsado extends Imovel{
	  
	  private double taxaDesc;
	  private int ano;
	  
	  public ImovelUsado(){
	    
	  }
	  public ImovelUsado(Imovel im, double taxaDesc, int ano){
	    super(im.getLocalizacao(),im.getPreco(),im.getQtdquartos(),im.getProp());
	    this.taxaDesc = taxaDesc;
	    this.ano = ano;
	  }
	  
	  public double calcularValorFinal(){
	    return(super.getPreco() - taxaDesc);
	  }
	  
	  public String toString(){
	    return (super.toString()+"\nValor final: "+calcularValorFinal()+"\nAno de construção: "+ano);
	  }
	  public double getTaxaDesc(){
	    return taxaDesc;
	  }
	  public void setTaxaDesc(double taxaDesc){
	    this.taxaDesc = taxaDesc;
	  }
	  public int getAno(){
	    return ano;
	  }
	  public void setAno(int ano){
	    this.ano = ano;
	  }
	}
