file:///C:/Users/Abdulla/OneDrive/Desktop/Codes/Java/Datatypes/Array.java
### java.util.NoSuchElementException: next on empty iterator

occurred in the presentation compiler.

presentation compiler configuration:
Scala version: 3.3.3
Classpath:
<HOME>\AppData\Local\Coursier\cache\v1\https\repo1.maven.org\maven2\org\scala-lang\scala3-library_3\3.3.3\scala3-library_3-3.3.3.jar [exists ], <HOME>\AppData\Local\Coursier\cache\v1\https\repo1.maven.org\maven2\org\scala-lang\scala-library\2.13.12\scala-library-2.13.12.jar [exists ]
Options:



action parameters:
uri: file:///C:/Users/Abdulla/OneDrive/Desktop/Codes/Java/Datatypes/Array.java
text:
```scala
import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

public class Array {
    public static void main(String[] args) {
        int[] Array1 = new int[5]; 
        
        int[] Array2 = { 1, 2, 3, 4, 5 };

        int[] Array3;
        Array3 = new int[]{ 1, 2, 3, 4, 5 };
        System.out.println(Array3.length);

        int[] sourceArray = { 1, 2, 3 };
        int[] targetArray = new int[sourceArray.length];
        System.arraycopy(sourceArray, 0, targetArray, 0, sourceArray.length);

        int max = Arrays.stream(Array2).max().getAsInt();
        int min = Arrays.stream(Array2).min().getAsInt();
        System.out.println("max in Array1 ="+max);
        System.out.println("min in Array1 ="+min);

        System.out.println("Index of value ="+Arrays.binarySearch(Array2,2));

        for (int number : Array2) {
            System.out.println(number);
        }

        int[] numbers = { 5, 2, 9, 1, 7 };
        Arrays.sort(numbers);
        System.out.println("Sorted array:");
        for (int num : numbers) {
            System.out.print(num+", ");
        }
        System.out.println("\n"+Arrays.toString(numbers));              //don't work for 2D Arrays

        int[][] Array4 = {{9,4,7},{4,3,1,4,2,5,3}};
        System.out.println("\n"+Arrays.deepToString(Array4));

        String[] filledArray3 = new String[Array3.length];
        Arrays.fill(filledArray3, "");
        System.out.println("to String ="+Arrays.toString(filledArray3));

        Integer[] Array5= new Integer[5];
        System.out.println("List =");

        Integer[] integerArray = {1, 2, 3, 4, 5, 2, 3};
        String[] stringArray = {"apple", "banana", "cherry", "date", "elderberry"};

        // Create lists using Arrays.asList()
        List<Integer> integerList = Arrays.asList(integerArray);
        List<String> stringList = Arrays.asList(stringArray);

        // Printing Integer list
        System.out.print("Integer List:  ");
        for (int number : integerList) {
            System.out.print(number+" ");
        }
        System.out.print("\nString List:");
        for (String fruit : stringList) {
            System.out.print(fruit+" ");
        }
    }
}

```



#### Error stacktrace:

```
scala.collection.Iterator$$anon$19.next(Iterator.scala:973)
	scala.collection.Iterator$$anon$19.next(Iterator.scala:971)
	scala.collection.mutable.MutationTracker$CheckedIterator.next(MutationTracker.scala:76)
	scala.collection.IterableOps.head(Iterable.scala:222)
	scala.collection.IterableOps.head$(Iterable.scala:222)
	scala.collection.AbstractIterable.head(Iterable.scala:933)
	dotty.tools.dotc.interactive.InteractiveDriver.run(InteractiveDriver.scala:168)
	scala.meta.internal.pc.MetalsDriver.run(MetalsDriver.scala:45)
	scala.meta.internal.pc.PcCollector.<init>(PcCollector.scala:44)
	scala.meta.internal.pc.PcSemanticTokensProvider$Collector$.<init>(PcSemanticTokensProvider.scala:61)
	scala.meta.internal.pc.PcSemanticTokensProvider.Collector$lzyINIT1(PcSemanticTokensProvider.scala:61)
	scala.meta.internal.pc.PcSemanticTokensProvider.Collector(PcSemanticTokensProvider.scala:61)
	scala.meta.internal.pc.PcSemanticTokensProvider.provide(PcSemanticTokensProvider.scala:90)
	scala.meta.internal.pc.ScalaPresentationCompiler.semanticTokens$$anonfun$1(ScalaPresentationCompiler.scala:110)
```
#### Short summary: 

java.util.NoSuchElementException: next on empty iterator