public class SortedRadix implements Isort {
   private int[] list ;

   public SortedRadix() {
       int[] array = new int[15];
       for (int i = 0; i < array.length; i++) {
           array[i] = ((int)(Math.random() * 50));
       }
       list=array;
       System.out.println("Array for sorted Radix");
       for(int i: list){
           System.out.print(" "+i);

       }
       System.out.println();
   }

   @Override
   public void sort() {
       System.out.println("Sorted :");
       for (int shift = Integer.SIZE - 1; shift > -1; shift--) {
           int[] tmp = new int[list.length];
           int j = 0;
           for (int i = 0; i < list.length; i++) {
               boolean move = list[i] << shift >= 0;
               if (shift == 0 ? !move : move) {
                   tmp[j] = list[i];
                   j++;
               } else {
                   list[i - j] = list[i];
               }
           }
           for (int i = j; i < tmp.length; i++) {
               tmp[i] = list[i - j];
           }
           list = tmp;
       }
       for(int i: list){
           System.out.print(" "+i);
       }
       System.out.println();
       System.out.println("_________");
   }
}
