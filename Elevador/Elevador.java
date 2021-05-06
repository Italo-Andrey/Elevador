class Elevador {

	private String code; 
	private int state; //0, 1, 2, ou 3
	private int position;
	private int totalRun; //historico deslocamentos

	public boolean off(){
		if(this.state == 0){
			return true;
		}else
			return false;
	}

	public void boot(String code){
		if (this.state == 0) {
			this.code = Code;
			this.position = 0;
			this.totalRun = 0;
			this.state = 1; //disponivel
		} else {
			System.out.println("(debug) falha, operação ilegal!");
		}
	}

	public void turnOn(){

		if (this.state == 0) {
			this.state = 1;
		}  else {
			System.out.println("(debug) falha, operação ilegal!");
		}

	}

	public void turnOff(){

		if (this.state == 1 && this.position == 0) { //disponivel e no no terreo
			this.state = 0;
		}  else {
			System.out.println("(debug) falha, operação ilegal!");
		}

	}

	public void move(int destiny){
		
		if (this.state == 1 && destiny >= 0) {
			
			int delta;

			if (destiny > this.position) {
					System.out.println("\n(debug) subindo...>" + destiny);
					delta = destiny - position;
			} else { 
					System.out.println("\n(debug) descendo...>" + destiny);
					delta = position - destiny;

		}

			totalRun = totalRun + delta;

			this.position = destiny;

		} else {
			System.out.println("(debug) falha, operação ilegal!");
		}

	}
	

	public int getPosition() {

		return this.position;

	}

	public int getTotalRun() {

		return this.totalRun;

	}

	public String getCodigo() {
	
        return this.code;
	
    }
}