package heranca.bank;

/* Adicionar a plavra "final", bloqueia a criação de subclasses
    Exemplo em SavingAccountPlus
    Em métodos a palavra "final" bloqueia a herança dos mesmos.
 */
public final class SavingsAccount extends Account{
    private Double interestRate;

    public SavingsAccount(){
        super();
    }

    public SavingsAccount(Integer number, String holder, Double balance, Double interestRate) {
        super(number, holder, balance);
        this.interestRate = interestRate;
    }

    @Override
    public final void withdraw(Double amount) {
        balance -= amount;
    }

    public void updateBalance(){
        balance += balance * interestRate;
    }

    public Double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(Double interestRate) {
        this.interestRate = interestRate;
    }
}
