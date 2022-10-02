package structural.decorator;

public class BaseArtefact implements IArtefact{

    String name;

    public BaseArtefact(String name) {
        this.name = name;
    }

    @Override
    public String render() {
        return "Base Artefact";
    }
}
