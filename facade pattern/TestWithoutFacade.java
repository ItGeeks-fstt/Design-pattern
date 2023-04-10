public class TestWithoutFacade {
    public static void main(String[] args) {
        WelcomeToBank bankWelcome = new WelcomeToBank();
        AccountNumberCheck acctChecker = new AccountNumberCheck();
        SecurityCodeCheck codeChecker = new SecurityCodeCheck();
        FundsCheck fundChecker = new FundsCheck();

        System.out.println("Bank Account Details:");
        System.out.println("Account Number: " + acctChecker.getAccountNumber());
        System.out.println("Security Code: " + codeChecker.getSecurityCode());
        System.out.println();

        double cashToWithdrawal = 500.00;
        if (acctChecker.accountActive(acctChecker.getAccountNumber()) &&
                codeChecker.isCodeCorrect(codeChecker.getSecurityCode()) &&
                fundChecker.haveEnoughMoney(cashToWithdrawal)) {
            System.out.println("Transaction Complete\n");
        } else {
            System.out.println("Transaction Failed\n");
        }

        double cashToDeposit = 1000.00;
        if (acctChecker.accountActive(acctChecker.getAccountNumber()) &&
                codeChecker.isCodeCorrect(codeChecker.getSecurityCode())) {
            fundChecker.makeDeposit(cashToDeposit);
            System.out.println("Transaction Complete\n");
        } else {
            System.out.println("Transaction Failed\n");
        }
    }
}






