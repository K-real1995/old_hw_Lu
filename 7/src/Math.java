public class Math<T> {

    public static <T> Object getSum(T obj1, T obj2) {
        if (obj1 instanceof String & obj2 instanceof String) {
            return (T) (obj1.toString() + obj2.toString());
        } else if (obj1 instanceof Integer & obj2 instanceof Integer) {
            return ((Integer) obj1).intValue() + ((Integer) obj2).intValue();
        } else return null;
    }

    public static <T> Object getMul(T obj1, T obj2) {
        if (obj1 instanceof String & obj2 instanceof String) {
            return "Умножение строковых переменных невозможно";
        } else if (obj1 instanceof Integer & obj2 instanceof Integer) {
            return ((Integer) obj1).intValue() * ((Integer) obj2).intValue();
        } else return null;
    }

    public static <T> Object getDivision(T obj1, T obj2){
        if (obj1 instanceof String & obj2 instanceof String) {
            return "Деление строковых переменных невозможно";
        } else if (obj1 instanceof Integer & obj2 instanceof Integer) {
             try{
                 return ((Integer) obj1).intValue() / ((Integer) obj2).intValue();
             }
             catch (ArithmeticException e){
                 e.printStackTrace();
                 return "Деление на ноль невозможно";
             }
        } return null;
    }

    public static <T> Object getSub(T obj1, T obj2){
        if(obj1 instanceof String & obj2 instanceof String){
            return "Вычитание строковых переменных невозможно";
        }
        else if (obj1 instanceof Integer & obj2 instanceof Integer){
            return ((Integer) obj1).intValue() * ((Integer) obj2).intValue();
        }
        else return null;
    }
}


