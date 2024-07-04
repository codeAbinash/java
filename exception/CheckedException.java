package exception;

class LowBalanceException extends Exception {
  public String toString() {
    return "Balance is low";
  }
}

class Bank {
  int balance = 100;

  void withdraw(int amount) throws LowBalanceException {
    if (balance < amount) {
      throw new LowBalanceException();
    } else {
      balance -= amount;
      System.out.println("Withdrawal successful");
    }
  }
}

public class CheckedException {
  public static void main(String[] args) {
    Bank bank = new Bank();
    try {
      bank.withdraw(200); // Exception Must be handled
    } catch (Exception e) {
      System.out.println("Exception: " + e.getMessage());
      System.out.println(e);
      e.getStackTrace();
    }
  }
}
