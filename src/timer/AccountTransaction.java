package timer;

public class AccountTransaction {

        long accountNo;
        double amount;
        String transactiontype;

        AccountTransaction (long accountNo,double amount,String transactiontype){
            this.accountNo =accountNo;
            this.amount =amount;
            this.transactiontype =transactiontype;
        }

    public long getAccountNo() {
        return accountNo;}

    public void setAccountNo(long accountNo) {
        this.accountNo = accountNo;
    }

    public double getAmount() {
        return amount;
    }

    public long  setAmount(long amount) {
            if (getTransactiontype() == "cr" ){
                amount +=getAmount();
            }
            else if((getTransactiontype()=="dr") && amount - getAmount() >0)
             amount -=getAmount();
           return amount;
    }

    public String getTransactiontype() {
        return transactiontype;
    }

    public void setTransactiontype(String transactiontype) {
        this.transactiontype = transactiontype;
    }

}

/*
accountno ,transactiontype , amount

valid account number  \\ validation the size , starting with // non zero // digits // spaces // special characters //select  5 1
cr /dr
amount - non negative , 0 ,0000

button

id --autoincremented

unique id -- not present in table

SELECT MAX(ID) FROM TABLE;

UPDATE TABLE T */

