package behavioral.strategy_mine;

import java.util.ArrayList;
import java.util.List;

public class ImageStorage {

    private List<String> images;

    public ImageStorage() {
        images = new ArrayList<>();
    }

    public void store(String filename, ImageCompressing compressing, ImageFilter filter) {
        String compress = compressing.compress(filename);
        filter.process(compress);
        images.add(compress);
    }

}
