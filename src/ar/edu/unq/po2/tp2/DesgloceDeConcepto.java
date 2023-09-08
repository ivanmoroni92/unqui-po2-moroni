package ar.edu.unq.po2.tp2;

public class DesgloceDeConcepto {
	
	  private String key ;
	  private double value ;
	  
	  
	  public DesgloceDeConcepto (String key, double value ) {
		   this.key = key ;
		   this.value = value ;
		  
	  }


	public String getKey() {
		return key;
	}


	public void setKey(String key) {
		this.key = key;
	}


	public double getValue() {
		return value;
	}


	public void setValue(double value) {
		this.value = value;
	}
	  

}
