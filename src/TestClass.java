public class TestClass {
    @Attached(count = 2)
    public void annotationPublic()
    {
        System.out.println("public annotation function");
    };
    public void notAnnotationPublic()
    {
        System.out.println("public function");
    };

    @Attached(count = 4)
    private void annotationPrivate()
    {
        System.out.println("private annotation function");
    };

    @Attached(count = 6)
    private void annotationProtected()
    {
        System.out.println("protected annotation function");
    };
    @Attached(count = 3)
    public void publicParams (int a, char b, String c)  {
        System.out.println("PUBLIC Int: " + a + ", Char: " + b +", String:" + c);
    };

    @Attached(count = 2)
    protected void protectedParams (long a, boolean b, double c)  {
        System.out.println("PROTECTED Long: " + a + ", Boolean: " + b +", Double:" + c);
    };

    @Attached(count = 1)
    private void privateParams (long a, boolean b, double c)  {
        System.out.println("PRIVATE Long: " + a + ", Boolean: " + b +", Double:" + c);
    };
}
