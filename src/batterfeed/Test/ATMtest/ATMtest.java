package batterfeed.Test.ATMtest;

public class ATMtest {
    public static void main(String[] args) throws ATM.NotEnoughBanknotesException, ATM.IncorrectWithdrawalAmountException {
        ATM atm = new ATM(
                5,
                0,
                15,
                1,
                0);


        showValues(atm.Withdrawal(3100));

    }

    public static void showValues(int[] values){
        System.out.println("Банкноты к выдаче:");
        System.out.println("\t" + values[0] + " по 50₽");
        System.out.println("\t" + values[1] + " по 100₽");
        System.out.println("\t" + values[2] + " по 500₽");
        System.out.println("\t" + values[3] + " по 1000₽");
        System.out.println("\t" + values[4] + " по 5000₽");
        System.out.println();
    }
}
