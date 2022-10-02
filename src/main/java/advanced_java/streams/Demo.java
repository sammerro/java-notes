package advanced_java.streams;

import java.util.*;
import java.util.function.BinaryOperator;
import java.util.function.IntBinaryOperator;
import java.util.function.IntPredicate;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Demo {

    public void show() {
        System.out.println("DEMO STREAMS");
        List<Movie> movieList = List.of(new Movie("Michal Improving", 12345, Genre.ACTION),
                new Movie("The Golden Fall", 44, Genre.DRAMA),
                new Movie("ASDFASFD", 3, Genre.COMEDY),
                new Movie("Allo Allo", 3, Genre.COMEDY));

        // get count of movies that have > 0 likes
        movieList.stream().filter(m -> m.getLikes() > 10).count();
        // for Each terminates stream
        movieList.stream().forEach(System.out::println);
        // stream of declared values
        Stream<Integer> integerStream = Stream.of(1, 2, 3, 4, 5);
        // 3 losowe liczby
        Stream<Double> generate = Stream.generate(() -> Math.random());
        generate.limit(3).forEach(System.out::println);
        // Stream iterate tworzy wartosci strean rekurencyjnie
        Stream.iterate(1, n -> n + 1).limit(10).forEach(System.out::println);


        //MAP to titles
        movieList.stream().map(m -> m.getTitle()).forEach(System.out::println);
        //flat map
        // Stream<List<Element>> -> Stream<Element>
        Stream.of(List.of(1,2,3,5), List.of(4,5,6)).flatMap( list -> list.stream()).forEach(System.out::println);


        // FILTER
        movieList.stream().filter(m -> m.getLikes() < 10).forEach(System.out::println);

        // SLICING
        long count = movieList.stream().skip(2).count();// 1
        // pagination
        int pageSize = 10;
        int page = 2;
        movieList.stream().skip((page - 1) * pageSize).limit(pageSize).forEach(System.out::println);
        // take while
        movieList.stream().takeWhile(m -> m.getLikes() < 30).forEach(System.out::println);
        // skipWhile
        movieList.stream().dropWhile(m -> m.getLikes() < 30).forEach(System.out::println); // 0

        // SORTING
        movieList.stream()
//                .sorted((m1, m2) -> m1.getTitle().compareTo(m2.getTitle()))
//                .sorted(Comparator.comparing(Movie::getTitle));
                .sorted(Comparator.comparing(Movie::getTitle).reversed());

        // UNIQUE VALUES
        movieList.stream()
                .map(Movie::getLikes)
                .distinct()
                .forEach(System.out::println);

        // PEEKING ELEMENTS
        movieList.stream()
                .filter(m -> m.getTitle().startsWith("The "))
                .peek(System.out::println)
                .map(Movie::getTitle)
                .forEach(System.out::println);

        //REDUCERS
        movieList.stream().count();
        movieList.stream().anyMatch(m -> m.getLikes() > 1);
        movieList.stream().allMatch(m -> m.getLikes() > 10);
        movieList.stream().noneMatch(m -> m.getLikes() > 10);
        movieList.stream().findFirst();
        movieList.stream().findAny();
        movieList.stream().max(Comparator.comparing(Movie::getLikes));
        movieList.stream().min(Comparator.comparing(Movie::getTitle));

        BinaryOperator<Integer> summing = (l1, l2) -> l1 + l2;
        Optional<Integer> optSum = movieList.stream().map(Movie::getLikes).reduce(summing);
        int sum = optSum.orElse(0);
        // same as
        Integer sum2 = movieList.stream().map(Movie::getLikes).reduce(0, summing);

        // COLLECTORS
        List<Movie> collect = movieList.stream().collect(Collectors.toList());
        Map<String, Integer> titleLikesMap = movieList.stream()
                .collect(Collectors.toMap(v -> v.getTitle(), v -> v.getLikes()));// title -> likes count
        Integer sum3 = movieList.stream().collect(Collectors.summingInt(Movie::getLikes));
        IntSummaryStatistics stats = movieList.stream().collect(Collectors.summarizingInt(Movie::getLikes)); // !!
        // joining
        String allTitles = movieList.stream().map(Movie::getTitle).collect(Collectors.joining(", "));

        Map<Genre, List<Movie>> groupedByGenre = movieList.stream().collect(Collectors.groupingBy(Movie::getGenre));
        Map<Genre, Set<Movie>> groupedByGenreSets = movieList.stream().collect(Collectors.groupingBy(Movie::getGenre, Collectors.toSet()));

        Collector<Movie, ?, String> joinMoviesTitlesCollector = Collectors.mapping(Movie::getTitle, Collectors.joining("; "));
        Map<Genre, String> genreToString = movieList.stream()
                .collect(Collectors.groupingBy(Movie::getGenre, joinMoviesTitlesCollector));

        // PARTITIONING
        Map<Boolean, List<Movie>> partitions10Likes = movieList.stream().collect(Collectors.partitioningBy(m -> m.getLikes() > 10));

        // PRIMITIVE STREAMS
        IntStream.of(1,5,3,4);
        IntStream.range(1, 10).forEach(System.out::println);


    }

}
