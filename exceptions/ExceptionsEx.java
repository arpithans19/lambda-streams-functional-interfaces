package com.exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class ExceptionsEx {

    public static void main(String[] args) {

        /** *****************File Reader Try catch finally ***************************/

        System.out.println("Entering file path");
        File file = new File("C:\\Users\\ARPITHAN\\Desktop\\JaaFullstack\\JavaFullstack.txt");
        String line = file.getPath();
        System.out.println(line);

        try {
            FileReader fileReader = new FileReader(file);
            System.out.println("Reading completed");
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
            e.printStackTrace();
//			e.toString();
//			e.getClass();
//			e.getMessage();
        } finally {
            System.out.println("outside try catch");
        }
    }
}


//*  ******************Multiple catch block********************
//to handle the exception without maintaining the order of exceptions
// (i.e. from most specific(ArithmeticException e) to most general(Exception e).


/*//		try {
//
//			int a[] = new int[5];
//             a[5]=30/0;    //Arithmetic Exception excepted
//
//             System.out.println(a[10]);  //ArrayIndexOutofBound
//
//			String str = null;
//			System.out.println(str.length()); // NullPointer (Parent Exception)
//		} catch (ArithmeticException e) {
//			System.out.println("Arithmetic Exception occurs");
//		} catch (ArrayIndexOutOfBoundsException e) {
//			System.out.println("ArrayIndexOutOfBounds Exception occurs");
//		} catch (Exception e) {
//			System.out.println("Parent Exception occurs");
//		}
//		System.out.println("rest of the code");
//	}
//}
*/
/******************** Nested Try ******************************/
//		try {
//
//			try {
//
//				try {
//					int arr[] = { 1, 2, 3, 4 };
//
//					// printing the array element out of its bounds
//					System.out.println(arr[10]);
//				}
//
//				// to handles ArithmeticException
//				catch (ArithmeticException e) {
//					System.out.println("Arithmetic exception" + e.getMessage());
//
//					System.out.println(" inner try block 2");
//				}
//			}
//
//			// to handle ArithmeticException
//			catch (ArithmeticException e) {
//				System.out.println("Arithmetic exception");
//				System.out.println("inner try block 1");
//			}
//		}
//
//		// to handle ArrayIndexOutOfBoundsException
//		catch (ArrayIndexOutOfBoundsException e4) {
//			System.out.print(e4.getMessage());
//			System.out.println(" outer (main) try block");
//
//		} catch (Exception e5) {
//			System.out.print("Exception");
//			System.out.println(" handled in main try-block");
//		}
//	}
//}

/******************** throw *********************************************/

/** syntax- throw new exception_class("error message"); */

//	public static void validate(int age) {
//		if (age < 18) {
//			throw new ArithmeticException("Person is not eligible to vote");
//		} else {
//			System.out.println("Person is eligible to vote!!");
//		}
//	}
//
//	// main method
//	public static void main(String args[]) {
////		 calling the function
//		ExceptionExample ex = new ExceptionExample();
//		 ex.validate(19);
//
//		System.out.println("rest of the code...");
//	}
//}

/******************* throws Checked Exception *************/

//	public static int divideNum(int m, int n) throws ArithmeticException, NullPointerException {
//		int div = m / n;
//		return div;
//	}
//
//	public static void main(String[] args) {
//		ExceptionExample obj = new ExceptionExample();
//		try {
//
//			System.out.println(obj.divideNum(45, 0));
//
//
//			String str = null;
////			int length = str.length();
//			System.out.println(str.length());
//
////			obj.divideNum(45, 0);
//			}
//		 catch (ArithmeticException e) {
//			System.out.println("\nNumber cannot be divided by 0");
//		} catch (NullPointerException e) {
//			System.out.println("\nNull pointer ");
//		}
//			finally {
//		System.out.println("Rest of the code..");
//	}
//}

/****************** practice *************/


//        public static void divideByZero() {
//            throw new ArithmeticException("Trying to divide by 0");
//        }
//
//        public static void main(String[] args) {
//            divideByZero();
//        }
//    }

