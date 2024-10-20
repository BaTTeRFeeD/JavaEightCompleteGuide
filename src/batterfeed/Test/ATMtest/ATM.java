package batterfeed.Test.ATMtest;

public class ATM {
    private int[] banknotes; //массив, содержащий колличество банкнот разных номиналов
                             //пример: {кол-во 50₽, кол-во 100₽, кол-во 500₽, кол-во 1000₽, кол-во 5000₽,}
    ATM(int amount50, int amount100, int amount500, int amount1000, int amount5000){
        banknotes = new int[]{
                Math.max(amount50, 0),
                Math.max(amount100, 0),
                Math.max(amount500, 0),
                Math.max(amount1000, 0),
                Math.max(amount5000, 0)};
    }

    ATM(int[] values){
        banknotes = values;
    }


    /**
     * В цикле мы по очереди отнимаем от заданной суммы выдачи
     * купюры разного номинала, начиня от самой крупной.
     * Если купюру отнять нельзя(например: 3000 - 5000 = -2000 =>
     * отрицательное быть не может), тогда очередь переходит на
     * более мелкиий номинал. При это не забываем проверять, чтобы
     * в массиве bknts было нужное кол-во нужных купюр. Если же заданная
     * сумма равна 0 или же в банкомате не хватает банкнот, тогда мы просто
     * выходим из цикла. Далее 2 варианта событий:
     * 1. Если заданная сумма стала равна 0(то есть кол-вом имеющихся банкнот
     * можно оплатить эту сумму) Тогда возвращается массив с кол-вом купюр
     * на выдачу(он подобен тому, в котором храниться кол-во имеющихся купюр).
     * А также массив с отняным количеством банкнот bknts присваевается
     * основному(banknotes).
     * 2. Если же нужного кол-ва купюр для выдачи заданной суммы не нашлось,
     * банкомат создаёт исключение NotEnoughBanknotesException и завершает работу.
     * @param amount
     * @return кол-во купюр к выдаче
     * @throws NotEnoughBanknotesException
     * @throws IncorrectWithdrawalAmountException
     */
    int[] Withdrawal(int amount) throws NotEnoughBanknotesException, IncorrectWithdrawalAmountException{
        int[] result = new int[]{0,0,0,0,0};
        int[] bknts = banknotes;
        try{
            if(amount % 50 != 0){ throw new IncorrectWithdrawalAmountException(); } //проверка корректного ввода значения

            while (amount > 0){
                if(amount - 5000 >= 0 && bknts[4] > 0){
                    amount -= 5000;
                    result[4]++;
                    bknts[4]--;
                } else if ((amount - 1000 >= 0) && (bknts[3] > 0)) {
                    amount -= 1000;
                    result[3]++;
                    bknts[3]--;
                } else if (amount - 500 >= 0 && bknts[2] > 0) {
                    amount -= 500;
                    result[2]++;
                    bknts[2]--;
                } else if (amount - 100 >= 0 && bknts[1] > 0) {
                    amount -= 100;
                    result[1]++;
                    bknts[1]--;
                } else if (amount - 50 >= 0 && bknts[0] > 0) {
                    amount -= 50;
                    result[0]++;
                    bknts[0]--;
                } else {
                    break;
                }
            }

            if(amount == 0){
                banknotes = bknts;
                return result;
            }
            else{
                throw new NotEnoughBanknotesException();
            }

        } catch (IncorrectWithdrawalAmountException e){
            System.out.println("ОШИБКА! Сумма для вывода должна быть кратна 50₽.");
            e.printStackTrace();
            return new int[5];
        } catch (NotEnoughBanknotesException e){
            System.out.println("ОШИБКА! Нехватает банкнот для выдачи заданной суммы.");
            e.printStackTrace();
            return new int[5];
        }
    }


    public static class NotEnoughBanknotesException extends Exception{
        NotEnoughBanknotesException(){
            super();
        }
        NotEnoughBanknotesException(String message){
            super(message);
        }
    }

    public static class IncorrectWithdrawalAmountException extends Exception{
        IncorrectWithdrawalAmountException(){
            super();
        }

        IncorrectWithdrawalAmountException(String message){
            super(message);
        }
    }
}
