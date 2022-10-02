package behavioral.visitor;

import java.util.ArrayList;
import java.util.List;

public class WavFile {
    private List<Segment> segments = new ArrayList<>();

    public static WavFile read(String fileName) {
        // Simulate reading a wav file and building the segments
        var wavFile = new WavFile();
        wavFile.segments.add(new FormatSegment());
        wavFile.segments.add(new FactSegment());
        wavFile.segments.add(new FactSegment());
        wavFile.segments.add(new FactSegment());

        return wavFile;
    }

    public void reduceNoise() {
        NoiceReduceOperation noiceReduceOperation = new NoiceReduceOperation();
        for (var segment : segments)
            segment.execute(noiceReduceOperation);
    }

    public void addReverb() {
        AddReverbOperation addReverbOperation = new AddReverbOperation();
        for (var segment : segments)
            segment.execute(addReverbOperation);
    }

    public void normalize() {
        NormalizeOperation normalizeOperation = new NormalizeOperation();
        for (var segment : segments)
            segment.execute(normalizeOperation);
    }
}
