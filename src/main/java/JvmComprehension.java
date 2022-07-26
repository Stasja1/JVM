public class JvmComprehension {

    public static void main(String[] args) {
        int i = 1;                      // 1. В Main фрейме, в Stack создаётся переменная int i = 1;
        Object o = new Object();        // 2 В heap создаем объект Object и во фрейме main создается переменная "o" которой присваивается ссылка на этот объект
        Integer ii = 2;                 // 3. В heap создаем объект Integer и ему присваиваем значение "2", во фрейме main появляется переменная ii, которая ссылается на этот объект
        
        printAll(o, i, ii);             // 4 В памяти стека создается фрейм метода printAll(), в этот фрейм входит переменная "o"типа Object она связывается с объектом "o" в памяти heap,
         // также в этот фрейм помещается переменная i типа int она связывается с объектом i в памяти heap
        // в этот фрейм входит переменная ii типа Integer, она связывается с объектом ii в памяти heap. 
        
        System.out.println("finished"); // 7 В памяти стека создается фрейм для метода println() в него помещаем значение "finished", 
        //в памяти Heap создается объект типа String, он связывается со значением finished из фрейма на вершине стека. 
        //Метод println() выполняется, значение finished помечается для удаления сборщиком мусора
    }

    private static void printAll(Object o, int i, Integer ii) {
        Integer uselessVar = 700;                   // 5.  В памяти Heap создается объект Integer со значением 700, во фрейме printAll создается переменная uselessVar и ссылается на этот объект.
        System.out.println(o.toString() + i + ii);  // 6.  В памяти стека создается фрейм для метода println(), в этот фрейм помещается переменная "о",связанная с объектом в памяти HEAP(приводится к типу String)  
       //Также в этот фрейм помещается переменная i типа int она связывается с объектом i в памяти Heap.          
       //Еще в этот фрейм помещается переменная ii типа Integer, она тоже связывается с объектом ii в памяти Heap.
        //Этот фрейм находится на вершине памяти стека - на консоль выводится результат метода println(). 
        //В памяти Heap объекты  o,i,ii,uselessVar помечаются для удаления сборщиком мусора
    }
}
