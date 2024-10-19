//public abstract class Account {
//    private int balance;
//    int pay(int amount){
//        balance -= amount;
//        return balance;
//    }
//    int transfer(Account account, int amount){
//        account.balance += amount;
//        balance -= amount;
//        return balance;
//    }
//    int addMoney(int amount){
//        balance += amount;
//        return balance;
//    }
//    public abstract int getBalance();
//}
//
//class SavingsAccount extends Account {
//    private int balance;
//    @Override
//    int pay(int amount) {
//        System.out.println("Со сберегательного счета нельзя оплачивать");
//        return 0;
//    }
//
//    @Override
//    int transfer(Account account, int amount) {
//        if (balance > amount) {
//            balance = super.transfer(account, amount);
//            return balance;
//        } else {
//            System.out.println("Недостаточно средств");
//            return balance;
//        }
//    }
//
//    @Override
//    int addMoney(int amount) {
//        balance = super.addMoney(amount);
//        return balance;
//    }
//
//    @Override
//    public int getBalance() {
//        System.out.println("Сберегательный счет: " + balance);
//        return balance;
//    }
//}
//
//class CreditAccount extends Account {
//    private int balance;
//    @Override
//    int addMoney(int amount) {
//        if ((balance + amount) < 0) {
//            balance = super.addMoney(amount);
//            return balance;
//        } else if (balance == 0) {
//            System.out.println("Баланс уже равен нулю");
//            return 0;
//        } else {
//            System.out.println("Вы можете добавить" + balance);
//            return balance;
//        }
//    }
//
//    @Override
//    public int getBalance() {
//        System.out.println("Кредитный счет: " + balance);
//        return balance;
//    }
//}
//
//class CheckingAccount extends Account {
//    private int balance;
//
//    @Override
//    int transfer(Account account, int amount) {
//        if (balance > amount) {
//            balance = super.transfer(account, amount);
//        }
//        return balance;
//    }
//
//    @Override
//    int pay(int amount) {
//        if (balance > amount) {
//            balance = super.pay(amount);
//        }
//        return balance;
//    }
//
//    @Override
//    int addMoney(int amount) {
//        balance = super.addMoney(amount);
//        return balance;
//    }
//
//    @Override
//    public int getBalance() {
//        System.out.println("Расчетный счет: " + balance);
//        return balance;
//    }
//}
//
//class Main {
//    public static void main(String[] args) {
//        SavingsAccount account1 = new SavingsAccount();
//        CreditAccount account2 = new CreditAccount();
//        CheckingAccount account3 = new CheckingAccount();
//        account1.addMoney(10000);
//        account2.addMoney(10000);
//        account3.addMoney(10000);
//        account1.getBalance();
//        account2.getBalance();
//        account3.getBalance();
//        account1.pay(15000);
//        account2.pay(15000);
//        account3.pay(15000);
//        account1.getBalance();
//        account2.getBalance();
//        account3.getBalance();
//    }
//}

//Я замудрил, не туда пошел, ничего не понял, понял что все плохо