private static <T> void sjekk(String hva, boolean test, T result) {
    if (!test) {
        System.out.println("Testen '" + hva + "' feilet! Resultat: " + result);
        System.out.println();
        System.exit(1);
    }
}



// Med String return type
String expected = "Hello, world!";
String actual = someMethod();
sjekk("Test1", expected.equals(actual), actual);

// Med integer return type
int expected = 42;
int actual = someMethod();
sjekk("Test2", expected == actual, actual);
