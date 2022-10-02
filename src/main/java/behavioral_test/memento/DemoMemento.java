package behavioral_test.memento;

public class DemoMemento {

    public static void main(String[] args) {
        //
        // project = new Project(name, accountId, owner)
        // porjectHistory = new ProjectChangeHistory(project);
        // history.pushState()
        // project.setName("zmienione");
        // history.pushState(project);
        StateHistory<Project> history = new StateHistory<>();
        Project project = new Project();
        history.add(new ProjectState(project));
        project.setName("Super project");
        history.add(new ProjectState(project));
        project.setOwnerId(32);
        history.add(new ProjectState(project));
        project.setAccountId(99);
        // undo
        history.pop().restore(project);
        history.pop().restore(project);
        //

        System.out.println(project.toString());

    }
}
