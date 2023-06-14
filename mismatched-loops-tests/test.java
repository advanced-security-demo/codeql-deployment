public class test {

  void test1() {

    for (int i = 0; i > 10; i++) { // NON_COMPLIANT
      System.out.println(i);
    }

    for (int j = 10; j < 0; j--) { // NON_COMPLIANT
      System.out.println(j);
    }

    for (int k = 0; k < 10; k++) { // COMPLIANT
      System.out.println(k);
    }
  }
}