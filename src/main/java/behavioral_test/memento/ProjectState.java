package behavioral_test.memento;



public class ProjectState implements State<Project> {
    private final String name;
    private final Integer accountId;
    private final Integer ownerId;

    public ProjectState(Project project) {
        this.name = project.getName();
        this.accountId = project.getAccountId();
        this.ownerId = project.getOwnerId();
    }

    @Override
    public void restore(Project project) {
        if (project == null) return;
        project.setName(this.name);
        project.setAccountId(this.accountId);
        project.setOwnerId(this.ownerId);
    }
}
