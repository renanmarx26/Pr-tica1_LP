class Main {
  public static void main(String[] args) {
  Scanner entrada = new Scanner(System.in);

  int Cadastro , Checkin , Cancelar , Sair ;
  int Passageiro , Nome , CPF , DataVoo, NumeroVoo , Horario;

  System.out.printIn ("1 - Cadastrar Passageiro\n");
  Cadastro = entrada.nextInt();

    System.out.printIn ("2 - Check in\n");
  Checkin = entrada.nextInt();

    System.out.printIn ("3 - Cancelar Voo\n");
  Cancelar = entrada.nextInt();

    System.out.printIn ("4 - Sair\n");
  Sair = entrada.nextInt();

    Random gerador = new Random();

    if (Passageiro = 'CPF' , 'Nome', 'DataVoo', 'Horario'){
     System.out.printIn("Cadastro Efetuado com Sucesso" + gerador.nextInt());
    
      }else(Passageiro = 'CPF' , 'NumeroVoo', 'Checkin'){
    System.out.printIn("Check in realizado com sucesso.");
      
      }else(Passageiro = 'CPF' , 'NumeroVoo', 'Cancelar')      {
      System.out.printIn ("Voo Cancelado com sucesso.");
      }
    
  
    
  }
}