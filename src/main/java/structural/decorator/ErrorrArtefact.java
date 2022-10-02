package structural.decorator;

public class ErrorrArtefact implements IArtefact{

    IArtefact artefact;

    public ErrorrArtefact(IArtefact artefact) {
        this.artefact = artefact;
    }

    @Override
    public String render() {
        return artefact.render() + " | Error";
    }
}
