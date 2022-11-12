package day29_abstacttioncollections;

import java.util.LinkedList;

/**
 * <h2>Note</h2>
 * <lu>
 *     <li>LinkedLies deki her eleman iki bölümden olusuru  i) Data ii) Pointer</li>
 *     <li>LinkedList deki her eleman "Node" olarak adlandirilirlar</li>
 *     <li>LinkedList ler eleman ekleme ve eleman silme islemlerinde cok basarilidirlar</li>
 *     <li>LinkedList ler eleman arama islemlerinde basarisizdirlar</li>
 *     <li> 3. ve 4. maddelerden dolai eleman ekleme ve eleman silme islemlerinde cok yapilacagi durumlarda LinkedList kullanmalidir</li><br>
 *     <li>ArrayListler index kullanir LinkedList ler index kullanmaz.</li>
 *     <li>Index kullanmak eleman bulma islemlerinde cok basaralidir. Bu yuzden eleman bulma islemlerini cok yapacaksaniz ArrayList kullanmalisiniz.
 * </lu>
 */

        public class LinkedList01 {
        //    region Konstanten
        //    endregion

        //    region Attribute
        //    endregion

        //    regionKonstruktor
        //    endregion

        //    regionMethoden
            public static void main(String[] args) {
                LinkedList<String> visitors = new LinkedList<String>();

                visitors.add("Tom");
                visitors.add("Hanks");
                visitors.add("Tom Hanks");
                visitors.add("Pitt");
                visitors.add("Brad Pitt");

                System.out.println(visitors);//[Tom, Hanks, Tom Hanks, Pitt, Brad Pitt]
                visitors.add(2,"Angeline Jolie");

                System.out.println(visitors);//[Tom, Hanks, Angeline Jolie, Tom Hanks, Pitt, Brad Pitt]

                visitors.addLast("Ajda Pekkan");
                visitors.addFirst("Cüneyt Arkin");
                System.out.println(visitors);//[Cüneyt Arkin, Tom, Hanks, Angeline Jolie, Tom Hanks, Pitt, Brad Pitt, Ajda Pekkan]

                visitors.removeLast();
                System.out.println(visitors);//[Cüneyt Arkin, Tom, Hanks, Angeline Jolie, Tom Hanks, Pitt, Brad Pitt]

                visitors.removeFirst();
                System.out.println(visitors);//[Tom, Hanks, Angeline Jolie, Tom Hanks, Pitt, Brad Pitt]

                visitors.add("Tom Hanks");
                visitors.add("Brad Pitt");
                System.out.println(visitors);//[Tom, Hanks, Angeline Jolie, Tom Hanks, Pitt, Brad Pitt, Tom Hanks, Brad Pitt]

                visitors.removeFirstOccurrence("Tom Hanks");
                System.out.println(visitors);//[Tom, Hanks, Angeline Jolie, Pitt, Brad Pitt, Tom Hanks, Brad Pitt]

                visitors.removeLastOccurrence("Brad Pitt");
                System.out.println(visitors);//[Tom, Hanks, Angeline Jolie, Pitt, Brad Pitt, Tom Hanks]

//          ------------------------------------------------------------------------------------------------------------
                /*
                  Removes and returns the first element of this list.
                  This method is equivalent to removeFirst().
                 Returns:
                  the element at the front of this list (which is the top of the stack represented by this list)
                  Throws:
                  NoSuchElementException – if this list is empty
                 */

                String firstElement = visitors.pop(); // Cut + Paste
                System.out.println(firstElement);//Tom

                System.out.println(visitors);//[Hanks, Angeline Jolie, Pitt, Brad Pitt, Tom Hanks]
//          ------------------------------------------------------------------------------------------------------------

                LinkedList<String> myList = new LinkedList<String>();

//                myList.pop();//.NoSuchElementException  atti cunku LinkedList bos
                myList.addAll(visitors);
                System.out.println(myList);
            }
        //    endregion

        }
