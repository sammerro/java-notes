package behavioral_test.memento;

public class Project {
    private String name;
    private Integer accountId;
    private Integer ownerId;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAccountId() {
        return accountId;
    }

    public void setAccountId(Integer accountId) {
        this.accountId = accountId;
    }

    public Integer getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(Integer ownerId) {
        this.ownerId = ownerId;

    }


    @Override
    public String toString() {
        return "Project{" +
                "name='" + name + '\'' +
                ", accountId=" + accountId +
                ", ownerId=" + ownerId +
                '}';
    }
}
