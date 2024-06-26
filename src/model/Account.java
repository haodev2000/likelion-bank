package model;

public abstract class Account {
    private int id;
    private String accountid;
    private String name;
    public Long initialDeposit;
    private Long blance;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAccountid() {
        return accountid;
    }

    public void setAccountid(String accountid) {
        this.accountid = accountid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getInitialDeposit() {
        return initialDeposit;
    }

    public void setInitialDeposit(Long initialDeposit) {
        this.initialDeposit = initialDeposit;
    }

    public Long getBlance() {
        return blance;
    }

    public void setBlance(Long blance) {
        this.blance = blance;
    }
}
