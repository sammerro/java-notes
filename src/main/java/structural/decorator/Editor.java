package structural.decorator;

public class Editor {
    public void openProject(String path) {
//        Artefact[] artefacts = {
//                new Artefact("Main"),
//                new Artefact("Demo"),
//                new Artefact("EmailClient"),
//                new Artefact("EmailProvider"),
//        };
//
//        artefacts[0].setMain(true);
//        artefacts[2].setHasError(true);
//
//        for (var artefact : artefacts)
//            System.out.println(artefact.render());

        IArtefact[] artefacts = {
                new BaseArtefact("Main"),
                new BaseArtefact("Demo"),
                new BaseArtefact("EmailClient"),
                new BaseArtefact("EmailProvider"),
        };

        artefacts[0] = new MainArtefact(artefacts[0]);
        artefacts[2] = new ErrorrArtefact(artefacts[2]);

        for (var artefact : artefacts)
            System.out.println(artefact.render());
    }
}
