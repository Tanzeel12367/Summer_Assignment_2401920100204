interface test {
    void square(int n);
}

class arithmetic implements test {
    public void square(int n){
        System.out.println(n*n);
    }
}

class ToTestInt {
    public static void main(String[] args){
        arithmetic a = new arithmetic();
        a.square(5);
        a.square(9);
    }
}
