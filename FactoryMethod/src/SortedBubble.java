public class SortedBubble implements Isort {
   private int[] list;


   public SortedBubble() {
       int[] array = new int[15];
       for (int i = 0; i < array.length; i++) {
           array[i] = ((int)(Math.random() * 50));
       }
       list=array;
       System.out.println("Array for sorted Bubble");
       for(int i: list){
           System.out.print(" "+i);

       }
       System.out.println();
   }

   @Override
   public void sort() {
       boolean isSorted = false;
       int buf;
       System.out.println("Sorted :");
       while(!isSorted) {
           isSorted = true;
           for (int i = 0; i < list.length-1; i++) {
               if(list[i] > list[i+1]){
                   isSorted = false;

                   buf = list[i];
                   list[i] = list[i+1];
                   list[i+1] = buf;
               }
           }
       }
       for(int i: list){
           System.out.print(" "+i);
       }
       System.out.println();
       System.out.println("_________");
   }


}
