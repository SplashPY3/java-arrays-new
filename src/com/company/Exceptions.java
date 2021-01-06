package com.company;

public class Exceptions {
    public static void main(String[] args) {
        try {
            System.out.println("in Try");
//           int nums[] = new int [5];
//           nums[10] = 21;
            throw new ArrayIndexOutOfBoundsException();
        }
        catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println(ex);
        }
        catch (Exception ex) {
            System.out.println("In exception");
        }
        finally {
            System.out.println("Finally code");
        }
    }
}
