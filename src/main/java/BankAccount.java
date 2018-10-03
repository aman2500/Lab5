import java.util.Random;

/**
 * Class implementing a bank account.
 * <p>
 * Complete and document this class as part of Lab 5.
 *
 * @see <a href="https://cs125.cs.illinois.edu/lab/5/">Lab 5 Description</a>
 */
public class BankAccount {

    /**
     * You may want to use this to distinguish between different kinds of accounts.
     */
    public enum BankAccountType {
        /**
         * comment.
         */
        CHECKINGS,
        /**
         * comment.
         */
        SAVINGS,
        /**
         * comment.
         */
        STUDENT,
        /**
         * comment.
         */
        WORKPLACE
    }
    /**
     * comment.
     */
    private int accountNumber;
    /**
     * comment.
     */
    private BankAccountType accountType;
    /**
     * comment.
     */
    private double accountBalance;
    /**
     * comment.
     */
    private String ownerName;
    /**
     * comment.
     */
    private double interestRate;
    /**
     * comment.
     */
    private double interestEarned;

    /**
     * comment.
     * @param accountCategory j.
     * @param name n.
     */
    public BankAccount(final String name, final BankAccountType accountCategory) {
        /*
         * Implement this function
         */
    }
    /**
     * comment.
     */
    public int getAccountNumber() {
        return accountNumber;
    }
    /**
     * comment.
     * @param accountNumber w.
     */
    public void setAccountNumber(final int accountNumber) {
        this.accountNumber = accountNumber;
    }
    /**
     * comment.
     */
    public BankAccountType getAccountType() {
        return accountType;
    }
    /**
     * comment.
     */
    public double getAccountBalance() {
        return accountBalance;
    }
    /**
     * comment.
     */
    public double getInterestEarned() {
        return interestEarned;
    }
    /**
     * comment.
     * @param accountType p.
     */
    public void setAccountType(final BankAccountType accountType) {
        this.accountType = accountType;
    }
    /**
     * comment.
     */
    public double getInterestRate() {
        return interestRate;
    }
    /**
     * comment.
     */
    public String getOwnerName() {
        return ownerName;
    }
    /**
     * comment.
     * @param accountBalance e.
     */
    public void setAccountBalance(final double accountBalance) {
        this.accountBalance = accountBalance;
    }
    /**
     * comment.
     * @param interestEarned l.
     */
    public void setInterestEarned(final double interestEarned) {
        this.interestEarned = interestEarned;
    }
    /**
     * comment.
     * @param interestRate s.
     */
    public void setInterestRate(final double interestRate) {
        this.interestRate = interestRate;
    }
    /**
     * comment.
     * @param ownerName s.
     */
    public void setOwnerName(final String ownerName) {
        this.ownerName = ownerName;
    }
}
