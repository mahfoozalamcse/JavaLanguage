package ClassObject;
// import ClassObject.Protected1;
class Protected2 extends Protected1{
    public static void main(String[] args) {
        Protected2 d = new Protected2();
        d.fun();
    }
}
/*
 * private -> within the class
 * default -> within the package
 * protected -> within package and child class of other package
 * public -> Any where
 * 
 * recomendation use private strictaly that not loose its value
 */