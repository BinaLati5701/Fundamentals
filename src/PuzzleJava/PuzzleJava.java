package PuzzleJava;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.nio.charset.Charset;
import java.util.*;

public class PuzzleJava {

    public void arraySum(){
        int[] arr = {3,5,1,2,7,9,8,13,25,32};
        int sum =0;
        for(int i=0; i<arr.length; i++){
            sum += arr[i];

            if(arr[i] > 10){
                System.out.println(arr[i]);
            }

        }
        System.out.println(sum);

    }
    public void personArray(){
        ArrayList<String> person = new ArrayList<String>();
        person.add("Nancy");
        person.add("Jinichi");
        person.add("Fujibayashi");
        person.add("Momochi");
        person.add("Ishikawa");

        Collections.shuffle(person);
        System.out.println(person);

        for(String p : person) {
            if (p.length() > 5) {
                System.out.println(p);

            }

        }
    }
    public void alphaArray(){
//        ArrayList<Character> alpha = new ArrayList<Character>();
//        for (char letter = 'A'; letter <= 'Z'; letter++) {
//            alpha.add(letter);


        Character[] alphabet = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
        List<Character> array = new ArrayList<Character>();
        array.addAll(Arrays.asList(alphabet));
        Collections.shuffle(array);
        System.out.println(array);


         char first = array.get(0);
         char last = array.get(array.size()-1);
        System.out.println(last);


         if(first=='a' || first=='e'|| first=='i'|| first=='o'||first=='u'){
             System.out.println("First letter after shuffle is a vowel: " + first);
         }
         else{
             System.out.println("Oops! It is consonant");
         }
    }
    public void randomInteger(){
        ArrayList<Integer> nums = new ArrayList<Integer>();
        nums.add(89);
        nums.add(75);
        nums.add(67);
        nums.add(95);
        nums.add(56);
        nums.add(59);
        nums.add(61);
        nums.add(82);
        nums.add(72);
        nums.add(93);
        System.out.println(nums);

        Random r = new Random();
        System.out.println(r.nextInt(100));

        Collections.sort(nums);
        System.out.println(nums);

        int max = Collections.max(nums);
        int min = Collections.min(nums);

        System.out.println(min);
        System.out.println(max);


    }
    public void randomString(){
        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

        String [] strings = new String[10];
        Random random = new Random();

        int length =5;


        for(int j =0; j<strings.length; j++){
            StringBuilder sb = new StringBuilder();
            for(int i=0; i<length; i++){

                int index = random.nextInt(alphabet.length());
                char randomChar = alphabet.charAt(index);
                sb.append(randomChar);
            }
            String randomStr = sb.toString();
            strings[j]= randomStr;


        }
//        sb.append(strings);
        System.out.println(Arrays.toString(strings));

    }


}
