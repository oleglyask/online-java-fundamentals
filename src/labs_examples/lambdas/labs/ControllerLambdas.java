
    package labs_examples.lambdas.labs;
    import java.io.IOException;
    import java.nio.file.Files;
    import java.nio.file.Paths;
    import java.sql.SQLOutput;
    import java.util.*;
    import java.util.function.*;
    import java.util.stream.Collectors;
    import java.util.stream.IntStream;
    import java.util.stream.Stream;

    public class ControllerLambdas {

        public static void main(String[] args) throws IOException {



            //interface
            MyInterface myInterface = (i) -> i * i;
            System.out.println(myInterface.squareNumber(4));

            //1 BiFunction example
            BiFunction<Integer, Integer, Integer> function = (Integer a, Integer b) -> a + b;
            System.out.println(function.apply(7, 3));

            //2 Supplier example
            Supplier<ArrayList<Integer>> listIntegers = () -> {
                  ArrayList<Integer> list = new ArrayList<Integer>();
                  for (int i=0; i < 5; i++)
                      list.add(i);
                  return list;
            };
            System.out.println(listIntegers.get().toString());

            //3 consumer  example
            IntConsumer consumer = i -> System.out.println(String.valueOf(i+10));
            consumer.accept(10);

            //4 predicate example
            Predicate<Integer> predicate = (Integer i) -> i > 100;
            System.out.println(predicate.test(99));

            //5 another consumer example
            IntConsumer consumer2 = System.out::println;
            consumer2.accept(55);

            //6 string supplier example
            String stringSup = "hello";
            Supplier<String> stringSupplier = stringSup::toUpperCase;
            System.out.println(stringSupplier.get());

            //7 .range example
            IntStream
                    .range(1,16)
                    .forEach(System.out::println);

            //8 .map example
            int sum = Arrays.stream(new int[] {10,20,30,40,50})
                    .map(x->x+10)
                    .sum();
            System.out.println(sum);

            //9 .filter + average example
            Arrays.stream(new int[] {10,20,30,40,50})
                    .filter(x->x<45)
                    .average()
                    .ifPresent(System.out::println);

            //10 .reduce example
            Arrays.stream(new int[] {10,20,30,40,50})
                    .reduce((x,y) -> x + y)
                    .ifPresent(System.out::println);

            //11 working with file example
            String dataFile = "src/labs_examples/lambdas/labs/stream_text_lab.csv";
            Stream<String> lines = Files.lines(Paths.get(dataFile));

            Map<String, Double> list = new HashMap<>();
            double sum2 = 0;

           list = lines
                   .map(x->x.split(","))
                   //.collect(Collectors.toList(x->x[2]));
                   .collect(Collectors.toMap(
                           x->x[0],
                           x->Double.parseDouble(x[2])));
           for (String key : list.keySet()){
               System.out.println(list.get(key));
               sum2 += list.get(key);
           }

            System.out.println(sum2);

           // 12 .anyMatch example
            System.out.println(Arrays.stream(new int[] {1,2,3,4,5,6}).anyMatch(x->x==6));

            // 13 .allMatch example
            System.out.println(Arrays.stream(new int[] {11,12,13,14,15,16}).allMatch(x->x>11));

            //14 .toList example
            Stream<Integer> ints = Stream.of(1,2,3,4,5);
            List<Integer> myInts = ints.collect(Collectors.toList());
            System.out.println(myInts.toString());



        }
    }
