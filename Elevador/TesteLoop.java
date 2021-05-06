import java.util.Scanner;

class TesteLoop{

    void loop(){
        Scanner teclado = new Scanner(System.in);
       Elevador e = new Elevador();
        
       e.boot("Loop");
       int opcao;

    while(!e.off()){
        System.out.println("andar atual ->" + e.getPosition());
        System.out.println("proximo -> ");
            opcao = teclado.nextInt();

            if(opcao == -1){
                e.turnOff();
            }    
            else{
                e.move(opcao);
            }
            

}

}
}
