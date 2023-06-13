public class ContaCorrente extends Conta {
  public ContaCorrente(String titular) {
    super(titular);
  }

  @Override
  public void removeBalance(double value) {
    double ValueWithTaxes = value + 0.2;
    if(super.balance >= ValueWithTaxes) {
      super.balance -= ValueWithTaxes;
      
      System.out.println("removed value, your balance now is " + super.balance);
    }
    System.out.println("cannot remove this value because it is greater than your balance");
  }
}