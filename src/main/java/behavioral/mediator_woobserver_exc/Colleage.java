package behavioral.mediator_woobserver_exc;

public abstract class Colleage {
    Mediator mediator;

    public Colleage(Mediator mediator) {
        this.mediator = mediator;
    }

    public void changed(Colleage colleage) {
        mediator.wasUpdated(colleage);
    };


}
