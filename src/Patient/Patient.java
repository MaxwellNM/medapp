package Patient;

public class Patient {
	
	private String  FirstName;
	
	private String  LastName;
	
	private String  SexePatient;
        
        private String  AgePatient;
	
	private String  PaysPatient;
	
	private String  VillePatient;
	
	
	
	public String getFirstName(){
		return this.FirstName;
	}

	public void setFirstName(String st){
		this.FirstName = st;
	}

	public String getLastName(){
		return this.LastName;
	}

	public void setLastName(String st){
		this.LastName = st;
	}
	
	public String getSexe(){
		return this.SexePatient;
	}

	public void setSexe(String st){
		this.SexePatient = st;
	}    
        
        
	
        
        public String toString(){
            String st;
            st = FirstName+" "+LastName+" ("+SexePatient+"), ";
            return st;
            
        }
}
