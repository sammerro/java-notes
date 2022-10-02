package structural.decorator;

public class MainArtefact implements IArtefact{

    IArtefact artefact;

    public MainArtefact(IArtefact artefact) {
        this.artefact = artefact;
    }

    @Override
    public String render() {
        return artefact.render() + " | isMain";
    }
}
